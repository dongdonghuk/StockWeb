function signIn(){
    document.signInForm.action = "/";
    document.signInForm.submit();
    // var data = {
    //     userId : $("#signInUserId").val(),
    //     userPw : $("#signInUserPw").val()
    // }

    // $.ajax({
    //     url: "/signin",
    //     type: "POST",
    //     data: data,
    // })
    // .done(function (data) {
    // });
}

 $("#signInconfirmLogin").on("click",signIn);