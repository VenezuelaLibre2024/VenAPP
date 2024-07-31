package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0644l2;
import java.util.List;
import p407w.C12048y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.b */
/* loaded from: classes.dex */
public final class C0601b extends AbstractC0597a {

    /* renamed from: a */
    private final AbstractC0612d2 f2759a;

    /* renamed from: b */
    private final int f2760b;

    /* renamed from: c */
    private final Size f2761c;

    /* renamed from: d */
    private final C12048y f2762d;

    /* renamed from: e */
    private final List<InterfaceC0644l2.b> f2763e;

    /* renamed from: f */
    private final InterfaceC0649n0 f2764f;

    /* renamed from: g */
    private final Range<Integer> f2765g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0601b(AbstractC0612d2 abstractC0612d2, int i10, Size size, C12048y c12048y, List<InterfaceC0644l2.b> list, InterfaceC0649n0 interfaceC0649n0, Range<Integer> range) {
        if (abstractC0612d2 == null) {
            throw new NullPointerException("Null surfaceConfig");
        }
        this.f2759a = abstractC0612d2;
        this.f2760b = i10;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2761c = size;
        if (c12048y == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.f2762d = c12048y;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.f2763e = list;
        this.f2764f = interfaceC0649n0;
        this.f2765g = range;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: b */
    public List<InterfaceC0644l2.b> mo2972b() {
        return this.f2763e;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: c */
    public C12048y mo2973c() {
        return this.f2762d;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: d */
    public int mo2974d() {
        return this.f2760b;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: e */
    public InterfaceC0649n0 mo2975e() {
        return this.f2764f;
    }

    public boolean equals(Object obj) {
        InterfaceC0649n0 interfaceC0649n0;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0597a)) {
            return false;
        }
        AbstractC0597a abstractC0597a = (AbstractC0597a) obj;
        if (this.f2759a.equals(abstractC0597a.mo2977g()) && this.f2760b == abstractC0597a.mo2974d() && this.f2761c.equals(abstractC0597a.mo2976f()) && this.f2762d.equals(abstractC0597a.mo2973c()) && this.f2763e.equals(abstractC0597a.mo2972b()) && ((interfaceC0649n0 = this.f2764f) != null ? interfaceC0649n0.equals(abstractC0597a.mo2975e()) : abstractC0597a.mo2975e() == null)) {
            Range<Integer> range = this.f2765g;
            Range<Integer> mo2978h = abstractC0597a.mo2978h();
            if (range == null) {
                if (mo2978h == null) {
                    return true;
                }
            } else if (range.equals(mo2978h)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: f */
    public Size mo2976f() {
        return this.f2761c;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: g */
    public AbstractC0612d2 mo2977g() {
        return this.f2759a;
    }

    @Override // androidx.camera.core.impl.AbstractC0597a
    /* renamed from: h */
    public Range<Integer> mo2978h() {
        return this.f2765g;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f2759a.hashCode() ^ 1000003) * 1000003) ^ this.f2760b) * 1000003) ^ this.f2761c.hashCode()) * 1000003) ^ this.f2762d.hashCode()) * 1000003) ^ this.f2763e.hashCode()) * 1000003;
        InterfaceC0649n0 interfaceC0649n0 = this.f2764f;
        int hashCode2 = (hashCode ^ (interfaceC0649n0 == null ? 0 : interfaceC0649n0.hashCode())) * 1000003;
        Range<Integer> range = this.f2765g;
        return hashCode2 ^ (range != null ? range.hashCode() : 0);
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f2759a + ", imageFormat=" + this.f2760b + ", size=" + this.f2761c + ", dynamicRange=" + this.f2762d + ", captureTypes=" + this.f2763e + ", implementationOptions=" + this.f2764f + ", targetFrameRate=" + this.f2765g + "}";
    }
}
