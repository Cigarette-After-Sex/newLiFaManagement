package cn.edu.guet.mapper;

import cn.edu.guet.model.VipList;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VipMapper {
    List<VipList> getAllList();
    List<VipList> getVipById(String vipid);
    void deleteVip(String vipid);
    void updateVip(VipList vipid);
}
