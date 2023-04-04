package com.sap.mathisneunzig.exec;

import java.util.HashMap;

import com.sap.mathisneunzig.algorithms.BreitensucheRace;
import com.sap.mathisneunzig.algorithms.TiefensucheRace;
import com.sap.mathisneunzig.tree.List2TreeByParents;
import com.sap.mathisneunzig.tree.Node;

public class RaceExecution {
	
	public static void main(String[] args) {

		HashMap<String, Node> simple = List2TreeByParents.getMap();
		HashMap<String, Node> middle = List2TreeByParents.getMapMiddle();
		HashMap<String, Node> big = List2TreeByParents.getMapBig();
		for(int i = 0; i<1; i++) {
//			run(simple, "SB_CFD_PRJ_PROJECT_V4", "cfd_dummy");
			run(big, "S_SALES_ORDER_CREATED", "dummy");
		}
		
	}

	private static void run(HashMap<String, Node> map, String s, String suche) {

		// TiefensucheRace
		
		long iterativPreorderDFS = 0;
		long iterativPostorderDFS = 0;
		long rekursivPreorderDFS = 0;
		long rekursivPostorderDFS = 0;
		long beschraenktIterativPreorderDFS = 0;
		long beschraenktIterativPostorderDFS = 0;
		long nichtDeterministischIterativPreorderDFS = 0;
		long nichtDeterministischIterativPostorderDFS = 0;
		long nichtDeterministischRekursivPreorderDFS = 0;
		long nichtDeterministischRekursivPostorderDFS = 0;

		long iterativPreorderDFSStart = 0;
		long iterativPostorderDFSStart = 0;
		long rekursivPreorderDFSStart = 0;
		long rekursivPostorderDFSStart = 0;
		long beschraenktIterativPreorderDFSStart = 0;
		long beschraenktIterativPostorderDFSStart = 0;
		long nichtDeterministischIterativPreorderDFSStart = 0;
		long nichtDeterministischIterativPostorderDFSStart = 0;
		long nichtDeterministischRekursivPreorderDFSStart = 0;
		long nichtDeterministischRekursivPostorderDFSStart = 0;
		
		long t = 0;
		
		iterativPreorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.iterativPreOrder(map, s, suche);
		iterativPreorderDFS = t - iterativPreorderDFSStart;
		
		iterativPostorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.iterativPostOrder(map, s, suche);
		iterativPostorderDFS = t - iterativPostorderDFSStart;
		
		rekursivPreorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.rekursivPreOrder(map, s, suche);
		rekursivPreorderDFS = t - rekursivPreorderDFSStart;
		
		rekursivPostorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.rekursivPostOrder(map, s, suche);
		rekursivPostorderDFS = t - rekursivPostorderDFSStart;
		
		beschraenktIterativPreorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.beschraenktIterativPreOrder(map, s, suche, 5);
		beschraenktIterativPreorderDFS = t - beschraenktIterativPreorderDFSStart;
		
		beschraenktIterativPostorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.beschraenktIterativPostOrder(map, s, suche, 5);
		beschraenktIterativPostorderDFS = t - beschraenktIterativPostorderDFSStart;
		
		nichtDeterministischIterativPreorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.nichtDeterministischIterativPreOrder(map, s, suche);
		nichtDeterministischIterativPreorderDFS = t - nichtDeterministischIterativPreorderDFSStart;
		
		nichtDeterministischIterativPostorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.nichtDeterministischIterativPostOrder(map, s, suche);
		nichtDeterministischIterativPostorderDFS = t - nichtDeterministischIterativPostorderDFSStart;
		
		nichtDeterministischRekursivPreorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.nichtDeterministischRekursivPreOrder(map, s, suche);
		nichtDeterministischRekursivPreorderDFS = t - nichtDeterministischRekursivPreorderDFSStart;
		
		nichtDeterministischRekursivPostorderDFSStart = System.currentTimeMillis();
		t = TiefensucheRace.nichtDeterministischRekursivPostOrder(map, s, suche);
		nichtDeterministischRekursivPostorderDFS = t - nichtDeterministischRekursivPostorderDFSStart;
		
		// BreitensucheRace

		long iterativBFS = 0;
		long rekursivBFS = 0;
		long beschraenktBFS = 0;
		long nichtDeterministischIterativBFS = 0;
		long nichtDeterministischRekursivBFS = 0;
		
		long iterativBFSStart = 0;
		long rekursivBFSStart = 0;
		long beschraenktBFSStart = 0;
		long nichtDeterministischIterativBFSStart = 0;
		long nichtDeterministischRekursivBFSStart = 0;
		
		iterativBFSStart = System.currentTimeMillis();
		t = BreitensucheRace.iterativ(map, s, suche);
		iterativBFS = t - iterativBFSStart;
		
		rekursivBFSStart = System.currentTimeMillis();
		t = BreitensucheRace.rekursiv(map, s, suche);
		rekursivBFS = t - rekursivBFSStart;
		
		beschraenktBFSStart = System.currentTimeMillis();
		t = BreitensucheRace.beschraenktIterativ(map, s, suche);
		beschraenktBFS = t - beschraenktBFSStart;
		
		nichtDeterministischIterativBFSStart = System.currentTimeMillis();
		t = BreitensucheRace.nichtDeterministischIterativ(map, s, suche);
		nichtDeterministischIterativBFS = t - nichtDeterministischIterativBFSStart;
		
		nichtDeterministischRekursivBFSStart = System.currentTimeMillis();
		t = BreitensucheRace.nichtDeterministischRekursiv(map, s, suche);
		nichtDeterministischRekursivBFS = t - nichtDeterministischRekursivBFSStart;
		
		// Ausgabe

//		System.out.println("[DFS] Iterativ, preorder "+iterativPreorderDFS);
//		System.out.println("[DFS] Iterativ, postorder "+iterativPostorderDFS);
//		System.out.println("[DFS] Iterativ, preorder, beschränkt "+beschraenktIterativPreorderDFS);
//		System.out.println("[DFS] Iterativ, postorder, beschränkt "+beschraenktIterativPostorderDFS);
//		System.out.println("[DFS] Iterativ, preorder, nicht deterministisch "+nichtDeterministischIterativPreorderDFS);
//		System.out.println("[DFS] Iterativ, postorder, nicht deterministisch "+nichtDeterministischIterativPostorderDFS);
//		System.out.println("[DFS] Rekursiv, preorder "+rekursivPreorderDFS);
//		System.out.println("[DFS] Rekursiv, postorder "+rekursivPostorderDFS);
//		System.out.println("[DFS] Rekursiv, preorder, nicht deterministisch "+nichtDeterministischRekursivPreorderDFS);
//		System.out.println("[DFS] Rekursiv, postorder, nicht deterministisch "+nichtDeterministischRekursivPostorderDFS);
//		System.out.println("[BFS] Iterativ "+iterativBFS);
//		System.out.println("[BFS] Iterativ, beschränkt "+beschraenktBFS);
//		System.out.println("[BFS] Iterativ, nicht deterministisch "+nichtDeterministischIterativBFS);
//		System.out.println("[BFS] Rekursiv "+rekursivBFS);
//		System.out.println("[BFS] Rekursiv, nicht deterministisch "+nichtDeterministischRekursivBFS);
		
		long[] result = new long[15];
		result[0] = iterativPreorderDFS;
		result[1] = iterativPostorderDFS;
		result[2] = beschraenktIterativPreorderDFS;
		result[3] = beschraenktIterativPostorderDFS;
		result[4] = nichtDeterministischIterativPreorderDFS;
		result[5] = nichtDeterministischIterativPostorderDFS;
		result[6] = rekursivPreorderDFS;
		result[7] = rekursivPostorderDFS;
		result[8] = nichtDeterministischRekursivPreorderDFS;
		result[9] = nichtDeterministischRekursivPostorderDFS;
		result[10] = iterativBFS;
		result[11] = beschraenktBFS;
		result[12] = nichtDeterministischIterativBFS;
		result[13] = rekursivBFS;
		result[14] = nichtDeterministischRekursivBFS;
		
		System.out.print("| ");
		for(long l : result) {
			System.out.print(l +" | ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
	}
	
}
