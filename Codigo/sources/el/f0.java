package el;

import el.e0;

/* loaded from: classes3.dex */
public final class f0<S extends e0<S>> {
    public static <S extends e0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj == d.f14760a) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (S) obj;
    }

    public static final boolean c(Object obj) {
        return obj == d.f14760a;
    }
}
