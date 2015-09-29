<%@taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>College Spider</title>



</head>
<body>

	<div class="container">

		<!--body starts here-->
		<div class="row well" id="bodymain">

			<!--first part of body starts here-->
			<div class="row">
				<div class="col-md-12">
					<div class="col-md-3 ">
						<div class="row well ">



							<s:form name="loginform_main_horizontal" action="/collegespider/login" 
								class="form-horizontal col-md-offset-1" id="loginMainForm"
								modelAttribute="loginBean" method="POST">


								<div class="control-group">
									<label class="control-label" for="inputEmail">Email</label>
									<div class="controls">
										<input type="email" name="emailId" class="form-control"
											placeholder="Email">
										<p></p>
									</div>
								</div>


								<div class="control-group">
									<label class="control-label" for="inputPassword">Password</label>
									<div class="controls">
										<input name="password" type="password" class="form-control"
											placeholder="Password">

										<p></p>
										<p></p>

									</div>
								</div>

								<div class="control-group">
									<div class="controls">
										<label class="checkbox">
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox">
											Remember me
										</label> <br />
										<!-- button type="submit" class="btn btn-primary "></button-->
										<input type="submit" class="btn btn-primary "
											value="Sign
											in"> <a
											href="/collegespider/registration">Register here</a>
									</div>
								</div>
							</s:form>


							<br />
							<div class="row" id="">

								<div class="control-group col-md-offset-1">


									Forgot <a href="">username</a> or <a href="">password</a> ?

								</div>

							</div>
						</div>
						<div class="row" id="side">
							<br /> <br />

						</div>
						<div class="row well">
							<h3>College Search</h3>
							<form class="form-search">
								<input type="text" class="input-large search-query">
								<button type="submit" class="btn  btn-info">Search</button>
							</form>

						</div>



					</div>

					<div class="col-md-9" id="rot-img">
						<div id="rotating-item-wrapper">
							<img class="rotating-item img-rounded" src="images/img.jpg"
								alt="a" width="100%" height="450" /> <img
								class="rotating-item img-rounded" src="images/adah.jpg" alt="b"
								width="100%" height="450" /> <img
								class="rotating-item img-rounded" src="images/art.jpg" alt="c"
								width="100%" height="450" />
						</div>


					</div>

				</div>
			</div>

			<!--first part of body ends here-->

			<!--second part of body starts here-->
			<div class="row well">

				<div class="col-md-3 mm well well-sm">

					<a href="/collegespider/studentprofile" class="mmm" id="mm1m"><h2>Students</h2></a>

				</div>
				<div class="col-md-3 mm well well-sm">

					<a href="/collegespider/facultyprofile" class="mmm" id="mm2m"><h2>Faculty</h2></a>

				</div>
				<div class="col-md-3 mm well well-sm">

					<a href="/collegespider/evenglistprofile" class="mmm" id="mm3m"><h2>Evanglist</h2></a>

				</div>
				<div class="col-md-3 mm well well-sm">

					<a href="/collegespider/adminhome" class="mmm" id="mm4m"><h2>Admin</h2></a>

				</div>

			</div>

			<!--second part of body ends here-->





			<!--third part of body starts here-->
			<div class="row">
				<div class="col-md-12">

					<div class="col-md-3 well ">

						<div class="row" style="text-align: center">

							<h3>
								<b> More to explore</b>
							</h3>
							<hr />
						</div>


						<div class="row ">
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<br /> <br /> <br /> <br />
						</div>

					</div>

					<div class="col-md-6"></div>

					<div class="col-md-3 events">
						<div class="row">
							<h3>
								<b> Events</b>
							</h3>

							<hr />
							<a class="eventhlink" href="#">College Spider Annual
								Event(2015)</a>
							<hr />
							<a class="eventhlink" href="#">Placement(2015)</a>
							<hr />
							<a class="eventhlink" href="#">College</a>
							<hr />
							<a class="eventhlink" href="#">All Events</a>
							<hr />
						</div>

						<div class="row well">
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<br /> <br />
						</div>
					</div>

				</div>


			</div>
			<!--third part of body ends here-->




		</div>

		<!--body ends here-->



	</div>



</body>
</html>