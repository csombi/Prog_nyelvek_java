class Complex {
	double re, im;

	Complex(){
		this.re = 0;
		this.im = 0;
	}

	Complex(double re, double im){
		this.re = re;
		this.im = im;
	}

	//done
	double abs(){
		return Math.sqrt(this.re * this.re + this.im * this.im);
	}

	//done	
	void add(Complex c){
		this.re += c.re;
		this.im += c.im;
	}

	//done
	void sub(Complex c){
		this.re -= c.re;
		this.im -= c.im;
	}

	//done
	void mul(Complex c){
		double a_re = this.re;
		double a_im = this.im;
		double real = a_re * c.re - a_im * c.im;
		double imag = a_re * c.im + a_im * c.re;
		this.re = real;
		this.im = imag;
	}

	//done
	void conjugate(){
		this.im *= (-1);
	}

	//done
	void reciprocate(){
		double d = this.re * this.re + this.im * this.im;
		this.re = this.re / d;
		this.im = ((-1) * this.im) / d;
	}

	//done
	void div(Complex c){
		Complex z = new Complex(c.re, c.im);;
		z.reciprocate();
		this.mul(z);	 
	}
}