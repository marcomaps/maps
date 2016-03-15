#cd ~/dev/maps/monolith
#mvn package
#cd ~/dev/maps/fii-informe-mensal
#mvn package

docker rm monolith fii

docker run -p 8080:8080 --name monolith -d -v ~/dev/maps/monolith/target/monolith-0.1.0.jar:/home/app.jar -i -t java8
docker run -p 8081:8080 --name fii --link monolith:monolith -d -v ~/dev/maps/fii-informe-mensal/target/fii-informe-mensal-0.1.0.jar:/home/app.jar -i -t java8
