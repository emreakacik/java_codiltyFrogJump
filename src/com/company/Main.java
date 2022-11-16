package com.company;

public class Main {

    public int solotion(int x,int y, int d){
        int mesafe=y-x;
        int ziplama=(int)Math.ceil(mesafe/(double)d);
        return ziplama;
    }

    public static void main(String[] args) {
        System.out.println(new Main().solotion(10,85,30));
	    }
}
