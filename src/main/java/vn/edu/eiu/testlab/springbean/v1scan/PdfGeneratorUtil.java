package vn.edu.eiu.testlab.springbean.v1scan;

import org.springframework.stereotype.Component;

@Component("pdfGene")//Tự đặt tên bean, nếu không tự đặt thì tên mặc định là lấy ten class đặt theo cú pháp camel (pdfGeneratorUtil)
public class PdfGeneratorUtil {
    //Khai báo các thuộc tính cần thiết

    //Hàm xử lý tạo file
    public void generatePdfFile(String fileName) {
        //Xử lý tạo file

        //Xuất thông báo
        System.out.println("MyIoC: The file " + fileName + ".pdf is generated successfully.");
    }
}
