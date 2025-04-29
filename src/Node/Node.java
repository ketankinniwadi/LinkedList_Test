package Node;

public class Node {
	 private Integer m_data;
	 private Node m_next;

	public Node(Integer data) {
		
		setM_data(data);
		setM_next(null);
	}

	public Node getM_next() {
		return m_next;
	}

	public void setM_next(Node next) {
		m_next = next;
	}

	public Integer getM_data() {
		return m_data;
	}

	public void setM_data(Integer data) {
		m_data = data;
	}

	@Override
	public String toString() {
		return "Node [m_data=" + m_data + "]";
	}

}
