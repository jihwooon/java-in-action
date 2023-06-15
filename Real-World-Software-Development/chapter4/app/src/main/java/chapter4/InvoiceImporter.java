package chapter4;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static chapter4.Attributes.AMOUNT;
import static chapter4.Attributes.AMOUNT_PREFIX;
import static chapter4.Attributes.NAME_PREFIX;
import static chapter4.Attributes.PATIENT;
import static chapter4.Attributes.TYPE;

public class InvoiceImporter implements Importer {

    @Override
    public Document importFile(File file) throws IOException {
        TextFile textFile = new TextFile(file);

        textFile.addLineSuffix(NAME_PREFIX, PATIENT);
        textFile.addLineSuffix(AMOUNT_PREFIX, AMOUNT);

        Map<String, String> attributes = textFile.getAttributes();
        attributes.put(TYPE, "LETTER");
        return new Document(attributes);
    }
}
