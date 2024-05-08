package Tugas7;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate ulangTahun;

    public Employee(String name, String noKTP, LocalDate ulangTahun){
        this.name = name;
        this.noKTP = noKTP;
        this.ulangTahun = ulangTahun;
    }

    // Accessor dan mutator buat tgl lahir
    public LocalDate getUlangTahun() {
        return ulangTahun;
    }

    public void setUlangTahun(LocalDate ulangTahun) {
        this.ulangTahun = ulangTahun;
    }

    public String toStringTgl() {
        return String.format("%s\nNo. KTP: %s\nTanggal Lahir: %s", getName(), getNoKTP(), getUlangTahun());
    }

    public String getName(){
        return name;
    }

    public String getNoKTP(){
        return noKTP;
    }

    public String toString(){
        return String.format(" " + getName() + "\nNo. KTP : " + getNoKTP());
    }
    
    public abstract double earnings(); //pendapatan
}
