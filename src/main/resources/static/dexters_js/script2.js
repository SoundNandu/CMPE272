function onSignIn (googleUser)
{
	//alert("Welcome")
    var profile= googleUser.getBasicProfile();
    $(".g-signin2").css("display","none");
    $(".data").css("display","block");
    $("#pic").attr('src',profile.getImageUrl());
    $("#email").text(profile.getEmail());
	$("#firstName").text(profile.getGivenName());
	$("#lastName").text(profile.getFamilyName());

    var email=profile.getEmail();
    var role;
    sessionStorage.setItem("firstName",profile.getGivenName());
    sessionStorage.setItem("lastName",profile.getFamilyName());
    if (email === "abhishek.s.prabhudesai@gmail.com") {
        sessionStorage.setItem("role",'admin');
    } else {
        sessionStorage.setItem("role",'user');
    }
}

function signOut()
{
    var auth2 = gapi.auth2.getAuthInstance();
    auth2.signOut().then(function(){
        alert("You have been Successfully signed out");

        $(".g-signin2").css("display","block");
        $(".data").css("display","none");
    });
}