
public class Teste {

	public static void main(String[] args) {
		WAV w = new WAV();
		MID m = new MID();
		Video v = new VideoAdapter(w,m);
		v.gravarVideo();
		v.rodarVideo();
	}

}
