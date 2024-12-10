package org.example.mytraining;

abstract class OvenDecorator implements Oven {
    private final Oven oven;

    public OvenDecorator(Oven oven) {
        this.oven = oven;
    }

    @Override
    public String bake() {
        return oven.bake();
    }
}
