const menuopen=document.querySelector("#menu-open-button");
const menuclose=document.querySelector("#menu-close-button");
menuopen.addEventListener("click",()=>{
    document.body.classList.add("show-mobile-menu");
});
menuclose.addEventListener("click",()=>{
    document.body.classList.remove("show-mobile-menu");
});


const homeImg=document.querySelector('.home-image')
const btns=document.querySelectorAll('.btn-image')
const img=["coffee1.jpeg","coffee2.jpeg","coffee3.jpeg","coffee4.jpeg"]
let index=0
btns.forEach((button)=>{
    button.addEventListener('click',()=>{
        if(button.classList.contains('btn-left1')){
            index--;
            if(index<0){
                index=img.length-1;
            }
            homeImg.style.background=`url(images/${img[index]}) center/cover  no-repeat`
        }
        else{
            index++;
            if(index>(img.length-1)){
                index=0;
            }
            homeImg.style.background=`url(images/${img[index]}) center/cover no-repeat`
        }
    })
})

setInterval(() => {
    index++;
    if (index >= img.length) {
        index = 0;
    }homeImg.style.background=`url(images/${img[index]}) center/cover  no-repeat`
},2000
)