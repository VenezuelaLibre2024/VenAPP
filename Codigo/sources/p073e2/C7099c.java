package p073e2;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e2.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C7099c {
    /* renamed from: a */
    public static /* synthetic */ boolean m20926a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
