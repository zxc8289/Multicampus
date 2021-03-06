<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
MemberDto mem = (MemberDto) request.getSession().getAttribute("login");
%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<link rel="apple-touch-icon" type="image/png"
	href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
<meta name="apple-mobile-web-app-title" content="CodePen">

<link rel="shortcut icon" type="image/x-icon"
	href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />

<link rel="mask-icon" type="image/x-icon"
	href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg"
	color="#111" />

<title>CodePen - Sakshat | ProfilePage</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/solid.js"
	integrity="sha384-+Ga2s7YBbhOD6nie0DzrZpJes+b2K1xkpKxTFFcx59QmVPaSA8c7pycsNaFwUK6l"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js"
	integrity="sha384-7ox8Q2yzO/uWircfojVuCQOZl+ZZBg2D2J5nkpLqzH1HY0C1dHlTKIbpRz/LG23c"
	crossorigin="anonymous"></script>



<style>
/* ---- General styling starts ---- */
.light-text {
	color: rgba(0, 0, 0, .8)
}

.small-head {
	font-size: 0.8em;
}

.bold-weight {
	font-weight: 600;
}

.box-component {
	background: #fff;
	border: 1px solid rgba(0, 0, 0, 0.1);
	border-radius: 5px;
	padding: 15px
}
/* ---- General styling ends ---- */

/* ---- Navigation Bar styling starts ---- */

/* ---- Navigation Bar styling ends ---- */

/* ---- Cover Image styling starts ---- */
.cover-image-container {
	padding: 0;
}

.cover-image {
	position: relative;
	width: 100%;
	height: 300px;
	overflow: hidden;
}

.cover-image img {
	position: absolute;
	left: 50%;
	top: 50%;
	width: 100%;
	height: auto;
	-webkit-transform: translate(-50%, -50%);
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}
/* ---- Cover Image styling ends ---- */

/* ---- Search Icon inside Search bar styling starts ---- */
.inner-addon {
	position: relative;
}

/* style icon */
.inner-addon span {
	position: absolute;
	padding: 7px 10px;
	pointer-events: none;
	color: #a9a9a9;
}

/* align icon */
.left-addon span {
	left: 0px;
}

.right-addon span {
	right: 0px;
}

/* add padding  */
.left-addon input {
	padding-left: 30px;
}

.right-addon input {
	padding-right: 30px;
}
/* ---- Search Icon inside Search bar styling ends ---- */

/* ---- Nav Tabs styling starts ---- */
.nav-holder {
	background-color: #FFFFFF;
	box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.2);
	width: 100vw;
}

.nav-holder .container-fluid {
	padding-left: 0px;
	padding-right: 0px;
	margin: 5px 0px;
}

.nav-holder .container {
	width: 1050px;
}

.nav-holder .profile-pic {
	position: absolute;
	top: -120px;
	z-index: 99;
	width: 180px;
	height: 180px;
	background: #FFFFFF;
}

.nav-holder .profile-pic img {
	border-radius: 5px;
	box-shadow: 0 1px 4px 0 rgba(0, 0, 0, 0.2);
}

.nav.nav-tabs.nav-custom .nav-link.active {
	border: 0;
	border-bottom: 2px solid #D9222A;
	color: #D9222A
}

.nav.nav-tabs.nav-custom .nav-link {
	color: rgba(0, 0, 0, .5);
	border-bottom: 0;
}
/* ---- Nav Tabs styling ends ---- */

/* ---- Main Content styling starts ---- */
.main-content-container {
	background-color: #FAFAFA;
}

.main-content {
	width: 1050px;
	height: 1000px;
	padding-top: 50px
}

.user-information {
	background: #fff;
	border: 1px solid rgba(0, 0, 0, 0.1);
	border-radius: 5px;
	padding: 15px
}

.main-content .user-information h5.user-name {
	margin-bottom: 0;
	color: #D9222A;
}

.main-content .user-information h6.user-handle {
	margin-bottom: 15px;
	color: rgba(0, 0, 0, .5);
	font-size: 0.8em
}

.main-content .user-information hr.full-width-hr {
	margin: 0 -15px;
}

.main-content .user-information .user-followers {
	padding-top: 15px;
	display: flex;
	align-items: center;
	justify-content: space-around;
	font-size: 0.85em;
	color: rgba(0, 0, 0, .5)
}

.main-content .user-information .user-followers .num {
	font-weight: 600;
	color: rgba(0, 0, 0, 0.6)
}

/* ---- Interests section styling starts ---- */
.sectional-tabs {
	background-color: #FAFAFA;
	padding: 0.5em;
	margin: 0.3em 1em;
	border-radius: 12px;
	border: 1px solid #57595b;
	color: #57595b;
	font-size: 0.9em;
	flex-basis: 200px;
	text-align: center
}
/* ---- Interests section styling ends ---- */

/* ---- Main Content styling ends ---- */
.nav {
	display: flex;
	flex-wrap: wrap;
	padding-left: 0;
	margin-bottom: 0;
	list-style: none;
}

.nav-link {
	display: block;
	padding: 0.5rem 1rem;
	color: #0d6efd;
	text-decoration: none;
	transition: color 0.15s ease-in-out, background-color 0.15s ease-in-out,
		border-color 0.15s ease-in-out;
}

@media ( prefers-reduced-motion : reduce) {
	.nav-link {
		transition: none;
	}
}

.nav-link:hover, .nav-link:focus {
	color: #0a58ca;
}

.nav-link.disabled {
	color: #6c757d;
	pointer-events: none;
	cursor: default;
}

.nav-tabs {
	border-bottom: 1px solid #dee2e6;
}

.nav-tabs .nav-link {
	margin-bottom: -1px;
	background: none;
	border: 1px solid transparent;
	border-top-left-radius: 0.25rem;
	border-top-right-radius: 0.25rem;
}

.nav-tabs .nav-link:hover, .nav-tabs .nav-link:focus {
	border-color: #e9ecef #e9ecef #dee2e6;
	isolation: isolate;
}

.nav-tabs .nav-link.disabled {
	color: #6c757d;
	background-color: transparent;
	border-color: transparent;
}

.nav-tabs .nav-link.active, .nav-tabs .nav-item.show .nav-link {
	color: #495057;
	background-color: #fff;
	border-color: #dee2e6 #dee2e6 #fff;
}

.nav-tabs .dropdown-menu {
	margin-top: -1px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}

.nav-pills .nav-link {
	background: none;
	border: 0;
	border-radius: 0.25rem;
}

.nav-pills .nav-link.active, .nav-pills .show>.nav-link {
	color: #fff;
	background-color: #0d6efd;
}

.nav-fill>.nav-link, .nav-fill .nav-item {
	flex: 1 1 auto;
	text-align: center;
}

.nav-justified>.nav-link, .nav-justified .nav-item {
	flex-basis: 0;
	flex-grow: 1;
	text-align: center;
}

.nav-fill .nav-item .nav-link, .nav-justified .nav-item .nav-link {
	width: 100%;
}

.tab-content>.tab-pane {
	display: none;
}

.tab-content>.active {
	display: block;
}

.navbar {
	position: relative;
	display: flex;
	flex-wrap: wrap;
	align-items: center;
	justify-content: space-between;
	padding-top: 0.5rem;
	padding-bottom: 0.5rem;
}

.navbar>.container, .navbar>.container-fluid, .navbar>.container-sm,
	.navbar>.container-md, .navbar>.container-lg, .navbar>.container-xl,
	.navbar>.container-xxl {
	display: flex;
	flex-wrap: inherit;
	align-items: center;
	justify-content: space-between;
}

.navbar-brand {
	padding-top: 0.3125rem;
	padding-bottom: 0.3125rem;
	margin-right: 1rem;
	font-size: 1.85rem;
	text-decoration: none;
	white-space: nowrap;
}

.navbar-nav {
	display: flex;
	flex-direction: column;
	padding-left: 0;
	margin-bottom: 0;
	list-style: none;
}

.navbar-nav .nav-link {
	padding-right: 0;
	padding-left: 0;
}

.navbar-nav .dropdown-menu {
	position: static;
}

.navbar-text {
	padding-top: 0.5rem;
	padding-bottom: 0.5rem;
}

.navbar-collapse {
	flex-basis: 100%;
	flex-grow: 1;
	align-items: center;
}

.navbar-toggler {
	padding: 0.25rem 0.75rem;
	font-size: 1.25rem;
	line-height: 1;
	background-color: transparent;
	border: 1px solid transparent;
	border-radius: 0.25rem;
	transition: box-shadow 0.15s ease-in-out;
}

@media ( prefers-reduced-motion : reduce) {
	.navbar-toggler {
		transition: none;
	}
}

.navbar-toggler:hover {
	text-decoration: none;
}

.navbar-toggler:focus {
	text-decoration: none;
	outline: 0;
	box-shadow: 0 0 0 0.25rem;
}

.navbar-toggler-icon {
	display: inline-block;
	width: 1.5em;
	height: 1.5em;
	vertical-align: middle;
	background-repeat: no-repeat;
	background-position: center;
	background-size: 100%;
}

.navbar-nav-scroll {
	max-height: var(- -bs-scroll-height, 75vh);
	overflow-y: auto;
}

@media ( min-width : 576px) {
	.navbar-expand-sm {
		flex-wrap: nowrap;
		justify-content: flex-start;
	}
	.navbar-expand-sm .navbar-nav {
		flex-direction: row;
	}
	.navbar-expand-sm .navbar-nav .dropdown-menu {
		position: absolute;
	}
	.navbar-expand-sm .navbar-nav .nav-link {
		padding-right: 0.5rem;
		padding-left: 0.5rem;
	}
	.navbar-expand-sm .navbar-nav-scroll {
		overflow: visible;
	}
	.navbar-expand-sm .navbar-collapse {
		display: flex !important;
		flex-basis: auto;
	}
	.navbar-expand-sm .navbar-toggler {
		display: none;
	}
	.navbar-expand-sm .offcanvas-header {
		display: none;
	}
	.navbar-expand-sm .offcanvas {
		position: inherit;
		bottom: 0;
		z-index: 1000;
		flex-grow: 1;
		visibility: visible !important;
		background-color: transparent;
		border-right: 0;
		border-left: 0;
		transition: none;
		transform: none;
	}
	.navbar-expand-sm .offcanvas-top, .navbar-expand-sm .offcanvas-bottom {
		height: auto;
		border-top: 0;
		border-bottom: 0;
	}
	.navbar-expand-sm .offcanvas-body {
		display: flex;
		flex-grow: 0;
		padding: 0;
		overflow-y: visible;
	}
}

@media ( min-width : 768px) {
	.navbar-expand-md {
		flex-wrap: nowrap;
		justify-content: flex-start;
	}
	.navbar-expand-md .navbar-nav {
		flex-direction: row;
	}
	.navbar-expand-md .navbar-nav .dropdown-menu {
		position: absolute;
	}
	.navbar-expand-md .navbar-nav .nav-link {
		padding-right: 0.5rem;
		padding-left: 0.5rem;
	}
	.navbar-expand-md .navbar-nav-scroll {
		overflow: visible;
	}
	.navbar-expand-md .navbar-collapse {
		display: flex !important;
		flex-basis: auto;
	}
	.navbar-expand-md .navbar-toggler {
		display: none;
	}
	.navbar-expand-md .offcanvas-header {
		display: none;
	}
	.navbar-expand-md .offcanvas {
		position: inherit;
		bottom: 0;
		z-index: 1000;
		flex-grow: 1;
		visibility: visible !important;
		background-color: transparent;
		border-right: 0;
		border-left: 0;
		transition: none;
		transform: none;
	}
	.navbar-expand-md .offcanvas-top, .navbar-expand-md .offcanvas-bottom {
		height: auto;
		border-top: 0;
		border-bottom: 0;
	}
	.navbar-expand-md .offcanvas-body {
		display: flex;
		flex-grow: 0;
		padding: 0;
		overflow-y: visible;
	}
}

@media ( min-width : 992px) {
	.navbar-expand-lg {
		flex-wrap: nowrap;
		justify-content: flex-start;
	}
	.navbar-expand-lg .navbar-nav {
		flex-direction: row;
	}
	.navbar-expand-lg .navbar-nav .dropdown-menu {
		position: absolute;
	}
	.navbar-expand-lg .navbar-nav .nav-link {
		padding-right: 0.5rem;
		padding-left: 0.5rem;
	}
	.navbar-expand-lg .navbar-nav-scroll {
		overflow: visible;
	}
	.navbar-expand-lg .navbar-collapse {
		display: flex !important;
		flex-basis: auto;
	}
	.navbar-expand-lg .navbar-toggler {
		display: none;
	}
	.navbar-expand-lg .offcanvas-header {
		display: none;
	}
	.navbar-expand-lg .offcanvas {
		position: inherit;
		bottom: 0;
		z-index: 1000;
		flex-grow: 1;
		visibility: visible !important;
		background-color: transparent;
		border-right: 0;
		border-left: 0;
		transition: none;
		transform: none;
	}
	.navbar-expand-lg .offcanvas-top, .navbar-expand-lg .offcanvas-bottom {
		height: auto;
		border-top: 0;
		border-bottom: 0;
	}
	.navbar-expand-lg .offcanvas-body {
		display: flex;
		flex-grow: 0;
		padding: 0;
		overflow-y: visible;
	}
}

@media ( min-width : 1200px) {
	.navbar-expand-xl {
		flex-wrap: nowrap;
		justify-content: flex-start;
	}
	.navbar-expand-xl .navbar-nav {
		flex-direction: row;
	}
	.navbar-expand-xl .navbar-nav .dropdown-menu {
		position: absolute;
	}
	.navbar-expand-xl .navbar-nav .nav-link {
		padding-right: 0.5rem;
		padding-left: 0.5rem;
	}
	.navbar-expand-xl .navbar-nav-scroll {
		overflow: visible;
	}
	.navbar-expand-xl .navbar-collapse {
		display: flex !important;
		flex-basis: auto;
	}
	.navbar-expand-xl .navbar-toggler {
		display: none;
	}
	.navbar-expand-xl .offcanvas-header {
		display: none;
	}
	.navbar-expand-xl .offcanvas {
		position: inherit;
		bottom: 0;
		z-index: 1000;
		flex-grow: 1;
		visibility: visible !important;
		background-color: transparent;
		border-right: 0;
		border-left: 0;
		transition: none;
		transform: none;
	}
	.navbar-expand-xl .offcanvas-top, .navbar-expand-xl .offcanvas-bottom {
		height: auto;
		border-top: 0;
		border-bottom: 0;
	}
	.navbar-expand-xl .offcanvas-body {
		display: flex;
		flex-grow: 0;
		padding: 0;
		overflow-y: visible;
	}
}

@media ( min-width : 1400px) {
	.navbar-expand-xxl {
		flex-wrap: nowrap;
		justify-content: flex-start;
	}
	.navbar-expand-xxl .navbar-nav {
		flex-direction: row;
	}
	.navbar-expand-xxl .navbar-nav .dropdown-menu {
		position: absolute;
	}
	.navbar-expand-xxl .navbar-nav .nav-link {
		padding-right: 0.5rem;
		padding-left: 0.5rem;
	}
	.navbar-expand-xxl .navbar-nav-scroll {
		overflow: visible;
	}
	.navbar-expand-xxl .navbar-collapse {
		display: flex !important;
		flex-basis: auto;
	}
	.navbar-expand-xxl .navbar-toggler {
		display: none;
	}
	.navbar-expand-xxl .offcanvas-header {
		display: none;
	}
	.navbar-expand-xxl .offcanvas {
		position: inherit;
		bottom: 0;
		z-index: 1000;
		flex-grow: 1;
		visibility: visible !important;
		background-color: transparent;
		border-right: 0;
		border-left: 0;
		transition: none;
		transform: none;
	}
	.navbar-expand-xxl .offcanvas-top, .navbar-expand-xxl .offcanvas-bottom
		{
		height: auto;
		border-top: 0;
		border-bottom: 0;
	}
	.navbar-expand-xxl .offcanvas-body {
		display: flex;
		flex-grow: 0;
		padding: 0;
		overflow-y: visible;
	}
}

.navbar-expand {
	flex-wrap: nowrap;
	justify-content: flex-start;
}

.navbar-expand .navbar-nav {
	flex-direction: row;
}

.navbar-expand .navbar-nav .dropdown-menu {
	position: absolute;
}

.navbar-expand .navbar-nav .nav-link {
	padding-right: 0.5rem;
	padding-left: 0.5rem;
}

.navbar-expand .navbar-nav-scroll {
	overflow: visible;
}

.navbar-expand .navbar-collapse {
	display: flex !important;
	flex-basis: auto;
}

.navbar-expand .navbar-toggler {
	display: none;
}

.navbar-expand .offcanvas-header {
	display: none;
}

.navbar-expand .offcanvas {
	position: inherit;
	bottom: 0;
	z-index: 1000;
	flex-grow: 1;
	visibility: visible !important;
	background-color: transparent;
	border-right: 0;
	border-left: 0;
	transition: none;
	transform: none;
}

.navbar-expand .offcanvas-top, .navbar-expand .offcanvas-bottom {
	height: auto;
	border-top: 0;
	border-bottom: 0;
}

.navbar-expand .offcanvas-body {
	display: flex;
	flex-grow: 0;
	padding: 0;
	overflow-y: visible;
}

.navbar-light .navbar-brand {
	color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-brand:hover, .navbar-light .navbar-brand:focus {
	color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-nav .nav-link {
	color: rgba(0, 0, 0, 0.55);
}

.navbar-light .navbar-nav .nav-link:hover, .navbar-light .navbar-nav .nav-link:focus
	{
	color: rgba(0, 0, 0, 0.7);
}

.navbar-light .navbar-nav .nav-link.disabled {
	color: rgba(0, 0, 0, 0.3);
}

.navbar-light .navbar-nav .show>.nav-link, .navbar-light .navbar-nav .nav-link.active
	{
	color: rgba(0, 0, 0, 0.9);
}

.navbar-light .navbar-toggler {
	color: rgba(0, 0, 0, 0.55);
	border-color: rgba(0, 0, 0, 0.1);
}

.navbar-light .navbar-toggler-icon {
	background-image:
		url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba%280, 0, 0, 0.55%29' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
}

.navbar-light .navbar-text {
	color: rgba(0, 0, 0, 0.55);
}

.navbar-light .navbar-text a, .navbar-light .navbar-text a:hover,
	.navbar-light .navbar-text a:focus {
	color: rgba(0, 0, 0, 0.9);
}

.navbar-dark .navbar-brand {
	color: #fff;
}

.navbar-dark .navbar-brand:hover, .navbar-dark .navbar-brand:focus {
	color: #fff;
}

.navbar-dark .navbar-nav .nav-link {
	color: rgba(255, 255, 255, 0.55);
}

.navbar-dark .navbar-nav .nav-link:hover, .navbar-dark .navbar-nav .nav-link:focus
	{
	color: rgba(255, 255, 255, 0.75);
}

.navbar-dark .navbar-nav .nav-link.disabled {
	color: rgba(255, 255, 255, 0.25);
}

.navbar-dark .navbar-nav .show>.nav-link, .navbar-dark .navbar-nav .nav-link.active
	{
	color: #fff;
}

.navbar-dark .navbar-toggler {
	color: rgba(255, 255, 255, 0.55);
	border-color: rgba(255, 255, 255, 0.1);
}

.navbar-dark .navbar-toggler-icon {
	background-image:
		url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 30 30'%3e%3cpath stroke='rgba%28255, 255, 255, 0.55%29' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
}

.navbar-dark .navbar-text {
	color: rgba(255, 255, 255, 0.55);
}

.navbar-dark .navbar-text a, .navbar-dark .navbar-text a:hover,
	.navbar-dark .navbar-text a:focus {
	color: #fff;
}

.getimg{
	width: 180px;
	height: 180px;
}

</style>

<script>
	window.console = window.console || function(t) {
	};
</script>



<script>
	if (document.location.search.match(/type=embed/gi)) {
		window.parent.postMessage("resize", "*");
	}
</script>


</head>

<body translate="no">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container px-4 px-lg-5">
			<a class="navbar-brand" href="#!"><span style="color: red;">We</span>View</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#!">????????????</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">???????????????</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">????????????</a></li>
					<li class="nav-item"><a class="nav-link" href="#!">???????????????</a></li>
				</ul>
				<form style="margin-right: 10px; margin-left: 250px">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search" />
				</form>

				<form class="d-flex">
					<button class="btn btn-outline-dark" type="submit">????????????</button>
				</form>
			</div>
		</div>
	</nav>
	<div class="cover-image-container container-fluid ">
		<div class="cover-image">
			<img
				src="https://s3.ap-south-1.amazonaws.com/static3.tagtaste.com/images/p/160/hi/DtMryWkuZy5AApHMAUXIR7bwVfpf27az.jpg" />
		</div>
	</div>
	<div class="nav-holder">
		<div class="container-fluid">
			<div class="container">
				<div class="row">
					<div class="col-sm-3">
						<div class="profile-pic">
							<img src="resources<%= mem.getProfile()%>" class="getimg">
						</div>
					</div>
					<div class="nav-section col-sm-9">
						<ul class="nav nav-tabs nav-custom" id="myTab" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								id="about-tab" data-toggle="tab" href="#about" role="tab"
								aria-controls="about" aria-selected="false">????????????</a></li>


							<li class="nav-item"><a class="nav-link" id="interests-tab"
								data-toggle="tab" href="#interests" role="tab"
								aria-controls="interests" aria-selected="false">?????????</a></li>

						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="main-content-container container-fluid">
		<div class="main-content container">
			<div class="row">
				<div class="col-sm-3 left-side-nav">
					<div class="box-component user-information">
						<div class="profile-info-view">
							<h5 class="user-name"><%=mem.getName()%></h5>
							<h6 class="user-handle"><%=mem.getNickname()%></h6>
							<hr class="full-width-hr" />
							<div class="user-followers">
								<div class="following">
									<span class="num">???????????? ??????????????????.</span> Following
								</div>

							</div>
						</div>
						<div class="profile-info-edit"></div>
					</div>
				</div>
				<div class="col-sm-9 general-info">
					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="about" role="tabpanel"
							aria-labelledby="about-tab">
							<div class="box-component">
								<div class="container">
									<div class="row">
										<div class="col-sm-12"
											style="margin-top: 10px; margin-bottom: 10px">
											<h5>????????????</h5>
										</div>
										<form action="update.do" method="POST">
											<div class="col-sm-12 pt-3">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight" style="margin-top: 5px">SEQ</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-left: 20px" id="seq_user" name="seq_user" value="<%=mem.getSeq_user()%>" readonly="readonly">
													</div>
												</div>
											</div>
											<div class="col-sm-12 pt-3">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px;">ID</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px" name="id">
													</div>
												</div>
											</div>
											<div class="col-sm-12">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px">PWD</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px" name="pwd">
													</div>
												</div>
											</div>
											<div class="col-sm-12">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px;">NickName</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px"
															name="nickname">
													</div>
												</div>
											</div>


											<button class="btn btnoutline-dark"
												style="margin-right: 40px; margin-left: 10px; border-radius: 50px"
												type="submit">????????????</button>
										</form>


									</div>
								</div>
							</div>
						</div>


						<div class="tab-pane fade" id="interests" role="tabpanel"
							aria-labelledby="interests-tab">
							<div class="box-component">
								<div class="container">
									<div class="row">
										<div class="col-sm-12">
											<h6>Interests</h6>
										</div>
										<div class="col-sm-12 pt-3">
											<div
												class="row d-flex align-items-center justify-content-flex-start">
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
											</div>
										</div>
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