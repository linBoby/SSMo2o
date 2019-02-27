package cn.lyh.o2o.service;

import java.util.List;

import cn.lyh.o2o.entity.ShopCategory;
import cn.lyh.o2o.exceptions.ShopOperationException;

public interface ShopCategoryService {
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) throws ShopOperationException;
	
}
