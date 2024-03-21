package com.AppMusic.Repository;

import com.AppMusic.Model.Ouvinte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OuvinteRepository extends JpaRepository<Ouvinte, Long> {
}
