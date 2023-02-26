<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$fname= $_POST["fname"];
$lname= $_POST["lname"];
$mail= $_POST["mail"];
$address= $_POST["address"];
$image= $_POST["image"];

$server="localhost";
$user="root";
$pass="";
$db="classwork";
$connection = new mysqli($server,$user,$pass,$db);
if ($connection->connect_error) {
    echo "ERROR!"."<br"." Connection Failed!";
}
$query= "INSERT INTO site_info(firstname, lastname, mail, address, image) VALUES ('$fname','$lname','$mail','$address','$image')";
$connection->query($query);
$connection->close();
}
header("sitedisplay.php");
?>