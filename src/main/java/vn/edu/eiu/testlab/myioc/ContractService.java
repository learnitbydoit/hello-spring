package vn.edu.eiu.testlab.myioc;

import java.time.LocalDate;

/** SRP: Xử lý logic tạo contract (Mock)
 * Sử dụng 2 dependency:
 * 1. ContractRepo để lưu DB (bỏ qua)
 * 2. PdfGeneratorUtil để xuất file pdf (làm Mock)*/
public class ContractService {
    //Khai báo dependency tạo file pdf
    private PdfGeneratorUtil pdfGeneratorUtil; //Không new, để inject từ ngoài vào

    //Có mấy cách để inject?
    //Cách 1: qua constructor (tạo con đường tiêm pdfGenerator qua constructor)
    public ContractService(PdfGeneratorUtil pdfGeneratorUtil){
        this.pdfGeneratorUtil = pdfGeneratorUtil;
    }
    //Cách 2: qua setter
    public void setPdfGeneratorUtil(PdfGeneratorUtil pdfGeneratorUtil){
        this.pdfGeneratorUtil = pdfGeneratorUtil;
    }

    //Hàm xử lý nghiệp vụ chính
    public void makeContract(String contractNum, LocalDate date){
        //Lấy thông tin từ UI, xử lý tạo hợp đồng
        //Gọi Repo lưu database
        //Gọi pdfGenerator để xuất file pdf
        String fileName = "contract_" + contractNum + date.toString() + ".pdf";
        pdfGeneratorUtil.generatePdfFile(fileName);
    }

}
