package com.example.websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private MessageType type;

    private String content;

    private String sender;

    public MessageType messageType;
}
