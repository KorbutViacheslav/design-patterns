package org.example.creationalPatterns.builder.animalBuilder;

public class Animal {
    private final String name;
    private final int age;
    private final boolean isVaccinated;

    private Animal(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.isVaccinated = builder.isVaccinated;
    }

    public static class Builder {
        private String name;
        private int age;
        private boolean isVaccinated;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder isVaccinated(boolean isVaccinated) {
            this.isVaccinated = isVaccinated;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
