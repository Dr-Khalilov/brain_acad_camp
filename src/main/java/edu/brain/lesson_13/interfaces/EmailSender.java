package edu.brain.lesson_13.interfaces;

public interface EmailSender extends MailSender {
    String editMail(String message);
}
