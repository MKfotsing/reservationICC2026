package be.iccbxl.pid.reservations_springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import be.iccbxl.pid.reservations_springboot.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
	List<Artist> findByLastname(String lastname);

	Artist findById(long id);
}
