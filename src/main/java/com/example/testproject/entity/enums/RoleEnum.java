package com.example.testproject.entity.enums;



public enum RoleEnum {
    DIRECTOR("direktor"),WORKER("worker"),LABARANT("labarant");

    private String name;


    RoleEnum(String name) {
        this.name=name;
    }
}
