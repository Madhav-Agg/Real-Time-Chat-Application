# 💬 Real-Time Chat Application

A real-time messaging web application built using **Java, Spring Boot, WebSockets, and STOMP**. The application allows multiple users to connect to a shared chat room and exchange messages instantly without refreshing the page.

🌐 **Live Demo:** https://real-time-chat-application-hygn.onrender.com

## ✨ Features

- **Real-Time Messaging:** Send and receive messages instantly using WebSockets.
- **Multi-User Chat:** Multiple users can join the same chat room.
- **STOMP Messaging:** Uses STOMP destinations for message publishing and subscriptions.
- **Responsive UI:** Clean, modern chat interface designed for desktop and mobile screens.
- **Automatic Reconnection:** Configured to attempt reconnecting after a connection interruption.
- **Cloud Deployment:** Deployed online using Render.

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming language |
| Spring Boot | Application framework |
| Spring WebSocket | Real-time, bidirectional communication |
| STOMP | Messaging protocol over WebSockets |
| SockJS | WebSocket connection fallback support |
| Thymeleaf | Serving the chat page |
| HTML, CSS, JavaScript | Frontend structure, styling, and behavior |
| Bootstrap | Responsive UI components and styling |
| Maven | Dependency management and build automation |
| Docker | Containerization for deployment |
| Render | Cloud hosting |

## ⚙️ How It Works

1. A user opens the chat application and connects to the Spring Boot server.
2. The frontend establishes a connection through the `/chat` SockJS endpoint.
3. A user sends a message to `/app/sendmessage`.
4. The Spring Boot controller receives the message using `@MessageMapping`.
5. The message is broadcast to subscribers of `/topic/messages` using `@SendTo`.
6. All connected users receive the message in real time.

## 🚀 Run Locally

### Prerequisites

- Java version compatible with the project configuration
- Git
- Maven, or the Maven Wrapper included in the project

### 1. Clone the repository

```bash
git clone https://github.com/Madhav-Agg/Real-Time-Chat-Application.git
```

### 2. Open the project

Open the project in IntelliJ IDEA.

Navigate to the `app` directory, where the Spring Boot project and `pom.xml` are located.

### 3. Run the application

On Windows PowerShell:

```powershell
cd app
.\mvnw.cmd spring-boot:run
```

Alternatively, run the main Spring Boot application class from IntelliJ IDEA.

### 4. Open the chat

Visit:

```text
http://localhost:8080/chat
```

## 📁 Project Structure

```text
Real-Time-Chat-Application/
└── app/
    ├── Dockerfile
    ├── pom.xml
    ├── mvnw
    ├── mvnw.cmd
    └── src/
        └── main/
            ├── java/
            │   └── com/livechat/app/
            │       ├── controller/
            │       ├── model/
            │       └── WebConfig/
            └── resources/
                ├── templates/
                │   └── chat.html
                └── application.properties
```

*Package and file names may vary slightly depending on the current project structure.*

## ☁️ Deployment

The application is deployed on Render using Docker.

**Live application:** https://real-time-chat-application-hygn.onrender.com/chat

To deploy your own instance:

1. Fork or clone this repository.
2. Connect your GitHub repository to Render.
3. Select Docker as the runtime.
4. Set the root directory to `app`.
5. Set the Dockerfile path to `Dockerfile`.
6. Deploy the service and configure the WebSocket allowed origin for your deployed URL.

## 🔮 Future Improvements

- User registration and authentication
- Private one-to-one conversations
- Persistent message history using a database
- Chat rooms and group management
- Online presence and typing indicators
- Message timestamps and delivery status

## ⚠️ Current Limitations

- Messages are broadcast to all connected users.
- Messages are not persisted in a database.
- Usernames are not authenticated.
- This version is intended as a learning project and demonstration, not a secure production messaging service.

## 👨‍💻 Author

**Madhav Aggarwal**

- GitHub: [@Madhav-Agg](https://github.com/Madhav-Agg)
- LinkedIn: [Madhav Aggarwal](https://www.linkedin.com/in/madhav-aggarwal-a90805374/)

---

If you find this project useful, consider giving the repository a ⭐ on GitHub!
