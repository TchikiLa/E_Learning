<!-- Sidebar -->
<ul
	class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion"
	id="accordionSidebar">

	<!-- Sidebar - Brand -->
	<a
		class="sidebar-brand d-flex align-items-center justify-content-center"
		href="javascript:void(0);">
		<div class="sidebar-brand-icon rotate-n-15">
			<i class="fas fa-laugh-wink"></i>
		</div>
		<div class="sidebar-brand-text mx-3">
			E-learning
		</div>
	</a>

	<!-- Divider -->
	<hr class="sidebar-divider my-0">

	<!-- Nav Item - Dashboard -->
	<c:url value="/home/" var="home" />
	<li class="nav-item"><a class="nav-link" href="${home }"> <i
			class="fas fa-fw fa-tachometer-alt"></i> <span>
			<fmt:message key="common.dashbord" /></span></a></li>
	<c:url value="/ens_etudiant/" var="etudiant" />
	<li class="nav-item"><a class="nav-link" href="${etudiant }"> <i
			class="fas fa-fw fa-table"></i> <span>
			<fmt:message key="common.etudiants" /></span></a></li>
			
	<!-- Divider -->

	<!-- Heading -->

	<!-- Nav Item - Pages Collapse Menu -->

	<!-- Nav Item - Utilities Collapse Menu -->
	
	<li class="nav-item"><a class="nav-link collapsed" 
		data-toggle="collapse" data-target="#collapseUtilities"
		aria-expanded="true" aria-controls="collapseUtilities"> <i
			class="fas fa-fw fa-folder"></i> <span><fmt:message key="common.cours" /></span>
	</a>
		<c:url value="/cours/" var="cours" />
		<div id="collapseUtilities" class="collapse" href="${cours }"
			aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
			<div class="bg-white py-2 collapse-inner rounded">
				<c:url value="/ens_cours/" var="cours" />
				<a class="collapse-item" href="${cours }"><fmt:message key="common.cours.cours" /></a>
				<c:url value="/ens_question/" var="question" />
				<a class="collapse-item" href="${question }"><fmt:message key="common.cours.question" /></a>
				<c:url value="/ens_examain/" var="examains" />
				<a class="collapse-item" href="${examains }"><fmt:message key="common.cours.examains" /></a>
			</div>
		</div></li>

	<!-- Divider -->

	<!-- Heading -->

	<!-- Nav Item - Pages Collapse Menu -->

	<!-- Nav Item - Charts -->

	<!-- Nav Item - Tables -->

	<!-- Divider -->
	<hr class="sidebar-divider d-none d-md-block">
	
	<!-- Sidebar Toggler (Sidebar) -->
	<div class="text-center d-none d-md-inline">
		<button class="rounded-circle border-0" id="sidebarToggle"></button>
	</div>

</ul>

<!-- End of Sidebar -->