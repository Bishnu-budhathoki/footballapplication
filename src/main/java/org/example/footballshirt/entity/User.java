package org.example.footballshirt.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_table")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {


    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen", sequenceName = "information_seq", allocationSize = 1, initialValue = 1)
    @Id
    private Integer user_id;

    @Column(name = "user_name", length = 255)
    private String userName;

    @Column(name = "email", length = 255)
    private String emailAddress;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name= "contact",length = 255)
    private Integer contact;

}