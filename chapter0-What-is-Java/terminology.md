**Compiler:** The compiler translates source code into a  low-level program.
In most compiled languages, the file containing the resulting low-level code is called an object file.  Compiled languages such as C and C++ use a platform-specific compilers, which output platform-specific object code.

**Platform** A specific target machine that code can be executed on. For example, if you compile a C++ program for a 64-bits Windows machine, the executable file can be copied to any other machine, but it can only run on other similar 64-bits Windows machines. It cannot run on a 32-bits Windows, a Mac or a Linux machine. The differences are due to different hardware and operating systems, that utilise different codes for the same operations.

**Object File:** The result from compiling source code. Object files can have different formats and may also depend on other object files or programs.  Hence, some will not be directly executable without further compilation and / or in isolation.  Several object files, which depend on each other to create a fully-functioning program, can be linked together to create an executable file.

**Linker:** Links a collection of object files to form an executable file.

**Executable file:** A file that the operating system can load into memory and run directly without further compilation.  Executable files are sometimes known as 'relocatable' since they can be moved to and run on any instance of the intended platform (see 'platform', above).

**Interpreter** Similar to a compiler, an interpreter turns high-level code into instructions the computer can execute.
However, that translation is happening for each statement in succession (before the next high-level statement is even looked at).
This conversion is called "on-the-fly" or "as needed".

**Source code** A high level programming language, such as Java or Ruby.

**Bytecode** The result from the Java compiler (often called the JVM compiler). Essentially, it is an object file for a virtual machine, which allows it to be used on any machine that has Java. Bytecode is not, however, an executable file.  To execute a bytecode file, you need to invoke a Java interpreter.

**Machine code:** The result from linking compiled source code (a collection of object files) together.  I.e. The code which comprises executable files.

**Java Runtime Environment (JRE):** A set of software tools for development of Java applications. It combines the Java Virtual Machine (JVM), platform core classes and supporting libraries.

**The Java Development Kit (JDK):** A software development environment used for developing Java applications and applets. It includes the Java Runtime Environment (JRE), an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc) and other tools needed in Java development.

**JAR:** A Java Archive, or JAR file, contains all of the various components that make up a self-contained, executable Java application, deployable Java applet or, most commonly, a Java library to which any Java Runtime Environment can link. Java applications and libraries can contain hundreds of different files, including compiled Java source code, a manifest file, XML-based configuration data, JSON-based data files, images, sound clips and even security certificates. A JAR file is simply an aggregation of all of these resources into a single, compressed file.

**Java Virtual Machine (JVM):** An abstraction layer between a Java application and the underlying platform. As the name implies, the JVM acts as a “virtual” machine or processor. To the bytecodes comprising the program, they are communicating with a physical machine; however, they are actually interacting with the JVM.
