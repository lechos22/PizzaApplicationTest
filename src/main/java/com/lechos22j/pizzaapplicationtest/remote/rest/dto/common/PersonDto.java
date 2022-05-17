package com.lechos22j.pizzaapplicationtest.remote.rest.dto.common;

public class PersonDto {
    // fields: String name, String phone, String address, Integer floor
    private String name;
    private String phone;
    private String address;
    private Integer floor;
    // constructors: PersonDto(), PersonDto(String name, String phone, String address, Integer floor)
    public PersonDto() {
    }
    public PersonDto(String name, String phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }
    // getters and setters: String getName(), void setName(String name), String getPhone(), void setPhone(String phone), String getAddress(), void setAddress(String address), Integer getFloor(), void setFloor(Integer floor)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Integer getFloor() {
        return floor;
    }
    public void setFloor(Integer floor) {
        this.floor = floor;
    }
}
