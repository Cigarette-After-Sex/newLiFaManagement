package cn.edu.guet.service.impl;

import cn.edu.guet.mapper.VipMapper;
import cn.edu.guet.model.Vip;
import cn.edu.guet.service.IVipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 开卡Service业务层处理
 *
 */

@Service
public class VipServiceImpl implements IVipService {

    @Autowired
    private VipMapper vipMapper;

    /**
     * 查询开卡
     *
     * @param vipId 开卡ID
     * @return 开卡
     */
    @Override
    public Vip selectVipById(String vipId) {
        return vipMapper.selectVipById(vipId);
    }

    /**
     * 查询开卡列表
     *
     * @param vip 开卡
     * @return 开卡
     */
    @Override
    public List<Vip> selectVipList(Vip vip) {
        return vipMapper.selectVipList(vip);
    }

    @Override
    /**
     * 根据vipId查询数量
     * @param vipId 开卡ID
     * @return 数量
     */
    public int selectCountById(String vipId){
        return vipMapper.selectCountById(vipId);
    }

    /**
     * 新增开卡
     *
     * @param vip 开卡
     * @return 结果
     */
    @Override
    public int insertVip(Vip vip) {
        return vipMapper.insertVip(vip);
    }

    /**
     * 修改开卡
     *
     * @param vip 开卡
     * @return 结果
     */
    @Override
    public int updateVip(Vip vip) {
        return vipMapper.updateVip(vip);
    }

    /**
     * 删除开卡信息
     *
     * @param vipId 开卡ID
     * @return 结果
     */
    @Override
    public int deleteVipById(String vipId) {
        return vipMapper.deleteVipById(vipId);
    }

    @Override
    public List<Vip> getAllList() {
        return vipMapper.getAllList();
    }

    @Override
    public List<Vip> getVipById(String vipId) {
        return vipMapper.getVipById(vipId);
    }

    @Override
    @Transactional()
    public void deleteVip(String vipId) {
        vipMapper.deleteVip(vipId);
    }

    @Override
    @Transactional()
    public void updateVipList(Vip vipId) {
        vipMapper.updateVipList(vipId);
    }
}
