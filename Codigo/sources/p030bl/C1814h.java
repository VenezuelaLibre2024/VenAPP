package p030bl;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bl.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1814h {
    /* renamed from: a */
    public static /* synthetic */ boolean m9805a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
