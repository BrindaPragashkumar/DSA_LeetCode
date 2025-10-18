class Solution(object):
    def isAnagram(self, s, t):
        # check lengths are the same
        if len(s) != len(t):
            return False

        # create hash tables!
        f1 = {}
        f2 = {}

        # count s chars
        for ch in s:
            if ch in f1:
                f1[ch] += 1
            else:
                f1[ch] = 1

        # count t chars
        for ch in t:
            if ch in f2:
                f2[ch] += 1
            else:
                f2[ch] = 1

        # compare both for differences
        for key in f1:
            if key not in f2 or f1[key] != f2[key]:
                return False

        # all matched successfully
        return True





        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        