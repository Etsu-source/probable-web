package ec.etsudesu.prueba.jose.bone.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admi_rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdmiRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nombre;

    @Column(length = 200)
    private String descripcion;

}
