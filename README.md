# 🔁 Practice time
## Practice 4: Bean Lifecycle 👀 Watcher
Goal: Observe how Spring manages a bean from birth to death.

- Create LifecycleDemoBean with @Component.

- Implement a method with @PostConstruct to print "Bean is born!".

- Implement a method with @PreDestroy to print "Bean is dying...".

Task: Run the app and then stop it. Check the console to see the sequence of messages.

## Practice 5: Manual Bean Definition
Goal: Define a bean without using @Service or @Component.

- Create a class CustomFeature (no annotations).

- In config/AppConfig.java, use @Configuration and create a method with @Bean that returns a new CustomFeature().

Task: Inject this CustomFeature into your Controller and see if it works.

## Practice 6: The "Hide and Seek" Scan
Goal: Manually tell Spring where to find components.

- Create HiddenService in a package outside the main application package.

- Try to @Autowired it. The app should fail (Bean not found).

Task: In your main class, use @SpringBootApplication(scanBasePackages = {"com.thinhreal.advanced", "com.extra"}) to fix it.

## Challenge 7: The 3-Tier Flow
Goal: Pass data through all layers using DTOs.

- Repository: Returns a UserEntity (with a fake password).

- Service: Receives UserEntity, converts it to UserDTO (removes password).

- Controller: Calls Service and returns UserDTO to the user.

Task: Verify that the API output never contains the password.