package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.CardTypeMapper;
import cn.edu.guet.model.CardType;
import cn.edu.guet.service.ICardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardTypeServiceImpl implements ICardTypeService {

    @Autowired
    private CardTypeMapper cardTypeMapper;

    @Override
    public List<CardType> selectCardTypeList() {
        return cardTypeMapper.selectCardTypeList();
    }
}
