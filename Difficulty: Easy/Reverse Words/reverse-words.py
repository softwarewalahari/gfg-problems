class Solution:
    def reverseWords(self, s):
        rev = s.split()
        reverse=rev[::-1]
        return ' '.join(reverse)
