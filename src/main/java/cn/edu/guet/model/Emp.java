package cn.edu.guet.model;


import javax.validation.constraints.NotBlank;

public class Emp {
    @NotBlank(message = "员工ID不能为空")
    private String empId;
    private String empname;
    private String sex;
    private String emplevel;
    private String phone;
    private String birth;
    private String hiredate;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmplevel() {
        return emplevel;
    }

    public void setEmplevel(String emplevel) {
        this.emplevel = emplevel;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }
}
