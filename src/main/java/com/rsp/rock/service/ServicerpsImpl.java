package com.rsp.rock.service;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ServicerpsImpl implements Servicerps {
    @Override
    public String gen(String input) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Rock");
        al.add("Paper");
        al.add("Scissor");

        Random random = new Random();
        int value = random.nextInt(3);
        String comp = al.get(value);

        if (input.equals(comp)) {
            return "User : " + input + "\nComp: " + comp + "\nIt's a Tie !";
        } else if (input.equals("Rock") && comp.equals("Scissor")) {
            return "User : " + input + "\nComp: " + comp + "\nUser Wins";
        } else if (input.equals("Scissor") && comp.equals("Paper")) {
            return "User : " + input + "\nComp: " + comp + "\nUser Wins";
        } else if (input.equals("Paper") && comp.equals("Rock")) {
            return "User : " + input + "\nComp: " + comp + "\nUser Wins";
        }

        return "User : " + input + "\nComp: " + comp + "\nComputer Wins";

    }
}
