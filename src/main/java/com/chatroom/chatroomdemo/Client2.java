package com.chatroom.chatroomdemo;

import java.io.IOException;

public class Client2 {
    public static void main(String[] args) throws IOException {
        new ChatClient().start("王五");
    }
}
