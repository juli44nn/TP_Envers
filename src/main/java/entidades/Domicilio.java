package entidades;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Audited
public class Domicilio implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_calle")
    private String nombreCalle;

    private int numero;

    @OneToOne(mappedBy = "domicilio")
    private Cliente cliente;
}
