# DSL4W
Đây là công cụ cho phép phát sinh mã nguồn cho các ứng dụng chạy trên thiết bị đeo tay với việc đặc tả ứng dụng đó bằng các thành phần thiết bị và lược đồ trạng thái của ứng dụng http://esp-lab.net/
-----------------------------------
| stt |	Cú pháp | Mô tả | Thiết bị | Ví dụ |
|:--|:--------------------------|:------------------------------------|:-----------------------------|:------------------------------|
|1	| `Display <id>`            |Kích hoạt một thiết bị.			        |LED			                     | `Display` ledRed              |
|2	| `Hidden <id>`	            |Ngừng hoạt động cho một thiết bị	    |LED			                     | `Hidden` ledRed               |
|3	| `Blink <id>`		          |Điều khiển thiết bị nhâp nháy		    |LED, I2CLCD	                 | `Blink` lelRed, `Blink` lcd   |
|4	| `Beep <id>`		            |Phát ra tiếng kêu Beep				        |Buzzer			                   | `Beep` buzzer                 |
|5	| `Show <String>`	          |Hiển thị chuỗi lên thiết bị hiển thị	|LCD		                       | `Show` "Xin chao"             |
|6	| `<String> button pressed`	|Mô tả sự kiện nhấn phím	            |keypad		                     | "Cancel" `button pressed`     |
|7	| `<id> push`	              |Nhận sự kiện nhấn 1 push button		  |push button	                 | button `push`                 |
|8	| `<string> send`	          |Gửi dữ liệu qua wifi				          |wifi esp8266	                 |"hello" `send`                 |
|9	| `<string> received`	      |Lắng nghe chuỗi gửi từ wifi khác	    |wifi esp8266	                 |"hello" `received`             |     
