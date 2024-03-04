
# QuizApp Backend

## Introduction

Welcome to the QuizApp Backend! This Java Spring Boot application provides a robust backend infrastructure for a quiz platform, allowing users to create questions across diverse categories.
Whether you're interested in Agriculture, Economics, Ghanaian History, Geography, Physics, Chemistry, or Biology, QuizApp Backend offers a flexible and entertaining way to engage users with quiz content.

## Features

- **Category-Based Question Creation:** Users can create and customize quiz questions based on their preferred category.

- **Diverse Categories:** The platform supports a wide range of categories, including Agriculture, Economics, Ghanaian History, Geography, Physics, Chemistry, and Biology.

- **Leaderboard Ranking:** Users have the opportunity to be ranked on a leaderboard according to their performance and marks scored in the quizzes.

## Getting Started

To get started with QuizApp Backend, follow these simple steps:

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/quizapp-backend.git
   ```

2. **Build and Run:**
   ```bash
   cd quizapp-backend
   ./mvnw spring-boot:run
   ```

   The application will be accessible at `http://localhost:8080`.

3. **Explore API Endpoints:**
   - Use tools like Postman to explore and interact with the API endpoints.

## API Endpoints

- **Create a Question:**
  ```http
  POST /question/add
  ```

- **Get All Questions:**
  ```http
  GET /question/allQuestions
  ```

- **Get Questions by Category:**
  ```http
  GET /question/category/{category}
  ```

## Leaderboard

- **Get Leaderboard:**
  ```http
  GET /leaderboard
  ```

## Contributing

Contributions to QuizApp Backend are welcome! Feel free to open issues, submit pull requests, or suggest new features to enhance the platform.
