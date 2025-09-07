@RestController
@RequestMapping("/apps")
public class AppController {
  @Autowired
  private AppRepository appRepository;

  @Autowired
  private PasswordService passwordService;

  @PostMapping("/register")
  public App registerUser(@RequestBody App app) {
    app.setPass(passwordService.encode(app.getPass()));
    return appRepository.save(app);
  }

  @GetMapping
  public List<App> getAllUsers() {
    return appRepository.findAll();
  }
}
