package Model;

import java.util.*;

public class Payement {
	int Id_paiement;
	long Numero_carte;
	String Nom;
	int datefin_validite;
	int CVC;

	public Payement(int id_paiement, long numero_carte, String nom, int datefin_validite, int cVC) {

		Id_paiement = id_paiement;
		Numero_carte = numero_carte;
		Nom = nom;
		this.datefin_validite = datefin_validite;
		CVC = cVC;
	}

}