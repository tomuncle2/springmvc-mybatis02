package com.itheima.springmvc.customeenum;
/**
 * @ClassName: Test4
 * @author 蔡迪
 * @date 2018年12月5日上午12:03:40
 * @Description: TODO(这里用一句话描述这个类的作用)
 */

public enum Test4 implements INumberEnum{
    Mondy("星期一",0),
    Tuesday("星期二",1),
    Wednesday("星期三",2);
    
    private String weekday;
    private int code;
    
    Test4(String weekday,int code){
        this.weekday = weekday;
        this.code = code;
    };
    
    public int getCode() {
        return code;
    }

    public String getDescription() {
        return weekday;
    }
    
    public static void main(String args[]) { 
        // 静态方法 
        for (Test4 test4 : Test4.values()) { 
            System.out.println(test4.name()+ " code: " + test4.getCode() + ", description: " + test4.getDescription()); 
        }
    }
}
