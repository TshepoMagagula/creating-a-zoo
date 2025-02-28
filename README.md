# 🏞️ Java Zoo - OOP Concepts in Action

## 📌 Overview
The **Java Zoo** project is designed to demonstrate key **Object-Oriented Programming (OOP)** principles, including **inheritance, abstraction, polymorphism, and encapsulation**. This project simulates a zoo environment where different animals have specific behaviors, implemented using **abstract classes, interfaces, and concrete classes**.

## 🦁 Project Structure
### 🔹 Abstract Classes
- **`Animal`** → Base class for all animals, defining shared properties and behaviors.

### 🔹 Interfaces
- **`Eat`** → Represents the ability to eat.
- **`Swim`** → Represents the ability to swim.
- **`Walk`** → Represents the ability to walk.

### 🔹 Concrete Classes
- **`Tiger`** → Extends `Animal`, implements `Eat` and `Walk`.
- **`Dolphin`** → Extends `Animal`, implements `Eat` and `Swim`.
- **`Penguin`** → Extends `Animal`, implements `Eat`, `Swim`, and `Walk`.

### 🔹 Main Class
- **`Main`** → Entry point to demonstrate the interactions between objects.

## 🎯 Features
✅ Uses **inheritance** to share common behavior across animals.  
✅ Implements **abstraction** to define structured animal behavior.  
✅ Demonstrates **polymorphism** to allow dynamic method behavior.  
✅ Uses **encapsulation** to protect data and ensure safe interactions.  

## 🚀 Getting Started
### 🔹 Prerequisites
Ensure you have **Java 8+** installed on your system.

### 🔹 Clone the Repository
```bash
git clone https://github.com/yourusername/java-zoo.git
cd java-zoo
```

### 🔹 Compile and Run
```bash
javac Main.java
java Main
```

## 🛠️ Usage
- Run the `Main` class to see different animals interact with their environment.
- Modify or extend the classes to add more animals and behaviors.

## 📌 Example Output
```
Tiger is walking...
Tiger is eating...
Dolphin is swimming...
Dolphin is eating...
Penguin is walking...
Penguin is swimming...
Penguin is eating...
```

## 🤝 Contribution
Contributions are welcome! Feel free to fork this repository, create new features, or fix any issues.  
### 🔹 Steps to Contribute
1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Open a Pull Request.

## 📜 License
This project is open-source and available under the **MIT License**.

---

Happy coding! 🚀🐯🐬🐧

