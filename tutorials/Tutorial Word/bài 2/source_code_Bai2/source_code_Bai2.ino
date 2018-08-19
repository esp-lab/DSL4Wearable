/*
Source code for
*/
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
Start: 0
TurnOnLed1: 1
TurnOnLed2: 2
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define Button  output*/
const int button = 2;
/*Define LED - led1 output*/
const int led1 = 3;
/*Define LED - led2 output*/
const int led2 = 4;
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
void stateStart();
void stateTurnOnLed1();
void stateTurnOnLed2();
/*--------------------END Prototype--------------------*/
void setup()
{
	pinMode(button, INPUT);
	pinMode(led1, OUTPUT);
	pinMode(led2, OUTPUT);
	if(currentState == 0){
		stateStart();
	}
}
void loop()
{
	switch(currentState){
		case 0:
		//Event: "button" push
		if(digitalRead(button) == HIGH){
			stateTurnOnLed1();
		}
		//<case0>
		break;
		case 1:
		//Event: "button" push
		if(digitalRead(button) == HIGH){
			stateTurnOnLed2();
		}
		//<case1>
		break;
		case 2:
		//Event: "button" push
		if(digitalRead(button) == HIGH){
			stateStart();
		}
		//<case2>
		break;
		default:
		break;
	}
}
/*--------------------Implement--------------------*/
void stateStart(){
	digitalWrite(led1, LOW);
	digitalWrite(led2, LOW);
	delay(2000);
	currentState = 0;
	delay(200);
}
void stateTurnOnLed1(){
	digitalWrite(led1, HIGH);
	digitalWrite(led2, HIGH);
	currentState = 1;
	delay(200);
}
void stateTurnOnLed2(){
	for(int i=0;i< 4;i++){
		digitalWrite(led1, HIGH);
		delay(1000);
		digitalWrite(led1, LOW);
		delay(1000);
	}
	currentState = 2;
	delay(200);
}
/*--------------------END Implement--------------------*/