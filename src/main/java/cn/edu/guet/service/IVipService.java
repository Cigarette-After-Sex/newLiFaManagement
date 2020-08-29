package cn.edu.guet.service;

import cn.edu.guet.model.Vip;

import java.util.List;

/**
 * 开卡Service接口
 *
 */
public interface IVipService {
    /**
     * 查询开卡
     *
     * @param vipId 开卡ID
     * @return 开卡
     */
    public Vip selectVipById(String vipId);

    /**
     * 查询开卡列表
     *
     * @param vip 开卡
     * @return 开卡集合
     */
    public List<Vip> selectVipList(Vip vip);

    /**
     * 根据vipId查询数量
     * @param vipId 开卡ID
     * @return 数量
     */
    public int selectCountById(String vipId);

    /**
     * 新增开卡
     *
     * @param vip 开卡
     * @return 结果
     */
    public int insertVip(Vip vip);

    /**
     * 修改开卡
     *
     * @param vip 开卡
     * @return 结果
     */
    public int updateVip(Vip vip);

    /**
     * 删除开卡信息
     *
     * @param vipId 开卡ID
     * @return 结果
     */
    public int deleteVipById(String vipId);

    public List<Vip> getAllList();

    public List<Vip> getVipById(String vipid);
    public void deleteVip(String vipid);
    public void updateVipList(Vip vipid);
}
