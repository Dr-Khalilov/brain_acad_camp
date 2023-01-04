package edu.brain.lesson_11;

import edu.brain.lesson_11.abstracts.AbstractMultiCooker;

class Oven extends AbstractMultiCooker {
    @Override
    public void cook() {
        System.out.println("Накладываем все что нужно на противень и ставим в духовое отделение и готовим");
    }

    void initTimer(int min) {
        System.out.println("Устанавливаем таймер приготовления: " + min);
    }
}
