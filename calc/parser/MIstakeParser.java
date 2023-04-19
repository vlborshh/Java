package calc.parser;

public class MIstakeParser implements ArgsParser {
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private ArgsParser parser;

    public MIstakeParser() {

    }

    public MIstakeParser(ArgsParser parser) {
        this.parser = parser;
    }

    @Override
    public String[] parse(String[] calcArgs) {
        final String joining = String.join("", calcArgs);
        for (String arg : joining.split("")) {
            if (alphabet.contains(arg)) {
                throw new RuntimeException("Недопустимый символ" + arg);
            }
        }
        return parser != null ? parser.parse(calcArgs) : calcArgs;
    }
}
