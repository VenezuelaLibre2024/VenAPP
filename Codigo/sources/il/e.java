package il;

import el.h0;
import el.k0;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17841a;

    /* renamed from: b, reason: collision with root package name */
    private static final h0 f17842b;

    /* renamed from: c, reason: collision with root package name */
    private static final h0 f17843c;

    /* renamed from: d, reason: collision with root package name */
    private static final h0 f17844d;

    /* renamed from: e, reason: collision with root package name */
    private static final h0 f17845e;

    /* renamed from: f, reason: collision with root package name */
    private static final int f17846f;

    static {
        int e10;
        int e11;
        e10 = k0.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f17841a = e10;
        f17842b = new h0("PERMIT");
        f17843c = new h0("TAKEN");
        f17844d = new h0("BROKEN");
        f17845e = new h0("CANCELLED");
        e11 = k0.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f17846f = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j10, f fVar) {
        return new f(j10, fVar, 0);
    }
}
