package com.example.first_work_project.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "objects")
public class Object {

    @Id
    @Column
    private int object_id;

    @Column
    private String object_name;

    @Column
    private int object_node_type;

    @Column
    private boolean is_deleted;

    @Column
    private String description;

    @Column
    private boolean is_full_event;

    @Column
    private int current_version;

    @Column
    private int previous_version;

    @Column
    private Long first_version;
}
