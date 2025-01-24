package com.actividadAutoma.Itsqmet;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Entidad {
    @Size(min=3, max=50)
    private String nombre;

    @Size(min=3, max=50)
    private String apellido;

    @NotNull
    @Email(message="Ingrese un correo")
    private String email;

    @NotNull
    @Size(min=8, max=10)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}", message = "Mínimo ocho y máximo 15 caracteres, al menos una letra mayúscula, una letra minúscula, un número y un carácter especial:")
    private String password;

    @Size(min = 10, max = 150)
    private String domicilio;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fecha_nacimiento;
}
