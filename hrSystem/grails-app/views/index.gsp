<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket | HomePage</title>
<asset:stylesheet src="index.css"/>
</head>
<body>
  <div id="content" role="main">
  <div class="row">
  <div class="first">
<h3>Team Leader Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="teamLeader" action="create">Add Team Leader</g:link>
</button>
<div class="second">
<h3>Team Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="team" action="create">Add Team</g:link>
</button>
<div class="third">
<h3>Employee Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="employees" action="create">Add Employee</g:link>
</button>
<div class="fourth">
<h3>Shift Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="shift" action="create">Add Shift</g:link>
</button>
<div class="fifth">
<h3>Task Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="task" action="create">Add Task</g:link>
</button>
<div class="sixth">
<h3>Manager Management</h3>
<button type="button" class="btn btn-default">
<g:link controller="manager" action="create">Add Manager</g:link>
</button>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</body>
</html>
