package fk;

import java.util.Comparator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final e f15254a = new e();

    private e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(Comparable<Object> a10, Comparable<Object> b10) {
        n.e(a10, "a");
        n.e(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return f.f15255a;
    }
}
