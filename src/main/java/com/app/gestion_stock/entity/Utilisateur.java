package com.app.gestion_stock.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    @JsonIgnore
    private Long id;
    private String nom;
    private String prenom;

    @Column(unique = true)
    private String email;
    private String telephone;
    private String adresse;
}
