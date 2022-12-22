function slaptrump(){
    document.getElementById('trump').src='trump rmvBG.png';
}
function again(){
    document.getElementById('trump').src='trump-removebg-preview.png';
}
body{
    background-color: rgb(255, 255, 255);
}
h1{
    color: rgb(0, 169, 253);
    font-size: 60px;
    text-align: center;
}
.container{
    display: flex;
    justify-content: center;
    
}
.btn{
    font-size: 2    0px;
    padding: 10px;
    display: flex;
    justify-content: space-between;  
}
span{
    color:red;
}
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JavaScript</title>
    <script src="https://kit.fontawesome.com/5d9cf14b0e.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="index.css">
</head>

<body>
    <script src="index.js"></script>
    <h1>Slap Donald Trump</h1>
    <div class="container">
        
        <div>
            <img src="trump-removebg-preview.png" height="300px" width="500px" id="trump" alt="">

            <div class="btn">
                <button onclick="slaptrump() " class="slap" id="slap"><span>  <i class="fa-solid fa-hands-clapping"></i></span>    SLAP TRUMP  </button>
                <button onclick="again() " class="again" id="again"> <i class="fa-solid fa-arrow-rotate-right"></i>       AGAIN</button>
            </div>
        </div>
    </div>
</body>

</html>
