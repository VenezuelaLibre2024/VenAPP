package g0;

/* loaded from: classes.dex */
public class z0 {
    public static int a(int i10) {
        int i11 = 0;
        while (i10 != 0) {
            i11 += i10 & 1;
            i10 >>= 1;
        }
        return i11;
    }

    public static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
