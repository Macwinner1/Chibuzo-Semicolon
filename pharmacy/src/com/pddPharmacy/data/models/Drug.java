package com.pddPharmacy.data.models;

import java.time.LocalDateTime;

public class Drug {
    private Long id = 0L;
    private String name;
    private Category category;
    private Type type;
    private LocalDateTime manufactureOn;
    private int quantity;
    private LocalDateTime expirationDate;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getManufactureOn() {
        return manufactureOn;
    }

    public void setManufactureOn(LocalDateTime manufactureOn) {
        this.manufactureOn = manufactureOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

