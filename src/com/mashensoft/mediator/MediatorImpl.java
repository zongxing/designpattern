package com.mashensoft.mediator;

public class MediatorImpl implements IMediator {
	AbstractUser uiDesigner;
	AbstractUser softEnginner;
	
	public MediatorImpl() {
		uiDesigner = new UIDesigner();
		softEnginner = new SoftEnginner();
	}

	@Override
	public void workAll() {
		uiDesigner.work();
		softEnginner.work();
	}
	

}
