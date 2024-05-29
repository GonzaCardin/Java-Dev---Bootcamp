Pasos para deploy {Con doker tiene tarjeta}
fly auth login

cd .\proytecto-clipse

fly apps destroy myApp <- esto es para un re deploy, por lo general

fly launch --dockerfile Dockerfile