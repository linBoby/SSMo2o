package cn.lyh.o2o.dto;

import java.util.List;

import cn.lyh.o2o.entity.Shop;
import cn.lyh.o2o.enums.ShopStateEnum;

public class ShopExecution {
	//结果状态
	private int state;
	//状态标识
	private String stateInfo;
	//店铺数量
	private int count ;
	//操作的shop(CUD 时用到)
	private Shop shop;
	//shop(R查询时用到)
	private List <Shop> shopList;
	public ShopExecution() {
		
	}
	//店铺操作失败的时候采用的构造器
	public ShopExecution(ShopStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	//店铺操作成功时候采用的构造器 返回单个
	public ShopExecution(ShopStateEnum stateEnum,Shop shop) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shop=shop;
	}
	//店铺操作成功时候采用的构造器 返回多个	
	public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.shopList=shopList;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public List<Shop> getShopList() {
		return shopList;
	}
	public void setShopList(List<Shop> shopList) {
		this.shopList = shopList;
	}
	
}
