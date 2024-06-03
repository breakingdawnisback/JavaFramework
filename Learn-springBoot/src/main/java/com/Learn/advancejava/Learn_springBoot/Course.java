package com.Learn.advancejava.Learn_springBoot;

public class Course {

    private long id;
    private String name;
    private String author;

    //Constructor
    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    //getters
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
//tostring
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
    

}
