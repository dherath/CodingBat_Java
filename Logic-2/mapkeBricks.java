public boolean makeBricks(int small, int big, int goal) {
  return (goal<= small + big*5)  && goal%5<=small;
}
