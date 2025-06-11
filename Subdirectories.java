

import java.io.File;

public class Main {

    // Recursive method to print directory contents
    public static void recursivePrint(File[] au, int index, int level) {
        if (index == au.length)
            return;

        for (int i = 0; i < level; i++)
            System.out.print("\t"); // Changed println to print for proper indentation

        if (au[index].isFile())
            System.out.println(au[index].getName());
        else if (au[index].isDirectory()) {
            System.out.println(au[index].getName() + "/");
            recursivePrint(au[index].listFiles(), 0, level + 1);
        }

        recursivePrint(au, index + 1, level);
    }

    public static void main(String[] args) {
        String maindirpath = "C:\\Sona";
        File maindir = new File(maindirpath);

        if (maindir.exists() && maindir.isDirectory()) {
            File[] a = maindir.listFiles();

            System.out.println("*****");
            System.out.println("Files from main directory: " + maindir.getName());
            System.out.println("*****");

            recursivePrint(a, 0, 0);
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
}
