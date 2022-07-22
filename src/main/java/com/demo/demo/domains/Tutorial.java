package com.demo.demo.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alejandro Anachuri
 * @version 1.0
 * @description <p>Tutorial domain class</p>
 * @date 2022-07-22 15:36
 **/
@Entity
@Table(name="tutorials")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;
    private String description;
}
