package com.example.first_work_project.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "knowledge_bases")
public class Knowledge_base {

    @Id
    @Column
    private int kb_id;

    @Column(length =  128)
    private String kb_name;

    @Column
    private int modified_by_user;

    @Column
    private Timestamp date_of_modification;

    @Column
    private boolean delete_as_soon_as_possible;

    @Column
    private Timestamp will_be_deleted_after;

    //@Column
    //private Text? description;

    @Column
    private int created_by_user;

    @Column
    private Timestamp date_of_creation;
}
