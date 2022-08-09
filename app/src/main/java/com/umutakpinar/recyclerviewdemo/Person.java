package com.umutakpinar.recyclerviewdemo;

import java.io.Serializable;

public class Person implements Serializable{

    String name;
    String info;
    int image;

    public Person(String _name,String _info, int _image){
        this.name = _name;
        this.info = _info;
        this.image = _image;
    }
}
