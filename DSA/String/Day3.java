package DSA.String;

class Day3 {
    public String validIPAddress(String queryIP) {
        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            return validateIPv4(queryIP);
        } 
        else if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            return validateIPv6(queryIP);
        } 
        else {
            return "Neither";
        }
    }

    private String validateIPv4(String ip) {

        String[] parts = ip.split("\\.", -1);

        for (String part : parts) {
            if (part.length() == 0 || part.length() > 3){
                 return "Neither";
            }
            if (part.charAt(0) == '0' && part.length() != 1){
                return "Neither";
            }
            for (char ch : part.toCharArray()) {
                if (!Character.isDigit(ch)) return "Neither";
            }
            if (Integer.parseInt(part) > 255){
                return "Neither";
            } 
        }
        return "IPv4";
    }

    private String validateIPv6(String ip) {
        String[] parts = ip.split(":", -1);
        String hex = "0123456789abcdefABCDEF";
        
        for (String part : parts) {
            if (part.length() == 0 || part.length() > 4){
                return "Neither";
            };
            for (char ch : part.toCharArray()) {
                if (hex.indexOf(ch) == -1) return "Neither";
            }
        }
        return "IPv6";
    }
}
