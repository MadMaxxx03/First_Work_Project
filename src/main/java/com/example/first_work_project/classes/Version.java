package com.example.first_work_project.classes;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "versions")
public class Version {

    @Id
    @Column(name = "version_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger versionId;

    @Column(name = "kb_id")
    private int kbId;

    @Column(name = "user_id")
    private int userId;

    //@Column
    //private TableNameType table_name; ?

    //@Column
    //private ActionType action; ?

    @Column(name = "registration_date")
    private Timestamp registrationDate;

    @Column(name = "previous_version_id")
    private int previousVersionId;
}
