package dk;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.C9322n;
import p088ek.C7207j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dk.p0 */
/* loaded from: classes3.dex */
public class C7028p0 {
    /* renamed from: a */
    public static <E> Set<E> m20564a(Set<E> builder) {
        C9322n.m27781e(builder, "builder");
        return ((C7207j) builder).m21538d();
    }

    /* renamed from: b */
    public static <E> Set<E> m20565b() {
        return new C7207j();
    }

    /* renamed from: c */
    public static <E> Set<E> m20566c(int i10) {
        return new C7207j(i10);
    }

    /* renamed from: d */
    public static <T> Set<T> m20567d(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        C9322n.m27780d(singleton, "singleton(element)");
        return singleton;
    }
}
