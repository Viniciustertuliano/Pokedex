package com.pokedex.reactiveweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pokemon {

    @Id
    private String id;

    private String name;

    private String category;

    private String skills;

    private Double weight;

}
