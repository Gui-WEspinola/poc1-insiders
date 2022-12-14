package io.GuiWEspinola.poc1.repository;

import io.GuiWEspinola.poc1.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
