package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.56 */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass56 {
    public static byte[] A0I;
    public static String[] A0J = {"RjjM", "koSvj4DxhDjUOCe4EMKks9dnOG3CuiGu", "aGHSBrQSfGZtxcbyILmCKrnGyIhpjEzu", "3xCBACovNHKuv2JvT7we0utPzpikn", "cVLYlYPRz01pIgpGABaAmbt5GOW22sRw", "rNQ6SroUNOr34Wm88sisB9VlrwVLSnji", "gjKr", "5vAD1AgEgb1ZXBUPAvYh"};
    public static final List<Object> A0K;
    public C0882Eb A08;
    public WeakReference<C0882Eb> A09;
    public int A0C;
    public final View A0H;
    public int A03 = -1;
    public int A01 = -1;
    public long A05 = -1;
    public int A00 = -1;
    public int A04 = -1;
    public AnonymousClass56 A06 = null;
    public AnonymousClass56 A07 = null;
    public List<Object> A0A = null;
    public List<Object> A0B = null;
    public int A0D = 0;
    public C06724w A0F = null;
    public boolean A0G = false;
    public int A0E = 0;
    public int A02 = -1;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0I = new byte[]{120, 49, 60, 101, 89, 16, 30, 23, 22, 11, 28, 29, 107, 34, 37, 61, 42, 39, 34, 47, 9, 71, 70, 9, 89, 72, 91, 76, 71, 93, 20, 90, 91, 64, 20, 70, 81, 87, 77, 87, 88, 85, 86, 88, 81, 28, 123, 43, 52, 40, 50, 47, 50, 52, 53, 102, 114, 32, 55, 63, 61, 36, 55, 54, 18, 65, 81, 64, 83, 66, 18, 25, 77, 84, 73, 125, 92, 77, 88, 90, 81, 92, 93, 58, 111, 116, 120, 117, 111, 116, 126, 100, 49, 42, 32, 33, 34, 45, 42, 33, 32, 100, 37, 32, 37, 52, 48, 33, 54, 100, 52, 43, 55, 45, 48, 45, 43, 42, 41, 124, 121, 109, 104, 125, 108, 81, 22, 26, 85, 86, 94, 106, 85, 73, 7, 76, 64, 16, 44, 16, 15, 19, 90, 96, 95, 83, 65, 69, 122, 118, 100, 91, 124, Byte.MAX_VALUE, 119, 118, 97, 104, 118, 76, 89, 89, 76, 78, 69, 72, 73, 126, 78, 95, 76, 93, 112, 95, 103, 108, 101, 106, 99, 97, 87, 103, 118, 101, 116, 89, 48, 42, 11, 60, 58, 32, 58, 53, 56, 59, 53, 60, 121, 61, 60, 58, 43, 60, 52, 60, 55, 45, 60, 61, 121, 59, 60, 53, 54, 46, 121, 105, 99, 121, 44, 55, 52, 56, 45, 58, 49, 60, 61, 121, 41, 56, 48, 43, 121, 54, 63, 121, 42, 60, 45, 16, 42, 11, 60, 58, 32, 56, 59, 53, 60, 113, 112, 121, 58, 56, 53, 53, 42, 121, 63, 54, 43, 121, 31, 2, 19, 27, 32, 31, 19, 1, 86, 27, 23, 15, 86, 24, 25, 2, 86, 20, 19, 86, 24, 3, 26, 26, 19};
        String[] strArr = A0J;
        if (strArr[5].charAt(21) != strArr[1].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0J;
        strArr2[5] = "ATZarWDBMn8zDwozKxOA19Yjdj8cqMYP";
        strArr2[1] = "9Y2h7opSRjFz5DGljetO79QOLWaAi3pM";
    }

    static {
        A04();
        A0K = Collections.EMPTY_LIST;
    }

    public AnonymousClass56(View view) {
        if (view != null) {
            this.A0H = view;
            return;
        }
        throw new IllegalArgumentException(A02(264, 24, 92));
    }

    private void A03() {
        if (this.A0A == null) {
            ArrayList arrayList = new ArrayList();
            this.A0A = arrayList;
            this.A0B = Collections.unmodifiableList(arrayList);
        }
    }

    public void A07(C0882Eb c0882Eb) {
        this.A0E = C3T.A00(this.A0H);
        c0882Eb.A1x(this, 4);
    }

    public void A08(C0882Eb c0882Eb) {
        c0882Eb.A1x(this, this.A0E);
        this.A0E = 0;
    }

    public boolean A09() {
        return (this.A0C & 16) == 0 && C3T.A0G(this.A0H);
    }

    public boolean A0A() {
        return (this.A0C & 16) != 0;
    }

    private final boolean A0B() {
        return (this.A0C & RecognitionOptions.UPC_A) != 0 || A0Z();
    }

    public final int A0G() {
        C0882Eb c0882Eb = this.A08;
        if (c0882Eb == null) {
            return -1;
        }
        return c0882Eb.A1C(this);
    }

    public final int A0H() {
        return this.A00;
    }

    public final int A0I() {
        int i10 = this.A04;
        return i10 == -1 ? this.A03 : i10;
    }

    public final int A0J() {
        return this.A01;
    }

    public final long A0K() {
        return this.A05;
    }

    public final List<Object> A0L() {
        if ((this.A0C & RecognitionOptions.UPC_E) == 0) {
            List<Object> list = this.A0A;
            if (list != null) {
                int size = list.size();
                if (A0J[2].charAt(8) == 'd') {
                    throw new RuntimeException();
                }
                String[] strArr = A0J;
                strArr[5] = "2DcmVbWbN7IXAuYZB7QLz9ixHDr4nD2H";
                strArr[1] = "B34awafHihlIJm5KsMjOG9HfWfhHTq0p";
                if (size != 0) {
                    return this.A0B;
                }
            }
            return A0K;
        }
        return A0K;
    }

    public final void A0M() {
        this.A01 = -1;
        this.A04 = -1;
    }

    public final void A0N() {
        List<Object> list = this.A0A;
        if (list != null) {
            list.clear();
        }
        this.A0C &= -1025;
    }

    public final void A0O() {
        this.A0C &= -33;
    }

    public final void A0P() {
        this.A0C &= -257;
    }

    public final void A0Q() {
        this.A0C = 0;
        this.A03 = -1;
        this.A01 = -1;
        this.A05 = -1L;
        this.A04 = -1;
        this.A0D = 0;
        this.A06 = null;
        this.A07 = null;
        A0N();
        this.A0E = 0;
        this.A02 = -1;
        C0882Eb.A0s(this);
    }

    public final void A0R() {
        if (this.A01 == -1) {
            this.A01 = this.A03;
        }
    }

    public final void A0S() {
        this.A0F.A0Y(this);
    }

    public final void A0T(int i10) {
        this.A0C |= i10;
    }

    public final void A0U(int i10, int i11) {
        this.A0C = (this.A0C & (i11 ^ (-1))) | (i10 & i11);
    }

    public final void A0V(C06724w c06724w, boolean z10) {
        this.A0F = c06724w;
        this.A0G = z10;
    }

    public final void A0W(Object obj) {
        if (obj != null) {
            if ((1024 & this.A0C) != 0) {
                return;
            }
            A03();
            this.A0A.add(obj);
            return;
        }
        A0T(RecognitionOptions.UPC_E);
    }

    public final void A0X(boolean z10) {
        int i10 = this.A0D;
        int i11 = z10 ? i10 - 1 : i10 + 1;
        this.A0D = i11;
        if (A0J[4].charAt(7) != 'R') {
            throw new RuntimeException();
        }
        A0J[7] = "l8mjsSEKM";
        if (i11 < 0) {
            this.A0D = 0;
            Log.e(A02(143, 4, 28), A02(186, 78, 115) + this);
            return;
        }
        if (!z10 && i11 == 1) {
            int i12 = this.A0C | 16;
            String[] strArr = A0J;
            if (strArr[5].charAt(21) != strArr[1].charAt(21)) {
                throw new RuntimeException();
            }
            A0J[2] = "drml3nLoX5pQWQBc32bzozsnTExNEnJK";
            this.A0C = i12;
            return;
        }
        if (!z10 || i11 != 0) {
            return;
        }
        this.A0C &= -17;
    }

    public final boolean A0Y() {
        return (this.A0C & 1) != 0;
    }

    public final boolean A0Z() {
        return (this.A0C & 4) != 0;
    }

    public final boolean A0a() {
        return (this.A0C & 8) != 0;
    }

    public final boolean A0b() {
        return this.A0F != null;
    }

    public final boolean A0c() {
        return (this.A0C & RecognitionOptions.QR_CODE) != 0;
    }

    public final boolean A0d() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0e() {
        return (this.A0C & 2) != 0;
    }

    public final boolean A0f() {
        return (this.A0C & RecognitionOptions.ITF) != 0;
    }

    public final boolean A0g() {
        return (this.A0C & 32) != 0;
    }

    public final boolean A0h() {
        return (this.A0C & 16) == 0 && !C3T.A0G(this.A0H);
    }

    public final boolean A0i(int i10) {
        return (this.A0C & i10) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b3, code lost:
    
        if (r4.getParent() == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b5, code lost:
    
        r3.append(A02(20, 10, 3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c1, code lost:
    
        r3.append(A02(288, 1, 68));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
    
        return r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01e2, code lost:
    
        if (r4.getParent() == null) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.AnonymousClass56.toString():java.lang.String");
    }
}
