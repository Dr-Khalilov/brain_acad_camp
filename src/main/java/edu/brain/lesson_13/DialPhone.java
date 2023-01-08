package edu.brain.lesson_13;

import edu.brain.lesson_13.abstracts.AbstractPhone;
import edu.brain.lesson_13.interfaces.Caller;

class DialPhone extends AbstractPhone implements Caller {

    @Override
    public void powerOn() {
        System.out.println("Подключаем стационарный телефон к сети. И зажимаем кнопку включения");
    }

    @Override
    public void powerOff() {
        System.out.println("Зажимаем кнопку выключения. Стационарный телефон выключается. Отключаем его от сети");
    }

    @Override
    public void calls() {
        System.out.println("Picks from list contacts and caller");
    }

    @Override
    public void call() {
        System.out.println("Выбираем из списка контактов контакт и звоним либо набираем номер");
    }

    void autoAnswer() {
        System.out.println("Автоответчик включается если владелец не берёт трубку");
    }
}
