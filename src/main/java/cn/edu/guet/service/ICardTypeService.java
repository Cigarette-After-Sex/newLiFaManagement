package cn.edu.guet.service;

import cn.edu.guet.model.CardType;

import java.util.List;

public interface ICardTypeService {

    /**
     * 查询开卡类型列表
     *
     * @return 开卡类型集合
     */
    public List<CardType> selectCardTypeList();
}
