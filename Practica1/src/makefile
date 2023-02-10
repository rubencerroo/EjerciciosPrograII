JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		  Principal.java \
		  Matematicas.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
	
run:
	java Principal 1000