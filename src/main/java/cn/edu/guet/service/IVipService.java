package cn.edu.guet.service;

import cn.edu.guet.exception.DeleteVipException;
import cn.edu.guet.exception.UpdateVipException;
import cn.edu.guet.model.VipList;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IVipService {
    List<VipList> getAllList();
    List<VipList> getVipById(String vipid);
    void deleteVip(String vipid) throws DeleteVipException;
    void updateVip(VipList vipid) throws UpdateVipException;
}
