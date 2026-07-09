package com.sample;

interface Temperature
{
	double cToF(double cel);
	double fToC(double fah);
}

 class TemperatureConverter implements Temperature
{
	@Override
	public double cToF(double C)
	{
		 return ((C * 9.0 / 5.0) + 32.0);
	}

	@Override
	public double fToC(double fah) {
		
		return ((fah -32.0) * 5.0 / 9.0);
	}
}

