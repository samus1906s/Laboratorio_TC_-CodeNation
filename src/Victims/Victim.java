/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Victims;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Eduard Salas Murillo
 */
public class Victim {
    public String id;
    public String name;
    public LocalDate datebirth;
    public String gender;
    private String mail;
    private String phone;
    private int address;
    private int age;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDatebirth() {
        return datebirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public Victim(String id, String name, LocalDate datebirth, String gender, String mail, String phone, int address) {
        this.id = String.valueOf(id.hashCode());
        this.name = name;
        this.datebirth = datebirth;
        this.age = Period.between(datebirth, LocalDate.now()).getYears();
        this.gender = gender;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Victim{" + "id=" + id + ", name=" + name.hashCode() + ", datebirth=" + datebirth + ", gender=" + gender + ", mail=" + mail + ", phone=" + phone + ", address=" + address + '}';
    }
    

}
