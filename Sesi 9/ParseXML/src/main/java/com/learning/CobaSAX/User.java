package com.learning.CobaSAX;

public class User {
    int id;
    private String name;
    private String gender;
    private String role;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("user{").append("id=").append(id)
        .append("name=").append(name)
        .append("gender=").append(gender)
        .append("role=").append(role).append("}");

        return build.toString();
    }
    
}
