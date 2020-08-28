package cn.edu.guet.mapper;

import cn.edu.guet.model.CardType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardTypeMapper {

    /**
     * 查询开卡类型列表
     *
     * @return 开卡类型集合
     */
    public List<CardType> selectCardTypeList();

}
