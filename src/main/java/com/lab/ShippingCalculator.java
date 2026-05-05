package com.lab;

public class ShippingCalculator {

    public double calculate(double weight, String type) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be positive");
        }
        if (type.equals("EXPRESS")) return weight * 5000 + 20000;
        if (type.equals("STANDARD")) return weight * 3000;
        throw new IllegalArgumentException("Unknown type: " + type);
    }
}
//1. Chỉ ra lỗi nằm ở file nào, dòng nào: Lỗi nằm ở file cấu hình workflow .github/workflows/main.yml (dòng chứa lệnh run: mvn package).
//2. Log bằng chứng từ GitHub Actions: Error: The goal you specified requires a project to execute but there is no POM in this directory (/home/runner/work/CICD/CICD). Please verify you invoked Maven from the correct directory.
//3. Khi pipeline bắt đầu chạy. GH sẽ khởi tạo một runner mới và clone code về. Tuy nhiên, do cấu hình sai nên GH không tìm thấy file pom.xml.
// Trong file mail.yml đã bỏ qua bước tải mã nguồn. Khi lệnh mvn chạy trong một thư mục không chứa pom.xml, nó sẽ báo lỗi như trên.
// Để khắc phục, cần thêm bước checkout code trước khi chạy lệnh mvn package.
