import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		Sequencer sequencer = MidiSystem.getSequencer();

		System.out.println("We got a sequencer");
	
	} // end of play method

	public static void main(String[] args) {
	
	MusicTest1 mt = new MusicTest1();
	mt.play();

	} // end of main method

} // end of MusicTest1 class
