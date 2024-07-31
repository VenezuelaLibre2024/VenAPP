package p112g0;

/* renamed from: g0.z0 */
/* loaded from: classes.dex */
public class C7438z0 {
    /* renamed from: a */
    public static int m22437a(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    /* renamed from: b */
    public static boolean m22438b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
