public interface EnergyReadingRepository extends JpaRepository<EnergyReading, Long> {

    List<EnergyReading> findByReadingDate(LocalDate date);

    // ... otros métodos de consulta y actualización
}