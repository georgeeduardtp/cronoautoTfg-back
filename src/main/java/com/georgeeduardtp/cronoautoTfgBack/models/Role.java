package com.georgeeduardtp.cronoautotfgback.models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;


@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  public Role() {

  }

  public Role(ERole name) {
    this.name = name;
  }

  // getters and setters
}
