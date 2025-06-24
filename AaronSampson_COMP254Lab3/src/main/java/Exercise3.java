import java.io.File;
public class Exercise3 {
    //method for dinding files with name
    public static void find(String path, String filename){
        File root = new File(path);

        //Checking for file if its a file
        if (root.isFile())
                System.out.println(root.getAbsolutePath());
        else if(root.isDirectory()) {
            //use recursion for directory and file if it is a directory
                File[] files = root.listFiles();
                for (File f: files){
                    find(f.getAbsolutePath(), filename);
                }

            }


    }

    public static void main(String[] args) {
        //Use modify run config to test find
        if (args.length < 2) {
            System.out.println("...........");
            return;
        }
        String testPath = args[0]; //folder
        String testFilename = args[1]; //file

        System.out.println("Finding" + testFilename + "/" + testPath + ":");
        find(testPath, testFilename);
    }

}
