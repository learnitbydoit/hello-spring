package vn.edu.eiu.testlab.springioc.v2setter;

import org.springframework.stereotype.Component;

@Component
public class PdfGeneratorUtil {
    public void generatePdfFile(String fileName){
        //Xử lý xuất file pdf
        //Thông báo
        System.out.println("Spring IoC V2-Setter: The pdf file " + fileName + " is generated successfully.");
    }
}
