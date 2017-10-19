package observer;

public class Main {

	public static void main(String[] args) {
		SensorConcrete s1 = new SensorConcrete();
		SensorConcrete s2 = new SensorConcrete();
		SensorConcrete s3 = new SensorConcrete();
		
		AlarmeConcrete alarme = new AlarmeConcrete();
		alarme.adicionarSensor(s1);
		alarme.adicionarSensor(s2);
		alarme.adicionarSensor(s3);
		DelegaciaConcrete delegacia = new DelegaciaConcrete(alarme);
		CiaSegurancaConcrete cia = new CiaSegurancaConcrete(alarme);
		
		s2.alterarAlerta();
		s1.alterarAlerta();
		s3.alterarAlerta();
		s2.alterarAlerta();
		s3.alterarAlerta();
		s1.alterarAlerta();
	}

}
