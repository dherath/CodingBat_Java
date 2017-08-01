public int makeChocolate(int small, int big, int goal) {
  if(goal <= small + 5*big) {
    if (goal/5 <= big && goal%5<=small) return goal%5;
    else if (goal/5>big && goal-(big*5)<=small) return goal - big*5;
  }
  return -1;
}
