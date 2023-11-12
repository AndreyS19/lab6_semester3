<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Sort Array App</title>
</head>
<body>
<h1>Сортировка чисел</h1>
<form method="post" action="sort">
    <label for="numbers">Введите целые числа(разделенные запятыми):</label><output></output><br>
    <input type="text" pattern="([\d]+[,]*)+" id="numbers" name="numbers" required><br>
    <input type="submit" value="Сортировать">
</form>
</body>
</html>
