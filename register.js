const Server_Url="http://localhost:8081";



document.getElementById("registerform")?.addEventListener("submit",function(e){
    e.preventDefault();

    const email=document.getElementById("mail").value;
    const password=document.getElementById("password").value;
    fetch(`${Server_Url}/register`,{
        method:"POST", 
        headers: {
            "Content-Type": "application/json"
        },
        body:JSON.stringify({email,password})
    })
    .then(response=>{
        if(response.ok){
            alert("resigter successfully,login now");
            window.location.href="login.html";
        }else{
            return "Register failed"; 
        }
        }).catch(error => {

           alert( error.message);
    })

});



document.getElementById("loginform")?.addEventListener("submit",function (e){
    e.preventDefault();



    const email=document.getElementById("mail").value;
    const password=document.getElementById("password").value;

    fetch(`${Server_Url}/login`,{
        method:"POST",
        headers: {
            "Content-Type": "application/json"
        },
         body:JSON.stringify({email,password})
    })
    .then(async response=>{
        if(!response.ok){
             const errorText = await response.text();
            throw new Error(errorText||"login failed");  
        }
      
         window.location.href='index.html';
        })
        
        .catch(error => {

           alert( error.message);
    })



});
