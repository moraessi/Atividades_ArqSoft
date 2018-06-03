package Exercicio9_1;

/**
 * 
 * @author Tainá Monteiro Gomes - R.A 817119056 - Turma:SIN3AN-MCA1
 * 			
 *
 */

public class Slot10 implements Slot {
	private Slot slot;

	public Slot10() {
	};

	@Override
	public double recebeMoeda(int m) {
		if (m == 10) {
			System.out.println("- Recebeu R$0,10");
			return 0.1;
		} else {
			return this.slot.recebeMoeda(m);
		}
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
