/*
Source code for
*/
#include <Keypad.h>
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
Start: 0
LightLED1: 1
LightLED2: 2
lightAll: 3
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define LED - led1 output*/
const int led1 = 10;
/*Define LED - led2 output*/
const int led2 = 11;
/*Define kepad4x4 - keypad
Button 0 : light1
Button 1 : light2
Button 2 : turnOff
*/
char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};
byte keypad_rowPins[4] = {2,3,4,5};
byte keypad_columnPins[4] = {6,7,8,9};
Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);
/*Define LED - led3 output*/
const int led3 = 12;
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
void stateStart();
void stateLightLED1();
void stateLightLED2();
void statelightAll();
/*--------------------END Prototype--------------------*/
void setup()
{
	pinMode(led1, OUTPUT);
	pinMode(led2, OUTPUT);
	pinMode(led3, OUTPUT);
	if(currentState == 0){
		stateStart();
	}
}
void loop()
{
	char keypadClientKey = keypad.getKey();
	switch(currentState){
		case 0:
		//Event: "light1" button pressed
		if(keypadClientKey == '0'){
			stateLightLED1();
		}
		//<case0>
		break;
		case 1:
		//Event: "light2" button pressed
		if(keypadClientKey == '1'){
			stateLightLED2();
		}
		//<case1>
		break;
		case 2:
		//Event: "light1" button pressed
		if(keypadClientKey == '0'){
			statelightAll();
		}
		//<case2>
		break;
		case 3:
		//Event: "turnOff" button pressed
		if(keypadClientKey == '2'){
			stateStart();
		}
		//<case3>
		break;
		default:
		break;
	}
}
/*--------------------Implement--------------------*/
void stateStart(){
	digitalWrite(led1, LOW);
	digitalWrite(led2, LOW);
	digitalWrite(led3, LOW);
	delay(1000);
	currentState = 0;
	delay(200);
}
void stateLightLED1(){
	digitalWrite(led1, HIGH);
	digitalWrite(led2, LOW);
	digitalWrite(led3, LOW);
	currentState = 1;
	delay(200);
}
void stateLightLED2(){
	digitalWrite(led2, HIGH);
	digitalWrite(led1, LOW);
	digitalWrite(led3, LOW);
	currentState = 2;
	delay(200);
}
void statelightAll(){
	digitalWrite(led1, HIGH);
	digitalWrite(led3, HIGH);
	currentState = 3;
	delay(200);
}
/*--------------------END Implement--------------------*/