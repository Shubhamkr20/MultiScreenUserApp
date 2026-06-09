📱 MultiScreenUserApp

An Android application demonstrating multi-screen navigation, user data handling, and basic UI design using Activities, Fragments, and ViewBinding.

🚀 App Overview

This app allows a user to:

Login with name and email
View a dashboard with a welcome message
Edit profile details
Logout safely

The project is built to understand core Android concepts and is suitable for beginner learning and interviews.

🧭 App Flow
Login Screen
   ↓
Dashboard Screen
   ↓
Profile Screen
   ↓
Save → Back to Dashboard
   ↓
Logout → Login Screen
🖥️ Screens
1️⃣ Login Screen
Input fields for Name and Email
Input validation
Error message for invalid input
Navigates to Dashboard on success

Concepts used:

Activity
ViewBinding
Input validation
Intent navigation
2️⃣ Dashboard Screen
Displays welcome message
Button to open Profile screen
Logout button

Concepts used:

Activity
Fragment navigation
Fragment back stack
3️⃣ Profile Screen
Displays user name and email
Allows editing user details
Dummy profile image
Save button updates user data

Concepts used:

Fragment
ViewBinding
Shared data handling
🧩 Architecture & Navigation
Activities
LoginActivity
DashboardActivity
Fragment
ProfileFragment
Navigation
Activity → Activity using Intent
Fragment → Fragment using FragmentManager
Back navigation handled via fragment back stack
🔄 State Management
User data is stored temporarily using a SessionManager
Data persists while the app is running
Fragment back stack ensures smooth navigation
UI state is preserved during screen rotation
🗂️ Data Handling
User Model
User(name: String, email: String)
SessionManager
Stores current logged-in user
Clears data on logout
✅ Validation Rules
Name must not be empty
Email must:
Not be empty
Contain @ and .
Error messages shown for invalid input
🎨 UI & Design
Clean and minimal UI
Built using XML layouts
Uses ViewBinding (no findViewById)
Dummy profile image stored in drawable
⭐ Bonus Features Implemented
✅ Logout functionality
✅ Temporary user data storage
✅ Dummy profile image
✅ Fragment back stack handling
🛠️ Tech Stack
Language: Kotlin
IDE: Android Studio
UI: XML
Architecture: Activities + Fragments
View Handling: ViewBinding
📂 Project Structure
com.example.multiscreenuserapp
│
├── LoginActivity.kt
├── DashboardActivity.kt
├── ProfileFragment.kt
├── SessionManager.kt
├── User.kt
├── Validator.kt
│
├── res/layout
│   ├── activity_login.xml
│   ├── activity_dashboard.xml
│   └── fragment_profile.xml
│
└── res/drawable
    └── ic_profile.png
🧠 Key Learnings
Android Activity lifecycle
Fragment usage and back stack
Data passing and storage
Input validation
ViewBinding best practices
Clean UI structure
🧪 How to Run
Clone the repository
Open in Android Studio
Sync Gradle
Run on emulator or device
📌 Interview Notes

Why ViewBinding?
Avoids null pointer issues and removes boilerplate code.

Why Fragments?
Efficient UI reuse and better navigation control.

Why SessionManager?
Simple in-memory state handling for beginner projects.

📎 Future Improvements
Persist data using SharedPreferences
Add profile image picker
Use ViewModel for better state handling
Improve UI with Material Design
