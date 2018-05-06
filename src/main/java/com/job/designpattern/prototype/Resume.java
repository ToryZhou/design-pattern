package com.job.designpattern.prototype;

import lombok.Data;

@Data
public class Resume implements Cloneable {

    private String name;
    //String 是特殊的引用类型会进行深拷贝
    private String sex;
    //值类型在clone时会复制到新对象
    private int age;

    private WorkExperience workExperience;

    //引用类型会浅拷贝，拷贝时引用的还是同一个对象，要深拷贝需要一层一层拷贝
    private Prize prize;

    public Resume(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.workExperience.setTimeArea(timeArea);
        this.workExperience.setCompany(company);
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }

    public Resume deepClone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.workExperience = workExperience.clone();
        resume.prize = prize.clone();
        return resume;
    }
}
