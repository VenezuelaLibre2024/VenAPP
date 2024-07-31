package el;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a */
    private static final Object f14804a = new h0("CONDITION_FALSE");

    public static final Object a() {
        return f14804a;
    }

    public static final s b(Object obj) {
        s sVar;
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null && (sVar = b0Var.f14758a) != null) {
            return sVar;
        }
        kotlin.jvm.internal.n.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (s) obj;
    }
}
