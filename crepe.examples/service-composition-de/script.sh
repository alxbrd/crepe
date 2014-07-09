#!/bin/bash
# $1 : start iteration 
# $2 : end iteration

batch=1
proc_num=1
counter=$1
iterations=$(($2 / proc_num))

export R_HOME=/usr/lib/R

rm -r "Experiments/"
mkdir "Experiments/"

for i in $(seq $1 $iterations);
do
	batch=$((batch + 1))
	echo "Next batch:" $batch
	for j in $(seq 1 $proc_num)
	do 
		START=$(date +%s.%N)
		mkdir "Experiments/Experiment:"$counter
  		echo ant -buildfile build.xml -Diteration=$counter &
		ant -buildfile build.xml -Diteration=$counter &		
		((++executed == proc_num)) && { executed=0; wait; }
		END=$(date +%s.%N)
		DIFF=$(echo "$END - $START" | bc)
		echo $DIFF >> "Experiments/timings.txt"	
		counter=$((counter + 1))
	done
done

