package p258nm;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import java.util.Objects;
import kotlin.jvm.internal.C9322n;

/* renamed from: nm.a */
/* loaded from: classes3.dex */
public final class C9731a {

    /* renamed from: a */
    private final boolean f23928a;

    /* renamed from: b */
    private final boolean f23929b;

    /* renamed from: c */
    private final int f23930c;

    /* renamed from: d */
    private final int f23931d;

    /* renamed from: e */
    private final int f23932e;

    /* renamed from: f */
    private final int f23933f;

    public C9731a() {
        this(false, false, 2, 1, 1, 0);
    }

    public C9731a(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        this.f23928a = z10;
        this.f23929b = z11;
        this.f23930c = i10;
        this.f23931d = i11;
        this.f23932e = i12;
        this.f23933f = i13;
    }

    /* renamed from: c */
    public static /* synthetic */ C9731a m29165c(C9731a c9731a, boolean z10, boolean z11, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z10 = c9731a.f23928a;
        }
        if ((i14 & 2) != 0) {
            z11 = c9731a.f23929b;
        }
        boolean z12 = z11;
        if ((i14 & 4) != 0) {
            i10 = c9731a.f23930c;
        }
        int i15 = i10;
        if ((i14 & 8) != 0) {
            i11 = c9731a.f23931d;
        }
        int i16 = i11;
        if ((i14 & 16) != 0) {
            i12 = c9731a.f23932e;
        }
        int i17 = i12;
        if ((i14 & 32) != 0) {
            i13 = c9731a.f23933f;
        }
        return c9731a.m29167b(z10, z12, i15, i16, i17, i13);
    }

    /* renamed from: a */
    public final AudioAttributes m29166a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f23931d).setContentType(this.f23930c).build();
        C9322n.m27780d(build, "build(...)");
        return build;
    }

    /* renamed from: b */
    public final C9731a m29167b(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        return new C9731a(z10, z11, i10, i11, i12, i13);
    }

    /* renamed from: d */
    public final int m29168d() {
        return this.f23932e;
    }

    /* renamed from: e */
    public final int m29169e() {
        return this.f23933f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C9731a) {
            C9731a c9731a = (C9731a) obj;
            if (this.f23928a == c9731a.f23928a && this.f23929b == c9731a.f23929b && this.f23930c == c9731a.f23930c && this.f23931d == c9731a.f23931d && this.f23932e == c9731a.f23932e && this.f23933f == c9731a.f23933f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m29170f() {
        return this.f23929b;
    }

    /* renamed from: g */
    public final boolean m29171g() {
        return this.f23928a;
    }

    /* renamed from: h */
    public final void m29172h(MediaPlayer player) {
        C9322n.m27781e(player, "player");
        player.setAudioAttributes(m29166a());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f23928a), Boolean.valueOf(this.f23929b), Integer.valueOf(this.f23930c), Integer.valueOf(this.f23931d), Integer.valueOf(this.f23932e), Integer.valueOf(this.f23933f));
    }

    public String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f23928a + ", stayAwake=" + this.f23929b + ", contentType=" + this.f23930c + ", usageType=" + this.f23931d + ", audioFocus=" + this.f23932e + ", audioMode=" + this.f23933f + ')';
    }
}
