package com.example.Head;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by yasha on 28.09.2016.
 */
@Entity
@Getter
@Setter
public class Pribor {
    @Id
    @Getter
    @Setter

    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId()
    {return id;}

    @Column
    @Getter
    @Setter

    private String number;
    @Column
    @Getter
    @Setter

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

}
