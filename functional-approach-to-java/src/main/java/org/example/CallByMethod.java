package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 메서드 참조
 */
public class CallByMethod {

    class Customer {

        private final String name;
        private final boolean active;

        Customer(String name, boolean active) {
            this.name = name;
            this.active = active;
        }

        String getName() {
            return this.name;
        }

        boolean isActive() {
            return this.active;
        }
    }

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        // 람다 표현식
        customers.stream()
            .filter(customer -> customer.isActive())
            .map(customer -> customer.getName())
            .map(name -> name.toUpperCase())
            .peek(name -> System.out.println(name))
            .toArray(count -> new String[count]);

        // 메서드 참조
        customers.stream()
            .filter(Customer::isActive)
            .map(Customer::getName)
            .map(String::toUpperCase)
            .peek(System.out::println)
            .toArray(String[]::new);
    }
}
