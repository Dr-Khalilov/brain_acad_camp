package edu.brain.lesson_13;

import edu.brain.lesson_13.abstracts.AbstractPhone;

class CellPhone extends AbstractPhone {
    int simCount;
    float display;

    @Override
    public void call() {
        System.out.println("При звонке выбираем из какой сим-карты звонить.\tВыбираем контакт из меню, звоним." +
                " Поднимаем трубку, набираем номер, звоним");
    }

    @Override
    public void powerOn() {
        System.out.println("Зажимаем кнопку вкл/выкл. Мобильный телефон запускается.");
    }

    @Override
    public void powerOff() {
        System.out.println("Зажимаем кнопку выкл/вкл. Мобильный телефон выключается.");
    }
}
