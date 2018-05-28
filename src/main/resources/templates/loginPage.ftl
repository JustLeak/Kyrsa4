<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Форма для авторизации</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="https://code.jquery.com/jquery-3.2.1.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet" type="text/css"/>
    <script src="/js/script.js" type="text/javascript"></script>
</head>
<body>
<div class="dws-wrapper">
    <#if error??>
        sosi
    </#if>
    <div class="dws-form">
        <label class="tab active" title="Inset 1"> Authorization</label>
        <label class="tab" title="Inset 2"> Registration </label>

        <form class="tab-form active" method="post" action="/login">
            <input class="input" id="login" name="login" type="text">
            <input class="input" id="password" name="password" type="password">
        <#-- <label class="input" for="remember-me">Запомнить меня</label>
         <input class="input" type="checkbox" name="remember-me" id="remember-me">-->
            <input class="input" type="submit">
        </form>

        <form class="tab-form " method="post" action="/registration">
            <input class="input" type="text" placeholder="Input login">
            <input class="input" type="text" placeholder="Input first name">
            <input class="input" type="text" placeholder="Input last name">
            <input type="radio" name="gender" value="male"> Male
            <input type="radio" name="gender" value="female"> Female
            <input class="input" type="number" placeholder="Input weight(kg)">
            <input class="input" type="number" placeholder="Input height(sm)">
            <input class="input" type="password" placeholder="Password">
            <input class="input" type="submit" value="Submit">
        </form>
    </div>

</div>
</body>
</html>