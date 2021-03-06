package com.codewithatoullo;
// Создать класс Самолет (Airplane) с полями: producer (изготовитель), year (год выпуска),  length (длина), weight (вес),  fuel (количество топлива в баке);

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    //Создать конструктор в классе Самолет, принимающий в качестве аргументов значения четырех полей класса (значение поля “количество топлива в баке” установить равным 0)
    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    //В конструкторе для передачи полям значений использовать ключевое слово this. Помимо этого, в классе необходимо реализовать метод info(), который выводит сообщение в следующем формате:
    // “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    // необходимо реализовать метод fillUp(int n), который в качестве аргумента принимает число и заправляет топливный бак самолета на это значение.
    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
