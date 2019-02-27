package cn.lyh.o2o.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lyh.o2o.entity.ShopCategory;

public interface ShopCategoryDao {
	/**
	 * 通过设置父分类id，获取子分类集合
	 * @param shopCategoryCondition
	 * @return
	 */
	List<ShopCategory> queryShopCategory(@Param("shopCategoryCondition")ShopCategory shopCategoryCondition);
}
