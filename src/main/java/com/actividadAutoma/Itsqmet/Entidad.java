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
    @Past(message = "La fecha debe ser en el pasado")
    private Date fecha_nacimiento;

    @NotNull
    @Min(value = 18, message = "Debe ser mayor o igual a 18 años")
    private Integer edad;

    @Pattern(regexp = "^\\+?\\d{1,3}?[-.\\s]?\\d{1,15}$", message = "Número de teléfono no válido")
    private String telefono;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$", message = "El correo debe ser válido y contener un dominio correcto")
    private String emailAlternativo;

    @NotBlank(message = "El campo género no debe estar vacío")
    private String genero;

    @Digits(integer = 5, fraction = 2, message = "Debe ser un número válido con hasta 5 enteros y 2 decimales")
    private Double salario;

    @AssertTrue(message = "Debe aceptar los términos y condiciones")
    private Boolean aceptaTerminos;

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Boolean getAceptaTerminos() {
        return aceptaTerminos;
    }

    public void setAceptaTerminos(Boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }
}

