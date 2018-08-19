/*
Source code for
*/
#include <Keypad.h>
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
Start: 0
Beep: 1
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define kepad4x4 - keypad
Button 1 : turnOn
*/
char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};
byte keypad_rowPins[4] = {2,3,4,5};
byte keypad_columnPins[4] = {6,7,8,9};
Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);
/*Define Buzzer output*/
#define buzz  10
/*Define LED - led output*/
const int led = 11;
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
void stateStart();
void stateBeep();
/*--------------------END Prototype--------------------*/
void setup()
{
	pinMode(led, OUTPUT);
	if(currentState == 0){
		stateStart();
	}
}
void loop()
{
	char keypadClientKey = keypad.getKey();
	switch(currentState){
		case 0:
		//Event: "turnOn" button pressed
		if(keypadClientKey == '1'){
			stateBeep();
		}
		//<case0>
		break;
		case 1:
		//Event: "turnOn" button pressed
		if(keypadClientKey == '1'){
			stateStart();
		}
		//<case1>
		break;
		default:
		break;
	}
}
/*--------------------Implement--------------------*/
void stateStart(){
	digitalWrite(led, LOW);
	currentState = 0;
	delay(200);
}
void stateBeep(){
	digitalWrite(led, HIGH);
	analogWrite(buzz, 230);   // turn the Buzzer on
	delay(1000);                  // wait for 1000 milisecond
	analogWrite(buzz, -1);// turn the Buzzer off
	currentState = 1;
	delay(200);
}
/*--------------------END Implement--------------------*/