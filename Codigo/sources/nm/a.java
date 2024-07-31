package nm;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21995a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21996b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21997c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21998d;

    /* renamed from: e, reason: collision with root package name */
    private final int f21999e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22000f;

    public a() {
        this(false, false, 2, 1, 1, 0);
    }

    public a(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f21995a = z10;
        this.f21996b = z11;
        this.f21997c = i10;
        this.f21998d = i11;
        this.f21999e = i12;
        this.f22000f = i13;
    }

    public static /* synthetic */ a c(a aVar, boolean z10, boolean z11, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z10 = aVar.f21995a;
        }
        if ((i14 & 2) != 0) {
            z11 = aVar.f21996b;
        }
        boolean z12 = z11;
        if ((i14 & 4) != 0) {
            i10 = aVar.f21997c;
        }
        int i15 = i10;
        if ((i14 & 8) != 0) {
            i11 = aVar.f21998d;
        }
        int i16 = i11;
        if ((i14 & 16) != 0) {
            i12 = aVar.f21999e;
        }
        int i17 = i12;
        if ((i14 & 32) != 0) {
            i13 = aVar.f22000f;
        }
        return aVar.b(z10, z12, i15, i16, i17, i13);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f21998d).setContentType(this.f21997c).build();
        kotlin.jvm.internal.n.d(build, "build(...)");
        return build;
    }

    public final a b(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        return new a(z10, z11, i10, i11, i12, i13);
    }

    public final int d() {
        return this.f21999e;
    }

    public final int e() {
        return this.f22000f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f21995a == aVar.f21995a && this.f21996b == aVar.f21996b && this.f21997c == aVar.f21997c && this.f21998d == aVar.f21998d && this.f21999e == aVar.f21999e && this.f22000f == aVar.f22000f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f21996b;
    }

    public final boolean g() {
        return this.f21995a;
    }

    public final void h(MediaPlayer player) {
        kotlin.jvm.internal.n.e(player, "player");
        player.setAudioAttributes(a());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f21995a), Boolean.valueOf(this.f21996b), Integer.valueOf(this.f21997c), Integer.valueOf(this.f21998d), Integer.valueOf(this.f21999e), Integer.valueOf(this.f22000f));
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f21995a + ", stayAwake=" + this.f21996b + ", contentType=" + this.f21997c + ", usageType=" + this.f21998d + ", audioFocus=" + this.f21999e + ", audioMode=" + this.f22000f + ')';
    }
}
