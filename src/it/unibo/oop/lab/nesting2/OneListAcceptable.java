package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}
	
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			private Iterator<T> it = OneListAcceptable.this.list.iterator();
			
			public void accept(T newElement) throws ElementNotAcceptedException {				
				if(!it.hasNext() || !it.next().equals(newElement)){
					throw new ElementNotAcceptedException(newElement);
				}
			}
			
			public void end() throws EndNotAcceptedException {	
				if(it.hasNext()) {
					throw new EndNotAcceptedException();
				}
			}
		};
	}

}
