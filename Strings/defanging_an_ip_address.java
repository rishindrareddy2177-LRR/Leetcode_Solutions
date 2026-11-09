#Leetcode: Defanging an ip address
#Link:
https://leetcode.com/problems/defanging-an-ip-address/submissions/2192588812/

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
