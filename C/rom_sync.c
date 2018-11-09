#include <stdio.h>
#include <sys/stat.h>

int main(int argc, char* argv[])
{
    const char* home_dir;
    home_dir = "/home/msifland/roms/du";
    struct stat sb;

    if (stat(home_dir, &sb) == 0 && S_ISDIR(sb.st_mode))
    {
        printf("YES\n");
    }
    else
    {
        printf("NO\n");
    }
}
