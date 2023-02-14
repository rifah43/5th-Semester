<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Form</title>
<link rel="stylesheet" type="text/css" href="signup.css">
</head>
<body>
<div class="container">
    <form action="formstore.php" method="POST">
        <div class="form-group">
        <label for="id">ID:</label>
			<div class="id"><input type="text" class="form-control" name="id" required="required"></div>       	
        </div>
        <div class="form-group">
        <label for="name">Name:</label>
			<div class="name"><input type="text" class="form-control" name="names" required="required"></div>       	
        </div>
		<div class="form-group">
        <label for="price">Price:</label>
            <input type="number" class="form-control" name="price">
        </div>      
		<div class="form-group">
            <button type="submit" class="btn btn-primary btn-lg">Submit</button>
        </div>
    </form>
</div>
</body>
</html>