The first thing I wanted to do was to make sure the basic function of the binary search worked.
So my first few tests were the ones that were given, with a basic integer and string search. 
After making sure that the basic functionality works, I moved on to checking if duplicates works.
For duplicates, we could return any index of the duplicates, since the binary search function only return one
index, I just use that index as my excepted value. The next thing was using "ZOMBIES" looking at the zero and boundaries.
I created tests for the beginning, middle and end of the array range to check that the search work while remaining in bound. 
Next was to look at what happened if things were out of bound, on the lower and higher end. Checking for boundaries helps us know what
is in bound and what is out of bound. Another technique that was used was equivalence partition, to check all of the data types, like string,
int, double and boolean. Just checking that the basic function of a few of them works and it is very probable that the other tests checking for boundaries
works for the other data types. Moreover, I had to create test for the cases that would throw an error. Things that would occur if the binary search failed,
like if the element wasn't found or if there was a null element. 

The under specified part is for unsorted arrays and if that problem occurs, the function just threw a no such element exception. I agree that checking to see
if the array was sorted would be kind of a wasted effort because it would increase the time and potentially the memory complexity and it would make binary search
really inefficient. 
The tests that tested for this behavior were the ones that tested for an unsorted array. Since the array wasn't sorted it would return an error. I think that checking if it 
was unsorted would be an closed box test because it is something that you would check no matter what, even if you knew the ins and outs of the code. It is a test checking the inputs of the
array and that is something a user might check. 