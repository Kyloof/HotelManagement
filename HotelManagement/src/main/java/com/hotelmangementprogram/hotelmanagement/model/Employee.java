package com.hotelmangementprogram.hotelmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "job",
        discriminatorType = DiscriminatorType.STRING)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public abstract class Employee extends People implements Serializable {
    @Column(name = "job", insertable = false, updatable = false)
    @Enumerated(EnumType.STRING)
    protected Job job;

    //paychecks
    public Employee(Long employeeId, String firstName, String lastName, String pesel, String phoneNumber, String emailAddress, Job job){
        super(employeeId, firstName, lastName, pesel, phoneNumber, emailAddress);
        this.job = job;
    }

    public void setJob(Job job){
        this.job = job;
    }
    abstract void calculatePaycheck();

}
