package domain.models;

import domain.DTOs.UserDTO;

public class Forfun {
    private String name;
    private UserDTO holder;

    public Forfun() {}

    public Forfun(String name, UserDTO holder) {
        setName(name);
        setHolder(holder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDTO getHolder() {
        return holder;
    }

    public void setHolder(UserDTO holder) {
        this.holder = holder;
    }
}
