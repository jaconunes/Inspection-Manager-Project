package com.inspectionmanager.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Inspect {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    private String type;

    private String status;

    private String access;

    private String powerMeterId; // número do medidor de energia

    private String powerMeterReading;

    private String waterMeterId;

    private String waterMeterReading;

    @ManyToOne
    @JoinColumn(name = "USER_ID", nullable = false)
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Long customerId;

    @ManyToOne
    @JoinColumn(name = "PROPERTY_ID", nullable = false)
    private Long propertyId;

    @ManyToOne
    @JoinColumn(name = "RENTER_ID", nullable = false)
    private Long renterId;

}
