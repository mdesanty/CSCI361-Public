
public class MatrixAdd 
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
		MatrixAdd obj = new MatrixAdd();
		obj.add();
		obj.printAnswer();			
	}

	private void add()
	{
		int n = m_a.length;
		for (int r = 0; r < n; r++)
		{
			for (int c = 0; c < n; c++)
			{
				m_c[r][c] = m_a[r][c] + m_b[r][c];
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
