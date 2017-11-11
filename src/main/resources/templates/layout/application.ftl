<#import "/spring.ftl" as spring/>
<#macro layout>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Example</title>
    <link rel='stylesheet' href='/webjars/bootstrap/3.3.5/css/bootstrap.min.css'>
</head>

<body>
    <nav class="navbar navbar-default">
        <div class="container">
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/one/">One</a></li>
                    <li><a href="/two/">Two</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <#nested>
    </div>
</body>
</html>
</#macro>