package chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static chapter4.Attributes.ADDRESS;
import static chapter4.Attributes.BODY;
import static chapter4.Attributes.NAME_PREFIX;
import static chapter4.Attributes.PATIENT;
import static chapter4.Attributes.TYPE;

public class LetterImporter implements Importer {

    @Override
    public Document importFile(File file) throws IOException {
        TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);

        final int lineNumber = textFile.addLines(2, String::isEmpty, ADDRESS);
        textFile.addLines(lineNumber + 1, (line) -> line.startsWith("regards,"), BODY);

        Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "LETTER");
        return new Document(attributes);
    }
}
