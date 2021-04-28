package se.kth.ict.id2203.components.rb;

import se.kth.ict.id2203.ports.beb.BebDeliver;
import se.kth.ict.id2203.ports.rb.RbDeliver;
import se.sics.kompics.address.Address;

import java.util.Objects;

public class RbMessage extends BebDeliver {

	private static final long serialVersionUID = 234324324234L;

	private final RbDeliver data;
	private final Integer sequenceNumber;

	public RbMessage(Address source, RbDeliver data, Integer sequenceNumber) {
		super(source);
		this.data = data;
		this.sequenceNumber = sequenceNumber;
	}
	
	public RbDeliver getData() {
		return data;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		RbMessage rbMessage = (RbMessage) o;
		return Objects.equals(data, rbMessage.data) &&
				Objects.equals(sequenceNumber, rbMessage.sequenceNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, sequenceNumber);
	}
}
