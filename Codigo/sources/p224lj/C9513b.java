package p224lj;

import p186jj.InterfaceC9075c;

/* renamed from: lj.b */
/* loaded from: classes3.dex */
public final class C9513b {

    /* renamed from: a */
    static final InterfaceC9075c<Object, Object> f23129a = new a();

    /* renamed from: lj.b$a */
    /* loaded from: classes3.dex */
    static final class a implements InterfaceC9075c<Object, Object> {
        a() {
        }
    }

    /* renamed from: a */
    public static int m28321a(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m28322b(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m28323c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static <T> T m28324d(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static int m28325e(int i10, String str) {
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i10);
    }
}
