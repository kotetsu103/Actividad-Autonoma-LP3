package com.actividadAutoma.Itsqmet;

import jakarta.validation.constraints.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Entidad {
    @Size(min = 3, max = 50)
    private String nombre;

    @Size(min = 3, max = 50)
    private String apellido;

    @NotNull
    @Email(message = "Ingrese un correo")
    private String email;

    @NotNull
    @Size(min = 8, max = 10)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}", message = "Mínimo ocho y máximo 15 caracteres, al menos una letra mayúscula, una letra minúscula, un número y un carácter especial:")
    private String password;

    @Size(min = 10, max = 150)
    private String domicilio;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha_nacimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}

