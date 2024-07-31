package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f5012a;

    /* renamed from: b, reason: collision with root package name */
    public int f5013b;

    public AudioAttributesImplApi21() {
        this.f5013b = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f5012a = audioAttributes;
        this.f5013b = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f5012a.equals(((AudioAttributesImplApi21) obj).f5012a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5012a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f5012a;
    }
}
