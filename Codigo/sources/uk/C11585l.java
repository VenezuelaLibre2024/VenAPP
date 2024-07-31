package uk;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9322n;
import sk.AbstractC10933c;
import sk.C10934d;
import uk.C11577d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: uk.l */
/* loaded from: classes3.dex */
public class C11585l extends C11584k {
    /* renamed from: b */
    public static int m36293b(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* renamed from: c */
    public static long m36294c(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* renamed from: d */
    public static int m36295d(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* renamed from: e */
    public static long m36296e(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* renamed from: f */
    public static int m36297f(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: g */
    public static long m36298g(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* renamed from: h */
    public static C11577d m36299h(int i10, int i11) {
        return C11577d.f30110d.m36272a(i10, i11, -1);
    }

    /* renamed from: i */
    public static int m36300i(C11579f c11579f, AbstractC10933c random) {
        C9322n.m27781e(c11579f, "<this>");
        C9322n.m27781e(random, "random");
        try {
            return C10934d.m33406d(random, c11579f);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    /* renamed from: j */
    public static C11577d m36301j(C11577d c11577d, int i10) {
        C9322n.m27781e(c11577d, "<this>");
        C11584k.m36292a(i10 > 0, Integer.valueOf(i10));
        C11577d.a aVar = C11577d.f30110d;
        int m36268c = c11577d.m36268c();
        int m36269d = c11577d.m36269d();
        if (c11577d.m36270f() <= 0) {
            i10 = -i10;
        }
        return aVar.m36272a(m36268c, m36269d, i10);
    }

    /* renamed from: k */
    public static C11579f m36302k(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C11579f.f30118e.m36277a() : new C11579f(i10, i11 - 1);
    }
}
