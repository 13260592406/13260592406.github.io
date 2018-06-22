package com.test;

import java.util.concurrent.ThreadPoolExecutor;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString(exclude = { "tName" }, includeFieldNames = true)
/**
 * leanup 注释可用于确保已分配的资源被释放,如IO的连接关闭。
 * 
 * @author AirDou 2018年6月21日 下午4:37:04
 */
public class Test {

    private String tName;
    private String tSex;
    private String tAddr;

    public static void main(String[] args) {
        Test t = new Test();
        t.setTName("hh");
        System.out.println(t);
    }
   

}
