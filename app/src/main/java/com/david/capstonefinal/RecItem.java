package com.david.capstonefinal;

import java.util.ArrayList;

/**
 * Created by David on 12/14/2017.
 */

public class RecItem implements java.io.Serializable{
    String title;
    String date;
    String desc;
    String rating;
    Float commRating;
    String picture;
    Float yourRating;
    String ytLink;
    int id;
    ArrayList<String> actors;

    RecItem(){

    }

    RecItem(String title,String date,String desc,String rating, ArrayList<String> actors,Float commRating, String picture,Float yourRating,String ytLink,int id){
        this.title = title;
        this.date = date;
        this.desc = desc;
        this.rating = rating;
        this.actors = actors;
        this.commRating = commRating;
        this.picture = picture;
        this.yourRating = yourRating;
        this.ytLink = ytLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public String getYtLink() {
        return ytLink;
    }

    public void setYtLink(String ytLink) {
        this.ytLink = ytLink;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ArrayList<String> getActors() {
        return actors;
    }

    public void setActors(ArrayList<String> actors) {
        this.actors = actors;
    }

    public Float getCommRating() {
        return commRating;
    }

    public void setCommRating(Float commRating) {
        this.commRating = commRating;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Float getYourRating() {
        return yourRating;
    }

    public void setYourRating(Float yourRating) {
        this.yourRating = yourRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
