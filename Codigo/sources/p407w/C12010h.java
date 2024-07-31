package p407w;

import android.graphics.Matrix;
import android.graphics.Rect;
import p407w.C12015i1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.h */
/* loaded from: classes.dex */
public final class C12010h extends C12015i1.h {

    /* renamed from: a */
    private final Rect f31929a;

    /* renamed from: b */
    private final int f31930b;

    /* renamed from: c */
    private final int f31931c;

    /* renamed from: d */
    private final boolean f31932d;

    /* renamed from: e */
    private final Matrix f31933e;

    /* renamed from: f */
    private final boolean f31934f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12010h(Rect rect, int i10, int i11, boolean z10, Matrix matrix, boolean z11) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f31929a = rect;
        this.f31930b = i10;
        this.f31931c = i11;
        this.f31932d = z10;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f31933e = matrix;
        this.f31934f = z11;
    }

    @Override // p407w.C12015i1.h
    /* renamed from: a */
    public Rect mo38586a() {
        return this.f31929a;
    }

    @Override // p407w.C12015i1.h
    /* renamed from: b */
    public boolean mo38587b() {
        return this.f31934f;
    }

    @Override // p407w.C12015i1.h
    /* renamed from: c */
    public int mo38588c() {
        return this.f31930b;
    }

    @Override // p407w.C12015i1.h
    /* renamed from: d */
    public Matrix mo38589d() {
        return this.f31933e;
    }

    @Override // p407w.C12015i1.h
    /* renamed from: e */
    public int mo38590e() {
        return this.f31931c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12015i1.h)) {
            return false;
        }
        C12015i1.h hVar = (C12015i1.h) obj;
        return this.f31929a.equals(hVar.mo38586a()) && this.f31930b == hVar.mo38588c() && this.f31931c == hVar.mo38590e() && this.f31932d == hVar.mo38591f() && this.f31933e.equals(hVar.mo38589d()) && this.f31934f == hVar.mo38587b();
    }

    @Override // p407w.C12015i1.h
    /* renamed from: f */
    public boolean mo38591f() {
        return this.f31932d;
    }

    public int hashCode() {
        return ((((((((((this.f31929a.hashCode() ^ 1000003) * 1000003) ^ this.f31930b) * 1000003) ^ this.f31931c) * 1000003) ^ (this.f31932d ? 1231 : 1237)) * 1000003) ^ this.f31933e.hashCode()) * 1000003) ^ (this.f31934f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f31929a + ", getRotationDegrees=" + this.f31930b + ", getTargetRotation=" + this.f31931c + ", hasCameraTransform=" + this.f31932d + ", getSensorToBufferTransform=" + this.f31933e + ", getMirroring=" + this.f31934f + "}";
    }
}
