# 🚌 QuickBus — Bus Booking Android App
<img width="474" height="952" alt="Screenshot 2025-09-05 174219" src="https://github.com/user-attachments/assets/defaf2cf-6411-4902-8b47-830e52c39b9f" />
<img width="475" height="956" alt="Screenshot 2025-09-05 174426" src="https://github.com/user-attachments/assets/b9d4aaa6-b667-461c-84f8-b5ee691e8253" />
<img width="473" height="956" alt="Screenshot 2025-09-05 174508" src="https://github.com/user-attachments/assets/50224d2d-4389-4dd7-b685-08b9f6d664c4" />
<img width="473" height="956" alt="Screenshot 2025-09-05 172939" src="https://github.com/user-attachments/assets/7e23849c-dfed-4607-b460-ab8fe8673139" />
<img width="475" height="957" alt="Screenshot 2025-09-05 172955" src="https://github.com/user-attachments/assets/91930413-9602-4a71-9cec-cc378e0c9262" /><img width="474" height="954" alt="Screenshot 2025-09-05 174630" src="https://github.com/user-attachments/assets/9196267a-d96d-4eb5-9738-0f3f3e95c7de" />



QuickBus is an Android mobile application that allows users to search bus routes, view schedules, book seats, and make payments — all from their smartphone.

---

## ✨ Features

- 🔐 **User Authentication** — Register and Login functionality
- 🗺️ **Route Search** — Browse and search available bus routes
- 🕐 **Schedule Viewer** — View bus schedules and timings
- 🎟️ **Seat Booking** — Book bus seats with ease
- 💳 **Payment** — Complete payment flow with success confirmation
- 🔔 **Notifications** — Stay updated with booking alerts
- 👤 **User Profile** — Manage personal account details
- ⚙️ **Settings** — App preferences and options
- 🎨 **Onboarding Screens** — Smooth 4-step onboarding experience for new users

---

## 🛠️ Tech Stack

| Technology | Details |
|---|---|
| Language | Kotlin |
| Platform | Android |
| Min SDK | API 24 (Android 7.0) |
| Target SDK | API 36 (Android 16) |
| UI | XML Layouts + Material Design |
| Navigation | Bottom Navigation View |
| Build System | Gradle (Kotlin DSL) |

---

## 📁 Project Structure

```
QuickBus/
├── app/
│   └── src/main/java/com/example/quickbus/
│       ├── LaunchScreen.kt
│       ├── WelcomeScreen.kt
│       ├── OnboardingScreen1.kt - OnboardingScreen4.kt
│       ├── Login.kt
│       ├── Register.kt
│       ├── Home.kt
│       ├── Route.kt
│       ├── Schedule.kt
│       ├── Booking.kt
│       ├── Payment.kt
│       ├── PaymentSuccessful.kt
│       ├── Notification.kt
│       ├── Profile.kt
│       └── Setting.kt
```

---

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog or later
- Android SDK API 24+
- Kotlin 2.0.21+

### Installation

1. Clone the repository
```bash
git clone https://github.com/it23677296-ayesha/quick-bus-app.git
```

2. Open the project in **Android Studio**

3. Let Gradle sync complete

4. Run the app on an emulator or physical device (API 24+)

---

## 📱 App Flow

```
LaunchScreen → WelcomeScreen → Onboarding (1→2→3→4)
    → Login / Register → Home
        ├── Route → Schedule → Booking → Payment → PaymentSuccessful
        ├── Notifications
        ├── Profile
        └── Settings
```

---

## 👩‍💻 Developer

**Ayesha** — IT Undergraduate @ SLIIT
- GitHub: [@it23677296-ayesha](https://github.com/it23677296-ayesha)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
