package com.example.demo.Entity;

import com.example.demo.Enum.MessageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "chat_Message")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private MessageType type;


}
