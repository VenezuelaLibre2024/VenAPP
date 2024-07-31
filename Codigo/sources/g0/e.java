package g0;

import android.graphics.Rect;
import android.util.Size;
import g0.v0;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends v0.d {

    /* renamed from: a */
    private final UUID f15570a;

    /* renamed from: b */
    private final int f15571b;

    /* renamed from: c */
    private final int f15572c;

    /* renamed from: d */
    private final Rect f15573d;

    /* renamed from: e */
    private final Size f15574e;

    /* renamed from: f */
    private final int f15575f;

    /* renamed from: g */
    private final boolean f15576g;

    public e(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.f15570a = uuid;
        this.f15571b = i10;
        this.f15572c = i11;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f15573d = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f15574e = size;
        this.f15575f = i12;
        this.f15576g = z10;
    }

    @Override // g0.v0.d
    public Rect a() {
        return this.f15573d;
    }

    @Override // g0.v0.d
    public int b() {
        return this.f15572c;
    }

    @Override // g0.v0.d
    public boolean c() {
        return this.f15576g;
    }

    @Override // g0.v0.d
    public int d() {
        return this.f15575f;
    }

    @Override // g0.v0.d
    public Size e() {
        return this.f15574e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0.d)) {
            return false;
        }
        v0.d dVar = (v0.d) obj;
        return this.f15570a.equals(dVar.g()) && this.f15571b == dVar.f() && this.f15572c == dVar.b() && this.f15573d.equals(dVar.a()) && this.f15574e.equals(dVar.e()) && this.f15575f == dVar.d() && this.f15576g == dVar.c();
    }

    @Override // g0.v0.d
    public int f() {
        return this.f15571b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.v0.d
    public UUID g() {
        return this.f15570a;
    }

    public int hashCode() {
        return ((((((((((((this.f15570a.hashCode() ^ 1000003) * 1000003) ^ this.f15571b) * 1000003) ^ this.f15572c) * 1000003) ^ this.f15573d.hashCode()) * 1000003) ^ this.f15574e.hashCode()) * 1000003) ^ this.f15575f) * 1000003) ^ (this.f15576g ? 1231 : 1237);
    }

    public String toString() {
        return "OutConfig{uuid=" + this.f15570a + ", targets=" + this.f15571b + ", format=" + this.f15572c + ", cropRect=" + this.f15573d + ", size=" + this.f15574e + ", rotationDegrees=" + this.f15575f + ", mirroring=" + this.f15576g + "}";
    }
}
