package dk;

import java.lang.reflect.Array;
import kotlin.jvm.internal.C9322n;

/* renamed from: dk.j */
/* loaded from: classes3.dex */
class C7015j {
    /* renamed from: a */
    public static final <T> T[] m20413a(T[] reference, int i10) {
        C9322n.m27781e(reference, "reference");
        Object newInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        C9322n.m27779c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    /* renamed from: b */
    public static final void m20414b(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
