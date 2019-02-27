package cn.lyh.o2o.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lyh.o2o.dao.ShopCategoryDao;
import cn.lyh.o2o.entity.ShopCategory;
import cn.lyh.o2o.exceptions.ShopOperationException;
import cn.lyh.o2o.service.ShopCategoryService;
@Service
public class ShopCategoryServiceImpl implements ShopCategoryService {
	
	@Autowired
	private ShopCategoryDao shopCategoryDao;
	@Override
	public List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition) throws ShopOperationException {
		return shopCategoryDao.queryShopCategory(shopCategoryCondition);
	}


}
