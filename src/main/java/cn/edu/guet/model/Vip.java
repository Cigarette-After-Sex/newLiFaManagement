package cn.edu.guet.model;

import java.io.Serializable;
import java.util.Date;

public class Vip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 会员卡号
     */
    private String vipId;

    /**
     * 姓名
     */
    private String vipName;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 卡的类型
     */
    private String cardId;

    /**
     * 卡上余额
     */
    private Double cardMoney;

    /**
     * 消费总额
     */
    private Double consumeMoney;

    /**
     * 职员ID
     */
    private String empId;

    /**
     * 开卡时间
     */
    private Date cardTime;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public String getVipName() {
        return vipName;
    }

    public void setVipName(String vipName) {
        this.vipName = vipName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public Double getCardMoney() {
        return cardMoney;
    }

    public void setCardMoney(Double cardMoney) {
        this.cardMoney = cardMoney;
    }

    public Double getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(Double consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Date getCardTime() {
        return cardTime;
    }

    public void setCardTime(Date cardTime) {
        this.cardTime = cardTime;
    }

}
