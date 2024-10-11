package main.java.org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseDisc {
    String name;
    int capacity;
    String discType;
    String content;

    //Constructor
    public BaseDisc(String name, int capacity, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.discType = discType;
        this.content = "";
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public String getContent() {
        return content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
