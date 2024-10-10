all:
	javac -d bin $(shell find src -name "*.java")

clean:
	rm -rf ./bin

run:
	java -cp bin com.ContaBanco.main

re: clean all

.PHONY: all clean re run