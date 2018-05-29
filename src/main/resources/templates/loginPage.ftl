<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Форма для авторизации</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <script src="/js/script.js" type="text/javascript"></script>
</head>
<body>
<div class="dws-wrapper">
    <#if logout>
        <div class="alert alert-info" role="alert">You've been logged out successfully.</div></#if>
    <#if error>
        <div class="alert alert-danger" role="alert">Invalid Email or Password!</div></#if>
    <div class="dws-form">
        <label class="tab active" title="Inset 1"> Authorization</label>
        <label class="tab" title="Inset 2"> Registration </label>

        <form class="tab-form active" method="post" action="/login">
            <input class="input" id="login" name="login" type="text" placeholder="Email">
            <input class="input" id="password" name="password" type="password" placeholder="Password">
            <input class="input" type="submit" value="Submit">
        </form>

        <form class="tab-form" name="userFrom" method="post" action="/registration">
            <input class="input" type="text" name="login" placeholder="Input login">
            <input class="input" type="text" name="firstName" placeholder="Input first name">
            <input class="input" type="text" name="lastName" placeholder="Input last name">
            <input class="input" type="number" name="age" placeholder="Input age">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="gender_male" value="MALE" checked>
                <label class="form-check-label" for="gender_male">
                    Male
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="gender_female" value="FEMALE">
                <label class="form-check-label" for="gender_female">
                    Female
                </label>
            <input class="input" type="number" name="weight" placeholder="Input weight(kg)">
            <input class="input" type="number" name="height" placeholder="Input height(sm)">
            <input class="input" type="password" name="password" placeholder="Password">
            <input class="input" type="submit" value="Submit">
        </form>
    </div>

</div>
</body>
</html>