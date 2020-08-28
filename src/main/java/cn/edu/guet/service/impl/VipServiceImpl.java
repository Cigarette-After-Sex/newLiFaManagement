package cn.edu.guet.service.impl;

import cn.edu.guet.exception.DeleteVipException;
import cn.edu.guet.exception.SaveException;
import cn.edu.guet.exception.UpdateVipException;
import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.VipList;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class VipServiceImpl implements IVipService {

    /*
    spring 自动注入vipMapper
     */
    @Autowired
    VipMapper vipMapper;

    @Override
    public List<VipList> getAllList() {
        return vipMapper.getAllList();
    }

    @Override
    public List<VipList> getVipById(String vipid) {
        return vipMapper.getVipById(vipid);
    }


    @Override
    @Transactional()
    public void deleteVip(String vipid) throws DeleteVipException {
        try {
            vipMapper.deleteVip(vipid);
        }catch(Exception e) {
            e.printStackTrace();
            throw new DeleteVipException("删除会员失败");
        }
    }

    @Override
    @Transactional()
    public void updateVip(VipList vipid) throws UpdateVipException {
        try {
            vipMapper.updateVip(vipid);
        }catch(Exception e) {
            e.printStackTrace();
            throw new UpdateVipException("更新会员信息失败");
        }
    }


}
