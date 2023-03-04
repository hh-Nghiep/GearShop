package com.example.gearshop;

public class SinhVien {
    String id, name, dayofbirth;
    Boolean gender;
    Boolean select;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Boolean getSelect() {
        return select;
    }

    public void setSelect(Boolean select) {
        this.select = select;
    }


    public SinhVien(){

    }

    public SinhVien(String id, String name, String dayofbirth, Boolean gender, Boolean select) {
        this.id = id;
        this.name = name;
        this.dayofbirth = dayofbirth;
        this.gender = gender;
        this.select = select;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayofbirth='" + dayofbirth + '\'' +
                ", gender=" + gender +
                ", select=" + select +
                '}';
    }
}
