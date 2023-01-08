package edu.brain.lesson_13;

import edu.brain.lesson_13.interfaces.Caller;
import edu.brain.lesson_13.interfaces.EmailSender;

class SmartPhone extends CellPhone implements Caller, EmailSender {
    String os;

    @Override
    public void calls() {
        System.out.println("Выбираем из списка контактов имя и звоним ему");
    }

    @Override
    public String editMail(String message) {
        return message;
    }

    @Override
    public String createMail(String mail) {
        return mail;
    }

    @Override
    public void sendMail(String str) {
        System.out.println("Send " + str);
    }

    void runApp() {
        System.out.println("Pick some app from list applications and run it");
    }
}
