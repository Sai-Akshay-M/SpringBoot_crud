package com.sample.SpringBoot_crud.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Guide {

    //Attributes
    @Id
    private int id;
    private String guideName;
    private String authorName;


    public Guide(int id, String guideName, String authorName) {
        this.id = id;
        this.guideName = guideName;
        this.authorName = authorName;
    }
}
