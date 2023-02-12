<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
</head>
<body>
    
    <form action="store.php" method= "post">
        <!-- eta on click chole jaoa solid text dekhay -->
        <label for="nid">NID no:</label>
        <input type="number" name="nid" required>
        <label for="date">Date:</label>
        <input type="number" name="date" required>
        <label for="month">Month:</label>
        <select name="month">
            <option>Jan</option>
            <option>Feb</option>
            <option>Mar</option>
            <option>Apr</option>
            <option>May</option>
            <option>June</option>
            <option>Jul</option>
            <option>Aug</option>
            <option>Sep</option>
            <option>Oct</option>
            <option>Nov</option>
            <option>Dec</option>
        </select>
        <label for="year">Year:</label>
        <input type="number" name="year" required><br>
        <label for="captcha">Captcha</label>
        <h1>uggdliw</h1>
        <input type="text" name="captcha" required><br>
        <input type="submit" value="Register">

    </form>
</body>
</html>