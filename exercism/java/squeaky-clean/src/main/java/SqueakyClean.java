class SqueakyClean {
    static String clean(String identifier) {
        // butt
        char[] charArray = identifier.toCharArray();
        
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '-') {
                identifier.replace(charArray[i], ' ');
            }
//            if (Character.isISOControl(charArray[i])) {
//                identifier.replace(Character.toString(charArray[i], "CTRL"));
//            }
        }
        
        String afterDashToUpper = identifier.substring(identifier.indexOf("-") + 1, identifier.indexOf("-") + 2).toUpperCase();
        System.out.println(afterDashToUpper);
        
        return identifier.replace(" ", "_")
                .replaceAll("\\p{Cc}", "CTRL")
                .replace("-", afterDashToUpper);
    }
}
