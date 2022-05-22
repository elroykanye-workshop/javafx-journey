package com.elroykanye.p2personui.model;

public record Person(String firstName, String lastName, String notes) {
    @Override
    public String toString() {
        return firstName.concat(" ").concat(lastName);
    }
}