package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f5014a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f5015b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f5016c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5017d = -1;

    public int a() {
        return this.f5015b;
    }

    public int b() {
        int i10 = this.f5016c;
        int c10 = c();
        if (c10 == 6) {
            i10 |= 4;
        } else if (c10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int c() {
        int i10 = this.f5017d;
        return i10 != -1 ? i10 : AudioAttributesCompat.a(false, this.f5016c, this.f5014a);
    }

    public int d() {
        return this.f5014a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f5015b == audioAttributesImplBase.a() && this.f5016c == audioAttributesImplBase.b() && this.f5014a == audioAttributesImplBase.d() && this.f5017d == audioAttributesImplBase.f5017d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5015b), Integer.valueOf(this.f5016c), Integer.valueOf(this.f5014a), Integer.valueOf(this.f5017d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f5017d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f5017d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.b(this.f5014a));
        sb2.append(" content=");
        sb2.append(this.f5015b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f5016c).toUpperCase());
        return sb2.toString();
    }
}
