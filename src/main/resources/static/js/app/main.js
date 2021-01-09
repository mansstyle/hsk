function checkLoginSession() {
    if (sessionStorage.getItem("myLoginData") != null){
        alert("1")
        // sessionStorage.clear()
    }else{
        alert("2")
        // sessionStorage.setItem("myLoginData" , "userdata")
    }
}