package med.voll.api.medic;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import med.voll.api.address.AddressRecord;

public record RegisterMedic(@NotBlank String name, @NotBlank @Email String email, @NotBlank String phone,
                            @NotBlank @Size(min = 4, max = 6) String crm, @Enumerated Specialty specialty,
                            @NotNull @Valid AddressRecord address) {
    
}
