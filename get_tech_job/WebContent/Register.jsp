<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/NewRegister.css">


</head>
<body>
<h2>Register Page</h2>
<br>
<h3>Register as Employer</h3>
<hr>

	    <form name="frm" method="post" action="RegisterUser" enctype="multipart/form-data">
      <div class="container">
  
        <p>Please fill in this form to create an account.</p>
        <hr>
        <table>
        <tr>
    
        <td><label for="userid"><b>User Id :</label></td>
        <td><input type="text" placeholder="Enter UserId" name="uid" id="uid" required>
        </tr>
        
        <tr>  
        <td><label for="username"><b>User Name :</label></td>
        <td><input type="text" placeholder="Enter Username" name="unm" id="unm" required>
        </tr>
        
        <tr>
        <td><label for="Date of Birth"><b>Date of Birth :</label></td>
        <td><input type="date"  name="dob" id="dob" required>
        </tr>
        
        <tr>
        <td><label for="Gender"><b>Gender :</label></td>
        <td><input type="radio"  name="gen" id="gen" value="male" required>Male</td>
        <td><input type="radio" name="gen" id="gen" value="female">Female</td>
        </tr>
        
        
        <tr>
        <td><label for="Mobile"><b>Mobile No :</label></td>
        <td><input type="number" placeholder="Enter Number" name="mob" id="mob"  required>
        </tr>
        
        <tr>
        <td><label for="email"><b>Email :</b></label>
        <td><input type="email" placeholder="Enter Email" name="email" id="email" required>
        </tr>
        
        <tr>
        <td><label for="aadharno"><b>Aadhar No :</b></label>
        <td><input type="number" placeholder="Enter Aadhar No" name="aadharno" id="aadharno" required>
        </tr>
        
        <tr>
        <td><label for="marial_status"><b>Marial Status :</label></td>
        <td><select name="sque">
        <option value="none">
		<option value="maried">maried
		<option value="single">single
		</select>
        </tr>
        
        <tr>
        <td><label for="language"><b>Language :</label></td>
        <td><input type="radio"  name="ja" id="ja" value="java" required>Java</td>
        <td><input type="radio" name="sq" id="sq" value="sql">SQL</td>
        <td><input type="radio" name="js" id="js" value="java_script">Java Script</td>
        <td><input type="radio" name="ht" id="ht" value="html">SQL</td>
        </tr>
        
        <tr>
        <td><label for="current_occupation"><b>Current Occupation :</label></td>
        <td><input type="text" placeholder="Current Occupation" name="cocp" id="cocp" required>
        </tr>
        
        
        <tr>
        <td><label for="homeaddr"><b>Home Address :</label></td>
        <td><input type="text" placeholder="Enter Address" name="hadd" id="hadd" required>
        </tr>
        
        <tr>  
        <td><label for="workaddr"><b>Work Address :</label></td>
        <td><input type="text" placeholder="Enter Address" name="wadd" id="wadd" required>
        </tr>
        
        <tr>
        <td><label for="psw"><b>Password :</b></label>
        <td><input type="password" placeholder="Enter Password" name="psw" id="psw" required>
        </tr>
        
        <tr>
        <td><label for="psw-repeat"><b>Repeat Password :</b></label>
        <td><input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
        </tr>
        
        <tr>
        <td><label for="image"><b>Upload Profile Photo:</b></label>
        <td><input type="file" name="file" multiple="true">
        </tr>
        
        
        <tr>
        <hr/>
        <td><p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p></td></tr>
        <tr>
        <td> <button type="submit" class="registerbtn">Register</button>
        </tr>
        </table>
      </div>
	</form>


</body>
</html>