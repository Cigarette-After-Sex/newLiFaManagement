package cn.edu.guet.model;

import javax.validation.constraints.NotBlank;
import java.sql.Time;

public class VipList {
    @NotBlank(message = "会员编号不能为空")
    private String vipid;
    @NotBlank(message = "会员姓名不能为空")
    private String vipname;
    @NotBlank(message = "联系电话不能为空")
    private String phone;   //电话
    @NotBlank(message = "会员卡号不能为空")
    private String cardid;   //会员卡号

    private float cardmoney;  //卡余额
    private float consumemoney;  //消费金额
    private String empid;

    public String getVipid() {
        return vipid;
    }

    public void setVipid(String vipid) {
        this.vipid = vipid;
    }

    public String getVipname() {
        return vipname;
    }

    public void setVipname(String vipname) {
        this.vipname = vipname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public float getCardmoney() {
        return cardmoney;
    }

    public void setCardmoney(float cardmoney) {
        this.cardmoney = cardmoney;
    }

    public float getConsumemoney() {
        return consumemoney;
    }

    public void setConsumemoney(float consumemoney) {
        this.consumemoney = consumemoney;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

}
