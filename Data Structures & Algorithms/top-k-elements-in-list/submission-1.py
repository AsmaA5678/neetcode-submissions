class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = {}

        # Count each number
        for num in nums:
            frequency[num] = frequency.get(num, 0) + 1

        # Group numbers by their frequency
        numbers_by_frequency = {}

        for num, freq in frequency.items():
            numbers_by_frequency.setdefault(freq, []).append(num)

        result = []

        # Process frequencies from largest to smallest
        for freq in sorted(numbers_by_frequency, reverse=True):
            for num in numbers_by_frequency[freq]:
                result.append(num)

                if len(result) == k:
                    return result

        return result