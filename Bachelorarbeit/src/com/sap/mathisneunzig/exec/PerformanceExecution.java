package com.sap.mathisneunzig.exec;

import java.util.HashMap;

import com.sap.mathisneunzig.algorithms.Breitensuche;
import com.sap.mathisneunzig.algorithms.Tiefensuche;
import com.sap.mathisneunzig.tree.List2TreeByParents;
import com.sap.mathisneunzig.tree.Node;

public class PerformanceExecution {
	
	public static void main(String[] args) {

		HashMap<String, Node> simple = List2TreeByParents.getMap();
		HashMap<String, Node> middle = List2TreeByParents.getMapMiddle();
		HashMap<String, Node> big = List2TreeByParents.getMapBig();
		for(int i = 0; i<10; i++) {
//			run(middle, "SB_CFD_PRJ_PROJECT_V2", "cfd_dummy");
			run(big, "S_SALES_ORDER_CREATED", "dummy");
		}
		
	}
	
	private static void run(HashMap<String, Node> map, String s, String suche) {

		// Tiefensuche
		
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
		
		iterativPreorderDFSStart = System.currentTimeMillis();
		Tiefensuche.iterativPreOrder(map, s, suche);
		iterativPreorderDFS = System.currentTimeMillis() - iterativPreorderDFSStart;
		
		iterativPostorderDFSStart = System.currentTimeMillis();
		Tiefensuche.iterativPostOrder(map, s, suche);
		iterativPostorderDFS = System.currentTimeMillis() - iterativPostorderDFSStart;
		
		rekursivPreorderDFSStart = System.currentTimeMillis();
		Tiefensuche.rekursivPreOrder(map, s, suche);
		rekursivPreorderDFS = System.currentTimeMillis() - rekursivPreorderDFSStart;
		
		rekursivPostorderDFSStart = System.currentTimeMillis();
		Tiefensuche.rekursivPostOrder(map, s, suche);
		rekursivPostorderDFS = System.currentTimeMillis() - rekursivPostorderDFSStart;
		
		beschraenktIterativPreorderDFSStart = System.currentTimeMillis();
		Tiefensuche.beschraenktIterativPreOrder(map, s, suche, 5);
		beschraenktIterativPreorderDFS = System.currentTimeMillis() - beschraenktIterativPreorderDFSStart;
		
		beschraenktIterativPostorderDFSStart = System.currentTimeMillis();
		Tiefensuche.beschraenktIterativPostOrder(map, s, suche, 5);
		beschraenktIterativPostorderDFS = System.currentTimeMillis() - beschraenktIterativPostorderDFSStart;
		
		nichtDeterministischIterativPreorderDFSStart = System.currentTimeMillis();
		Tiefensuche.nichtDeterministischIterativPreOrder(map, s, suche);
		nichtDeterministischIterativPreorderDFS = System.currentTimeMillis() - nichtDeterministischIterativPreorderDFSStart;
		
		nichtDeterministischIterativPostorderDFSStart = System.currentTimeMillis();
		Tiefensuche.nichtDeterministischIterativPostOrder(map, s, suche);
		nichtDeterministischIterativPostorderDFS = System.currentTimeMillis() - nichtDeterministischIterativPostorderDFSStart;
		
		nichtDeterministischRekursivPreorderDFSStart = System.currentTimeMillis();
		Tiefensuche.nichtDeterministischRekursivPreOrder(map, s, suche);
		nichtDeterministischRekursivPreorderDFS = System.currentTimeMillis() - nichtDeterministischRekursivPreorderDFSStart;
		
		nichtDeterministischRekursivPostorderDFSStart = System.currentTimeMillis();
		Tiefensuche.nichtDeterministischRekursivPostOrder(map, s, suche);
		nichtDeterministischRekursivPostorderDFS = System.currentTimeMillis() - nichtDeterministischRekursivPostorderDFSStart;
		
		// Breitensuche

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
		Breitensuche.iterativ(map, s, suche);
		iterativBFS = System.currentTimeMillis() - iterativBFSStart;
		
		rekursivBFSStart = System.currentTimeMillis();
		Breitensuche.rekursiv(map, s, suche);
		rekursivBFS = System.currentTimeMillis() - rekursivBFSStart;
		
		beschraenktBFSStart = System.currentTimeMillis();
		Breitensuche.beschraenktIterativ(map, s, suche);
		beschraenktBFS = System.currentTimeMillis() - beschraenktBFSStart;
		
		nichtDeterministischIterativBFSStart = System.currentTimeMillis();
		Breitensuche.nichtDeterministischIterativ(map, s, suche);
		nichtDeterministischIterativBFS = System.currentTimeMillis() - nichtDeterministischIterativBFSStart;
		
		nichtDeterministischRekursivBFSStart = System.currentTimeMillis();
		Breitensuche.nichtDeterministischRekursiv(map, s, suche);
		nichtDeterministischRekursivBFS = System.currentTimeMillis() - nichtDeterministischRekursivBFSStart;
		
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
