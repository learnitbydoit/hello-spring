package vn.edu.eiu.testlab.springbean.v1scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainV1Scan {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //appContext là người quản lý bean, tạo, lấy ra sử dụng
        //Hiện tại mình đang có một Bean (<=> PdfGeneratorUtil Obj)
        //Để lấy ra sử dụng thì có những cách sau:
        //Cách 1:
        PdfGeneratorUtil pdfGene1 = appContext.getBean(PdfGeneratorUtil.class);
        //<=> PdfGeneratorUtil pdfGeneratorUtil = new PdfGeneratorUtil();
        pdfGene1.generatePdfFile("123");

        //Cách 2: name:pdfGeneratorUtil là do spring bean tự tạo đối tượng lấy tên class và chuyển thành tên biến theo cú pháp camel
        PdfGeneratorUtil pdfGeneratorUtil = appContext.getBean("pdfGeneratorUtil",PdfGeneratorUtil.class);
        pdfGeneratorUtil.generatePdfFile("456");

        //Cách 3:
        PdfGeneratorUtil pdfGene3 = (PdfGeneratorUtil) appContext.getBean("pdfGeneratorUtil");
        pdfGene3.generatePdfFile("789");
    }
}
