package com.example.first_work_project.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "versions")
public class Version {

    @Id
    @Column
    private BigInteger version_id;

    @Column
    private int kb_id;

    @Column
    private int user_id;

    //@Column
    //private TableNameType table_name; ?

    //@Column
    //private ActionType action; ?

    @Column
    private Timestamp registration_date;

    @Column
    private int previous_version_id;
}
