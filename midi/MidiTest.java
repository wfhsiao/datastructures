
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Soundbank;
import javax.sound.midi.Synthesizer;


/**
 *
 * @author user
 */
public class MidiTest {

    public static void main(String[] args) {
        // global variables
        Synthesizer synthe = null;
        Instrument instrs[] = null;
        Soundbank sb = null;
        MidiChannel midiChs[] = null;
        int lastnote;

// initialization in main or other methods
        try {
            if ((synthe = MidiSystem.getSynthesizer()) == null) {
                System.out.println("getSynthesizer() failed!");
            }
            synthe.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
        midiChs = synthe.getChannels();
        sb = synthe.getDefaultSoundbank();
        if (sb != null) {
            instrs = synthe.getDefaultSoundbank().getInstruments();
            synthe.loadInstrument(instrs[0]); // instrs[0]為鋼琴
        }
        
        playbee(midiChs);

    }

    private static void playbee(MidiChannel[] midiChs) {
        int music[] = { 0, 5, 3, 3, 0,
        4, 2, 2, 0,
        1, 2, 3, 4, 5, 5, 5, 0,
        5, 3, 3, 3, 4, 2, 2, 2, 1, 3, 5, 5, 3, 0, 0, 0,
        2, 2, 2, 2, 2, 3, 4, 0,
        3, 3, 3, 3, 3, 4, 5, 0,
        5, 3, 3, 3, 4, 2, 2, 2, 1, 3, 5, 5, 1 };
        int doremi[] = { -1, 48, 50, 52, 53, 55, 57, 59 };
        
        for (int i = 0; i < music.length; i++) {
            // 如欲更改樂器的聲音可以使用以下的敘述
// midiChs[0].programChange(instrs[i].getPatch().getProgram()); 
// midiChs代表聲音的管道, 如果是管絃樂隊可以讓不同樂器在不同管道上彈奏
// instrs代表樂器的種類
            midiChs[0].noteOn(doremi[music[i]], 500); // 48代表Do, 500為聲音大小(可以試試50看看)
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            midiChs[0].noteOff(doremi[music[i]], 0);
            
        }
        
    }
}
