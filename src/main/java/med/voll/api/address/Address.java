package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
    
    public Address(AddressRecord address) {
        this.logradouro = address.logradouro();
        this.bairro = address.bairro();
        this.cep = address.cep();
        this.cidade = address.cidade();
        this.uf = address.uf();
        this.numero = address.numero();
        this.complemento = address.complemento();
    }
}
