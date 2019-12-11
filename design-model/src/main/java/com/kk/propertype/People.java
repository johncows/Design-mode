package com.kk.propertype;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Date;

public class People implements  Cloneable, Serializable {

    private int id;
    private Integer age;
    private Date birthday;
    private Car car;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public People(int id, Integer age, Date birthday, String name, int price) {
        this.id = id;
        this.age = age;
        this.birthday = birthday;
        car = new Car(name,price);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public People() {
    }

//    @Override
//    public People clone() throws CloneNotSupportedException {
//
//        People people= null;
//        try {
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//            objectOutputStream.writeObject(this);
//            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
//            Object o = objectInputStream.readObject();
//            people= (People) o;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return people;
//    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", age=" + age +
                ", birthday=" + birthday +
                ", car=" + car +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
