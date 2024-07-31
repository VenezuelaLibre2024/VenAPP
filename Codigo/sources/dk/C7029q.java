package dk;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p088ek.C7199b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.q */
/* loaded from: classes3.dex */
public class C7029q {
    /* renamed from: a */
    public static <E> List<E> m20568a(List<E> builder) {
        C9322n.m27781e(builder, "builder");
        return ((C7199b) builder).m21472o();
    }

    /* renamed from: b */
    public static final <T> Object[] m20569b(T[] tArr, boolean z10) {
        C9322n.m27781e(tArr, "<this>");
        if (z10 && C9322n.m27777a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C9322n.m27780d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static <E> List<E> m20570c() {
        return new C7199b();
    }

    /* renamed from: d */
    public static <E> List<E> m20571d(int i10) {
        return new C7199b(i10);
    }

    /* renamed from: e */
    public static <T> List<T> m20572e(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        C9322n.m27780d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
