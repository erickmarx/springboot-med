package med.voll.api.controller;
import jakarta.validation.Valid;
import med.voll.api.medic.ListMedics;
import med.voll.api.medic.Medic;
import med.voll.api.medic.MedicRepository;
import med.voll.api.medic.RegisterMedic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medics")
public class MedicController {
    
    @Autowired
    private MedicRepository medicRepository;
    
    @GetMapping
    @Transactional
    public List<ListMedics> list() {
        return this.medicRepository.findAll().stream().map(ListMedics::new).toList();
    }
    
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid RegisterMedic data) {
        this.medicRepository.save(new Medic(data));
    }
}
