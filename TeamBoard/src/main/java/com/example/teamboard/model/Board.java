package com.example.teamboard.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Board {
    private int id;
    private String userid;
    private String title;
    private String content;
    private int hit;
    private LocalDateTime regdate;
}
