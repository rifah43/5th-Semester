<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$id= $_POST["id"];
$name= $_POST["names"];
$price= $_POST["price"];
// echo $name."hi";
$server="localhost";
$user="root";
$pass="";
$db="classwork";
$connection = new mysqli($server,$user,$pass,$db);
if ($connection->connect_error) {
    echo "ERROR!"."<br"." Connection Failed!";
}
$query= "INSERT INTO item(id, names, price) VALUES ('$id','$name',$price)";
$connection->query($query);
$connection->close;
header::form.php;
}
?>