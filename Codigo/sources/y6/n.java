package y6;

import java.io.EOFException;
import t6.b3;

/* loaded from: classes.dex */
public final class n {
    public static void a(boolean z10, String str) {
        if (!z10) {
            throw b3.a(str, null);
        }
    }

    public static boolean b(l lVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return lVar.d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(l lVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int m10 = lVar.m(bArr, i10 + i12, i11 - i12);
            if (m10 == -1) {
                break;
            }
            i12 += m10;
        }
        return i12;
    }

    public static boolean d(l lVar, byte[] bArr, int i10, int i11) {
        try {
            lVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(l lVar, int i10) {
        try {
            lVar.n(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
