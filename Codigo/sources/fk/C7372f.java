package fk;

import java.util.Comparator;
import kotlin.jvm.internal.C9322n;

/* renamed from: fk.f */
/* loaded from: classes3.dex */
final class C7372f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C7372f f16678a = new C7372f();

    private C7372f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> a10, Comparable<Object> b10) {
        C9322n.m27781e(a10, "a");
        C9322n.m27781e(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C7371e.f16677a;
    }
}
