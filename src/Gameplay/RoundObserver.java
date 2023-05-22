package Gameplay;

public interface RoundObserver {

	GameClock gc = Battlefield.getBattlefield().gameC;
	public void update(int round);
}
