package me.bouzri.spring1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 40)
    private String Nom;

    @Temporal(TemporalType.DATE)
    @Column(name = "dn")
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
