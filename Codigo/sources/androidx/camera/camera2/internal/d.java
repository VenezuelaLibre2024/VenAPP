package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.j0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends j0.i {

    /* renamed from: a, reason: collision with root package name */
    private final String f1941a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f1942b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.camera.core.impl.y1 f1943c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.k2<?> f1944d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f1945e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, Class<?> cls, androidx.camera.core.impl.y1 y1Var, androidx.camera.core.impl.k2<?> k2Var, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f1941a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f1942b = cls;
        if (y1Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f1943c = y1Var;
        if (k2Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f1944d = k2Var;
        this.f1945e = size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.j0.i
    public androidx.camera.core.impl.y1 c() {
        return this.f1943c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.j0.i
    public Size d() {
        return this.f1945e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.j0.i
    public androidx.camera.core.impl.k2<?> e() {
        return this.f1944d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j0.i)) {
            return false;
        }
        j0.i iVar = (j0.i) obj;
        if (this.f1941a.equals(iVar.f()) && this.f1942b.equals(iVar.g()) && this.f1943c.equals(iVar.c()) && this.f1944d.equals(iVar.e())) {
            Size size = this.f1945e;
            Size d10 = iVar.d();
            if (size == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (size.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.j0.i
    public String f() {
        return this.f1941a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.j0.i
    public Class<?> g() {
        return this.f1942b;
    }

    public int hashCode() {
        int hashCode = (((((((this.f1941a.hashCode() ^ 1000003) * 1000003) ^ this.f1942b.hashCode()) * 1000003) ^ this.f1943c.hashCode()) * 1000003) ^ this.f1944d.hashCode()) * 1000003;
        Size size = this.f1945e;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f1941a + ", useCaseType=" + this.f1942b + ", sessionConfig=" + this.f1943c + ", useCaseConfig=" + this.f1944d + ", surfaceResolution=" + this.f1945e + "}";
    }
}
