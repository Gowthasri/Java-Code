package com.gowthasri;//package com.gowthasri;
//import java.util.Set;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//java.util.regex
//import com.google.common.collect.Sets;
//
//public class JapanValidator {
//    private static final String expression = "(?:[0-9]{4}([ .-]?)[0-9]{4}\\1[0-9]{4})";
//    jregex.Pattern pattern = new jregex.Pattern("(?:[0-9]{4}([ .-]?)[0-9]{4}\\1[0-9]{4})");
//
//    Pattern p = Pattern.compile("(?:[0-9]{4}([ .-]?)[0-9]{4}\\1[0-9]{4})");
//    Matcher m = p.matcher("12345678911");
//    boolean b = m.matches();
//    System.out.println(expression);
//
//}
import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JapanValidator {
    private JapanValidator() {
    }

    public static void main(String[] args) throws URISyntaxException, IOException {
        Path infile = Paths.get("C:\\Users\\redgo03\\Documents\\test\\testfile.txt");
        Path outfile = Paths.get(new File("C:\\Users\\redgo03\\Documents\\test\\testfile_output.txt").toURI());
        removeDuplicateLines(infile, outfile);

    }

    public static void removeDuplicateLines(final Path infile, final Path outfile)
            throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outfile, StandardCharsets.UTF_8))
        {
            try (BufferedReader reader = Files.newBufferedReader(infile, StandardCharsets.UTF_8))
            {

                // read/write the first line here so we can prepend newlines in the for loop
                String line= reader.readLine().replaceAll("\\|", "\\,");
                writer.write(line);
                writer.newLine();
                for (line = reader.readLine(); line != null; line = reader.readLine()) {
                    line = reader.readLine().replaceAll("\\|", "\\,");
                    writer.write(line);
                    }
                }
            }
        }
    }