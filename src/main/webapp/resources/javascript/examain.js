$(document).ready(function(){
	$("#idCours").on("change",function(e){
		if(VerifierCours()){
			creerExamain($("#idCours option:selected").val());
		}
	});
});

function VerifierCours(){
	var idCours = $("#idCours option:selected").val();
	if(idCours){
		if(idCours === "-1"){
			alert("Veuiller Selectioner un cour ");
			return false;
		}
		return true;
	}
}

function creerExamain(idCours){
	if(idCours){
		$.getJSON("creerexamain", {
		idCours: idCours,
		ajax: true
		},
		function(data){
			console.log("cous a ete mis a jour");
			}
			
		);
	}
}