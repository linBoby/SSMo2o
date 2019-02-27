package cn.lyh.o2o.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.lyh.o2o.BaseTest;
import cn.lyh.o2o.dto.ImageHolder;
import cn.lyh.o2o.dto.ShopExecution;
import cn.lyh.o2o.entity.Area;
import cn.lyh.o2o.entity.PersonInfo;
import cn.lyh.o2o.entity.Shop;
import cn.lyh.o2o.entity.ShopCategory;
import cn.lyh.o2o.enums.ShopStateEnum;
import cn.lyh.o2o.exceptions.ShopOperationException;

public class ShopServiceTest extends BaseTest {
	@Autowired
	private ShopService shopService;
	@Test
	public void testGetShopList() {
		Shop shopCondition = new Shop();
		ShopCategory sc= new ShopCategory();
		sc.setShopCategoryId(2L);
		shopCondition.setShopCategory(sc);
		ShopExecution se = shopService.getShopList(shopCondition, 2, 2);
		System.out.println(se.getShopList().size());
		System.out.println(se.getCount());
	}
	@Test
	
	public void testModifyShop() throws FileNotFoundException,ShopOperationException {
		Shop shop = new Shop();
		shop.setShopId(1L);
		shop.setShopName("修改后的店铺名称");
		File shopImg = new File("D:\\mylib\\imagesource\\4.jpg");
		InputStream is= new FileInputStream(shopImg);
		ImageHolder imageHolder =new ImageHolder("4.jpg", is);
		ShopExecution shopExecution=shopService.modifyShop(shop, imageHolder);
		System.out.println("新得图片地址："+shopExecution.getShop().getShopImg());
	}
	@Test
	@Ignore
	public void testAddShop() throws FileNotFoundException {
		Shop shop =new Shop();
		PersonInfo owner=new PersonInfo();
		Area area= new Area();
		ShopCategory shopCategory =new ShopCategory();
		owner.setUserId(1L);
		area.setAreaId(2);
		shopCategory.setShopCategoryId(1L);
		shop.setOwner(owner);
		shop.setArea(area);
		shop.setShopCategory(shopCategory);
		shop.setShopName("测试店铺3");
		shop.setShopDesc("test1");
		shop.setShopAddr("test1");
		shop.setPhone("test1");
		shop.setEnableStatus(ShopStateEnum.CHECK.getState());
		shop.setAdvice("审核中");
		File shopImg =new File ("D:"+File.separator+"mylib"+File.separator+"imagesource"+File.separator+"2.jpg");
		InputStream	is = new FileInputStream(shopImg);
		ImageHolder imageHolder =new ImageHolder(shopImg.getName(), is);
		ShopExecution se=shopService.addShop(shop,imageHolder);
		assertEquals(ShopStateEnum.CHECK.getState(),se.getState());
		
	}
}
