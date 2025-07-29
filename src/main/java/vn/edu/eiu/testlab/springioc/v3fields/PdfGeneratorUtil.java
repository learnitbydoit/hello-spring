package vn.edu.eiu.testlab.springioc.v3fields;

import org.springframework.stereotype.Component;

@Component
public class PdfGeneratorUtil {
    public void generatePdfFile(String fileName){
        //Xử lý xuất file pdf
        //Thông báo
        System.out.println("Spring IoC V3-Fields: The pdf file " + fileName + " is generated successfully.");
    }
}
