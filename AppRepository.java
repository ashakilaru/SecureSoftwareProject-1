public interface AppRepository extends JpaRepository<App, Long> {
  Optional<App> findByUsername(String userName);
}
