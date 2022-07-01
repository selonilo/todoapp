package com.cmv.borusan.model.entity;

import com.cmv.borusan.model.base.ExtendedModel;
import com.cmv.borusan.model.type.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role extends ExtendedModel {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private UserRole name;
}
