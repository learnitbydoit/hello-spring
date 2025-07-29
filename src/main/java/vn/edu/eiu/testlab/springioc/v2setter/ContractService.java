package vn.edu.eiu.testlab.springioc.v2setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service //Có thể dùng @Component
public class ContractService {
    private PdfGeneratorUtil pdfGene;

    //Khai báo setter làm đường truyền dependency
    @Autowired
    public void setPdfGeneratorUtil(PdfGeneratorUtil pdfGene) {
        this.pdfGene = pdfGene;
    }

    //Hàm xử lý chính
    public void makeContract(String contractNum, LocalDate contractDate){
        //Xử lý logic tạo hợp đồng
        //Gọi repo lưu db
        //Gọi pdfGene xuất file
        String fileName = "Contract_" + contractNum + contractDate.getYear() + contractDate.getMonthValue() + contractDate.getDayOfMonth() + ".pdf";
        pdfGene.generatePdfFile(fileName);
    }
}
