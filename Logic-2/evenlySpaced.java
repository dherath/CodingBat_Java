public boolean evenlySpaced(int a, int b, int c) {
  if (a>b && a>c) return Math.abs(a-b)==Math.abs(b-c) || Math.abs(a-c)==Math.abs(b-c);
  else if (b>a && b>c) return Math.abs(b-a)==Math.abs(a-c) || Math.abs(b-c)==Math.abs(a-c);
  else if (c>a && c>b) return Math.abs(c-a)==Math.abs(a-b) || Math.abs(c-b)==Math.abs(a-b);
  return Math.abs(a-b)==Math.abs(a-c) && Math.abs(b-c)==Math.abs(a-b);
}

