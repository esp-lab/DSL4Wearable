/*
Source code for
*/
#include <Keypad.h>
#include <LiquidCrystal_I2C.h>
/*
Each state in the application corresponds to one the integer.
Numbered starting at 0
stateCurrent is a variable that stores the current state of the application.
Start: 0
Hello: 1
*/
int currentState = 0;
int nextState = -1;
/*--------------------Define--------------------*/
/*Define kepad4x4 - keypad
Button 1 : welcome
Button 2 : hello
*/
char keypad_keys[4][4] ={{'1','2','3','A'},{'4','5','6','B'},{'7','8','9','C'},{'*','0','#','D'}};
byte keypad_rowPins[4] = {2,3,4,5};
byte keypad_columnPins[4] = {6,7,8,9};
Keypad keypad = Keypad(makeKeymap(keypad_keys), keypad_rowPins, keypad_columnPins, 4, 4);
/*Define LiquidCrystal_I2C - lcd */
LiquidCrystal_I2C lcd(0x27, 20, 4);
/*--------------------END Define--------------------*/
/*--------------------Prototype--------------------*/
void stateStart();
void stateHello();
/*--------------------END Prototype--------------------*/
void setup()
{
	lcd.init();
	lcd.begin(20, 4);
	lcd.backlight();
	if(currentState == 0){
		stateStart();
	}
}
void loop()
{
	char keypadClientKey = keypad.getKey();
	switch(currentState){
		case 0:
		//Event: "welcome" button pressed
		if(keypadClientKey == '1'){
			stateHello();
		}
		//<case0>
		break;
		case 1:
		//Event: "hello" button pressed
		if(keypadClientKey == '2'){
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
	lcd.clear();
	lcd.setCursor(0, 0);
	lcd.print("Hello World");
	currentState = 0;
	delay(200);
}
void stateHello(){
	lcd.clear();
	lcd.setCursor(0, 0);
	lcd.print("Welcome to");
	lcd.setCursor(0, 1);
	lcd.print("DSL4Wearable");
	currentState = 1;
	delay(200);
}
/*--------------------END Implement--------------------*/