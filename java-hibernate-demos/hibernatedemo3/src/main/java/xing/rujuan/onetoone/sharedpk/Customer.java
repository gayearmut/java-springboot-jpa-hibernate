package xing.rujuan.onetoone.sharedpk;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//@Entity
@Setter
@Getter
public class Customer {


    @Id
    @GeneratedValue
    public Long id;
    public String firstName;
    public String lastName;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Address address;
}
