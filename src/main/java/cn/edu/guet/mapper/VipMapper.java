package cn.edu.guet.mapper;

import cn.edu.guet.model.Vip;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 开卡Mapper接口
 *
 */

@Repository
public interface VipMapper {
    /**
     * 查询开卡
     *
     * @param vipId 开卡ID
     * @return 开卡
     */
    public Vip selectVipById(String vipId);

    /**
     * 根据vipId查询数量
     * @param vipId 开卡ID
     * @return 数量
     */
    public int selectCountById(String vipId);

    /**
     * 查询开卡列表
     *
     * @param vip 开卡
     * @return 开卡集合
     */
    public List<Vip> selectVipList(Vip vip);

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
     * 删除开卡
     *
     * @param vipId 开卡ID
     * @return 结果
     */
    public int deleteVipById(String vipId);

}
