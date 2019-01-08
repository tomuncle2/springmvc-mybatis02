package com.itheima.springmvc.customeenum;
/**在接口中组织 enum*/
public interface Plant { 
	enum Vegetable implements INumberEnum { 
		POTATO(0, "土豆"), 
		TOMATO(0, "西红柿"); 
		Vegetable(int number, String description) { 
			this.code = number; 
			this.description = description; 
		} 
		private int code; 
		private String description;
		
		public int getCode() {
			// TODO Auto-generated method stub
			return code;
		}
		public String getDescription() {
			// TODO Auto-generated method stub
			return description;
		}
		
    } 
	
	
	enum Fruit implements INumberEnum { 
		APPLE(0, "苹果"),
		ORANGE(0, "桔子"), 
		BANANA(0, "香蕉"); 
		Fruit(int number, String description) {
			this.code = number; 
			this.description = description; 
		} 
		private int code; 
		private String description; 
		public int getCode() { return code; }
		
		public String getDescription() { return description; }
		
	}
}

/**Java中提供了两个方便操作enum的工具类——EnumSet和EnumMap。*/