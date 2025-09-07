
@Entity
@Table(name = “app_identity”)
public class App {
  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long appId; // unique identifier for the app

  @Column (nullable = false, unique = true)
  private String userName; // stores the username

  @Column (nullable = false)
  private String pass; // stores password
}
