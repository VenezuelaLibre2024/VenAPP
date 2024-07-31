package il;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p089el.AbstractC7217e0;
import p089el.C7223h0;
import p124gk.InterfaceC7587f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: il.f */
/* loaded from: classes3.dex */
public final class C8013f extends AbstractC7217e0<C8013f> {

    /* renamed from: e */
    private final AtomicReferenceArray f19510e;

    public C8013f(long j10, C8013f c8013f, int i10) {
        super(j10, c8013f, i10);
        int i11;
        i11 = C8012e.f19509f;
        this.f19510e = new AtomicReferenceArray(i11);
    }

    @Override // p089el.AbstractC7217e0
    /* renamed from: n */
    public int mo9809n() {
        int i10;
        i10 = C8012e.f19509f;
        return i10;
    }

    @Override // p089el.AbstractC7217e0
    /* renamed from: o */
    public void mo9810o(int i10, Throwable th2, InterfaceC7587f interfaceC7587f) {
        C7223h0 c7223h0;
        c7223h0 = C8012e.f19508e;
        m24631r().set(i10, c7223h0);
        m21566p();
    }

    /* renamed from: r */
    public final AtomicReferenceArray m24631r() {
        return this.f19510e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f16188c + ", hashCode=" + hashCode() + ']';
    }
}
