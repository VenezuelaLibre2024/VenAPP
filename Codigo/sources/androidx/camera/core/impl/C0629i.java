package androidx.camera.core.impl;

import androidx.camera.core.impl.AbstractC0612d2;

/* renamed from: androidx.camera.core.impl.i */
/* loaded from: classes.dex */
final class C0629i extends AbstractC0612d2 {

    /* renamed from: a */
    private final AbstractC0612d2.b f2842a;

    /* renamed from: b */
    private final AbstractC0612d2.a f2843b;

    /* renamed from: c */
    private final long f2844c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0629i(AbstractC0612d2.b bVar, AbstractC0612d2.a aVar, long j10) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f2842a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f2843b = aVar;
        this.f2844c = j10;
    }

    @Override // androidx.camera.core.impl.AbstractC0612d2
    /* renamed from: c */
    public AbstractC0612d2.a mo3030c() {
        return this.f2843b;
    }

    @Override // androidx.camera.core.impl.AbstractC0612d2
    /* renamed from: d */
    public AbstractC0612d2.b mo3031d() {
        return this.f2842a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0612d2)) {
            return false;
        }
        AbstractC0612d2 abstractC0612d2 = (AbstractC0612d2) obj;
        return this.f2842a.equals(abstractC0612d2.mo3031d()) && this.f2843b.equals(abstractC0612d2.mo3030c()) && this.f2844c == abstractC0612d2.mo3032f();
    }

    @Override // androidx.camera.core.impl.AbstractC0612d2
    /* renamed from: f */
    public long mo3032f() {
        return this.f2844c;
    }

    public int hashCode() {
        int hashCode = (((this.f2842a.hashCode() ^ 1000003) * 1000003) ^ this.f2843b.hashCode()) * 1000003;
        long j10 = this.f2844c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f2842a + ", configSize=" + this.f2843b + ", streamUseCase=" + this.f2844c + "}";
    }
}
