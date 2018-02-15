//package com.gowthasri;
//
//import java.io.*;
//import java.net.URISyntaxException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class FileUtility {
//    private FileUtility() {}
//
//
//    public static void main(String[] args) throws URISyntaxException, IOException {
//        Path infile = Paths.get("C:\\Users\\redgo03\\Documents\\test\\testfile.txt");
//        Path outfile = Paths.get(new File("C:\\Users\\redgo03\\Documents\\test\\test_output1.txt").toURI());
//        replacepipe(infile, outfile);
//    }
//
//    /* modify this code to remove duplicate lines */
//    public static void replacepipe(final Path infile, final Path outfile)
//            throws IOException {
//        try (BufferedWriter writer = Files.newBufferedWriter(outfile, StandardCharsets.UTF_8)) {
//            try (BufferedReader reader = Files.newBufferedReader(infile, StandardCharsets.UTF_8)) {
//                // read/write the first line here so we can prepend newlines in the for loop
//                for (String line = reader.readLine(); line != null; line = reader.readLine()) {
//                    line = reader.readLine().replaceAll("\\|","\\,");
//                    writer.write(line);
//                    writer.newLine();
//                    System.out.println(line);
//                    int lineCount = Integer.parseInt(line);
//                    System.out.println(lineCount);
//                }
//                }
//
//            }
//
//
//            }
//    public int countLines(String infile) throws IOException {
//        LineNumberReader reader  = new LineNumberReader(new FileReader(infile));
//        int cnt = 0;
//        String lineRead = "";
//        while ((lineRead = reader.readLine()) != null) {}
//
//        cnt = reader.getLineNumber();
//        reader.close();
//        return cnt;
//    }
//        }
//
