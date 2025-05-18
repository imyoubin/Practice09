package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	List<Goods> gsList = new ArrayList<Goods>();
        Scanner sc = new Scanner(System.in);
        
        int ttc = 0;
        System.out.println("상품을 입력해주세요(종료 q)");
        
        while(true) {
        	String line =sc.nextLine();
        	if("q".equals(line)) {
        		System.out.println("[입력완료]");
        		System.out.println("=================");
        		break;
        		
        	}
        	String[] data = line.split(",");
        	String na = data[0];
        	int pr = Integer.parseInt(data[1]);
        	int con = Integer.parseInt(data[2]);
        	
        	Goods goods = new Goods(na,pr,con);
        	gsList.add(goods);
        	
        }
        for(int i=0; i<gsList.size();i++) {
        	gsList.get(i).showInfo();
        	
        }
        for(int i=0;i<gsList.size();i++) {
        	ttc=ttc+gsList.get(i).getCount();
        	
        }
        System.out.println("모든 상품의 갯수는 "+ ttc+"개 입니다.");
        sc.close();
    	
       
    }

}
