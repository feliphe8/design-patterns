
public class VideoAdapter implements Video {
	private WAV wav;
	private MID mid;
	
	public VideoAdapter(WAV wav,MID mid){
		this.wav = wav;
		this.mid = mid;
	}
	@Override
	public void rodarVideo() {
		wav.rodarSom();
		mid.rodarSom();
		
	}
	@Override
	public void gravarVideo() {
		wav.gravarSom();
		mid.gravarSom();
		
	}
	
	
}
