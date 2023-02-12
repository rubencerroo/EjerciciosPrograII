all: build run

build:
	javac -d bin src/mates/Matematicas.java src/aplicacion/Principal.java

run:
	java -cp bin aplicacion.Principal 1000

clean:
	rm -rf bin
