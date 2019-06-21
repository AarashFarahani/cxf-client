package com.example;


import com.example.service.Greeting;
import com.example.service.GreetingService;
import com.example.service.GreetingServiceImplService;

public class GreetingClient {

    public static void main(String[] args) {
        GreetingServiceImplService service = new GreetingServiceImplService();
        GreetingService port = service.getGreetingServiceImplPort();
        Greeting greeting = port.sayHowAreYou("Arash Farahani");
        System.out.println(greeting.getMessage());
    }
}
