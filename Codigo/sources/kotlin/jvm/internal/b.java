package kotlin.jvm.internal;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b {
    public static final <T> Iterator<T> a(T[] array) {
        n.e(array, "array");
        return new a(array);
    }
}
