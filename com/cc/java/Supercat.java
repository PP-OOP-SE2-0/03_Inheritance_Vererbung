package com.cc.java;

public class Supercat {

private String name;




public String getStringAttributes(String flag) {
    switch (flag) {
        case "#name":
            return name;
        case "#color":
            return furColor;
        default:
            return "#!ERROR";
    }
}

    
}
