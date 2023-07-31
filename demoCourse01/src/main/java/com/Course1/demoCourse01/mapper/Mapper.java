package com.Course1.demoCourse01.mapper;
import com.google.gson.Gson;
public class Mapper<T> {
    private Gson gson;

    private Class<T> type;

    public Mapper(Class<T> type){
        // TODO Auto-generated constructor stub
        gson = new Gson();
        this.type = type;
    }


    public String Object2Json(T t) {
        return gson.toJson(t);
    }

    public T Json2Object(String json) {
        return gson.fromJson(json, type);

    }
}
