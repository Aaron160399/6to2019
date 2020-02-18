/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.sql.Blob;

/**
 *
 * @author bienvenidos
 */
public class Person {
    private int id;
    private String name;
    private String img;
    private Blob imgB;

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, Blob imgB) {
        this.id = id;
        this.name = name;
        this.imgB = imgB;
    }

    public Person(int id, String name, String img) {
        this.id = id;
        this.name = name;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Blob getImgB() {
        return imgB;
    }

    public void setImgB(Blob imgB) {
        this.imgB = imgB;
    }
}
