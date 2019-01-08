package com.itheima.springmvc.customeenum;
/**全面展示如何在枚举中定义普通方法、静态方法、抽象方法、构造方法为为枚举常量赋值*/
public enum ErrorCode { 
	/*枚举实例名必须在属性或者方法之前*/
   //相当于给实例定义方法，但是这个方法必须是枚举类共有的(抽象)
	OK(0) { public String getDescription() { return"成功"; } },
	ERROR_A(100) { public String getDescription() { return "错误A"; } },
	ERROR_B(200) { public String getDescription() { return "错误B"; } };
//	ERROR_C(300) {public int getTT(){return 5;}};
//	private static int tt;
	private int code; 
	
     ErrorCode(int code){
         this.code = code;
     }
	// 构造方法：enum的构造方法只能被声明为private权限或不声明权限
//	private ErrorCode(int number) {
//	// 构造方法
//     this.code = number; 
//    }
	
	public int getCode() { 
		// 普通方法
	   return code; 
	} 
	// 抽象方法 
	public abstract String getDescription(); 
	
	// 静态方法 
	public static void main(String args[]) { 
		// 静态方法 
		for (ErrorCode s : ErrorCode.values()) { 
		    s.code = 9;
			System.out.println("code: " + s.getCode() + ", description: " + s.getDescription()); 
		}

	}
}
