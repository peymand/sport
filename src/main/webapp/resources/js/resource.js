$(document).ready(function(){
	
	$("#request-link").click(function(e){
		e.preventDefault();
		$.post(ctx + "/resource/request", $("form").serialize(), function(data){			
			alert(data);
		});
		return false;
	});
});

$(document).ready(function() {
    $(window).keydown(function(event){
        if(event.keyCode == 13) {
            event.preventDefault();
            return false;
        }
    });
});