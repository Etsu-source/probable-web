package ec.etsudesu.prueba.jose.bone.model;

import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "info_usuario_rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InfoUsarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private AdmiUsuario usuarioId;

    @ManyToOne
    @JsonIgnoreProperties({ "admi_usuario" })
    @JoinColumn(name = "rol_id")
    private AdmiRol rolId;

    @Column(length = 50)
    private String usuarioCreacion;

    @Column
    private Date fechaCreacion;

    @Column(length = 50)
    private String usuarioModificacion;

    @Column
    private Date fechaModificacion;

    @Column(length = 30)
    private String estado;

}
