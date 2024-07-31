package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.l2;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: a */
    private final d2 f2438a;

    /* renamed from: b */
    private final int f2439b;

    /* renamed from: c */
    private final Size f2440c;

    /* renamed from: d */
    private final w.y f2441d;

    /* renamed from: e */
    private final List<l2.b> f2442e;

    /* renamed from: f */
    private final n0 f2443f;

    /* renamed from: g */
    private final Range<Integer> f2444g;

    public b(d2 d2Var, int i10, Size size, w.y yVar, List<l2.b> list, n0 n0Var, Range<Integer> range) {
        if (d2Var == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f2438a = d2Var;
        this.f2439b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2440c = size;
        if (yVar == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f2441d = yVar;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f2442e = list;
        this.f2443f = n0Var;
        this.f2444g = range;
    }

    @Override // androidx.camera.core.impl.a
    public List<l2.b> b() {
        return this.f2442e;
    }

    @Override // androidx.camera.core.impl.a
    public w.y c() {
        return this.f2441d;
    }

    @Override // androidx.camera.core.impl.a
    public int d() {
        return this.f2439b;
    }

    @Override // androidx.camera.core.impl.a
    public n0 e() {
        return this.f2443f;
    }

    public boolean equals(Object obj) {
        n0 n0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2438a.equals(aVar.g()) && this.f2439b == aVar.d() && this.f2440c.equals(aVar.f()) && this.f2441d.equals(aVar.c()) && this.f2442e.equals(aVar.b()) && ((n0Var = this.f2443f) != null ? n0Var.equals(aVar.e()) : aVar.e() == null)) {
            Range<Integer> range = this.f2444g;
            Range<Integer> h10 = aVar.h();
            if (range == null) {
                if (h10 == null) {
                    return true;
                }
            } else if (range.equals(h10)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.a
    public Size f() {
        return this.f2440c;
    }

    @Override // androidx.camera.core.impl.a
    public d2 g() {
        return this.f2438a;
    }

    @Override // androidx.camera.core.impl.a
    public Range<Integer> h() {
        return this.f2444g;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f2438a.hashCode() ^ 1000003) * 1000003) ^ this.f2439b) * 1000003) ^ this.f2440c.hashCode()) * 1000003) ^ this.f2441d.hashCode()) * 1000003) ^ this.f2442e.hashCode()) * 1000003;
        n0 n0Var = this.f2443f;
        int hashCode2 = (hashCode ^ (n0Var == null ? 0 : n0Var.hashCode())) * 1000003;
        Range<Integer> range = this.f2444g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f2438a + ", imageFormat=" + this.f2439b + ", size=" + this.f2440c + ", dynamicRange=" + this.f2441d + ", captureTypes=" + this.f2442e + ", implementationOptions=" + this.f2443f + ", targetFrameRate=" + this.f2444g + "}";
    }
}
