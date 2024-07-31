package dk;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.q0 */
/* loaded from: classes3.dex */
public class C7030q0 extends C7028p0 {
    /* renamed from: e */
    public static <T> Set<T> m20573e() {
        return C7004d0.f15577a;
    }

    /* renamed from: f */
    public static <T> HashSet<T> m20574f(T... elements) {
        C9322n.m27781e(elements, "elements");
        return (HashSet) C7021m.m20471X(elements, new HashSet(C7012h0.m20362e(elements.length)));
    }

    /* renamed from: g */
    public static <T> Set<T> m20575g(T... elements) {
        C9322n.m27781e(elements, "elements");
        return (Set) C7021m.m20471X(elements, new LinkedHashSet(C7012h0.m20362e(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static final <T> Set<T> m20576h(Set<? extends T> set) {
        C9322n.m27781e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : C7026o0.m20511d(set.iterator().next()) : C7026o0.m20512e();
    }

    /* renamed from: i */
    public static <T> Set<T> m20577i(T... elements) {
        C9322n.m27781e(elements, "elements");
        return elements.length > 0 ? C7021m.m20487n0(elements) : C7026o0.m20512e();
    }
}
