package seminar14_testareUnitara.modele;

import java.util.ArrayList;

import seminar13_testareUnitara.exceptii.ExceptieNota;
import seminar13_testareUnitara.exceptii.ExceptieNume;
import seminar13_testareUnitara.exceptii.ExceptieVarsta;

public class Student {
	public static final int MIN_VARSTA = 14;
	public static final int MAX_VARSTA = 90;
	public static final int MIN_NOTA = 1;
	public static final int MAX_NOTA = 10;
	public static final int MIN_LUNGIME_NUME = 3;
	public static final int MAX_LUNGIME_NUME = 255;

	protected String nume;
	protected int varsta;
	protected ArrayList<Integer> note;

	public Student(String nume, int varsta, ArrayList<Integer> note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) throws ExceptieNume {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws ExceptieVarsta {
		// shadowing
		// varsta = varsta;

		if (varsta < Student.MIN_VARSTA || varsta > Student.MAX_VARSTA) { // >= bug pentru boundary lim superioara
			throw new ExceptieVarsta();
		}
		this.varsta = varsta;
	}

	public void setNote(ArrayList<Integer> note) throws ExceptieNota {
		//this.note = note; //shallow copy
		this.note=(ArrayList<Integer>) note.clone();
	}

	public int getNota(int index) {
		return this.note.get(index);
	}

	public int getNrNote() {
		return this.note.size();
	}

	public float getMedie() {
		float suma = 0;
		for (int grade : this.note) {
			suma += grade;
		}
		return suma / this.note.size();

	}

	public int getNotaMinima() {
		// int min = 0;
		if (this.note == null || this.note.size() == 0) {
			return 0;
		}

		int min = this.note.get(0);
		for (int nota : this.note) {
			if (min > nota) {
				min = nota;
			}
		}
		return min;
	}

}
