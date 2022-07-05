package com.kh.example.practice2.model.vo;

public class Product {

    public String pName;
    public int price;
    public String brand;

    public Product(String name, int pPrice, String pBrand) {
        pName = name;
        price = pPrice;
        brand = pBrand;
    }

    public void information() {
        System.out.printf("제품명 : %s, 가격 : %d원, 브랜드명 : %s\n", pName, price, brand);
    }

}
