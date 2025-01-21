package com.foro.forohub.autor;

import jakarta.validation.constraints.NotBlank;

public record DatosAutor(
        @NotBlank
        String nombre,
        @NotBlank
        String email) {
}
