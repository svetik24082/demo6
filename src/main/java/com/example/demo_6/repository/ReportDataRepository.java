package com.example.demo_6.repository;

import com.example.demo_6.model.ReportData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;
@Repository
public interface ReportDataRepository extends JpaRepository<ReportData, Long> {
    Set<ReportData> findListByChatId(Long id);
    ReportData findByChatId(Long id);
}
