package businessLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HeapSortByIntTest {
	HeapSortByInt hsbi;
	@Before
	public void setUp() throws Exception {
		hsbi = new HeapSortByInt();
	}

	@Test
	public void testHeapSort() {
		int a[] [] = {{1,0},{3,1},{53,2},{32,3}};
		int b[] [] = {{53,2},{32,3},{3,1},{1,0}};
		HeapSortByInt.heapSort(a);		
		for(int i =0;i<4;i++)
		{
			assertTrue(a[i][0]==b[i][0]&&a[i][1]==b[i][1]);
		}
	}

}
