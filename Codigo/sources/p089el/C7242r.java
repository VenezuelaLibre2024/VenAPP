package p089el;

import kotlin.jvm.internal.C9322n;

/* renamed from: el.r */
/* loaded from: classes3.dex */
public final class C7242r {

    /* renamed from: a */
    private static final Object f16227a = new C7223h0("CONDITION_FALSE");

    /* renamed from: a */
    public static final Object m21644a() {
        return f16227a;
    }

    /* renamed from: b */
    public static final C7243s m21645b(Object obj) {
        C7243s c7243s;
        C7211b0 c7211b0 = obj instanceof C7211b0 ? (C7211b0) obj : null;
        if (c7211b0 != null && (c7243s = c7211b0.f16181a) != null) {
            return c7243s;
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C7243s) obj;
    }
}
