package be.vdab.mail.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "leden")
public class Lid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String voornaam;
    @NotBlank
    private String familienaam;
    @NotNull
    @NotBlank
    private String emailAdres;
    @DateTimeFormat(style = "S-")
    private LocalDate lidSinds;

    public Lid(@NotBlank String voornaam, @NotBlank String familienaam, @NotNull @NotBlank String emailAdres) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.emailAdres = emailAdres;
        this.lidSinds = LocalDate.now();
    }

    protected Lid() {
    }

    public long getId() {
        return id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public String getEmailAdres() {
        return emailAdres;
    }

    public LocalDate getLidSinds() {
        return lidSinds;
    }
}
