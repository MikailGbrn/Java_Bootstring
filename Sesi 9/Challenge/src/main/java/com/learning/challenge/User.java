package com.learning.challenge;

public class User {
    int id;
    private String firstname;
    private String lastname;

    public User() {

    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("user{").append("id=").append(id)
        .append("| First Name= ").append(firstname)
        .append("| Last Name= ").append(lastname).append("}");

        return build.toString();
    }
    
}
