<?php
$servername = "localhost";
$username = "root";
$password = "Nishant2003@";
$dbname = "sams";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$name = $_POST['name'];
$password = $_POST['password'];
$mobile = $_POST['mobile'];
$email = $_POST['email'];

// Use prepared statements to avoid SQL injection
$stmt = $conn->prepare("INSERT INTO students (name, password, mobile, email) VALUES (?, ?, ?, ?)");
$stmt->bind_param("ssis", $name, $password, $mobile, $email);

if ($stmt->execute()) {
    echo "Registration successful!";
} else {
    echo "Error: " . $stmt->error;
}

$stmt->close();
$conn->close();
?>
