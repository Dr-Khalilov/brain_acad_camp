package edu.brain.lesson_11;

import edu.brain.lesson_11.abstracts.AbstractDevice;
import edu.brain.lesson_11.interfaces.MailSender;

class Main {
    public static void main(String[] args) {
        SmartPhone nokia = new SmartPhone();
        nokia.name = "Nokia 5.3";
        nokia.serialNumber = 10000000;
        nokia.display = 6.55f;
        nokia.simCount = 2;
        nokia.os = "Android One 10";
        nokia.powerOn();
        nokia.runApp();
        nokia.call();
        nokia.powerOff();

        MultiCooker scarlet = new MultiCooker();
        scarlet.name = "Scarlet";
        scarlet.serialNumber = 12345678;
        scarlet.powerOn();
        scarlet.switchProgram(30);
        scarlet.cook();
        scarlet.powerOff();

        Oven oven = new Oven();
        oven.name = "Gorenje";
        oven.serialNumber = 313231;
        oven.powerOn();
        oven.initTimer(40);
        oven.cook();
        oven.powerOff();
        System.out.println();

        System.out.println("------------------------------------------------");

        SmartPhone phone = new SmartPhone();
        phone.calls();
        phone.createMail("Васёк побежал");
        phone.sendMail("Отправить");

        DialPhone dialPhone = new DialPhone();
        dialPhone.calls();

        Post post = new Post();
        post.createMail("lalalalala");
        post.sendMail("send");

        allPowerOff(oven, scarlet, nokia);

        allMailing(phone, nokia, post);
    }

    static void allPowerOff(AbstractDevice... devices) {
        for (AbstractDevice device : devices) {
            device.powerOff();
        }
    }

    static void allMailing(MailSender... senders) {
        for (MailSender sender : senders) {
            sender.sendMail("Рассылка писем всем");
        }
    }
}
