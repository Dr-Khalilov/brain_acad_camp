package edu.brain.lesson13;

import edu.brain.lesson13.abstracts.AbstractMultiCooker;

class MultiCooker extends AbstractMultiCooker {
    @Override
    public void cook() {
        System.out.println("Кладём всё необходимое в мультиварку и выбираем режим приготовления");
    }

    void switchProgram(int min) {
        System.out.println("Выбираем программу и устанавливаем таймер приготовления на минут " + min);
    }
}
