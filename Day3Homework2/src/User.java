
public class User {
	
	// fields - özellikler
	
		private int id ;
		private String email;
		private String userName;
		private String password;
		

		// constructor (ilk oluþturulduðunda field verilerini atar)
		// iþlevler, fonksiyonlar, metodlar

		public User( String email, String userName, String password) {
			this.email = email;
			this.userName = userName;
			this.password = password;
		}
		
		public User() {
			
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
