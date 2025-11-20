# URLShortenerApp

**URL Shortener GUI** is a simple desktop application built in Java using **Swing**, which allows users to shorten long URLs and generate clickable short codes. The application stores the mapping locally and provides a quick way to manage and access URLs.

---

## Features
- Graphical User Interface using **Java Swing**.  
- Generates **unique short codes** for URLs.  
- Displays the short code in a clickable label.  
- Opens the original URL in the default browser when clicked.  
- Lightweight and easy-to-use.  

---

## Installation

- Clone the Repository :
```bash
git clone https://github.com/ravikiran-m-p/URLShortenerApp.git
```

- Navigate to the project folder:  ``` cd URLShortenerGUI ```

- Compile the Java files: ``` javac URLShortenerGUI.java ```

- Run the application: ``` java URLShortenerGUI ```

---

## Usage

- Launch the application.
- Enter a long URL in the text field.
- Click the "Shorten" button.
- The application generates a short code displayed as a clickable link.
- Click the short code to open the original URL in your default browser.

---

## How It Works
- Maintains a map of short codes to original URLs.
- Generates a 6-character random code for each URL.
- Checks for duplicates before saving the short code.
- Uses Desktop.getDesktop().browse() to open URLs on click.

---

## Technologies Used
   - Java SE
   - Java Swing for GUI
   - Java AWT for event handling and opening browser
