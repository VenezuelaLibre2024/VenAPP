package il;

import el.e0;
import el.h0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f extends e0<f> {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f17847e;

    public f(long j10, f fVar, int i10) {
        super(j10, fVar, i10);
        int i11;
        i11 = e.f17846f;
        this.f17847e = new AtomicReferenceArray(i11);
    }

    @Override // el.e0
    public int n() {
        int i10;
        i10 = e.f17846f;
        return i10;
    }

    @Override // el.e0
    public void o(int i10, Throwable th2, gk.f fVar) {
        h0 h0Var;
        h0Var = e.f17845e;
        r().set(i10, h0Var);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f17847e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f14765c + ", hashCode=" + hashCode() + ']';
    }
}
