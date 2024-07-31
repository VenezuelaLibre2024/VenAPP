package fk;

import java.util.Comparator;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fk.b */
/* loaded from: classes3.dex */
public class C7368b {
    /* renamed from: a */
    public static <T extends Comparable<?>> int m22236a(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    /* renamed from: b */
    public static <T extends Comparable<? super T>> Comparator<T> m22237b() {
        C7371e c7371e = C7371e.f16677a;
        C9322n.m27779c(c7371e, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c7371e;
    }
}
