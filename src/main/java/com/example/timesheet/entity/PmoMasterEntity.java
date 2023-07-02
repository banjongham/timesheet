package com.example.timesheet.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Accessors(chain = true)
@Table(name = "PMO_API_MASTER")
@Entity
@NoArgsConstructor
public class PmoMasterEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "API_ID")
    private String ApiId;

    @Column(name = "APPLICATION_CODE")
    private String ApplicationCode;

    @Column(name = "APPLICATION_KEY")
    private String ApplicationKey;

    @Column(name = "ACTIVE_FLG")
    private String ActiveFlg;

    @Column(name = "CREATE_BY")
    private String CreateBy;

    @Column(name = "CREATE_DATE")
    private Timestamp CreateDate;

    @Column(name = "UPDATE_BY")
    private String UpdateBy;

    @Column(name = "UPDATE_DATE")
    private Timestamp UpdateDate;
}
