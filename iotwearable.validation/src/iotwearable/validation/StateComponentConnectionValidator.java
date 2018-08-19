package iotwearable.validation;

import iotwearable.model.iotw.Component;
import iotwearable.model.iotw.Decision;
import iotwearable.model.iotw.EndPoint;
import iotwearable.model.iotw.StartPoint;

public class StateComponentConnectionValidator extends Validator{
	Component source;
	Component target;
	private static final String message01 = "Not start to itself.";
	private static final String message02 = "Not connect to itself.";
	private static final String message03 = "Only one connection.";
	private static final String message04 = "Not connect to StartPoint.";
	
	public StateComponentConnectionValidator(Component source, Component target) {
		this.source = source;
		this.target = target;
	}
	
	@Override
	public boolean isValid(){
		if(!addSource())
			return false;
		if(!addTarget())
			return false;
		return true;
	}
	//Validation for adding the source
	private boolean addSource(){
		if(source instanceof EndPoint){
			invalidMessage = message01;
			return false;
		}
		if(source instanceof StartPoint){
			if(!((StartPoint)source).getOutgoings().isEmpty()){
				invalidMessage = message03;
				return false;
			}
		}
		return true;
	}
	//Validation for adding the target
	private boolean addTarget(){
		if(target instanceof StartPoint){
			invalidMessage = message04;
			return false;
		}
		if(source instanceof Decision && target instanceof Decision){
			invalidMessage = message02;
			return false;
		}
		return true;
	}
}