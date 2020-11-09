package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private List<T> list;
	
	public OneListAcceptable(List<T> list) {
		this.list = list;
	}
	
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {
			
			private int nElementsAcceptable = 0;
			
			public void accept(T newElement) throws ElementNotAcceptedException {				
				if(!OneListAcceptable.this.list.contains(newElement)) {
					throw new ElementNotAcceptedException(newElement);
				}
				nElementsAcceptable++;
			}
			
			public void end() throws EndNotAcceptedException {	
				if(OneListAcceptable.this.list.size() != nElementsAcceptable) {
					throw new EndNotAcceptedException();
				}
				nElementsAcceptable  = 0;
			}
		};
	}

}
