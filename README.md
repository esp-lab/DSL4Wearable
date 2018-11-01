# DSL4W

Đây là công cụ cho phép phát sinh mã nguồn cho các ứng dụng chạy trên thiết bị đeo tay với việc đặc tả ứng dụng đó bằng các thành phần thiết bị và lược đồ trạng thái của ứng dụng http://esp-lab.net/

-----------------------------------
Bảng lệnh cho StateFame

| stt |	Cú pháp | Mô tả | Thiết bị | Ví dụ |
|:--|:--------------------------|:------------------------------------|:-----------------------------|:------------------------------|
|1	| `Display <id>`            |Kích hoạt một thiết bị.			        |LED			                     | `Display` ledRed              |
|2	| `Hidden <id>`	            |Ngừng hoạt động cho một thiết bị	    |LED			                     | `Hidden` ledRed               |
|3	| `Blink <id>`		          |Điều khiển thiết bị nhâp nháy		    |LED, I2CLCD	                 | `Blink` lelRed, `Blink` lcd   |
|4	| `Beep <id>`		            |Phát ra tiếng kêu Beep				        |Buzzer			                   | `Beep` buzzer                 |
|5	| `Show <String>`	          |Hiển thị chuỗi lên thiết bị hiển thị	|LCD		                       | `Show` "Xin chao"             |    


Lưu ý: Các trạng thái được chuyển tiếp khi và chỉ khi có các event xảy ra. Vì thế các connection/link phải được mô tả sự kiện. Ngoại trừ các kết nối với StartPoint và EndPoint.

Bảng lệnh cho Connection/Link

| stt |	Cú pháp | Mô tả | Thiết bị | Ví dụ |
|:--|:--------------------------|:------------------------------------|:-----------------------------|:------------------------------|
|1	| `<string> button pressed`	|Mô tả sự kiện nhấn phím	            |keypad		                     | "Cancel" `button pressed`     |
|2	| `<id> push`	              |Nhận sự kiện nhấn 1 push button		  |push button	                 | button `push`                 |
|3	| `<string> send`	          |Gửi dữ liệu qua wifi				          |wifi esp8266	                 | "hello" `send`                |
|4	| `<string> received`	      |Lắng nghe chuỗi gửi từ wifi khác	    |wifi esp8266	                 | "hello" `received`            |     
|5	| `<id> : Display`	        |Kiểm tra trạng thái của thiết bị	    |LED	                         | ledRed : `Display`            |
|6	| `<id> : Hidden`	          |Kiểm tra trạng thái của thiết bị	    |LED	                         | ledRed : `Hidden`             |
