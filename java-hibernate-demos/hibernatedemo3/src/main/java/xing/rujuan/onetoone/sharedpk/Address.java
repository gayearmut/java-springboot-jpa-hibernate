package xing.rujuan.onetoone.sharedpk;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Setter
@Getter
//@Entity
public class Address {

    @Id
    private Long id;
    private String street;
    private String zipCode;


    @OneToOne
    @PrimaryKeyJoinColumn
    private Customer customer;

}
