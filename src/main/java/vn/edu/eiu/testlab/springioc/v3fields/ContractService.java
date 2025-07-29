package vn.edu.eiu.testlab.springioc.v3fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("makingContract")
public class ContractService {
    //Tiêm trực tiếp qua field, Vi phạm tính đóng gói, nên thường các framwork sự dụng bên trong các thành phần của chúng. Lập trình viên thì không nên dùng.
    @Autowired
    private PdfGeneratorUtil pdfGeneratorUtil;

    //Không có setter để tiêm
    //Không có constructor để tiêm luôn
    //Hàm xử lý chính
    public void makeContract(String contractName){
        //
         //Tạo file pdf
        pdfGeneratorUtil.generatePdfFile(contractName);
    }
}
