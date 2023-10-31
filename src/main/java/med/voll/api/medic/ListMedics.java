package med.voll.api.medic;

public record ListMedics(String nome, String email, String crm, Specialty specialty) {
    public ListMedics(Medic medic) {
        this(medic.getName(), medic.getEmail(), medic.getCrm(), medic.getSpecialty());
    }
}
