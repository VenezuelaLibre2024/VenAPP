package il;

import p089el.C7223h0;
import p089el.C7229k0;

/* renamed from: il.e */
/* loaded from: classes3.dex */
public final class C8012e {

    /* renamed from: a */
    private static final int f19504a;

    /* renamed from: b */
    private static final C7223h0 f19505b;

    /* renamed from: c */
    private static final C7223h0 f19506c;

    /* renamed from: d */
    private static final C7223h0 f19507d;

    /* renamed from: e */
    private static final C7223h0 f19508e;

    /* renamed from: f */
    private static final int f19509f;

    static {
        int m21602e;
        int m21602e2;
        m21602e = C7229k0.m21602e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f19504a = m21602e;
        f19505b = new C7223h0("PERMIT");
        f19506c = new C7223h0("TAKEN");
        f19507d = new C7223h0("BROKEN");
        f19508e = new C7223h0("CANCELLED");
        m21602e2 = C7229k0.m21602e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f19509f = m21602e2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final C8013f m24630h(long j10, C8013f c8013f) {
        return new C8013f(j10, c8013f, 0);
    }
}
