package com.AI;
public class Administrator extends Person {
    private String Contact ;
    private String Role ;

    public Administrator(String name) {
        super(name);
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
