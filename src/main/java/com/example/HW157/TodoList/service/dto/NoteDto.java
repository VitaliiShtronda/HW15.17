package com.example.HW157.TodoList.service.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class NoteDto {
    private UUID id;
    private String title;
    private String content;

}
