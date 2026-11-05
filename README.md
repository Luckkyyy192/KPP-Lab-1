# Лабораторна робота № 1. Варіант 8 — Order

Дисципліна: «Кросплатформне програмування». Реалізовано незмінний клас `Order`.

- `subtotal() = unitPrice * quantity`;
- `discountAmount() = subtotal() * discountPercent / 100`;
- `amountDue() = subtotal() - discountAmount()`.

Параметри: `unitPrice` — додатне скінченне double; `quantity` — додатне int; `discountPercent` — скінченне double в діапазоні [0; 100]. Помилка дає `IllegalArgumentException`.

## Підготовка

Ці файли є **готовими змінами для офіційної заготовки**; усі викладацькі файли, включно з `Lab1PublicTest.java`, `pom.xml`, `mvnw.cmd`, повинні бути взяті без змін з репозиторію викладача. Запустіть `INSTALL_FROM_GITHUB.ps1` з кореня архіву в PowerShell для автоматичного завантаження повної заготовки.

## Запуск (Windows, JDK 25)

```powershell
cd 'Lab Assignment 1'
.\mvnw.cmd -B -ntp clean verify
'249.90 3 10' | java -cp target/classes ua.khnu.kpp.lab1.Main
```

Очікування:
```
RESULT_1=749.70
RESULT_2=74.97
RESULT_3=674.73
```

Негативні приклади: `0 3 10`, `249.90 0 10`, `249.90 3 -1`, `abc`, `249.90 3 10 extra` -> `ERROR`.

Результати справжніх Maven/JUnit тестів і Git commit SHA потрібно записати після запуску та публікації, не підмінюючи їх.
