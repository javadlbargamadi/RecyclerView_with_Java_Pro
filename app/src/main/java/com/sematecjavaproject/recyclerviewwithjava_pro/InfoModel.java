package com.sematecjavaproject.recyclerviewwithjava_pro;

import android.widget.ScrollView;

public class InfoModel {

    InfoModel(String name, String family, Integer age) {

        setName(name);
        setFamily(family);
        setAge(age);
    }

    private String name;
    private String family;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
