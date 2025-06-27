package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {

    private TextField nameField, rollField, courseField, semesterField, emailField, phoneField;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Management System");

        GridPane formGrid = new GridPane();
        formGrid.setVgap(10);
        formGrid.setHgap(10);
        formGrid.setPadding(new Insets(15));

        nameField = new TextField();
        nameField.textProperty().addListener((obs, oldText, newText) -> {
            if (!newText.matches("[a-zA-Z\\s]*")) {
                nameField.setText(oldText);
            }
        });
        rollField = new TextField();
        courseField = new TextField();
        semesterField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();

        Button insertButton = new Button("Insert");
        insertButton.setStyle("-fx-background-color: #4CAF50; -fx-text-fill: white;");
        insertButton.setOnAction(e -> insertStudent());

        Button searchButton = new Button("Search");
        searchButton.setOnAction(e -> searchStudent());

        Button updateButton = new Button("Update");
        updateButton.setStyle("-fx-background-color: #2196F3; -fx-text-fill: white;");
        updateButton.setOnAction(e -> updateStudent());

        Button deleteButton = new Button("Delete");
        deleteButton.setStyle("-fx-background-color: #f44336; -fx-text-fill: white;");
        deleteButton.setOnAction(e -> deleteStudent());

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> clearFields());

        formGrid.add(new Label("Name:"), 0, 0); formGrid.add(nameField, 1, 0);
        formGrid.add(new Label("Roll Number:"), 0, 1); formGrid.add(rollField, 1, 1); formGrid.add(searchButton, 2, 1);
        formGrid.add(new Label("Course:"), 0, 2); formGrid.add(courseField, 1, 2);
        formGrid.add(new Label("Semester:"), 0, 3); formGrid.add(semesterField, 1, 3);
        formGrid.add(new Label("Email:"), 0, 4); formGrid.add(emailField, 1, 4);
        formGrid.add(new Label("Phone:"), 0, 5); formGrid.add(phoneField, 1, 5);

        HBox buttonBox = new HBox(10, insertButton, updateButton, deleteButton, clearButton);
        formGrid.add(buttonBox, 0, 6, 3, 1);

        VBox root = new VBox(15, formGrid);
        root.setPadding(new Insets(20));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    private void insertStudent() {
        String sql = "INSERT INTO students(name, roll_number, course, semester, email, phone) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nameField.getText());
            stmt.setString(2, rollField.getText());
            stmt.setString(3, courseField.getText());
            stmt.setString(4, semesterField.getText());
            stmt.setString(5, emailField.getText());
            stmt.setString(6, phoneField.getText());
            stmt.executeUpdate();
            String insertedData = String.format(
                "Student Inserted:\n\nName: %s\nRoll Number: %s\nCourse: %s\nSemester: %s\nEmail: %s\nPhone: %s",
                nameField.getText(),
                rollField.getText(),
                courseField.getText(),
                semesterField.getText(),
                emailField.getText(),
                phoneField.getText()
            );
            showAlert(Alert.AlertType.INFORMATION, insertedData);

            clearFields();
        } catch (SQLException e) {
            showAlert(Alert.AlertType.ERROR, "Insert Error: " + e.getMessage());
        }
    }

    private void searchStudent() {
        String sql = "SELECT * FROM students WHERE roll_number = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rollField.getText());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nameField.setText(rs.getString("name"));
                courseField.setText(rs.getString("course"));
                semesterField.setText(rs.getString("semester"));
                emailField.setText(rs.getString("email"));
                phoneField.setText(rs.getString("phone"));
            } else {
                showAlert(Alert.AlertType.INFORMATION, "No student found.");
            }
        } catch (SQLException e) {
            showAlert(Alert.AlertType.ERROR, "Search Error: " + e.getMessage());
        }
    }

    private void updateStudent() {
        String sql = "UPDATE students SET name=?, course=?, semester=?, email=?, phone=? WHERE roll_number=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nameField.getText());
            stmt.setString(2, courseField.getText());
            stmt.setString(3, semesterField.getText());
            stmt.setString(4, emailField.getText());
            stmt.setString(5, phoneField.getText());
            stmt.setString(6, rollField.getText());
            stmt.executeUpdate();
            showAlert(Alert.AlertType.INFORMATION, "Student updated successfully!");
        } catch (SQLException e) {
            showAlert(Alert.AlertType.ERROR, "Update Error: " + e.getMessage());
        }
    }

    private void deleteStudent() {
        String sql = "DELETE FROM students WHERE roll_number=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rollField.getText());
            stmt.executeUpdate();
            showAlert(Alert.AlertType.INFORMATION, "Student deleted successfully!");
            clearFields();
        } catch (SQLException e) {
            showAlert(Alert.AlertType.ERROR, "Delete Error: " + e.getMessage());
        }
    }

    private void clearFields() {
        nameField.clear(); rollField.clear(); courseField.clear(); semesterField.clear(); emailField.clear(); phoneField.clear();
    }

    private void showAlert(Alert.AlertType type, String msg) {
        Alert alert = new Alert(type);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "v3390");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
