class Solution:
    def largest(self, arr):
        # code here
        if not arr:
            return None  # handle empty array
        max_element = arr[0]
        for num in arr:
            if num > max_element:
                max_element = num
        return max_element
        
