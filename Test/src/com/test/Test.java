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
 * leanup ע�Ϳ�����ȷ���ѷ������Դ���ͷ�,��IO�����ӹرա�
 * 
 * @author AirDou 2018��6��21�� ����4:37:04
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
