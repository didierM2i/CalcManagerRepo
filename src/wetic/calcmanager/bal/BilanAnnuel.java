package wetic.calcmanager.bal;

public class BilanAnnuel {

	private double ca;
	private double charges;
	private double cotizSoc;
	private double impots;
	
	private double revenuProfBrute;
	private double beneficeImposable;
	private double beneficeNet;
	
	public BilanAnnuel(double ca, double charges, double cotizSoc, double impots) {
		super();
		this.ca = ca;
		this.charges = charges;
		this.cotizSoc = cotizSoc;
		this.impots = impots;
	}

	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public double getCotizSoc() {
		return cotizSoc;
	}

	public void setCotizSoc(double cotizSoc) {
		this.cotizSoc = cotizSoc;
	}

	public double getImpots() {
		return impots;
	}

	public void setImpots(double impots) {
		this.impots = impots;
	}

	public double getRevenuProfBrute() {
		return ca - charges;
	}

	public double getBeneficeImposable() {
		return revenuProfBrute - cotizSoc;
	}

	public double getBeneficeNet() {
		return beneficeImposable - impots;
	}

	@Override
	public String toString() {
		return "BilanAnnuel [ca=" + ca + ", charges=" + charges + ", cotizSoc=" + cotizSoc + ", impots=" + impots
				+ ", revenuProfBrute=" + revenuProfBrute + ", beneficeImposable=" + beneficeImposable + ", beneficeNet="
				+ beneficeNet + "]";
	}
	
	
	
}
