package team.targaryen.selton.chapter1.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // other field
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String hobby;
}
