# Makefile for calculator-demo

# Compiler and flags
JC = javac
JFLAGS = -g

# Source and class files
SRCDIR = ./src
BINDIR = ./bin
SOURCES = $(wildcard $(SRCDIR)/*.java)
CLASSES = $(patsubst $(SRCDIR)/%.java,$(BINDIR)/%.class,$(SOURCES))

# Default target compiles all the source files
default:
	$(JC) $(JFLAGS) -d $(BINDIR) $(SOURCES)
# Run the CalculatorTest
test: default
	java -cp $(BINDIR) CalculatorTest
# Clean the compiled classes
clean:
	rm -rf $(BINDIR)/*

.PHONY: default test clean

