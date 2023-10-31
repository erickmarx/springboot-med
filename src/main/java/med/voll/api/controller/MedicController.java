package med.voll.api.controller;
import jakarta.validation.Valid;
import med.voll.api.medic.Medic;
import med.voll.api.medic.MedicRepository;
import med.voll.api.medic.RegisterMedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medics")
public class MedicController {
    
    @Autowired
    private MedicRepository medicRepository;
    
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisterMedic data) {
        this.medicRepository.save(new Medic(data));
    }
}
