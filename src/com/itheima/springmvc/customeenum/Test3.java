package com.itheima.springmvc.customeenum;
/**
 * @ClassName: Test3
 * @author 蔡迪
 * @date 2018年12月4日下午11:47:33
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public enum Test3 {
    Mondy("星期一"){public int getCode(){return 0;}},
    Tuesday("星期二"){public int getCode(){return 1;}},
    Wednesday("星期三"){public int getCode(){return 2;}};
   
    
    private  int code;
    private String weekday;
    //显示赋值的枚举 对应的实例构造方法
    Test3(String weekday,int code){
        this.code = code;
        this.weekday = weekday;
    };
    
   
    //没有显示赋值的枚举 的构造方法
    Test3(){}
    
    
    Test3(String weekday){
       
        this.weekday = weekday;
    };
    
    public abstract int getCode();
    
    public static void main(String args[]) { 
        // 静态方法 
        for (Test3 test3 : Test3.values()) { 
            System.out.println("code: " + test3.getCode() + ", description: " + test3); 
        } 
    }
}
