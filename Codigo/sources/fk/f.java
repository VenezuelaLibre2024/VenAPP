package fk;

import java.util.Comparator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
final class f implements Comparator<Comparable<? super Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f15255a = new f();

    private f() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> a10, Comparable<Object> b10) {
        n.e(a10, "a");
        n.e(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return e.f15254a;
    }
}
