package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f5012a = (AudioAttributes) aVar.r(audioAttributesImplApi26.f5012a, 1);
        audioAttributesImplApi26.f5013b = aVar.p(audioAttributesImplApi26.f5013b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.x(false, false);
        aVar.H(audioAttributesImplApi26.f5012a, 1);
        aVar.F(audioAttributesImplApi26.f5013b, 2);
    }
}
