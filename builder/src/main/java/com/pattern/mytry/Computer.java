package com.pattern.mytry;

public class Computer {

  String mainBoard;
  String gPU;
  String cPU;
  String ram;
  String hdd;

  private Computer() {
  }

  public static class ComputerBuilder {

    String mainBoard;
    String gPU;
    String cPU;
    String ram;
    String hdd;

    public ComputerBuilder() {
    }

    public ComputerBuilder mainBoard(String mainBoard) {
      this.mainBoard = mainBoard;
      return this;
    }

    public ComputerBuilder gPU(String gPU) {
      this.gPU = gPU;
      return this;
    }

    public ComputerBuilder cPU(String cPU) {
      this.cPU = cPU;
      return this;
    }

    public ComputerBuilder ram(String ram) {
      this.ram = ram;
      return this;
    }

    public ComputerBuilder hdd(String hdd) {
      this.hdd = hdd;
      return this;
    }

    public Computer build() {
      Computer computer = new Computer();
      computer.mainBoard = this.mainBoard;
      computer.gPU = this.gPU;
      computer.cPU = this.cPU;
      computer.ram = this.ram;
      computer.hdd = this.hdd;
      return computer;
    }
  }

  public static ComputerBuilder builder() {
    return new ComputerBuilder();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Computer{");
    if (mainBoard != null) {sb.append("mainBoard='").append(mainBoard).append("', ");}
    if (gPU != null) {sb.append("gPU='").append(gPU).append("', ");}
    if (cPU != null) {sb.append("cPU='").append(cPU).append("', ");}
    if (ram != null) {sb.append("ram='").append(ram).append("', ");}
    if (hdd != null) {sb.append("hdd='").append(hdd).append("', ");}

    if (sb.lastIndexOf(", ") == sb.length() - 2) {
      sb.delete(sb.length() - 2, sb.length());
    }
    sb.append("}");
    return sb.toString();
  }
}
