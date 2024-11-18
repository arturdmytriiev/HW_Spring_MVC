package org.example.spring_mvc_cpntroller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Note {
    private Long id;
    private String title;
    private String content;

}
