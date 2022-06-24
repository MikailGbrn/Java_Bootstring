==== Belajar Servlet ====

Belajar servlet menggunakan "eclipse enterprise for web developing"

1. Membuat Dynamic Web Project
	1a. File > New > Others
	1b. Web > Dynamic Web Project
	1c. setup Target Runtim menggunakan "Apache Tomcat v10"
	1d. setup Dynamic Web Module Version "5.0"
	1e. Project Name Diisi BelajarServlet

2. Membuat Folder Model dan Web 
	2a. Navigasikan ke src/main/java
	2b. Klik kanan > new > folder
	2c. isi folder name "com/belajar/model"
	2d. dan isi folder name satu lagi "com/belajar/web"

3. Setup controller
	3a. buat class baru di dalam folder model
	3b. nama class Member.java
	3c. masukkan codingan dibawah ini

public class Member {
	public String username;
	public String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

	3d. buat class baru di dalam folder web
	3e. nama class HelloServlet.java
	3f. masukkan kodingan dibawah ini

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		resp.getWriter().append("Served at: ").append(req.getContextPath());

		resp.setContentType("text/html");
        
		PrintWriter out = resp.getWriter();

		out.print("<html><body>");
		out.print("<h2>Selamat Belajar</h2>");
		out.print("</body></html>");
//		super.doGet(req, resp);
	}
	
}

	3g. buat class baru dengan nama LoginController.java
	3h. masukkan koding dibawah ini

import java.io.IOException;

import com.belajar.model.Member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String err = "";
		int q = 0;
		if (username.equals("") || username == null) {
			err = "Username harus diisi";
		}
		else if (password.equals("") || password == null) {
			err = "Password harus diisi";
		}
		else {
			HttpSession session = req.getSession();
			RequestDispatcher rd = req.getRequestDispatcher("member.jsp");
			Member member = new Member();
			member.setUsername(username);
			member.setPassword(password);
			session.setAttribute("member", member);
			rd.forward(req, resp);
			return;
		}
		if(q==0) {
			req.setAttribute("err", err);
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.forward(req, resp);
			return;
		}
		super.doPost(req, resp);
	}
	
	
}

4. Setup webapp
	4a. buat file JSP baru di dalam webapp dengan nama index
	4b. masukkan kodingan dibawah ini

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JSP Form Login</title>
	
	<style>
		body {font-family: Arial, Helvetica, sans-serif;}
		form {border: 3px solid #f1f1f1;}
		
		input[type=text], input[type=password] {
		  width: 100%;
		  padding: 12px 20px;
		  margin: 8px 0;
		  display: inline-block;
		  border: 1px solid #ccc;
		  box-sizing: border-box;
		}
		
		button {
		  background-color: #04AA6D;
		  color: white;
		  padding: 14px 20px;
		  margin: 8px 0;
		  border: none;
		  cursor: pointer;
		  width: 100%;
		}
		
		button:hover {
		  opacity: 0.8;
		}
		
		.hellobtn {
		  width: auto;
		  padding: 10px 18px;
		  background-color: #f44336;
		  color: #FFF;
		}		
		
		.container {
		  padding: 16px;
		}
		
		span.psw {
		  float: right;
		  padding-top: 16px;
		}
		
		/* Change styles for span and cancel button on extra small screens */
		@media screen and (max-width: 300px) {
		  span.psw {
		     display: block;
		     float: none;
		  }
		  .cancelbtn {
		     width: 100%;
		  }
		}
	</style>
</head>
<body>
	<h2 align="center">Form Login</h2>
	<form action="doLogin" method="post" style="margin: auto; width: 50%;">			
		<div class="container">			
	    	<label for="uname"><b>Username</b></label>
		    <input type="text" placeholder="Enter Username" id="username" name="username" required>
		
		    <label for="psw"><b>Password</b></label>
		    <input type="password" placeholder="Enter Password" id="password" name="password" required>
		        
		    <button type="submit">Login</button>
	  	</div>		
		<div class="container" style="background-color:#f1f1f1">
		  	<a href="HelloServlet" >Goto > Hello</a>		  	
		</div>		
	</form>
	
	<!-- Untuk menggunakan Alert Error silahkan hapus kode berikut : required di input username dan password -->
	<%
		String err = (String) request.getAttribute("err");
		if (err!=null){
	%>
	<script type="text/javascript">
		alert('<%=err%>')
	</script>
	<% } %>
		
</body>
</html>

	4c. buat file .jsp baru di dalam webapp dengan nama member.jsp
	4d. masukkan kodingan dibawah ini

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Member JSP</title>
	
	<style type="text/css">
		table,tr,td{
			background-color: #FFF ;
			font-family: century gothic;
			color: green;
			border: 1px solid orange;
			padding: 5px;
			border-collapse: collapse;
		}
		
		.container {
		  padding: 16px;
		}
		
		button {
		  background-color: #04AA6D;
		  color: white;
		  padding: 14px 20px;		  
		  border: none;
		  cursor: pointer;
		  width: 100%;
		}
		
		button:hover {
		  opacity: 0.8;
		}
		
		.hellobtn {
		  width: auto;
		  padding: 10px 18px;
		  background-color: #f44336;
		  color: #FFF;
		}	
		
	</style>
</head>

<jsp:useBean id="member" scope="session" class="com.belajar.model.Member" />
<body>
	<div class="container">
		<table style="margin: auto; width: 50%;">
			<tr>
				<td colspan="3" align="center">
					<b>Form Welcome</b>					
				</td>
			</tr>
			<tr>
				<td><b>Hai, Selamat Datang</b></td>
				<td>:</td>
				<td><%=member.getUsername()%></td>
			</tr>
			<tr>
				<td colspan="3" align="center">
					<Button class="hellobtn"onclick="javascript:history.go(-1)"> Kembali</Button>
				</td>
			</tr>	
		</table>
	</div>	
</body>
</html>

