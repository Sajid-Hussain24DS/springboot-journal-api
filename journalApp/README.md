Journal Management Backend



A secure, high-performance backend built with Spring Boot. Features dual-layer authentication, distributed caching, automated background tasks, and real-time API integration for contextual journaling.



Key Features



Secure Auth: JWT \& Google OAuth2 authentication



Performance: Redis caching for fast data retrieval



API Integration: Real-time Weather API for journal entries



Automation: Scheduled background tasks (Cron jobs)



Documentation: Swagger UI (OpenAPI)



Testing: Unit tests with JUnit 5 \& Mockito



Technologies



Backend: Spring Boot 3.x, Spring Security, Spring Data MongoDB Database: MongoDB, Redis Security: JWT, OAuth2 Tools: Maven, Lombok, Swagger UI



Installation \& Run git clone https://github.com/yourusername/project-name.git cd project-name



Update application.properties with MongoDB, Redis, and API keys

mvn clean install mvn spring-boot:run Usage



Access API via Swagger UI: http://localhost:8080/swagger-ui.html



Register/Login to get a JWT token



Use the token in Authorization header to access protected endpoints



Create journal entries; weather data is automatically appended

