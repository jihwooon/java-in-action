package chapter4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.unmodifiableList;

public class DocumentManagementSystem {
    private final List<Document> documents = new ArrayList<>();
    private final List<Document> documentsView = unmodifiableList(documents);
    private final Map<String, Importer> extensionToImporter = new HashMap<>();

    public DocumentManagementSystem() {
        extensionToImporter.put("jpg", new ImageImporter());
        extensionToImporter.put("letter", new LetterImporter());
        extensionToImporter.put("report", new ReportImporter());
    }

    public void importFile(final String path) throws IOException {
        final File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        final int separatorIndex = path.lastIndexOf(".");
        if (separatorIndex != -1) {
            if (separatorIndex == path.length()) {
                throw new UnknownFileTypeException("No extension found file: " + path);
            }
            final String extension = path.substring(separatorIndex + 1);
            Importer importer = extensionToImporter.get(extension);
            if (importer == null) {
                throw new UnknownFileTypeException("For file: " + path);
            }
            Document document = importer.importFile(file);
            documents.add(document);
        } else {
            throw new UnknownFileTypeException("No extension found for file: " + path);
        }
    }

    public List<Document> contents() {
        return documentsView;
    }

    public List<Document> search(final String query) {
        return documents.stream()
                .filter(Query.parser(query))
                .collect(Collectors.toList());
    }
}
