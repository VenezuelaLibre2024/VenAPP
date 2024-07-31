package p112g0;

import android.opengl.EGLSurface;
import p112g0.C7388a0;

/* renamed from: g0.b */
/* loaded from: classes.dex */
final class C7389b extends C7388a0.a {

    /* renamed from: a */
    private final EGLSurface f17134a;

    /* renamed from: b */
    private final int f17135b;

    /* renamed from: c */
    private final int f17136c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7389b(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f17134a = eGLSurface;
        this.f17135b = i10;
        this.f17136c = i11;
    }

    @Override // p112g0.C7388a0.a
    /* renamed from: a */
    EGLSurface mo22301a() {
        return this.f17134a;
    }

    @Override // p112g0.C7388a0.a
    /* renamed from: b */
    int mo22302b() {
        return this.f17136c;
    }

    @Override // p112g0.C7388a0.a
    /* renamed from: c */
    int mo22303c() {
        return this.f17135b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7388a0.a)) {
            return false;
        }
        C7388a0.a aVar = (C7388a0.a) obj;
        return this.f17134a.equals(aVar.mo22301a()) && this.f17135b == aVar.mo22303c() && this.f17136c == aVar.mo22302b();
    }

    public int hashCode() {
        return ((((this.f17134a.hashCode() ^ 1000003) * 1000003) ^ this.f17135b) * 1000003) ^ this.f17136c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f17134a + ", width=" + this.f17135b + ", height=" + this.f17136c + "}";
    }
}
