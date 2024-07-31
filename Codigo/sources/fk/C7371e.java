package fk;

import java.util.Comparator;
import kotlin.jvm.internal.C9322n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fk.e */
/* loaded from: classes3.dex */
public final class C7371e implements Comparator<Comparable<? super Object>> {

    /* renamed from: a */
    public static final C7371e f16677a = new C7371e();

    private C7371e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<Object> a10, Comparable<Object> b10) {
        C9322n.m27781e(a10, "a");
        C9322n.m27781e(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return C7372f.f16678a;
    }
}
