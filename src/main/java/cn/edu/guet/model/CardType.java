package cn.edu.guet.model;

import java.io.Serializable;

public class CardType implements Serializable {

    private String cardId;

    private String cardName;

    private Double comMoney;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Double getComMoney() {
        return comMoney;
    }

    public void setComMoney(Double comMoney) {
        this.comMoney = comMoney;
    }
}
