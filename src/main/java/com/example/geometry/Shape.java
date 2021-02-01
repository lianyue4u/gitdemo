package com.example.geometry;

import com.shenzhi.belina.entity.Customer;

import java.awt.*;
import java.util.Objects;

abstract sealed class Shape permits Circle,Rectangle,Square{}
final class Circle    extends Shape {}
non-sealed class Rectangle extends Shape {}
sealed class Square extends Shape {}
final class TransparentRectangle extends Square{};







class Customer1{
    private final String name;
    private final Customer1 partner;

    public Customer1(String name, Customer1 partner) {
        this.name = name;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public Customer1 getPartner() {
        return partner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer1)) return false;
        Customer1 customer1 = (Customer1) o;
        return Objects.equals(name, customer1.name) && Objects.equals(partner, customer1.partner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, partner);
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "name='" + name + '\'' +
                ", partner=" + partner +
                '}';
    }
}

