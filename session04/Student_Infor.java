package ra.session04;

public class Student_Infor {
    /*
     * Xây dựng lớp sinh viên gồm:
     * 1. Các đặc điểm
     *   - Mã sinh viên, tên sinh viên, tuổi, giới tính, số đt, địa chỉ, trạng thái
     * 2. Các constructors: 0 tham số, 2 tham số (mã + tên), đầy đủ tham số
     * 3. Các phương thức
     *   - Các phương thức getter/setter cho các thuộc tính
     *   - Phương thức hello: thực hiện chào giảng viên
     *   - Phương thức tính tổng 2 số
     *   - Phương thức hát
     *   - Phương thức inputData: cho phép nhập dữ liệu đối tượng sinh viên
     *   - Phương thức displayData: cho phép hiển thị thông tin sinh viên
     * */
    /*
     * 1. Fields/Attributes/Properties: Thuộc tính mô tả các đặc điểm của đối tượng sinh viên
     * Syntax: Access Modifier + Data type + fieldName
     * Note: Để thể hiện tính bao đóng thì các thuộc tính phải được khai báo là private
     * */
    private String studentId;
    private String studentName;
    private int studentAge;
    private boolean sex;
    private String phone;
    private String adress;
    private boolean status;

    //constructor

    // k tham số


    public Student_Infor() {
    }

    // 2 tham số

    public Student_Infor(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // đủ tham số

    public Student_Infor(String studentId, String studentName, int studentAge, boolean sex, String phone, String adress, boolean status) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.sex = sex;
        this.phone = phone;
        this.adress = adress;
        this.status = status;
    }


    //get and set


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


//       *   - Phương thức hello: thực hiện chào giảng viên

    public void hello(String teacherName){
        System.out.println("Hello" + teacherName);
    }

//     - Phương thức tính tổng 2 số

    public int sumTwoNumber(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }
}


