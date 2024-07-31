package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f5014a = aVar.p(audioAttributesImplBase.f5014a, 1);
        audioAttributesImplBase.f5015b = aVar.p(audioAttributesImplBase.f5015b, 2);
        audioAttributesImplBase.f5016c = aVar.p(audioAttributesImplBase.f5016c, 3);
        audioAttributesImplBase.f5017d = aVar.p(audioAttributesImplBase.f5017d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f5014a, 1);
        aVar.F(audioAttributesImplBase.f5015b, 2);
        aVar.F(audioAttributesImplBase.f5016c, 3);
        aVar.F(audioAttributesImplBase.f5017d, 4);
    }
}
