package com.demo.voting.repository;

import com.demo.voting.model.PlayPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayPackageRepository extends JpaRepository<PlayPackage, Integer> {
}