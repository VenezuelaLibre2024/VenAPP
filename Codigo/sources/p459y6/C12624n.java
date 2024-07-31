package p459y6;

import java.io.EOFException;
import p361t6.C11005b3;

/* renamed from: y6.n */
/* loaded from: classes.dex */
public final class C12624n {
    /* renamed from: a */
    public static void m41564a(boolean z10, String str) {
        if (!z10) {
            throw C11005b3.m33715a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m41565b(InterfaceC12622l interfaceC12622l, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return interfaceC12622l.mo41533d(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    /* renamed from: c */
    public static int m41566c(InterfaceC12622l interfaceC12622l, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int mo41537m = interfaceC12622l.mo41537m(bArr, i10 + i12, i11 - i12);
            if (mo41537m == -1) {
                break;
            }
            i12 += mo41537m;
        }
        return i12;
    }

    /* renamed from: d */
    public static boolean m41567d(InterfaceC12622l interfaceC12622l, byte[] bArr, int i10, int i11) {
        try {
            interfaceC12622l.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m41568e(InterfaceC12622l interfaceC12622l, int i10) {
        try {
            interfaceC12622l.mo41538n(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
