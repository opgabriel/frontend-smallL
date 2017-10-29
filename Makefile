all:
	find -name *.java -print0 | xargs -0 javac -classpath lib/swingx-all-1.6.5-1.jar

run:
	java -classpath src:lib/swingx-all-1.6.5-1.jar Main.Main

clean:
	find -name *.class -delete
