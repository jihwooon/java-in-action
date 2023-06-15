package chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static chapter4.Attributes.BODY;
import static chapter4.Attributes.NAME_PREFIX;
import static chapter4.Attributes.PATIENT;
import static chapter4.Attributes.TYPE;

public class ReportImporter implements Importer {

    @Override
    public Document importFile(File file) throws IOException {
        TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLines(2, line -> false, BODY);

        Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "LETTER");
        return new Document(attributes);
    }
}
