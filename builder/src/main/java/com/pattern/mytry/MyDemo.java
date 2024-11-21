package com.pattern.mytry;

import com.pattern.mytry.Computer.ComputerBuilder;

public class MyDemo {

  public static void main(String[] args) {
    Computer computer = Computer.builder()
        .mainBoard("Asus mainboard")
        .cPU("Ryzen 7")
        .gPU("RTX4070")
        .ram("32GB")
        .hdd("1Terabyte")
        .build();
    Computer nakedComputer = Computer.builder()
        .mainBoard("AsRock")
        .build();

    System.out.println(computer);
    System.out.println(nakedComputer);
  }

}
