<%-- 
    Document   : indexC
    Created on : 15/08/2017, 04:48:44 AM
    Author     : juxx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
  <html>
    <head>
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
      <nav class="nav-extended" style="background-color:#2f3e5d">
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">DB Classic Model</a>
      <a href="#" data-activates="mobile-demo" class="button-collapse"><i class="material-icons">menu</i></a>
      
    </div>
    <div class="nav-content">
      <ul class="tabs tabs-transparent">
        <li class="tab"><a class="active" href="#test1">Customers</a></li>
        <li class="tab"><a href="#test2">Agregar Customer</a></li>
        <li class="tab"><a href="#test3">Employes</a></li>
        <li class="tab"><a href="#test4">Agregar Employe</a></li>
        <li class="tab"><a href="#test5">Offices</a></li>
        <li class="tab"><a href="#test6">Agregar Office</a></li>
        <li class="tab"><a href="#test7">Orders</a></li>
        <li class="tab"><a href="#test8">Agregar Order</a></li>
      </ul>
    </div>
  </nav>
  <div id="test1" class="col s12"><iframe src="customersV" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test2" class="col s12"><iframe src="faces/agregarCust.xhtml" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test3" class="col s12"><iframe src="employesV" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test4" class="col s12"><iframe src="faces/agregarEmp.xhtml" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test5" class="col s12"><iframe src="officesV" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test6" class="col s12"><iframe src="faces/agregarOff.xhtml" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test7" class="col s12"><iframe src="ordersV" frameborder="%0" height="580" width="100%"></iframe></div>
  <div id="test8" class="col s12"><iframe src="faces/agregarOrd.xhtml" frameborder="%0" height="580" width="100%"></iframe></div>
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
  </html>
