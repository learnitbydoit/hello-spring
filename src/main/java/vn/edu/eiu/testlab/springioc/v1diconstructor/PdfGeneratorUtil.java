package vn.edu.eiu.testlab.springioc.v1diconstructor;

import org.springframework.stereotype.Component;

@Component
public class PdfGeneratorUtil {
    //Khai báo thuộc tính
    //Hàm tạo file pdf
    public void generatePdfFile(String fileName){
        //Xử lý tạo file

        //Xuất thông báo
        System.out.println("Spring IoC V1-Constructor: The pdf file " + fileName + " is generated successfully.");
    }
}
