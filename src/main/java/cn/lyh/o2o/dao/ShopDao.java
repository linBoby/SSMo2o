package cn.lyh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lyh.o2o.entity.Shop;

public interface ShopDao {
	/**
	 * 发挥查询结果数据条数
	 * @param shopCondition
	 * @return
	 */
	int queryShopCount(@Param("shopCondition")Shop shopCondition);
	/**
	 * 分页查询店铺，查询条件：店铺名（模糊），店铺状态，店铺类别，区域ID，owner
	 * @param shopCondition 条件（模糊）
	 * @param rowIndex  从几行开始
	 * @param pageSize  返回的行数
	 * @return
	 */
	List<Shop> queryShopList(@Param("shopCondition")Shop shopCondition,
			@Param("rowIndex")int rowIndex,@Param("pageSize")int pageSize);
	/**
	 * 新增店铺
	 * @param shop
	 * @return -1为失败
	 */
	int insertShop(Shop shop);
	/**
	 * 更新店铺信息
	 * @param shop
	 * @return
	 */
	int updateShop(Shop shop);
	/**
	 * 通过shopId查询店铺信息
	 * @param shopId
	 * @return
	 */
	Shop queryByShopId(long shopId);
}
