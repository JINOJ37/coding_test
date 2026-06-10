class Solution {
    public String solution(String rsp) {
        rsp = rsp.replaceAll("2", "3");
        rsp = rsp.replaceAll("0", "1");
        rsp = rsp.replaceAll("5", "2");
        rsp = rsp.replaceAll("3", "0");
        rsp = rsp.replaceAll("1", "5");
        return rsp;
    }
}