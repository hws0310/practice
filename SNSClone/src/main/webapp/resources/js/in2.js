let inputTag = document.getElementsByTagName("input");
let buttonArray = document.getElementsByTagName("button");

let inputId = document.getElementById("userId"); //아이디 입력창(input 태그의 0번째)
let inputPassword = document.getElementById("password"); //비밀번호 입력창

let ordinaryButton = document.getElementById("submit");

inputPassword.addEventListener("keyup", () => {
    if(inputId.value){
        ordinaryButton.classList.remove("unactivatedLoginColor");
        ordinaryButton.classList.add("activatedLoginColor");
    }
    if(!inputPassword.value){
        ordinaryButton.classList.remove("activatedLoginColor");
        ordinaryButton.classList.add("unactivatedLoginColor");
    }
})
