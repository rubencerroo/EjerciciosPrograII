all: Matematicas.class Principal.class

Matematicas.class: Matematicas.java
		javac Matematicas.java

Principal.class: Principal.java
		javac Principal.java

run: Principal.class
		java aplicacion.Principal 10000000

clean:
		rm -f *.class
