package zw.co.afrosoft.citizenservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.citizenservice.domain.Citizen;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen,Long> {

    List<Citizen> findByVaccinationCenterId(int id);
}
