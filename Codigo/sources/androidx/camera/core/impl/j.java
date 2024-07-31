package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j extends e2 {

    /* renamed from: a, reason: collision with root package name */
    private final Size f2508a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Size> f2509b;

    /* renamed from: c, reason: collision with root package name */
    private final Size f2510c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, Size> f2511d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f2512e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, Size> f2513f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<Integer, Size> f2514g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size == null) {
            throw new NullPointerException("Null analysisSize");
        }
        this.f2508a = size;
        if (map == null) {
            throw new NullPointerException("Null s720pSizeMap");
        }
        this.f2509b = map;
        if (size2 == null) {
            throw new NullPointerException("Null previewSize");
        }
        this.f2510c = size2;
        if (map2 == null) {
            throw new NullPointerException("Null s1440pSizeMap");
        }
        this.f2511d = map2;
        if (size3 == null) {
            throw new NullPointerException("Null recordSize");
        }
        this.f2512e = size3;
        if (map3 == null) {
            throw new NullPointerException("Null maximumSizeMap");
        }
        this.f2513f = map3;
        if (map4 == null) {
            throw new NullPointerException("Null ultraMaximumSizeMap");
        }
        this.f2514g = map4;
    }

    @Override // androidx.camera.core.impl.e2
    public Size b() {
        return this.f2508a;
    }

    @Override // androidx.camera.core.impl.e2
    public Map<Integer, Size> d() {
        return this.f2513f;
    }

    @Override // androidx.camera.core.impl.e2
    public Size e() {
        return this.f2510c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f2508a.equals(e2Var.b()) && this.f2509b.equals(e2Var.j()) && this.f2510c.equals(e2Var.e()) && this.f2511d.equals(e2Var.h()) && this.f2512e.equals(e2Var.f()) && this.f2513f.equals(e2Var.d()) && this.f2514g.equals(e2Var.l());
    }

    @Override // androidx.camera.core.impl.e2
    public Size f() {
        return this.f2512e;
    }

    @Override // androidx.camera.core.impl.e2
    public Map<Integer, Size> h() {
        return this.f2511d;
    }

    public int hashCode() {
        return ((((((((((((this.f2508a.hashCode() ^ 1000003) * 1000003) ^ this.f2509b.hashCode()) * 1000003) ^ this.f2510c.hashCode()) * 1000003) ^ this.f2511d.hashCode()) * 1000003) ^ this.f2512e.hashCode()) * 1000003) ^ this.f2513f.hashCode()) * 1000003) ^ this.f2514g.hashCode();
    }

    @Override // androidx.camera.core.impl.e2
    public Map<Integer, Size> j() {
        return this.f2509b;
    }

    @Override // androidx.camera.core.impl.e2
    public Map<Integer, Size> l() {
        return this.f2514g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f2508a + ", s720pSizeMap=" + this.f2509b + ", previewSize=" + this.f2510c + ", s1440pSizeMap=" + this.f2511d + ", recordSize=" + this.f2512e + ", maximumSizeMap=" + this.f2513f + ", ultraMaximumSizeMap=" + this.f2514g + "}";
    }
}
