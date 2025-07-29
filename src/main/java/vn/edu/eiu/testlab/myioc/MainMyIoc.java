package vn.edu.eiu.testlab.myioc;

import java.time.LocalDate;

/** Đóng vai trò là UI và nơi quản lý IoC*/
public class MainMyIoc {
    public static void main(String[] args) {
        //Tiêm qua constructor
        ContractService contractService = new ContractService(new PdfGeneratorUtil());
        //Gọi hàm makeContract
        contractService.makeContract("001", LocalDate.now());

        //Tiêm qua setter
        PdfGeneratorUtil pdfGene2 = new PdfGeneratorUtil();
        contractService.setPdfGeneratorUtil(pdfGene2);
        contractService.makeContract("002", LocalDate.now());
    }
}
