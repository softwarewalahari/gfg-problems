class Solution:
    def reverseWords(self, s):
        rev = s.split()
        return ' '.join(rev[::-1])
