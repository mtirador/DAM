# Instalación yii

Aplicación Base en Git

1. Entrar en GitLab
2. Abre xamp y enciende Apache y Mysql
3. Ir a Htdocs que se encuentra en c:/—>xamp—>htdocs
4. Crear un proyecto en GitLab con el nombre de “My awesome project” … Copiar el html 
5. Dentro de la carpeta htdocs, Hacer “gitbash here”. en consola 
6. Ir a google [Create yii2 project basic](https://www.yiiframework.com/doc/guide/2.0/en/start-installation).  
    
    Copiar lo que pone en la captura de abajo(en la web vendrá con dos basic al final. (quitar el último)) y en la consola  “pegar” (espacio) y poner punto  y dar intro.
    

![paso7.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/paso7.png)

1. Me preguntará si confio en composer y tecleare la “y” y daré intro.
2. git init (intro)
3. git remote add origin +(el https de gitlab del repo)
4. git add .
5. git commit -m “proyecto instalado”
6. git push origin master
7. Abrir netbeans/carpeta amarilla/php/php aplication with existing sources
8. En browser —> c:/xampp/htdocs/yii
9. Poner lo de las fotos de abajo

![paso15.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/paso15.png)

![paso16.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/paso16.png)

1. Dar a finish
2. Bola del Mundo—>Seleccionar el google Chrome de la parte de abajo.
3. Flecha verde,  Hacer Click
4. Config—>db.php (fotos de abajo)

![paso20.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/paso20.png)

![21.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/21.png)

![22.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/22.png)

1. Config—>web.php (fotos de abajo)

![23.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/23.png)

![24.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/24.png)

![25.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/25.png)

1. Abrir consola —> git add .
2. git commit -m “aplicacion configurada”
3. git push origin master
4. En el navegador poner lo de la foto de abajo: 
    
    ![captura26.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/captura26.png)
    

1. Start model generator/table 
    
    ![27.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/27.png)
    
2. Preview—>generate

1. Crud generator

![28.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/28.png)

![29.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/29.png)

1. Modificar main de la vista

![30.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/30.png)

![31.png](Instalacio%CC%81n%20yii%2000d1ff85e057417e948053ae3ea4bbc3/31.png)

1. git add .
2. git commit -m “modelo y crud de ciclista creado + menu añadido”
3. git push origin master