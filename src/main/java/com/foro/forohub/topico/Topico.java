package com.foro.forohub.topico;

import com.foro.forohub.autor.Autor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Table(name = "topicos")
@Entity(name = "topico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDate fechaCreacion;
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "autor_id" , nullable = false)
    private Autor autor;
    private String curso;

    public Topico(DatosTopicos datosTopicos) {
        this.titulo = datosTopicos.titulo();
        this.mensaje = datosTopicos.mensaje();
        this.fechaCreacion = datosTopicos.fechaCreacion();
        this.status = datosTopicos.status();
        this.autor = new Autor(datosTopicos.autor());
    }
}
