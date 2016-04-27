package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAE9ZexA-fIbpOGMXPONOclqBOVSeRMrMs";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bHB8P_tiDw9Tft46ImXb8EiPgQ11ejjvvh0abf66_m38xTmNslMr_ZdYYR9o53S7-gagMf-r2mMh7JO56XE-CLeEEmxDqtHDTkawkaD9Rh9EYdkzImLfZbBekSISIDz-T1j_NDx");

        c.createData("Working!!", "Test message");

        return c;
    }
}

