package androidx.camera.core.impl;

import androidx.camera.core.impl.d2;

/* loaded from: classes.dex */
final class i extends d2 {

    /* renamed from: a, reason: collision with root package name */
    private final d2.b f2504a;

    /* renamed from: b, reason: collision with root package name */
    private final d2.a f2505b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2506c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(d2.b bVar, d2.a aVar, long j10) {
        if (bVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f2504a = bVar;
        if (aVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f2505b = aVar;
        this.f2506c = j10;
    }

    @Override // androidx.camera.core.impl.d2
    public d2.a c() {
        return this.f2505b;
    }

    @Override // androidx.camera.core.impl.d2
    public d2.b d() {
        return this.f2504a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f2504a.equals(d2Var.d()) && this.f2505b.equals(d2Var.c()) && this.f2506c == d2Var.f();
    }

    @Override // androidx.camera.core.impl.d2
    public long f() {
        return this.f2506c;
    }

    public int hashCode() {
        int hashCode = (((this.f2504a.hashCode() ^ 1000003) * 1000003) ^ this.f2505b.hashCode()) * 1000003;
        long j10 = this.f2506c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f2504a + ", configSize=" + this.f2505b + ", streamUseCase=" + this.f2506c + "}";
    }
}
