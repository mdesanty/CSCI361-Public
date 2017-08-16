// ------------------------------------------------
// f(n) = c
// Constant time
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
// ------------------------------------------------

// ------------------------------------------------
// f(n) = clog(n) + c
// Sublinear or logarithmic
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 1; i < n; i=i*2)
{
    System.out.println(i); 
}
// ------------------------------------------------

// ------------------------------------------------
// f(n) = cn + c
// Linear
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 0; i < n; i++)
{
    System.out.println(i);
}

// ------------------------------------------------
// f(n) = c*nlog(n) + c
// Superlinear
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 1; i < n; i++)
{
    for (int j = 1; j < n; j=j*2)
    {
        System.out.println(i*j); 
    }
}
// ------------------------------------------------
// f(n) = cn^2  + c
// Quadratic
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 0; i < n; i++)
{
    for (int j = 0; j < n; j++)
    {
        System.out.println(i*j);
    }
}
// ------------------------------------------------

// ------------------------------------------------
// f(n) = c^n + c
// Exponential
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 0; i < Math.pow(c, n); i++)
{
    System.out.println(i);
}

// ------------------------------------------------
// f(n) = c*n! + c
// Factorial
// ------------------------------------------------
Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(i);
for (int i = 0; i < factorial(n); i++)
{
    System.out.println(i);
}
// ------------------------------------------------



public static int factorial(int n) 
{
    if (n == 0) {
        return 1;
    }
    
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

