package zw.co.afrosoft.citizenservice.service;

import org.springframework.stereotype.Component;
import zw.co.afrosoft.citizenservice.domain.Citizen;

import java.util.List;

@Component
public interface CitizenService {
    List<Citizen> getAllCitizens();

    List<Citizen> getById(int id);

    Citizen add(Citizen newCitizen);
}
