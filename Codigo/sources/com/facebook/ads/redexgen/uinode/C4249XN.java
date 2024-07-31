package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.XN */
/* loaded from: assets/audience_network.dex */
public final class C4249XN implements InterfaceC2950Bs {
    public static byte[] A0X;
    public static String[] A0Y = {"XdJWu", "FUlE3E4RGCFuY0n1jkLa4sDNStY", "LTfWg4MeBgD", "ea2mTe", "5aN4xnjUR54", "JRDUjTwIRED0cdRjG5ryaKaac6vLzQ8c", "s80pf3iUB", "VFz"};
    public static final InterfaceC2953Bv A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public InterfaceC2952Bu A0C;
    public C2988CV A0D;
    public C3306Hz A0E;
    public boolean A0F;
    public boolean A0G;
    public InterfaceC2962C4[] A0H;
    public InterfaceC2962C4[] A0I;
    public final int A0J;
    public final SparseArray<C2988CV> A0K;
    public final DrmInitData A0L;
    public final InterfaceC2962C4 A0M;
    public final C2994Ce A0N;
    public final C3306Hz A0O;
    public final C3306Hz A0P;
    public final C3306Hz A0Q;
    public final C3306Hz A0R;
    public final C3318IB A0S;
    public final ArrayDeque<C4255XT> A0T;
    public final ArrayDeque<C2987CU> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(C2988CV c2988cv, int i10, long j10, int i11, C3306Hz c3306Hz, int i12) {
        int i13;
        int i14 = i12;
        long j11 = j10;
        c3306Hz.A0Y(8);
        int A00 = AbstractC2977CJ.A00(c3306Hz.A08());
        C2994Ce c2994Ce = c2988cv.A05;
        C2996Cg c2996Cg = c2988cv.A07;
        C2983CP c2983cp = c2996Cg.A07;
        c2996Cg.A0E[i10] = c3306Hz.A0H();
        c2996Cg.A0G[i10] = c2996Cg.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = c2996Cg.A0G;
            jArr[i10] = jArr[i10] + c3306Hz.A08();
        }
        boolean z10 = (A00 & 4) != 0;
        int i15 = c2983cp.A01;
        if (z10) {
            i15 = c3306Hz.A0H();
        }
        boolean z11 = (A00 & RecognitionOptions.QR_CODE) != 0;
        boolean z12 = (A00 & RecognitionOptions.UPC_A) != 0;
        boolean z13 = (A00 & RecognitionOptions.UPC_E) != 0;
        boolean z14 = (A00 & RecognitionOptions.PDF417) != 0;
        long j12 = 0;
        if (c2994Ce.A08 != null && c2994Ce.A08.length == 1 && c2994Ce.A08[0] == 0) {
            j12 = AbstractC3322IF.A0F(c2994Ce.A09[0], 1000L, c2994Ce.A06);
        }
        int[] iArr = c2996Cg.A0D;
        int[] iArr2 = c2996Cg.A0C;
        long[] jArr2 = c2996Cg.A0F;
        boolean[] zArr = c2996Cg.A0I;
        boolean z15 = c2994Ce.A03 == 2 && (i11 & 1) != 0;
        int i16 = i14 + c2996Cg.A0E[i10];
        long j13 = c2994Ce.A06;
        if (i10 > 0) {
            j11 = c2996Cg.A06;
        }
        while (i14 < i16) {
            int A0H = z11 ? c3306Hz.A0H() : c2983cp.A00;
            if (z12) {
                i13 = c3306Hz.A0H();
            } else {
                i13 = c2983cp.A03;
                if (A0Y[5].charAt(2) == 'C') {
                    throw new RuntimeException();
                }
                A0Y[6] = "dkwnFPd0";
            }
            int A08 = (i14 == 0 && z10) ? i15 : z13 ? c3306Hz.A08() : c2983cp.A01;
            if (z14) {
                iArr2[i14] = (int) ((c3306Hz.A08() * 1000) / j13);
            } else {
                iArr2[i14] = 0;
            }
            jArr2[i14] = AbstractC3322IF.A0F(j11, 1000L, j13) - j12;
            iArr[i14] = i13;
            zArr[i14] = ((A08 >> 16) & 1) == 0 && (!z15 || i14 == 0);
            j11 += A0H;
            i14++;
        }
        c2996Cg.A06 = j11;
        return i16;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C4276Xo> A04(C3306Hz c3306Hz, long j10) throws C28319v {
        long A0N;
        long A0N2;
        c3306Hz.A0Y(8);
        int A01 = AbstractC2977CJ.A01(c3306Hz.A08());
        c3306Hz.A0Z(4);
        long A0M = c3306Hz.A0M();
        if (A01 == 0) {
            A0N = c3306Hz.A0M();
            A0N2 = j10 + c3306Hz.A0M();
        } else {
            A0N = c3306Hz.A0N();
            A0N2 = j10 + c3306Hz.A0N();
        }
        long A0F = AbstractC3322IF.A0F(A0N, 1000000L, A0M);
        c3306Hz.A0Z(2);
        int A0I = c3306Hz.A0I();
        int[] iArr = new int[A0I];
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        long[] jArr3 = new long[A0I];
        long j11 = A0F;
        for (int i10 = 0; i10 < A0I; i10++) {
            int A08 = c3306Hz.A08();
            if ((Integer.MIN_VALUE & A08) != 0) {
                throw new C28319v(A0A(581, 28, 126));
            }
            long A0M2 = c3306Hz.A0M();
            iArr[i10] = Integer.MAX_VALUE & A08;
            jArr[i10] = A0N2;
            jArr3[i10] = j11;
            A0N += A0M2;
            j11 = AbstractC3322IF.A0F(A0N, 1000000L, A0M);
            jArr2[i10] = j11 - jArr3[i10];
            c3306Hz.A0Z(4);
            A0N2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(A0F), new C4276Xo(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C2988CV A09(C3306Hz c3306Hz, SparseArray<C2988CV> sparseArray) {
        c3306Hz.A0Y(8);
        int A00 = AbstractC2977CJ.A00(c3306Hz.A08());
        C2988CV A08 = A08(sparseArray, c3306Hz.A08());
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0N = c3306Hz.A0N();
            A08.A07.A05 = A0N;
            A08.A07.A04 = A0N;
        }
        C2983CP c2983cp = A08.A04;
        A08.A07.A07 = new C2983CP((A00 & 2) != 0 ? c3306Hz.A0H() - 1 : c2983cp.A02, (A00 & 8) != 0 ? c3306Hz.A0H() : c2983cp.A00, (A00 & 16) != 0 ? c3306Hz.A0H() : c2983cp.A03, (A00 & 32) != 0 ? c3306Hz.A0H() : c2983cp.A01);
        return A08;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{117, 121, 84, 97, 122, 120, 53, 102, 124, 111, 112, 53, 121, 112, 102, 102, 53, 97, 125, 116, 123, 53, 125, 112, 116, 113, 112, 103, 53, 121, 112, 123, 114, 97, 125, 53, 61, 96, 123, 102, 96, 101, 101, 122, 103, 97, 112, 113, 60, 59, 114, 89, 67, 69, 78, 23, 84, 88, 66, 89, 67, 23, 94, 89, 23, 68, 85, 80, 71, 23, 22, 10, 23, 6, 23, 31, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, 30, 25, 119, 92, 70, 64, 75, 18, 81, 93, 71, 92, 70, 18, 91, 92, 18, 65, 85, 66, 86, 18, 19, 15, 18, 3, 18, 26, 71, 92, 65, 71, 66, 66, 93, 64, 70, 87, 86, 27, 28, 57, 13, 30, 24, 18, 26, 17, 11, 26, 27, 50, 15, 75, 58, 7, 11, 13, 30, 28, 11, 16, 13, 0, 46, 39, 38, 59, 32, 39, 46, 105, 39, 44, 46, 40, 61, 32, 63, 44, 105, 38, 47, 47, 58, 44, 61, 105, 61, 38, 105, 58, 40, 36, 57, 37, 44, 105, 45, 40, 61, 40, 103, 51, 26, 30, 25, 95, 30, 11, 16, 18, 95, 27, 26, 25, 22, 17, 26, 12, 95, 26, 7, 11, 26, 17, 27, 26, 27, 95, 30, 11, 16, 18, 95, 12, 22, 5, 26, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, 11, 26, 27, 86, 81, 30, 55, 51, 52, 114, 51, 38, 61, 63, 114, 37, 59, 38, 58, 114, 62, 55, 60, 53, 38, 58, 114, 108, 114, 96, 99, 102, 101, 102, 106, 97, 100, 102, 101, 114, 122, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 123, 124, 63, 22, 29, 20, 7, 27, 83, 30, 26, 0, 30, 18, 7, 16, 27, 73, 83, 15, 38, 38, 51, 37, 52, 96, 52, 47, 96, 37, 46, 35, 50, 57, 48, 52, 41, 47, 46, 96, 36, 33, 52, 33, 96, 55, 33, 51, 96, 46, 37, 39, 33, 52, 41, 54, 37, 110, 16, 57, 57, 44, 58, 43, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 58, 49, 59, Byte.MAX_VALUE, 48, 57, Byte.MAX_VALUE, 50, 59, 62, 43, Byte.MAX_VALUE, 40, 62, 44, Byte.MAX_VALUE, 49, 58, 56, 62, 43, 54, 41, 58, 113, 106, 83, 64, 87, 87, 76, 65, 76, 75, 66, 5, 113, 87, 68, 70, 78, 96, 75, 70, 87, 92, 85, 81, 76, 74, 75, 103, 74, 93, 5, 85, 68, 87, 68, 72, 64, 81, 64, 87, 86, 5, 76, 86, 5, 80, 75, 86, 80, 85, 85, 74, 87, 81, 64, 65, 11, 14, 54, 52, 45, 45, 56, 57, 125, 45, 46, 46, 53, 125, 60, 41, 50, 48, 125, 117, 59, 60, 52, 49, 56, 57, 125, 41, 50, 125, 56, 37, 41, 47, 60, 62, 41, 125, 40, 40, 52, 57, 116, 54, 14, 12, 21, 21, 12, 11, 2, 69, 4, 17, 10, 8, 69, 18, 12, 17, 13, 69, 9, 0, 11, 2, 17, 13, 69, 91, 69, 87, 84, 81, 82, 81, 93, 86, 83, 81, 82, 69, 77, 16, 11, 22, 16, 21, 21, 10, 23, 17, 0, 1, 76, 75, 62, 5, 14, 19, 27, 14, 8, 31, 14, 15, 75, 6, 4, 4, 29, 75, 9, 4, 19, 69, 13, 54, 61, 32, 40, 61, 59, 44, 61, 60, 120, 43, 57, 49, 55, 120, 61, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 98, 120, 76, 119, 113, 120, 119, 125, 117, 124, 125, 57, 112, 119, 125, 112, 107, 124, 122, 109, 57, 107, 124, Byte.MAX_VALUE, 124, 107, 124, 119, 122, 124, 58, 13, 30, 5, 13, 14, 0, 9, 76, 0, 9, 2, 11, 24, 4, 76, 8, 9, 31, 15, 30, 5, 28, 24, 5, 3, 2, 76, 5, 2, 76, 31, 11, 28, 8, 76, 10, 3, 25, 2, 8, 76, 68, 25, 2, 31, 25, 28, 28, 3, 30, 24, 9, 8, 69, 31, 14, 14, 18, 23, 29, 31, 10, 23, 17, 16, 81, 6, 83, 27, 19, 13, 25, 3, 21, 25, 23, 23, 8, 5, 4, 14, 78, 9, 4, 23, 2, 6, 25, 20, 21, 31, 95, 29, 0, 68};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0K(C4255XT c4255xt) throws C28319v {
        AbstractC3281Ha.A06(this.A0N == null, A0A(532, 20, 12));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(c4255xt.A02);
        }
        C4255XT A06 = c4255xt.A06(AbstractC2977CJ.A0n);
        SparseArray<C2983CP> sparseArray = new SparseArray<>();
        long j10 = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4254XS c4254xs = A06.A02.get(i10);
            if (((AbstractC2977CJ) c4254xs).A00 == AbstractC2977CJ.A1N) {
                Pair<Integer, C2983CP> A03 = A03(c4254xs.A00);
                sparseArray.put(((Integer) A03.first).intValue(), (C2983CP) A03.second);
            } else if (((AbstractC2977CJ) c4254xs).A00 == AbstractC2977CJ.A0g) {
                j10 = A01(c4254xs.A00);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c4255xt.A01.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C4255XT c4255xt2 = c4255xt.A01.get(i11);
            if (((AbstractC2977CJ) c4255xt2).A00 == AbstractC2977CJ.A1M) {
                C2994Ce A0C = AbstractC2982CO.A0C(c4255xt2, c4255xt.A07(AbstractC2977CJ.A0o), j10, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    sparseArray2.put(A0C.A00, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() != 0) {
            AbstractC3281Ha.A04(this.A0K.size() == size3);
            for (int i12 = 0; i12 < size3; i12++) {
                C2994Ce c2994Ce = (C2994Ce) sparseArray2.valueAt(i12);
                this.A0K.get(c2994Ce.A00).A07(c2994Ce, A06(sparseArray, c2994Ce.A00));
            }
            return;
        }
        for (int i13 = 0; i13 < size3; i13++) {
            C2994Ce c2994Ce2 = (C2994Ce) sparseArray2.valueAt(i13);
            C2988CV c2988cv = new C2988CV(this.A0C.AGi(i13, c2994Ce2.A03));
            c2988cv.A07(c2994Ce2, A06(sparseArray, c2994Ce2.A00));
            this.A0K.put(c2994Ce2.A00, c2988cv);
            this.A08 = Math.max(this.A08, c2994Ce2.A04);
        }
        A0C();
        this.A0C.A5Y();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A0M(C4255XT c4255xt, SparseArray<C2988CV> sparseArray, int i10, byte[] bArr) throws C28319v {
        C2988CV A09 = A09(c4255xt.A07(AbstractC2977CJ.A1J).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        C2996Cg c2996Cg = A09.A07;
        long j10 = c2996Cg.A06;
        A09.A04();
        if (c4255xt.A07(AbstractC2977CJ.A1I) != null && (i10 & 2) == 0) {
            j10 = A02(c4255xt.A07(AbstractC2977CJ.A1I).A00);
        }
        A0N(c4255xt, A09, j10, i10);
        C2995Cf A00 = A09.A05.A00(c2996Cg.A07.A02);
        C4254XS A07 = c4255xt.A07(AbstractC2977CJ.A0v);
        if (A07 != null) {
            A0P(A00, A07.A00, c2996Cg);
        }
        C4254XS A072 = c4255xt.A07(AbstractC2977CJ.A0u);
        if (A072 != null) {
            A0S(A072.A00, c2996Cg);
        }
        C4254XS A073 = c4255xt.A07(AbstractC2977CJ.A11);
        if (A073 != null) {
            A0T(A073.A00, c2996Cg);
        }
        C4254XS A074 = c4255xt.A07(AbstractC2977CJ.A0y);
        C4254XS A075 = c4255xt.A07(AbstractC2977CJ.A12);
        if (A074 != null && A075 != null) {
            A0V(A074.A00, A075.A00, A00 != null ? A00.A02 : null, c2996Cg);
        }
        int size = c4255xt.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4254XS c4254xs = c4255xt.A02.get(i11);
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "89j";
            C4254XS c4254xs2 = c4254xs;
            if (((AbstractC2977CJ) c4254xs2).A00 == AbstractC2977CJ.A1R) {
                A0U(c4254xs2.A00, c2996Cg, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0P(C2995Cf c2995Cf, C3306Hz c3306Hz, C2996Cg c2996Cg) throws C28319v {
        int i10 = c2995Cf.A00;
        c3306Hz.A0Y(8);
        if ((AbstractC2977CJ.A00(c3306Hz.A08()) & 1) == 1) {
            c3306Hz.A0Z(8);
        }
        int A0E = c3306Hz.A0E();
        int A0H = c3306Hz.A0H();
        if (A0H != c2996Cg.A00) {
            throw new C28319v(A0A(290, 17, 20) + A0H + A0A(0, 2, 62) + c2996Cg.A00);
        }
        int i11 = 0;
        if (A0E == 0) {
            boolean[] zArr = c2996Cg.A0H;
            for (int i12 = 0; i12 < A0H; i12++) {
                int A0E2 = c3306Hz.A0E();
                i11 += A0E2;
                zArr[i12] = A0E2 > i10;
            }
        } else {
            i11 = 0 + (A0E * A0H);
            Arrays.fill(c2996Cg.A0H, 0, A0H, A0E > i10);
        }
        c2996Cg.A02(i11);
        if (A0Y[6].length() == 17) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[2] = "tC3WLCXP6DZ";
        strArr[4] = "0Zxl8CEli3D";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C3306Hz c3306Hz, C3306Hz c3306Hz2, String str, C2996Cg c2996Cg) throws C28319v {
        c3306Hz.A0Y(8);
        int A08 = c3306Hz.A08();
        int A082 = c3306Hz.A08();
        int i10 = A0a;
        if (A082 != i10) {
            return;
        }
        if (AbstractC2977CJ.A01(A08) == 1) {
            c3306Hz.A0Z(4);
        }
        if (c3306Hz.A08() != 1) {
            throw new C28319v(A0A(50, 39, 80));
        }
        c3306Hz2.A0Y(8);
        int A083 = c3306Hz2.A08();
        if (c3306Hz2.A08() != i10) {
            return;
        }
        int A01 = AbstractC2977CJ.A01(A083);
        if (A01 == 1) {
            if (c3306Hz2.A0M() == 0) {
                throw new C28319v(A0A(609, 55, 11));
            }
        } else if (A01 >= 2) {
            c3306Hz2.A0Z(4);
        }
        if (c3306Hz2.A0M() != 1) {
            throw new C28319v(A0A(89, 39, 85));
        }
        c3306Hz2.A0Z(1);
        int A0E = c3306Hz2.A0E();
        int i11 = (A0E & 240) >> 4;
        int i12 = A0E & 15;
        boolean z10 = c3306Hz2.A0E() == 1;
        if (z10) {
            int A0E2 = c3306Hz2.A0E();
            byte[] bArr = new byte[16];
            c3306Hz2.A0c(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (z10 && A0E2 == 0) {
                int A0E3 = c3306Hz2.A0E();
                bArr2 = new byte[A0E3];
                c3306Hz2.A0c(bArr2, 0, A0E3);
            }
            c2996Cg.A0A = true;
            c2996Cg.A08 = new C2995Cf(z10, str, A0E2, bArr, i11, i12, bArr2);
        }
    }

    static {
        A0D();
        A0Z = new C4250XO();
        A0a = AbstractC3322IF.A08(A0A(682, 4, 23));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 25), Long.MAX_VALUE);
    }

    public C4249XN() {
        this(0);
    }

    public C4249XN(int i10) {
        this(i10, null);
    }

    public C4249XN(int i10, C3318IB c3318ib) {
        this(i10, c3318ib, null, null);
    }

    public C4249XN(int i10, C3318IB c3318ib, C2994Ce c2994Ce, DrmInitData drmInitData) {
        this(i10, c3318ib, c2994Ce, drmInitData, Collections.emptyList());
    }

    public C4249XN(int i10, C3318IB c3318ib, C2994Ce c2994Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i10, c3318ib, c2994Ce, drmInitData, closedCaptionFormats, null);
    }

    public C4249XN(int i10, C3318IB c3318ib, C2994Ce c2994Ce, DrmInitData drmInitData, List<Format> closedCaptionFormats, InterfaceC2962C4 interfaceC2962C4) {
        this.A0J = (c2994Ce != null ? 8 : 0) | i10;
        this.A0S = c3318ib;
        this.A0N = c2994Ce;
        this.A0L = drmInitData;
        this.A0V = Collections.unmodifiableList(closedCaptionFormats);
        this.A0M = interfaceC2962C4;
        this.A0O = new C3306Hz(16);
        this.A0R = new C3306Hz(AbstractC3302Hv.A03);
        this.A0Q = new C3306Hz(5);
        this.A0P = new C3306Hz();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    public static long A01(C3306Hz c3306Hz) {
        c3306Hz.A0Y(8);
        int fullAtom = c3306Hz.A08();
        return AbstractC2977CJ.A01(fullAtom) == 0 ? c3306Hz.A0M() : c3306Hz.A0N();
    }

    public static long A02(C3306Hz c3306Hz) {
        c3306Hz.A0Y(8);
        int fullAtom = c3306Hz.A08();
        int version = AbstractC2977CJ.A01(fullAtom);
        return version == 1 ? c3306Hz.A0N() : c3306Hz.A0M();
    }

    public static Pair<Integer, C2983CP> A03(C3306Hz c3306Hz) {
        c3306Hz.A0Y(12);
        int defaultSampleDescriptionIndex = c3306Hz.A08();
        int trackId = c3306Hz.A0H();
        int defaultSampleFlags = c3306Hz.A0H();
        int defaultSampleSize = c3306Hz.A0H();
        int defaultSampleDuration = c3306Hz.A08();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new C2983CP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C4254XS> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4254XS c4254xs = list.get(i10);
            int leafChildrenSize = ((AbstractC2977CJ) c4254xs).A00;
            if (leafChildrenSize == AbstractC2977CJ.A0s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c4254xs.A00.A00;
                UUID A02 = AbstractC2992Cb.A02(bArr);
                int leafChildrenSize2 = A0Y[3].length();
                if (leafChildrenSize2 != 6) {
                    throw new RuntimeException();
                }
                A0Y[7] = "tzO";
                if (A02 == null) {
                    Log.w(A0A(RecognitionOptions.ITF, 22, 24), A0A(437, 42, 58));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A02, A0A(696, 9, 23), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C2983CP A06(SparseArray<C2983CP> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (C2983CP) AbstractC3281Ha.A01(sparseArray.get(i10));
    }

    public static C2988CV A07(SparseArray<C2988CV> sparseArray) {
        C2988CV c2988cv = null;
        long trunOffset = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2988CV valueAt = sparseArray.valueAt(i10);
            int i11 = valueAt.A02;
            if (A0Y[1].length() == 5) {
                throw new RuntimeException();
            }
            A0Y[0] = "VXm0n";
            if (i11 != valueAt.A07.A02) {
                long nextTrackRunOffset = valueAt.A07.A0G[valueAt.A02];
                if (nextTrackRunOffset < trunOffset) {
                    c2988cv = valueAt;
                    trunOffset = nextTrackRunOffset;
                }
            }
        }
        return c2988cv;
    }

    public static C2988CV A08(SparseArray<C2988CV> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0068 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            if (r0 != 0) goto L42
            r0 = 2
            com.facebook.ads.redexgen.X.C4[] r5 = new com.facebook.ads.redexgen.uinode.InterfaceC2962C4[r0]
            r6.A0I = r5
            r4 = 0
            com.facebook.ads.redexgen.X.C4 r1 = r6.A0M
            if (r1 == 0) goto L13
            int r0 = r4 + 1
            r5[r4] = r1
            r4 = r0
        L13:
            int r0 = r6.A0J
            r3 = 4
            r0 = r0 & r3
            if (r0 == 0) goto L2a
            int r2 = r4 + 1
            com.facebook.ads.redexgen.X.Bu r1 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4 r0 = r1.AGi(r0, r3)
            r5[r4] = r0
            r4 = r2
        L2a:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0I
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r4)
            com.facebook.ads.redexgen.X.C4[] r4 = (com.facebook.ads.redexgen.uinode.InterfaceC2962C4[]) r4
            r6.A0I = r4
            int r3 = r4.length
            r2 = 0
        L36:
            if (r2 >= r3) goto L42
            r1 = r4[r2]
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = com.facebook.ads.redexgen.uinode.C4249XN.A0b
            r1.A5n(r0)
            int r2 = r2 + 1
            goto L36
        L42:
            com.facebook.ads.redexgen.X.C4[] r3 = r6.A0H
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C4249XN.A0Y
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4249XN.A0Y
            java.lang.String r1 = "8HQd7O"
            r0 = 3
            r2[r0] = r1
            if (r3 != 0) goto L8c
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.C4[] r0 = new com.facebook.ads.redexgen.uinode.InterfaceC2962C4[r0]
            r6.A0H = r0
            r3 = 0
        L65:
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            int r0 = r0.length
            if (r3 >= r0) goto L8c
            com.facebook.ads.redexgen.X.Bu r2 = r6.A0C
            android.util.SparseArray<com.facebook.ads.redexgen.X.CV> r0 = r6.A0K
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.C4 r1 = r2.AGi(r1, r0)
            java.util.List<com.facebook.ads.internal.exoplayer2.thirdparty.Format> r0 = r6.A0V
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = (com.facebook.ads.internal.exoplayer2.thirdparty.Format) r0
            r1.A5n(r0)
            com.facebook.ads.redexgen.X.C4[] r0 = r6.A0H
            r0[r3] = r1
            int r3 = r3 + 1
            goto L65
        L8c:
            return
        L8d:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4249XN.A0C():void");
    }

    private void A0E(long j10) {
        while (!this.A0U.isEmpty()) {
            C2987CU removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j11 = j10 + removeFirst.A01;
            C3318IB c3318ib = this.A0S;
            if (c3318ib != null) {
                j11 = c3318ib.A06(j11);
            }
            InterfaceC2962C4[] interfaceC2962C4Arr = this.A0I;
            if (A0Y[7].length() != 3) {
                throw new RuntimeException();
            }
            A0Y[7] = "ltl";
            for (InterfaceC2962C4 interfaceC2962C4 : interfaceC2962C4Arr) {
                interfaceC2962C4.AFS(j11, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C28319v {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j10) {
            A0I(this.A0T.pop());
        }
        A0B();
    }

    private void A0G(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        int i10 = ((int) this.A07) - this.A00;
        C3306Hz c3306Hz = this.A0E;
        if (c3306Hz != null) {
            interfaceC2951Bt.readFully(c3306Hz.A00, 8, i10);
            int atomPayloadSize = this.A01;
            A0O(new C4254XS(atomPayloadSize, this.A0E), interfaceC2951Bt.A7i());
        } else {
            interfaceC2951Bt.AGP(i10);
        }
        A0F(interfaceC2951Bt.A7i());
        String[] strArr = A0Y;
        String str = strArr[2];
        String str2 = strArr[4];
        int atomPayloadSize2 = str.length();
        if (atomPayloadSize2 != str2.length()) {
            throw new RuntimeException();
        }
        A0Y[1] = "jmSEpbOdW733bHBoDHkBty1cmj";
    }

    private void A0H(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        C2988CV c2988cv = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2988CV nextTrackBundle = this.A0K.valueAt(i10);
            C2996Cg c2996Cg = nextTrackBundle.A07;
            if (c2996Cg.A0B && c2996Cg.A04 < j10) {
                j10 = c2996Cg.A04;
                c2988cv = this.A0K.valueAt(i10);
            }
        }
        if (c2988cv == null) {
            this.A02 = 3;
            return;
        }
        int A7i = (int) (j10 - interfaceC2951Bt.A7i());
        if (A7i >= 0) {
            interfaceC2951Bt.AGP(A7i);
            c2988cv.A07.A04(interfaceC2951Bt);
            return;
        }
        throw new C28319v(A0A(307, 39, 39));
    }

    private void A0I(C4255XT c4255xt) throws C28319v {
        if (((AbstractC2977CJ) c4255xt).A00 == AbstractC2977CJ.A0k) {
            A0K(c4255xt);
            return;
        }
        int i10 = ((AbstractC2977CJ) c4255xt).A00;
        int i11 = AbstractC2977CJ.A0j;
        String[] strArr = A0Y;
        if (strArr[2].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0Y[6] = "QeKmRdkmErMZReeQj8";
        if (i10 == i11) {
            A0J(c4255xt);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        C4255XT peek = this.A0T.peek();
        if (A0Y[6].length() != 17) {
            A0Y[1] = "g8UpS1NyodMZ5eBXtPatKQwsoR";
            peek.A08(c4255xt);
        } else {
            A0Y[5] = "mkv5is6F5Mu6y6USr0b4mkDGodGLaqlp";
            peek.A08(c4255xt);
        }
    }

    private void A0J(C4255XT c4255xt) throws C28319v {
        DrmInitData A05;
        A0L(c4255xt, this.A0K, this.A0J, this.A0W);
        if (this.A0L != null) {
            A05 = null;
        } else {
            List<C4254XS> list = c4255xt.A02;
            int trackCount = A0Y[3].length();
            if (trackCount != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[2] = "YTpzURZBrt0";
            strArr[4] = "jDJUPBNch9x";
            A05 = A05(list);
        }
        if (A05 != null) {
            int i10 = this.A0K.size();
            for (int trackCount2 = 0; trackCount2 < i10; trackCount2++) {
                this.A0K.valueAt(trackCount2).A06(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0K.valueAt(i11).A05(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    public static void A0L(C4255XT c4255xt, SparseArray<C2988CV> sparseArray, int i10, byte[] bArr) throws C28319v {
        int size = c4255xt.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4255XT child = c4255xt.A01.get(i11);
            int i12 = ((AbstractC2977CJ) child).A00;
            int moofContainerChildrenSize = AbstractC2977CJ.A1L;
            if (i12 == moofContainerChildrenSize) {
                A0M(child, sparseArray, i10, bArr);
            }
        }
    }

    public static void A0N(C4255XT c4255xt, C2988CV c2988cv, long j10, int totalSampleCount) {
        int i10 = 0;
        int i11 = 0;
        List<C4254XS> list = c4255xt.A02;
        int size = list.size();
        for (int trunSampleCount = 0; trunSampleCount < size; trunSampleCount++) {
            C4254XS c4254xs = list.get(trunSampleCount);
            if (((AbstractC2977CJ) c4254xs).A00 == AbstractC2977CJ.A1O) {
                C3306Hz trunData = c4254xs.A00;
                trunData.A0Y(12);
                int A0H = trunData.A0H();
                if (A0H > 0) {
                    i11 += A0H;
                    i10++;
                }
            }
        }
        c2988cv.A02 = 0;
        c2988cv.A00 = 0;
        c2988cv.A01 = 0;
        c2988cv.A07.A03(i10, i11);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            C4254XS c4254xs2 = list.get(i14);
            int trunIndex = ((AbstractC2977CJ) c4254xs2).A00;
            if (trunIndex == AbstractC2977CJ.A1O) {
                i13 = A00(c2988cv, i12, j10, totalSampleCount, c4254xs2.A00, i13);
                i12++;
            }
        }
    }

    private void A0O(C4254XS c4254xs, long j10) throws C28319v {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(c4254xs);
            return;
        }
        if (((AbstractC2977CJ) c4254xs).A00 == AbstractC2977CJ.A13) {
            Pair<Long, C4276Xo> A04 = A04(c4254xs.A00, j10);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.AFi((InterfaceC2959C1) A04.second);
            this.A0F = true;
            return;
        }
        if (((AbstractC2977CJ) c4254xs).A00 != AbstractC2977CJ.A0Q) {
            return;
        }
        A0Q(c4254xs.A00);
    }

    private void A0Q(C3306Hz c3306Hz) {
        InterfaceC2962C4[] interfaceC2962C4Arr = this.A0I;
        if (interfaceC2962C4Arr == null || interfaceC2962C4Arr.length == 0) {
            return;
        }
        c3306Hz.A0Y(12);
        int sampleSize = c3306Hz.A04();
        c3306Hz.A0Q();
        c3306Hz.A0Q();
        long A0M = c3306Hz.A0M();
        long timescale = c3306Hz.A0M();
        long A0F = AbstractC3322IF.A0F(timescale, 1000000L, A0M);
        for (InterfaceC2962C4 interfaceC2962C4 : this.A0I) {
            c3306Hz.A0Y(12);
            interfaceC2962C4.AFR(c3306Hz, sampleSize);
        }
        long j10 = this.A0B;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + A0F;
            C3318IB c3318ib = this.A0S;
            if (c3318ib != null) {
                j11 = c3318ib.A06(j11);
            }
            for (InterfaceC2962C4 interfaceC2962C42 : this.A0I) {
                interfaceC2962C42.AFS(j11, 1, sampleSize, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C2987CU(A0F, sampleSize));
        this.A03 += sampleSize;
    }

    public static void A0R(C3306Hz c3306Hz, int i10, C2996Cg c2996Cg) throws C28319v {
        c3306Hz.A0Y(i10 + 8);
        int fullAtom = c3306Hz.A08();
        int flags = AbstractC2977CJ.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c3306Hz.A0H();
            int fullAtom4 = c2996Cg.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(c2996Cg.A0H, 0, sampleCount, z10);
                int fullAtom5 = c3306Hz.A04();
                c2996Cg.A02(fullAtom5);
                c2996Cg.A05(c3306Hz);
                return;
            }
            StringBuilder append = new StringBuilder().append(A0A(290, 17, 20)).append(sampleCount).append(A0A(0, 2, 62));
            int fullAtom6 = c2996Cg.A00;
            throw new C28319v(append.append(fullAtom6).toString());
        }
        throw new C28319v(A0A(381, 56, 66));
    }

    public static void A0S(C3306Hz c3306Hz, C2996Cg c2996Cg) throws C28319v {
        c3306Hz.A0Y(8);
        int flags = c3306Hz.A08();
        int fullAtom = AbstractC2977CJ.A00(flags) & 1;
        if (fullAtom == 1) {
            c3306Hz.A0Z(8);
        }
        int A0H = c3306Hz.A0H();
        if (A0H == 1) {
            int entryCount = AbstractC2977CJ.A01(flags);
            c2996Cg.A04 += entryCount == 0 ? c3306Hz.A0M() : c3306Hz.A0N();
            return;
        }
        throw new C28319v(A0A(552, 29, 63) + A0H);
    }

    public static void A0T(C3306Hz c3306Hz, C2996Cg c2996Cg) throws C28319v {
        A0R(c3306Hz, 0, c2996Cg);
    }

    public static void A0U(C3306Hz c3306Hz, C2996Cg c2996Cg, byte[] bArr) throws C28319v {
        c3306Hz.A0Y(8);
        c3306Hz.A0c(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0R(c3306Hz, 16, c2996Cg);
    }

    public static boolean A0W(int i10) {
        return i10 == AbstractC2977CJ.A0k || i10 == AbstractC2977CJ.A1M || i10 == AbstractC2977CJ.A0e || i10 == AbstractC2977CJ.A0i || i10 == AbstractC2977CJ.A17 || i10 == AbstractC2977CJ.A0j || i10 == AbstractC2977CJ.A1L || i10 == AbstractC2977CJ.A0n || i10 == AbstractC2977CJ.A0O;
    }

    public static boolean A0X(int i10) {
        if (i10 != AbstractC2977CJ.A0W && i10 != AbstractC2977CJ.A0d && i10 != AbstractC2977CJ.A0o && i10 != AbstractC2977CJ.A13 && i10 != AbstractC2977CJ.A1B) {
            int i11 = AbstractC2977CJ.A1I;
            if (A0Y[6].length() != 17) {
                A0Y[0] = "0bfDB";
                if (i10 != i11 && i10 != AbstractC2977CJ.A1J && i10 != AbstractC2977CJ.A1K && i10 != AbstractC2977CJ.A1N && i10 != AbstractC2977CJ.A1O && i10 != AbstractC2977CJ.A0s && i10 != AbstractC2977CJ.A0v) {
                    int i12 = AbstractC2977CJ.A0u;
                    if (A0Y[1].length() != 5) {
                        A0Y[5] = "GM1eDi9JpLsxcWxFcWWsCjSZthCJdr4f";
                        if (i10 != i12 && i10 != AbstractC2977CJ.A11 && i10 != AbstractC2977CJ.A1R && i10 != AbstractC2977CJ.A0y && i10 != AbstractC2977CJ.A12 && i10 != AbstractC2977CJ.A0P) {
                            int i13 = AbstractC2977CJ.A0g;
                            if (A0Y[3].length() == 6) {
                                A0Y[7] = "Eu3";
                                if (i10 != i13 && i10 != AbstractC2977CJ.A0Q) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        r0 = r11.A7i() - r10.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.uinode.AbstractC2977CJ.A0j) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        r9 = r10.A0K.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if (r8 >= r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r2 = r10.A0K.valueAt(r8).A07;
        r2.A03 = r0;
        r2.A04 = r0;
        r2.A05 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C4249XN.A0Y[3].length() == 6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        com.facebook.ads.redexgen.uinode.C4249XN.A0Y[0] = "GrBVN";
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
    
        r7 = com.facebook.ads.redexgen.uinode.C4249XN.A0Y;
        r7[2] = "tKeeSnEBB5V";
        r7[4] = "1ppH9MP2kpM";
        r8 = r8 + 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        if (r10.A01 != com.facebook.ads.redexgen.uinode.AbstractC2977CJ.A0c) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012e, code lost:
    
        r10.A0D = null;
        r10.A09 = r10.A07 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0137, code lost:
    
        if (r10.A0F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0139, code lost:
    
        r10.A0C.AFi(new com.facebook.ads.redexgen.uinode.C4271Xj(r10.A08, r0));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0147, code lost:
    
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x014a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0151, code lost:
    
        if (A0W(r10.A01) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0153, code lost:
    
        r5 = (r11.A7i() + r10.A07) - 8;
        r10.A0T.push(new com.facebook.ads.redexgen.uinode.C4255XT(r10.A01, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0170, code lost:
    
        if (r10.A07 != r10.A00) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0172, code lost:
    
        A0F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01dd, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0192, code lost:
    
        if (A0X(r10.A01) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0194, code lost:
    
        r3 = r10.A00;
        r2 = com.facebook.ads.redexgen.uinode.C4249XN.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01a6, code lost:
    
        if (r2[2].length() == r2[4].length()) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01b9, code lost:
    
        com.facebook.ads.redexgen.uinode.C4249XN.A0Y[7] = "6Yw";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c0, code lost:
    
        if (r3 != 8) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
    
        r2 = r10.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c6, code lost:
    
        if (r2 > 2147483647L) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c8, code lost:
    
        r10.A0E = new com.facebook.ads.redexgen.uinode.C3306Hz((int) r2);
        java.lang.System.arraycopy(r10.A0O.A00, 0, r10.A0E.A00, 0, 8);
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ed, code lost:
    
        throw new com.facebook.ads.redexgen.uinode.C28319v(A0A(241, 49, 53));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fd, code lost:
    
        throw new com.facebook.ads.redexgen.uinode.C28319v(A0A(190, 51, 24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b2, code lost:
    
        if (r10.A07 > 2147483647L) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b4, code lost:
    
        r10.A0E = null;
        r10.A02 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020c, code lost:
    
        throw new com.facebook.ads.redexgen.uinode.C28319v(A0A(479, 53, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0188, code lost:
    
        throw new com.facebook.ads.redexgen.uinode.C28319v(A0A(2, 48, 114));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
    
        if (r2 >= r8) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Y(com.facebook.ads.redexgen.uinode.InterfaceC2951Bt r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4249XN.A0Y(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        r1 = r0.A06(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010d, code lost:
    
        if (r6.A01 == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
    
        r9 = r18.A0Q.A00;
        r9[0] = 0;
        r9[1] = 0;
        r9[2] = 0;
        r8 = r6.A01 + 1;
        r17 = 4 - r6.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        if (r18.A04 >= r18.A06) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r15 = r18.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0135, code lost:
    
        if (com.facebook.ads.redexgen.uinode.C4249XN.A0Y[1].length() == 5) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0137, code lost:
    
        r16 = com.facebook.ads.redexgen.uinode.C4249XN.A0Y;
        r16[2] = "oY9Cfc6NZLH";
        r16[4] = "IHvoiGll8tT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0143, code lost:
    
        if (r15 != 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018f, code lost:
    
        if (r18.A0G == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0191, code lost:
    
        r18.A0P.A0W(r15);
        r19.readFully(r18.A0P.A00, r12, r18.A05);
        r5.AFR(r18.A0P, r18.A05);
        r3 = r18.A05;
        r15 = com.facebook.ads.redexgen.uinode.AbstractC3302Hv.A02(r18.A0P.A00, r18.A0P.A07());
        r18.A0P.A0Y(A0A(686, 10, 6).equals(r6.A07.A0O) ? 1 : 0);
        r18.A0P.A0X(r15);
        com.facebook.ads.redexgen.uinode.AbstractC3183Fy.A03(r1, r18.A0P, r18.A0H);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        r18.A04 += r3;
        r18.A05 -= r3;
        r14 = 4;
        r13 = 1;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ec, code lost:
    
        r3 = r5.AFQ(r19, r15, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r19.readFully(r9, r17, r8);
        r18.A0Q.A0Y(r12);
        r18.A05 = r18.A0Q.A0H() - r13;
        r18.A0R.A0Y(r12);
        r5.AFR(r18.A0R, r14);
        r5.AFR(r18.A0Q, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        if (r18.A0H.length <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0176, code lost:
    
        if (com.facebook.ads.redexgen.uinode.AbstractC3302Hv.A0C(r6.A07.A0O, r9[r14]) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        r18.A0G = r0;
        r18.A04 += 5;
        r18.A06 += r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0188, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        if (r15 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0222, code lost:
    
        r11 = r10.A0I[r4];
        r8 = null;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0229, code lost:
    
        if (r10.A0A == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022b, code lost:
    
        r11 = (r11 ? 1 : 0) | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        if (r10.A08 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0232, code lost:
    
        r0 = r10.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0234, code lost:
    
        r8 = r0.A01;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0254, code lost:
    
        r0 = r6.A00(r10.A07.A02);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0236, code lost:
    
        r14 = r8;
        r5.AFS(r1, r11, r18.A06, 0, r14);
        A0E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024a, code lost:
    
        if (r18.A0D.A08() != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024c, code lost:
    
        r18.A0D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024f, code lost:
    
        r18.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0253, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0210, code lost:
    
        r0 = r18.A04;
        r3 = r18.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0214, code lost:
    
        if (r0 >= r3) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0216, code lost:
    
        r18.A04 += r5.AFQ(r19, r3 - r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
    
        if (r0 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.uinode.InterfaceC2951Bt r19) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4249XN.A0Z(com.facebook.ads.redexgen.X.Bt):boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void A8o(InterfaceC2952Bu interfaceC2952Bu) {
        this.A0C = interfaceC2952Bu;
        C2994Ce c2994Ce = this.A0N;
        if (c2994Ce != null) {
            C2988CV c2988cv = new C2988CV(interfaceC2952Bu.AGi(0, c2994Ce.A03));
            c2988cv.A07(this.A0N, new C2983CP(0, 0, 0, 0));
            this.A0K.put(0, c2988cv);
            A0C();
            this.A0C.A5Y();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final int AEH(InterfaceC2951Bt interfaceC2951Bt, C2957Bz c2957Bz) throws IOException, InterruptedException {
        while (true) {
            int i10 = this.A02;
            if (A0Y[6].length() != 17) {
                A0Y[6] = "Adcvl3OLLWBEEjCvRjB7l1tHvWvuGk";
                switch (i10) {
                    case 0:
                        if (!A0Y(interfaceC2951Bt)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0G(interfaceC2951Bt);
                        break;
                    case 2:
                        A0H(interfaceC2951Bt);
                        break;
                    default:
                        if (!A0Z(interfaceC2951Bt)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final void AFh(long j10, long j11) {
        int size = this.A0K.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0K.valueAt(i10).A04();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j11;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2950Bs
    public final boolean AGR(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        return AbstractC2993Cc.A03(interfaceC2951Bt);
    }
}
