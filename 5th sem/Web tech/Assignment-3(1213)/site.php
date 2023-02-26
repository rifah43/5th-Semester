<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>My site</title>
</head>
<body>
    <div class="container">
		<div class="container">
			<div class="formBox">
				<form action="sitedisplay.php" method="post" enctype="multipart/form-data">
						<div class="row ">
							<div class="half">
								<label for="id">First Name</label>
								<input type="text" name="fname" required="required">
							</div>
							<div class="half"></div>
								<label for="id">Last Name</label>
								<input type="text" name="lname" required="required">
							</div>
						</div><br><br>

						<div class="row">
							<div class="col-sm-12">
								<div class="full">
									<label for="id">Email</label>
									<input type="text" name="mail" class="input" required="required">
								</div>
							</div>
						</div><br><br>

						<div class="row">
							<div class="col-sm-12">
								<div class="full">
									<label for="id">Address</label>
									<textarea class="input" name="address" required="required"></textarea>
								</div>
							</div>
						</div>
                        <div class="form-group">
                            <label for="exampleFormControlFile1">Photo</label>
                            <input type="file" name="image" id="image" required="required">
                          </div><br>
						<div class="row">
							<div class="col-sm-6">
								<button type="reset" class="btn btn-default cancel">Cancel</button>
							</div>
							<div class="col-sm-6">
								<button type="submit" class="btn btn-default submt">Submit</button>
							</div>
						</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>