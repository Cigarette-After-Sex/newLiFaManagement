package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.service.ICardTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 开卡类型Controller
 */
@RestController
@RequestMapping("/cardType")
public class CardTypeController {

    @Autowired
    private ICardTypeService cardTypeService;

    /**
     * 开卡类型列表
     */
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public Result list() {
        return Result.succ(cardTypeService.selectCardTypeList());
    }

}
