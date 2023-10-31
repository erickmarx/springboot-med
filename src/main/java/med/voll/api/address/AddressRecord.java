package med.voll.api.address;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AddressRecord(@NotBlank String logradouro, @NotBlank String bairro,
                            @NotBlank @Size(min = 8, max = 8) String cep, @NotBlank String cidade, @NotBlank String uf,
                            String numero, String complemento) {}
