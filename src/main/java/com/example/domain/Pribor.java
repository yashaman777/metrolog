package com.example.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by yasha on 28.09.2016.
 */
@Entity
@Table
public class Pribor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String number;
    @Column
    private int invent_number;
    @Column
    private String name;
    @Column
    private String type;
    @Column
    private int year;
    @Column
    private String zavod;
    @Column
    private String scale;
    @Column
    private String price_scale;
    @Column
    private String pogreshnost;
    @Column
    private String adress;
    @Column
    private String place;
    @Column
    private String last_check;
    @Column
    private int interval_check;
    @Column
    private String next_check;
    @Column
    private String primechanie;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getInvent_number() {
        return invent_number;
    }

    public void setInvent_number(int invent_number) {
        this.invent_number = invent_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getZavod() {
        return zavod;
    }

    public void setZavod(String zavod) {
        this.zavod = zavod;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getPrice_scale() {
        return price_scale;
    }

    public void setPrice_scale(String price_scale) {
        this.price_scale = price_scale;
    }

    public String getPogreshnost() {
        return pogreshnost;
    }

    public void setPogreshnost(String pogreshnost) {
        this.pogreshnost = pogreshnost;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getLast_check() {
        return last_check;
    }

    public void setLast_check(String last_check) {
        this.last_check = last_check;
    }

    public int getInterval_check() {
        return interval_check;
    }

    public void setInterval_check(int interval_check) {
        this.interval_check = interval_check;
    }

    public String getNext_check() {
        return next_check;
    }

    public void setNext_check(String next_check) {
        this.next_check = next_check;
    }

    public String getPrimechanie() {
        return primechanie;
    }

    public void setPrimechanie(String primechanie) {
        this.primechanie = primechanie;
    }
}
