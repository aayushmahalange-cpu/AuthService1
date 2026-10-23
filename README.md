# AuthService

AuthService is a Java Spring Boot project for handling user authentication and authorization. It uses Spring Security and JSON Web Tokens (JWT) to manage login sessions and protect API endpoints.

## Features

- User signup and login
- Password hashing
- JWT-based authentication
- Access and refresh token handling
- Token refresh endpoint
- Request authentication using a JWT filter
- User details and email/password validation
- Protected API endpoints

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Security:** Spring Security
- **Authentication:** JWT
- **Build Tool:** Maven or Gradle, depending on the project configuration

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| POST | `/auth/v1/signup` | Register a user |
| POST | `/auth/v1/login` | Authenticate a user |
| POST | `/auth/v1/refreshToken` | Refresh an access token |
| GET | `/ping` | Check service availability |

The exact request format and response fields depend on the controller implementation.

## Main Components

- **AuthController:** Handles authentication-related API requests.
- **JwtService:** Creates and validates JWTs.
- **JWTFilter:** Processes authentication tokens in incoming requests.
- **SecurityConfig:** Defines security rules and endpoint access.
- **UserDetailsServiceImpl:** Loads user information for authentication.
- **RefreshTokenService:** Handles refresh-token operations.
- **AuthenticationManager:** Coordinates the authentication process.

## How to Run

1. Clone the repository:

   ```bash
   git clone YOUR_REPOSITORY_URL
   cd AuthService
   ```

2. Configure the required application properties and environment variables, including any database connection details and JWT secrets.

3. Start the application using the build tool configured in the project.

   For a Maven project:

   ```bash
   mvn spring-boot:run
   ```

   For a Gradle project, use the included Gradle wrapper and the configured Spring Boot run task.

4. Test the endpoints using Postman or another HTTP client.

## Security Notes

- Passwords should be stored as hashes, not plain text.
- JWT signing secrets should be kept outside source control.
- Protected endpoints should validate authentication tokens.
- Refresh tokens should be handled according to their configured expiration and revocation rules.

## Future Improvements

- Add automated tests for authentication flows
- Improve token revocation and logout handling
- Add API documentation
- Improve error responses and input validation
