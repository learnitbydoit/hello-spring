package vn.edu.eiu.testlab.springioc.v4interface;

import org.springframework.stereotype.Component;

@Component("pdfGenerator")
public class PdfGenerator implements DocumentGenerator {
    @Override
    public void generateFile(String fileName) {
        //Xử lý xuất file pdf
        System.out.println("the pdf file " + fileName + ".pdf has been generated");
    }
}
