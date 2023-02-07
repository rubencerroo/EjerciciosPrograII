all: build

build:
	javac -d bin -cp src src/mates/Matematicas.java
	javac -d bin -cp src src/aplicacion/Principal.java

run:
	java -cp bin aplicacion.Principal $(ARGS)

clean:
	rm -rf bin
