release: clean build

build: prog1 valid-palindrome

prog1: prog1.cc valid-palindrome
	g++ prog1.cc -o prog1
	g++ valid-palindrome.cc -o valid-palindrome

clean: 
	rm -rf prog1 valid-palindrome
