package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 * <p>
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /**int value of locality.*/
    private int localityID;

    /**String value of locality name.*/
    private String localityName;

    /**String value of ascii greeting.*/
    private String asciiGreeting;

    /**String value of unicode greeting.*/
    private String unicodeGreeting;

    /**String value of format string.*/
    private String formatStr;

    /**
     * Default greeting that creates "Hello, {name}!".
     *
     * @param localityID   id of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters assuming
     * the language is already using ascii letters only.
     * It also assumes the format of the greeting to be "{greeting}, {name}!"
     *
     * @param localityID   id of the locality
     * @param localityName name of the locality
     * @param greeting     greeting using ascii characters
     */

    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     * It makes no assumptions and everything needs to be provided.
     *
     * @param localityID      id of the locality
     * @param localityName    name of the locality
     * @param asciiGreeting   greeting using ascii characters
     * @param unicodeGreeting greeting using unicode characters
     * @param formatStr       format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the ascii greeting. Just the greeting, no formatting.
     *
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Gets the unicode format string.
     *
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(this.formatStr, this.unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     *
     * @param asciiOnly if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly) {
        if (asciiOnly) {
            return String.format(this.formatStr, this.asciiGreeting);
        }
        return this.getFormatStr();
    }

    /**
     * Returns the locality id number.
     *
     * @return the locality id number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the unicode greeting. Just the greeting, no formatting.
     *
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Returns the full greeting details as a string.
     *
     * @return the full greeting details as a string.
     */
    @Override
    public String toString() {
        return "{" + "localityID:" + localityID
                + ", localityName:\"" + localityName + '\"'
                + ", asciiGreeting:\"" + asciiGreeting + '\"'
                + ", unicodeGreeting:\"" + unicodeGreeting + '\"' + "}";
    }

}
