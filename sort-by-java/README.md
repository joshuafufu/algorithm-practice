Sort Practice
==========

## Sort classification ##
Swap sort: bubble sort, quick sort
Insertion sort: shell sort
Choose sort: heap sort
Merge sort: merge sort

## Insertion Sort ##

Since there are N iteration in every inner loops, so the time complexity should be o(N*N).

If the data are most sorted, so this sort will be much fast and closely to o(N).


## Shell Sort ##

Shell sort is also called diminishing increment sort.

The worst time complexity should be o(N*N)

If using Hibbard increment sequence, the time complexity will be shorted to:
0(N(3/2))

The Hibbard increment sequence are: 1, 3, 7, ..., 2(k) - 1

Shell sort is a good choice in practice.

## Heap Sort ##

The time complexity is o(NlogN).

It need an attached array and will consump one time more storage.

## Merge Sort ##

The time complexity is o(NlogN).

It is a good example of iteration algorithm.

Divide-and-conquer

Merge sort is difficult to run in main memory since two arrays to be sorted need an additional memory. And it also need a temporary array to copy back which may make the sort slow.

Actually, merge sort is always used for external sort.

## Quick Sort ##

Quick sort is the fastest sort in the know sort algorithm in practice. It's average time complexity is o(NlogN). And the worst would be o(N*N).

However, for a small array which may be less than 20, insertion sort is better than quick sort.

## Bucket Sort ##

Bucket sort is used for sorting a group of small integers.

If the number are all small than M, then the time complexity will be o(N+M).

## External Sort ##

External sort means not to load all the datas into memory when sorting. It is used to handle large piece of datas.

The base thought of external sort is merge sort.
