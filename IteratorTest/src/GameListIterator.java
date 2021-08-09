
class GameListIterator implements Iterator {

	private GameListAggregate aggregate;
	private int current;

	public GameListIterator(GameListAggregate aggregate) {
		 this.aggregate = aggregate;
		 }


	@Override
	public void first() {
		// TODO 自動生成されたメソッド・スタブ
		current = 0;

	}

	@Override
	public void next() {
		// TODO 自動生成されたメソッド・スタブ
		current += 1;

	}

	@Override
	public boolean isDone() {
		// TODO 自動生成されたメソッド・スタブ
		if (current >= aggregate.getNumberOfStock()) {
			 return true;
			 }
			 else {
			 return false;
			 }

	}

	@Override
	public Object getItem() {
		// TODO 自動生成されたメソッド・スタブ
		return aggregate.getAt(current);
	}

}
