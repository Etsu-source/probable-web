package ec.etsudesu.prueba.jose.bone.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admi_usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdmiUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(length = 100)
    private String usuario;

    @NotBlank
    @Column(length = 100)
    private String password;

    @NotBlank
    @Column(length = 50)
    private String nombres;

    @NotBlank
    @Column(length = 50)
    private String apellidos;

    @NotBlank
    @Column(length = 200)
    private String direccion;

    @NotBlank
    @Column(length = 100)
    private String telefono;

    @Column(length = 50)
    private String usuarioCreacion;

    @Column
    private Date fechaCreacion;

    // @Column(length = 500)
    private Byte foto; // tipo de dato no confirmado

    @Column(length = 1)
    private String estado;

    @OneToMany(mappedBy = "admi_usuario")
    @JsonIgnoreProperties({ "admi_usuario" })
    private Set<InfoUsarioRol> infoUsarioRol = new HashSet<>();

}
