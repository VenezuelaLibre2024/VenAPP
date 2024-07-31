package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* renamed from: androidx.camera.core.impl.f */
/* loaded from: classes.dex */
final class C0617f extends AbstractC0659q1 {

    /* renamed from: a */
    private final Surface f2796a;

    /* renamed from: b */
    private final Size f2797b;

    /* renamed from: c */
    private final int f2798c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0617f(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2796a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2797b = size;
        this.f2798c = i10;
    }

    @Override // androidx.camera.core.impl.AbstractC0659q1
    /* renamed from: b */
    public int mo3052b() {
        return this.f2798c;
    }

    @Override // androidx.camera.core.impl.AbstractC0659q1
    /* renamed from: c */
    public Size mo3053c() {
        return this.f2797b;
    }

    @Override // androidx.camera.core.impl.AbstractC0659q1
    /* renamed from: d */
    public Surface mo3054d() {
        return this.f2796a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0659q1)) {
            return false;
        }
        AbstractC0659q1 abstractC0659q1 = (AbstractC0659q1) obj;
        return this.f2796a.equals(abstractC0659q1.mo3054d()) && this.f2797b.equals(abstractC0659q1.mo3053c()) && this.f2798c == abstractC0659q1.mo3052b();
    }

    public int hashCode() {
        return ((((this.f2796a.hashCode() ^ 1000003) * 1000003) ^ this.f2797b.hashCode()) * 1000003) ^ this.f2798c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f2796a + ", size=" + this.f2797b + ", imageFormat=" + this.f2798c + "}";
    }
}
