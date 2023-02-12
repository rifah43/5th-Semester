<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php
//$age = array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");
$cg["Peter"]=3.4;
$cg["Ben"]=3.7;
$cg["Joe"]=3.9;
$name= "Peter";
foreach($cg as  $x => $x_value){
  if($name===$x){
  echo $x."=".$x_value;
  }
}
?>
</body>
</html>