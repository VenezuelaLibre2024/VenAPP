package i0;

import androidx.camera.core.impl.f2;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.s;

/* loaded from: classes.dex */
public class h implements s {

    /* renamed from: a, reason: collision with root package name */
    private final s f16866a;

    /* renamed from: b, reason: collision with root package name */
    private final f2 f16867b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16868c;

    public h(f2 f2Var, long j10) {
        this(null, f2Var, j10);
    }

    public h(f2 f2Var, s sVar) {
        this(sVar, f2Var, -1L);
    }

    private h(s sVar, f2 f2Var, long j10) {
        this.f16866a = sVar;
        this.f16867b = f2Var;
        this.f16868c = j10;
    }

    @Override // androidx.camera.core.impl.s
    public f2 b() {
        return this.f16867b;
    }

    @Override // androidx.camera.core.impl.s
    public long c() {
        s sVar = this.f16866a;
        if (sVar != null) {
            return sVar.c();
        }
        long j10 = this.f16868c;
        if (j10 != -1) {
            return j10;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.s
    public r d() {
        s sVar = this.f16866a;
        return sVar != null ? sVar.d() : r.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.s
    public p f() {
        s sVar = this.f16866a;
        return sVar != null ? sVar.f() : p.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.s
    public q g() {
        s sVar = this.f16866a;
        return sVar != null ? sVar.g() : q.UNKNOWN;
    }

    @Override // androidx.camera.core.impl.s
    public n h() {
        s sVar = this.f16866a;
        return sVar != null ? sVar.h() : n.UNKNOWN;
    }
}
