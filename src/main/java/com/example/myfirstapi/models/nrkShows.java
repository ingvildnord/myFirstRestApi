package com.example.myfirstapi.models;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Representation of database table,
 * */
public class nrkShows {

    @Id
    private ObjectId _id;

    @Field ("seriesId")
    private String seriesId;
    @Field ("date")
    public String date;
    @Field ("screen")
    public String screen;
    @Field ("views")
    public String views;

    //todo see if possible to convert to better datatypes

    public nrkShows() {}
    public nrkShows(ObjectId _id, String seriesId, String date, String screen, String views) {
        this._id = _id;
        this.seriesId = seriesId;
        this.date = date;
        this.screen = screen;
        this.views = views;
    }

    //Converted type to string, potentially not needed
    public String get_id() {
        return _id.toHexString();
    }
    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getSeriesId() {
        return seriesId;
    }
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getScreen() {
        return screen;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getViews() {
        return views;
    }
    public void setViews(String views) {
        this.views = views;
    }
}
