package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f extends q1 {

    /* renamed from: a */
    private final Surface f2458a;

    /* renamed from: b */
    private final Size f2459b;

    /* renamed from: c */
    private final int f2460c;

    public f(Surface surface, Size size, int i10) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f2458a = surface;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2459b = size;
        this.f2460c = i10;
    }

    @Override // androidx.camera.core.impl.q1
    public int b() {
        return this.f2460c;
    }

    @Override // androidx.camera.core.impl.q1
    public Size c() {
        return this.f2459b;
    }

    @Override // androidx.camera.core.impl.q1
    public Surface d() {
        return this.f2458a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f2458a.equals(q1Var.d()) && this.f2459b.equals(q1Var.c()) && this.f2460c == q1Var.b();
    }

    public int hashCode() {
        return ((((this.f2458a.hashCode() ^ 1000003) * 1000003) ^ this.f2459b.hashCode()) * 1000003) ^ this.f2460c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f2458a + ", size=" + this.f2459b + ", imageFormat=" + this.f2460c + "}";
    }
}
