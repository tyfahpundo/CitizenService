package zw.co.afrosoft.citizenservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.afrosoft.citizenservice.domain.Citizen;
import zw.co.afrosoft.citizenservice.persistence.CitizenRepository;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService{
    @Autowired
    private CitizenRepository citizenRepository;

    @Override
    public List<Citizen> getAllCitizens() {
        List<Citizen> citizens = citizenRepository.findAll();
        return citizens;
    }

    @Override
    public List<Citizen> getById(int id) {
        List<Citizen> citizens = citizenRepository.findByVaccinationCenterId(id);
        return citizens;
    }
}
