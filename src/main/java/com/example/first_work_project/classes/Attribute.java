package com.example.first_work_project.classes;

import javax.persistence.*;

@Entity
@Table(name = "attributes")
public class Attribute {

    @Id
    @Column(name = "attribute_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attributeId;

    @Column(name = "attribute_name", length = 128)
    private String attributeName;

    @Column(name = "has_numeric_type")
    private boolean hasNumericType;

    @Column(name = "is_deleted")
    private boolean isDeleted;

    //@Column(name = "possible_numeric_range")
    //private numrange possibleNumericRange;

    @Column(name = "possible_string_values")
    private String possibleStringValues;
    //character varying[]

    @Column(length = 128)
    private String label;

    //kb_id

    @Column
    private String description;
    //Text

    //current_version

    //previous_version

    //first_version

}
