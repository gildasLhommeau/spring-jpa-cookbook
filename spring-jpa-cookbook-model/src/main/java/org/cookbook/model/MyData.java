package org.cookbook.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "my_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyData  implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id_data")
    private Integer id;

    @Column(name= "code_data")
    private String code;
    @Column(name = "label_data")
    private String label;

}
