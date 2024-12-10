package com.pattern.mytraining;

public class Pizza {
    private String bread;
    private String cheese;
    private String paper;
    private String meat;
    private String mushrooms;

    public Pizza() {
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public String getBread() {
        return bread;
    }

    public String getCheese() {
        return cheese;
    }

    public String getPaper() {
        return paper;
    }

    public String getMeat() {
        return meat;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setMushrooms(String mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", paper='" + paper + '\'' +
                ", meat='" + meat + '\'' +
                ", mushrooms='" + mushrooms + '\'' +
                '}';
    }
}
