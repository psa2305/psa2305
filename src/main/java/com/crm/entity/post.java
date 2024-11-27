package com.crm.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comments;

import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "post")
public class post {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 5000)
    private String description;


}