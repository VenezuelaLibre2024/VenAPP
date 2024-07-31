package g0;

import android.opengl.EGLSurface;
import g0.a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends a0.a {

    /* renamed from: a */
    private final EGLSurface f15556a;

    /* renamed from: b */
    private final int f15557b;

    /* renamed from: c */
    private final int f15558c;

    public b(EGLSurface eGLSurface, int i10, int i11) {
        if (eGLSurface == null) {
            throw new NullPointerException("Null eglSurface");
        }
        this.f15556a = eGLSurface;
        this.f15557b = i10;
        this.f15558c = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a0.a
    public EGLSurface a() {
        return this.f15556a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a0.a
    public int b() {
        return this.f15558c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g0.a0.a
    public int c() {
        return this.f15557b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        return this.f15556a.equals(aVar.a()) && this.f15557b == aVar.c() && this.f15558c == aVar.b();
    }

    public int hashCode() {
        return ((((this.f15556a.hashCode() ^ 1000003) * 1000003) ^ this.f15557b) * 1000003) ^ this.f15558c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f15556a + ", width=" + this.f15557b + ", height=" + this.f15558c + "}";
    }
}
