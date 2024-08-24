# 🚗 FIPE Table Consumer

This project is a Java-based application that consumes the FIPE API to collect and display vehicle data to users. The application is designed following SOLID principles, ensuring modularity, maintainability, and flexibility. It allows users to interact with the FIPE table, select categories, brands, and models of vehicles, and view detailed information about them.

## ✨ Features

- **🚙 Vehicle Category Selection:** Users can select a vehicle category (e.g., cars, motorcycles) to explore.
- **🔍 Brand and Model Filtering:** Users can filter brands and models based on their preferences.
- **📊 Detailed Vehicle Information:** The application fetches and displays detailed information about vehicle models, including their available years.

## 🗂️ Project Structure

- **🧑‍💻UserInterface:** Orchestrates the application's flow by interacting with the user and coordinating services.
- **🛠️ AutomotiveService:** Handles the retrieval and processing of automotive data from the FIPE API.
- **💻 DisplayService:** Responsible for displaying messages and data to the user.
- **🔗 AutomotiveUrlBuilder:** Constructs the URLs required to make API requests based on user input.
- **🌐 ApiService:** (Not detailed above but implied) Handles the actual API requests and data conversion.
- **🔄 DataConverter:** (Referenced but not detailed) Converts the raw JSON data from the API into Java objects.

## 🚀 Getting Started

### 📋 Prerequisites

- **☕ Java 11** or higher
- **🔧 Maven** (for dependency management and building)

### 🛠️ Installation

1. Clone the repository:
    
    ```bash
    git clone https://github.com/FernandoAurelius/fipe-table.git
    cd fipe-table-consumer
    ```
    
2. Build the project using Maven:
    
    ```bash
    mvn clean install
    ```
    

### ▶️ Running the Application

1. Run the application:
    
    ```bash
    java -jar target/FipeTableApplication.jar
    ```
    
2. Follow the on-screen prompts to interact with the FIPE table.

### 📚 Usage

- **🚗 Select Vehicle Category:** At the start, the application will prompt you to choose a vehicle category (e.g., `carros`, `motos`).
- **🏷️ Select Brand:** After selecting a category, you'll be prompted to choose a brand from the displayed list.
- **🔍 Filter Models:** You can further filter models by name.
- **📅 View Details:** Finally, you can view detailed information about a model, including the available years.

### 📖 Example Interaction

1. The application starts and asks for a vehicle category (e.g., `carros`).
2. The user selects a category and is presented with a list of brands.
3. The user chooses a brand and sees a list of models.
4. The user can filter these models by entering a part of the model name.
5. The application then displays detailed information about the selected model.

## 🏗️ Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── br/com/floresdev/fipe_table/
│   │       ├── application/
│   │       │   └── UserInterface.java
│   │       ├── models/
│   │       │   ├── AutomotiveBrand.java
│   │       │   ├── AutomotiveYear.java
│   │       │   ├── BaseBrand.java
│   │       │   └── BaseYear.java
│   │       ├── services/
│   │       │   ├── ApiService.java
│   │       │   ├── AutomotiveService.java
│   │       │   ├── DataConverter.java
│   │       │   └── DisplayService.java
│   │       └── utils/
│   │           └── AutomotiveUrlBuilder.java
└── test/
    └── java/
        └── br/com/floresdev/fipe_table/
            └── AllTestClassesHere.java
```

## 🤝 Contributing

If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are welcome.

1. Fork the repository.
2. Create your feature branch:
    
    ```bash
    git checkout -b feature/YourFeatureName
    ```
    
3. Commit your changes:
    
    ```bash
    git commit -m 'Add some feature'
    ```
    
4. Push to the branch:
    
    ```bash
    git push origin feature/YourFeatureName
    ```
    
5. Open a pull request.

## 🙌 Acknowledgements

- **🚘 FIPE API:** This project consumes the <a href="https://deividfortuna.github.io/fipe/">FIPE API</a> to retrieve vehicle data.
- **💡 SOLID Principles:** The project is designed with SOLID principles in mind, promoting maintainable and scalable code.
