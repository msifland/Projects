// My first C program
#include <stdio.h> // Standard input output for printing and other standards
#include <unistd.h> // For sleep commands
#include <stdlib.h> // Standard libraries for executing shell commands
#include <dirent.h> // For getting directory paths through "cwd"
#include <sys/types.h>
#include <pwd.h>

int main() {
	char *home = ("/home/msifland/");

	int age;
	int height;
	age = 50;
	height = 60;

	printf("These are variables:\n \n");
	printf("I am %d years old.\n", age);
	printf("\a\n");
	sleep(.1);

	printf("I am %d inches tall.\n", height);
	printf("\a\n");
	sleep(.1);

	printf("I am trying to execute build int shell commands:\n");
	printf("Home directory is %s \n", home);
	//return execl("/home/msifland/scripts/updater", "updater", NULL);

	return 0;
}
