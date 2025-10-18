class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        f1 = {}
        f2 = {}
        for ch in s:
            if ch in f1:
                f1[ch] += 1
            else:
                f1[ch] = 1
        for ch in t:
            if ch in f2:
                f2[ch] += 1
            else:
                f2[ch] = 1
        for key in f1:
            if key not in f2 or f1[key]!=f2[key]:
                return False
        
        return True
        




        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        