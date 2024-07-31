package androidx.camera.camera2.internal;

import android.util.Size;
import androidx.camera.camera2.internal.C0503j0;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0640k2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.d */
/* loaded from: classes.dex */
public final class C0472d extends C0503j0.i {

    /* renamed from: a */
    private final String f2244a;

    /* renamed from: b */
    private final Class<?> f2245b;

    /* renamed from: c */
    private final C0701y1 f2246c;

    /* renamed from: d */
    private final InterfaceC0640k2<?> f2247d;

    /* renamed from: e */
    private final Size f2248e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0472d(String str, Class<?> cls, C0701y1 c0701y1, InterfaceC0640k2<?> interfaceC0640k2, Size size) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f2244a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f2245b = cls;
        if (c0701y1 == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f2246c = c0701y1;
        if (interfaceC0640k2 == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f2247d = interfaceC0640k2;
        this.f2248e = size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0503j0.i
    /* renamed from: c */
    public C0701y1 mo2310c() {
        return this.f2246c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0503j0.i
    /* renamed from: d */
    public Size mo2311d() {
        return this.f2248e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0503j0.i
    /* renamed from: e */
    public InterfaceC0640k2<?> mo2312e() {
        return this.f2247d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0503j0.i)) {
            return false;
        }
        C0503j0.i iVar = (C0503j0.i) obj;
        if (this.f2244a.equals(iVar.mo2313f()) && this.f2245b.equals(iVar.mo2314g()) && this.f2246c.equals(iVar.mo2310c()) && this.f2247d.equals(iVar.mo2312e())) {
            Size size = this.f2248e;
            Size mo2311d = iVar.mo2311d();
            if (size == null) {
                if (mo2311d == null) {
                    return true;
                }
            } else if (size.equals(mo2311d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0503j0.i
    /* renamed from: f */
    public String mo2313f() {
        return this.f2244a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.C0503j0.i
    /* renamed from: g */
    public Class<?> mo2314g() {
        return this.f2245b;
    }

    public int hashCode() {
        int hashCode = (((((((this.f2244a.hashCode() ^ 1000003) * 1000003) ^ this.f2245b.hashCode()) * 1000003) ^ this.f2246c.hashCode()) * 1000003) ^ this.f2247d.hashCode()) * 1000003;
        Size size = this.f2248e;
        return hashCode ^ (size == null ? 0 : size.hashCode());
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f2244a + ", useCaseType=" + this.f2245b + ", sessionConfig=" + this.f2246c + ", useCaseConfig=" + this.f2247d + ", surfaceResolution=" + this.f2248e + "}";
    }
}
