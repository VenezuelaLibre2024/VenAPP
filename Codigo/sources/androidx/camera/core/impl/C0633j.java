package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.j */
/* loaded from: classes.dex */
public final class C0633j extends AbstractC0616e2 {

    /* renamed from: a */
    private final Size f2846a;

    /* renamed from: b */
    private final Map<Integer, Size> f2847b;

    /* renamed from: c */
    private final Size f2848c;

    /* renamed from: d */
    private final Map<Integer, Size> f2849d;

    /* renamed from: e */
    private final Size f2850e;

    /* renamed from: f */
    private final Map<Integer, Size> f2851f;

    /* renamed from: g */
    private final Map<Integer, Size> f2852g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0633j(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f2846a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f2847b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f2848c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f2849d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f2850e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f2851f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f2852g = map4;
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: b */
    public Size mo3041b() {
        return this.f2846a;
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: d */
    public Map<Integer, Size> mo3043d() {
        return this.f2851f;
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: e */
    public Size mo3044e() {
        return this.f2848c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0616e2)) {
            return false;
        }
        AbstractC0616e2 abstractC0616e2 = (AbstractC0616e2) obj;
        return this.f2846a.equals(abstractC0616e2.mo3041b()) && this.f2847b.equals(abstractC0616e2.mo3049j()) && this.f2848c.equals(abstractC0616e2.mo3044e()) && this.f2849d.equals(abstractC0616e2.mo3047h()) && this.f2850e.equals(abstractC0616e2.mo3045f()) && this.f2851f.equals(abstractC0616e2.mo3043d()) && this.f2852g.equals(abstractC0616e2.mo3051l());
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: f */
    public Size mo3045f() {
        return this.f2850e;
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: h */
    public Map<Integer, Size> mo3047h() {
        return this.f2849d;
    }

    public int hashCode() {
        return ((((((((((((this.f2846a.hashCode() ^ 1000003) * 1000003) ^ this.f2847b.hashCode()) * 1000003) ^ this.f2848c.hashCode()) * 1000003) ^ this.f2849d.hashCode()) * 1000003) ^ this.f2850e.hashCode()) * 1000003) ^ this.f2851f.hashCode()) * 1000003) ^ this.f2852g.hashCode();
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: j */
    public Map<Integer, Size> mo3049j() {
        return this.f2847b;
    }

    @Override // androidx.camera.core.impl.AbstractC0616e2
    /* renamed from: l */
    public Map<Integer, Size> mo3051l() {
        return this.f2852g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2846a + ", s720pSizeMap=" + this.f2847b + ", previewSize=" + this.f2848c + ", s1440pSizeMap=" + this.f2849d + ", recordSize=" + this.f2850e + ", maximumSizeMap=" + this.f2851f + ", ultraMaximumSizeMap=" + this.f2852g + "}";
    }
}
