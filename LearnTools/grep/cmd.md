-i	Case-insensitive search
-r	Recursive search
-n	Show line numbers
-v	Invert match (lines not containing pattern)
-w	Match whole words
-c	Count matches
-l	Show filenames only
-s	Suppress error messages
-E	Use extended regular expressions
-F	Fixed-string matching

``` grep -i -r -n 'Nisarg' .```
./file1.txt:1:Nisarg is my Name. Hello I am nisarg. Nisarg means Nature.
./file1.txt:8:Here is some other text with nisarg in it.
./file1.txt:10:Not lets say Nisarg.
./dir1/file3.txt:1:Nisarg ok
./dir1/file3.txt:11:Okay Nisarg


```grep % grep -i -r -n 'Nisarg'  *.txt```
cmd.txt:1:nisarg@NIsargs-MacBook-Air grep % grep -i -r -n 'Nisarg' .
cmd.txt:2:./file1.txt:1:Nisarg is my Name. Hello I am nisarg. Nisarg means Nature.
cmd.txt:3:./file1.txt:8:Here is some other text with nisarg in it.
cmd.txt:4:./file1.txt:10:Not lets say Nisarg.
cmd.txt:5:./dir1/file3.txt:1:Nisarg ok
cmd.txt:6:./dir1/file3.txt:11:Okay Nisarg
file1.txt:1:Nisarg is my Name. Hello I am nisarg. Nisarg means Nature.
file1.txt:8:Here is some other text with nisarg in it.
file1.txt:10:Not lets say Nisarg.
