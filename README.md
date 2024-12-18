# Патерни проєктування в Java

Цей проект створений для вивчення та демонстрації популярних патернів проектування на мові Java.
Кожен патерн реалізовано в окремому модулі, де наведено приклад використання та пояснення його
основних принципів.

## 🔖 Категорії патернів

### 1. **Створювальні (Creational Patterns)**

- **Singleton**  
  Забезпечує створення єдиного екземпляра класу та його глобальну доступність.  
  _(Модуль: `singleton`)_ [Go to the pattern](singleton/src/main/java/com/pattern/Main.java)

- **Factory Method**  
  Делегує створення об'єктів підкласам, дозволяючи використовувати різні варіанти реалізації.  
  _(Модуль: `factory-method`)_ [Go to the pattern](factory-method/src/main/java/com/pattern/Main.java)

- **Abstract Factory**  
  Надає інтерфейс для створення груп пов’язаних об'єктів без вказання їх конкретних класів.  
  _(Модуль: `abstract-factory`)_ [Go to the pattern](abstract-factory/src/main/java/com/pattern/Main.java)

- **Builder**  
  Полегшує створення складних об'єктів, дозволяючи налаштовувати їх поетапно.  
  _(Модуль: `builder`)_ [Go to the pattern](builder/src/main/java/com/pattern/Main.java)

- **Prototype**  
  Створює нові об'єкти через клонування існуючих.  
  _(Модуль: `prototype`)_ [Go to the pattern](prototype/src/main/java/com/pattern/Main.java)

---

### 2. **Структурні (Structural Patterns)**

- **Adapter**  
  Перетворює інтерфейс одного класу в інший, забезпечуючи сумісність.  
  _(Модуль: `adapter`)_

- **Decorator**  
  Додає нову функціональність до об'єкта динамічно, без змін його структури.  
  _(Модуль: `decorator`)_ [Go to the pattern](decorator/src/main/java/org/example/mytraining/Demo.java)

- **Facade**  
  Надає простий інтерфейс до складної системи.  
  _(Модуль: `facade`)_

- **Proxy**  
  Створює замінник або сурогат об'єкта, контролюючи доступ до нього.  
  _(Модуль: `proxy`)_

---

### 3. **Поведінкові (Behavioral Patterns)**

- **Iterator**  
  Дає змогу послідовно обходити елементи складових об’єктів,
  не розкриваючи їхньої внутрішньої організації  
  _(Модуль: `iterator`)_ [Go to the pattern](iterator/src/main/java/org/pattern/DemoIteratorPattern.java)

- **Observer**  
  Оновлює всі підписані об'єкти при зміні стану об'єкта-видавця.  
  _(Модуль: `observer`)_

- **Strategy**  
  Визначає набір алгоритмів, які можна змінювати динамічно.  
  _(Модуль: `strategy`)_

- **Command**  
  Інкапсулює запит у вигляді об'єкта, дозволяючи легко зберігати та виконувати команди.  
  _(Модуль: `command`)_

- **State**  
  Змінює поведінку об'єкта залежно від його поточного стану.  
  _(Модуль: `state`)_

- **Chain of Responsibility**  
  Передає запит по ланцюжку обробників до тих пір, поки він не буде оброблений.  
  _(Модуль: `chain-of-responsibility`)_

---

## 🛠️ Як використовувати

1. Склонуйте цей репозиторій:
   ```bash
   git clone https://github.com/KorbutViacheslav/design-patterns.git
   ```
2. Відкрийте проект у вашій IDE (наприклад, IntelliJ IDEA).
3. Оберіть модуль із цікавим вам патерном.
4. Запустіть відповідний приклад коду, щоб побачити реалізацію в дії.

## 📚 Ресурси для вивчення

[Refactoring Guru](https://refactoring.guru/uk/design-patterns/java) — зручний ресурс для вивчення
патернів.
