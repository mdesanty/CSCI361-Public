
public class MatrixMultiply 
{
	private int m_a[][] = 
		{ 
			{4, 2, 1},
			{0, -3, 4},
			{5, 6, 2}
		};

	private int m_b[][] = 
		{ 
			{6, 1, 7},
			{3, 2, -1},
			{4, 6, 2}
		};

	private int m_c[][] = 
		{ 
			{-1, -1, -1},
			{-1, -1, -1},
			{-1, -1, -1}
		};
	
	public static void main(String[] args) 
	{
		MatrixMultiply obj = new MatrixMultiply();
		obj.multiply();
		obj.printAnswer();			
	}

	private void multiply()
	{
		int n = m_a.length;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				int sum = 0;
				for (int i = 0; i < n; i++)
				{
					sum += m_a[r][i] * m_b[i][c];
				}
				m_c[r][c] = sum;
			}
		}
	}
	
	private void printAnswer()
	{
		int n = m_a.length;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				System.out.print(m_c[r][c] + " ");
			}
			System.out.println();
		}		
	}
}
