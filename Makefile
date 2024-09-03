# Makefile for calculator-demo

# Compiler and flags
JC = javac
JFLAGS = -g

# Source and class files
SRCDIR = ./
BINDIR = ./
SOURCES = $(wildcard $(SRCDIR)/*.java)
CLASSES = $(patsubst $(SRCDIR)/%.java,$(BINDIR)/%.class,$(SOURCES))

# Default target
default: $(CLASSES)

# Compile Java source files into classes
$(BINDIR)/%.class: $(SRCDIR)/%.java
    $(JC) $(JFLAGS) -d $(BINDIR) $<

# Run the CalculatorTest
test: $(CLASSES)
    java -cp $(BINDIR) CalculatorTest

# Clean the compiled classes
clean:
    rm -rf $(BINDIR)/*

.PHONY: default test clean

