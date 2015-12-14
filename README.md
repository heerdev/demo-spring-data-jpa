<h1>Spring Web MVC (+ Hibernate, Spring Data JPA) without any XML file using Spring Boot</h1>

<p>No web.xml, no Spring xml configuration file, no persistence.xml, 
no *.hbm.xml, simply no XML configuration file is in this example, 
which retrieves data from database and returns them in JSON format.</p>

<p>This project uses embedded heroku postgress database, which creates an in-memory database at startup and 
destroys all data at shutdown.</p>

<p>
	How to run:
	<code>mvn clean spring-boot:run</code>
</p>

<ul>
<li>List all customers (in JSON format): <code>http://localhost:8080/customers</code></li>
<li>Customer detail (in JSON format): <code>http://localhost:8080/customers/1</code></li>
</ul>

<p>
	How to deploy springboot on heroku:
    <br>
    https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
    <br>
    naviagte to root folder of the project
	<br>
    $ git init
    <br>
    $ git add .
    <br>
    $ git commit -m "first commit"
    <br>
    $ heroku create
    <br>
    $ git push heroku master
    <br>
    $  heroku logs --tail
    <br>
    $  heroku open
    <br>
    To resolve H14 - No web dynos running
    <br>
    $ heroku ps:scale web=1
</p>
