package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.stereotype.Component;

@Component("docxGenerator")
public class DocxGenerator implements DocumentGenerator {
    @Override
    public void generateFile(String fileName) {
        System.out.println("The docx file " + fileName + ".docx has been generated");
    }
}
