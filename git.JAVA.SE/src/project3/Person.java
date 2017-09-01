package project3;

import java.util.Vector;


public abstract class Person {
	public String name;
	public int age;
	public String address;
	public int numofbook;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumofbook() {
		return numofbook;
	}
	public void setNumofbook(int numofbook) {
		this.numofbook = numofbook;
	}
	public book[] getBk() {
		return bk;
	}
	public void setBk(book[] bk) {
		this.bk = bk;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	book[] bk;
	String status;
	public Vector<Object> getall() {
		Vector<Object> myvector = new Vector<Object>();
		myvector.add(name);
		myvector.add(age);
		myvector.add(numofbook);
		myvector.add(address);
		myvector.add(status);
		return myvector;
	}
}
