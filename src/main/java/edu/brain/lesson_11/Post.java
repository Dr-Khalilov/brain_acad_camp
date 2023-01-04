package edu.brain.lesson_11;

import edu.brain.lesson_11.interfaces.EmailSender;

class Post implements EmailSender {
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
        System.out.println("Mail was sent " + str);
    }
}
