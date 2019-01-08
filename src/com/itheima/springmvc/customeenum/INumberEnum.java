package com.itheima.springmvc.customeenum;
/**枚举可以实现接口*/
public interface INumberEnum { 
	int getCode(); 
	String getDescription(); 
} 

 enum ErrorCodeEn2 implements INumberEnum { 
   OK(0, "成功"), 
   ERROR_A(100, "错误A"),
   ERROR_B(200, "错误B");
   ErrorCodeEn2(int number, String description) {
	   this.code = number; this.description = description;
   } 
   private int code; 
   private String description; 

	public int getCode() {
		
		return code; 
	}
	public String getDescription() {
		return description;
	}
	
	public static void main(String[] args) {
	    for(ErrorCodeEn2 errorcode : ErrorCodeEn2.values()){
	        System.out.println(errorcode +" : " + errorcode.ordinal());
	    }
	}
}
