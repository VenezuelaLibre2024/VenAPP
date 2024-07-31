package p112g0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import p112g0.C7430v0;

/* renamed from: g0.e */
/* loaded from: classes.dex */
final class C7395e extends C7430v0.d {

    /* renamed from: a */
    private final UUID f17148a;

    /* renamed from: b */
    private final int f17149b;

    /* renamed from: c */
    private final int f17150c;

    /* renamed from: d */
    private final Rect f17151d;

    /* renamed from: e */
    private final Size f17152e;

    /* renamed from: f */
    private final int f17153f;

    /* renamed from: g */
    private final boolean f17154g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7395e(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        if (uuid == null) {
            throw new NullPointerException("Null uuid");
        }
        this.f17148a = uuid;
        this.f17149b = i10;
        this.f17150c = i11;
        if (rect == null) {
            throw new NullPointerException("Null cropRect");
        }
        this.f17151d = rect;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f17152e = size;
        this.f17153f = i12;
        this.f17154g = z10;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: a */
    public Rect mo22320a() {
        return this.f17151d;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: b */
    public int mo22321b() {
        return this.f17150c;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: c */
    public boolean mo22322c() {
        return this.f17154g;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: d */
    public int mo22323d() {
        return this.f17153f;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: e */
    public Size mo22324e() {
        return this.f17152e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7430v0.d)) {
            return false;
        }
        C7430v0.d dVar = (C7430v0.d) obj;
        return this.f17148a.equals(dVar.mo22326g()) && this.f17149b == dVar.mo22325f() && this.f17150c == dVar.mo22321b() && this.f17151d.equals(dVar.mo22320a()) && this.f17152e.equals(dVar.mo22324e()) && this.f17153f == dVar.mo22323d() && this.f17154g == dVar.mo22322c();
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: f */
    public int mo22325f() {
        return this.f17149b;
    }

    @Override // p112g0.C7430v0.d
    /* renamed from: g */
    UUID mo22326g() {
        return this.f17148a;
    }

    public int hashCode() {
        return ((((((((((((this.f17148a.hashCode() ^ 1000003) * 1000003) ^ this.f17149b) * 1000003) ^ this.f17150c) * 1000003) ^ this.f17151d.hashCode()) * 1000003) ^ this.f17152e.hashCode()) * 1000003) ^ this.f17153f) * 1000003) ^ (this.f17154g ? 1231 : 1237);
    }

    public String toString() {
        return "OutConfig{uuid=" + this.f17148a + ", targets=" + this.f17149b + ", format=" + this.f17150c + ", cropRect=" + this.f17151d + ", size=" + this.f17152e + ", rotationDegrees=" + this.f17153f + ", mirroring=" + this.f17154g + "}";
    }
}
