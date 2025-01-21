package com.foro.forohub.topico;

import com.foro.forohub.autor.Autor;
import com.foro.forohub.autor.DatosAutor;
import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public record DatosTopicos(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        @DateTimeFormat
        LocalDate fechaCreacion,
        @NotBlank
        Boolean status,
        @NotBlank
        DatosAutor autor,
        @NotBlank
        String curso) {
}
