package tn.esprit.Charfi_Imen_4Actuariat.service.implementation;

import org.springframework.stereotype.Service;
import tn.esprit.Charfi_Imen_4Actuariat.entities.Employe;
import tn.esprit.Charfi_Imen_4Actuariat.repository.EmployeRepository;
import tn.esprit.Charfi_Imen_4Actuariat.service.interfaces.IEmployeService;
import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeServiceImpl implements IEmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public Employe addEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe updateEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe retrieveEmploye(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Employe> retrieveAllEmployes() {
        return new HashSet<>(employeRepository.findAll());
    }
}