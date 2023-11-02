package hoyolabdailycheckin;

import org.apache.commons.cli.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Options options = new Options();

        Option help = new Option("h", "help", false, "print this help page");
        Option test = new Option("test", "test option");
        
        options.addOption(help);
        options.addOption(test);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter helpFormatter = new HelpFormatter();
        try {
            CommandLine cmd = parser.parse(options, args);
            if (cmd.hasOption(help)) {
                helpFormatter.printHelp("test", options);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
