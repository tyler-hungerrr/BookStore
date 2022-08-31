public class BookStore {
	public String name;
	public String address;
	public int maxHold;
	public int currHold;
	public int maxReview;
	public int currReview;
	public Book[] currBookList;
	public Book[] reviewBookList;
	
	public BookStore(String name,int maxHold, int maxReview, String address) {
		this.name = name;
		this.address = address;
		this.maxHold = maxHold;
		this.maxReview = maxReview;
		this.currHold = 0;
		this.currReview = 0;
		currBookList = new Book[maxHold];
		reviewBookList = new Book[maxReview];
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getCurrHold() {
		return currHold;
	}
	 public int getCurrReview() {
		 return currReview;
	 }
	 
	 public int search(Book targetItem) {
			int result=-1;
					for (int i=0;i<currHold;i++)
					{
						if(currBookList[i].equals(targetItem)) result=1;
					}
					for (int i=0;i<currReview;i++)
					{
						if(reviewBookList[i].equals(targetItem)) result=2;
					}
					return result;
		}
	 public String getHold() {
		 String books= " ";
					for (int i=0;i<currHold;i++)
					{
						books = books + currBookList[i]+"\n";
					}
					return books;
		}
	 public String getReview() {
		 String books= " ";
					for (int i=0;i<currReview;i++)
					{
						books = books + reviewBookList[i]+"\n";
					}
					return books;
		}
	 
	 public String add(Book newItem) {
		 String added = "Book added to  current book list";
		 String failed = "Book could not be added to current book list";
			int check= search(newItem);
			if(check==-1 && maxHold>currHold)
			{
				currBookList[currHold]=newItem;
				currHold++;
				return added;
			}
			else if (check==-1 && maxReview>currReview) {
				reviewBookList[currReview]=newItem;
				currReview++;
				return added;
			}
			else return failed;
		}
	 
	 public String currRemove(Book targetItem) {
		 String removed = "Book was removed from current book list";
		 String failed = "Book could not be removed from current book list";
			int check= search(targetItem);
			
			if(check==-1) return failed;
			
			for (int i=0;i<currHold;i++) {
				if(currBookList[i].equals(targetItem)) {
					currBookList[i] = currBookList[currHold-1];
					currBookList[currHold-1]=null;
				}
			} 
			currHold--;
			if(currReview>0) {
				currBookList[currHold] = reviewBookList[0];
				for(int i=0;i<currReview;i++) {
					reviewBookList[i] = reviewBookList[i+1];
				}
			}
			return removed;
		} 
	 
	 public String ReviewRemove(Book targetItem) {
		 String removed = "Book was removed from review book list";
		 String failed = "Book could not be removed from review book list";
			int check= search(targetItem);
			
			if(check==-1) return failed;
			
			for (int i=0;i<currReview;i++) {
				if(reviewBookList[i].equals(targetItem)) {
					for(int h=i;h<currReview;h++) {
						reviewBookList[i] = reviewBookList[i+1];
				}
			}
		} 
			currReview--;
			return removed;
	 }
	 
	 @Override
	 public String toString() {
			String str= name + "_"+ address+"\n";
			for(int i=0;i<currHold;i++) {
				str= str + currBookList[i]+"\n";
			}
			for(int i=0;i<currReview;i++) {
				str= str + reviewBookList[i]+"\n";
			}
			return str;
		}
}
