class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
		return false;
	}
	char arr1[]=s.toCharArray();
	char arr2[]=t.toCharArray();
	Arrays.sort(arr2);
	Arrays.sort(arr1);
if(Arrays.equals(arr1, arr2)) {
	return true;
}
	return false;
    }
}