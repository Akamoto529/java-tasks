package ru.mail.polis.homework.collections.mail;

import javafx.scene.text.Text;

public class MailMessage  extends  Mail<String>{
    public MailMessage(String sender, String receiver, String text){
        super(sender, receiver, text);
    }
}
