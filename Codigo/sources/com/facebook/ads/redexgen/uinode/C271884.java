package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.84 */
/* loaded from: assets/audience_network.dex */
public final class C271884 {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C271985> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<InterfaceC271682> A0A;
    public static final AtomicReference<InterfaceC271783> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -58, -49, -62, -41, -56, -42, -41, -4, -3, -9, 4, 7, -1, -1, 1, 6, -1, -52, -37, -44, -44, -53, -46, -41, -34, -47, -51, -28, -49, -38, -41, -46, -49, -30, -41, -35, -36, 0, -9, 6, 9, 1, 4, -3};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, Integer.valueOf(AdError.NETWORK_ERROR_CODE));
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>(false);
        A02 = false;
    }

    public static int A00(String str, int i10, C26937f c26937f) {
        if ((A01(465, 7, 107).equals(str) && AbstractC27248A.A20 == i10) || A01(422, 5, 56).equals(str) || A01(445, 6, 63).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return AbstractC3350Ij.A05(c26937f);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C271985> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
        return list;
    }

    public static void A05(C26937f c26937f, int i10, int i11) {
        c26937f.A07().A9a(A01(435, 10, 113), AbstractC27248A.A2X, new C27258B(A01(338, 33, 80) + i10, A01(87, 9, 13) + i11));
    }

    @Deprecated
    public static void A06(C26937f c26937f, String str, int i10, C27258B c27258b) {
        if (c26937f == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        AbstractC26927e.A01(c26937f.A01());
        if (A02 && c27258b.A01() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i10, c27258b));
        }
        try {
            if (A0J(c26937f, str, i10, Math.random(), c27258b)) {
                A09(c26937f, str, i10, c27258b);
            }
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    @Deprecated
    public static void A07(C26937f c26937f, String str, int i10, C27258B c27258b) {
        try {
            c27258b.A05(2);
            c27258b.A0A(false);
            c27258b.A06(1);
            if (AbstractC3350Ij.A0Q(c26937f)) {
                c27258b.A08(true);
            } else {
                c27258b.A08(false);
            }
            A06(c26937f, str, i10, c27258b);
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    @Deprecated
    public static void A08(C26937f c26937f, String str, int i10, C27258B c27258b) {
        try {
            c27258b.A05(2);
            c27258b.A08(false);
            A06(c26937f, str, i10, c27258b);
        } catch (Throwable t10) {
            A0F(t10);
        }
    }

    public static void A09(C26937f c26937f, String str, int i10, C27258B c27258b) {
        synchronized (C271884.class) {
            if (!A03) {
                int A012 = AbstractC3350Ij.A01(c26937f);
                AtomicInteger atomicInteger = A09;
                int threshold = atomicInteger.getAndIncrement();
                if (threshold < A012 - 1) {
                    A07.add(new C271985(str, i10, c27258b));
                } else if (atomicInteger.get() == A012) {
                    A07.add(new C271985(A01(435, 10, 113), AbstractC27248A.A2U, new C27258B(A01(140, 42, 0) + str + A01(47, 1, 19) + i10)));
                }
            } else {
                A0A(c26937f, str, i10, c27258b, true);
            }
        }
    }

    public static void A0A(C26937f c26937f, String str, int i10, C27258B c27258b, boolean z10) {
        InterfaceC271783 interfaceC271783 = A0B.get();
        boolean z11 = interfaceC271783 != null && interfaceC271783.A9G();
        if (A08.get() || z11) {
            int A012 = c27258b.A01();
            String A013 = A01(289, 17, 46);
            String A014 = A01(31, 16, 8);
            if (A012 == 0) {
                Log.e(A013, A01(182, 37, 40) + str + A014 + i10, c27258b);
            } else {
                Log.i(A013, A01(306, 32, 116) + str + A014 + i10 + A01(19, 12, 63) + c27258b.getMessage() + A01(0, 19, 80) + c27258b.A03());
            }
        }
        C4328Ye c4328Ye = new C4328Ye(c26937f, str, i10, c27258b, interfaceC271783);
        if (z10) {
            A01.execute(c4328Ye);
        } else {
            c4328Ye.run();
        }
    }

    public static void A0C(C4336Ym c4336Ym, InterfaceC271783 interfaceC271783, InterfaceC271682 interfaceC271682, boolean z10) {
        A0A.set(interfaceC271682);
        A0B.set(interfaceC271783);
        A08.set(z10);
        synchronized (C271884.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C4329Yf(c4336Ym));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.81
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th2) {
        if (A02) {
            A0D(new RuntimeException(A01(RecognitionOptions.QR_CODE, 33, 121), th2));
        }
    }

    public static void A0F(Throwable th2) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th2);
        if (A02) {
            A0D(new RuntimeException(th2));
        }
    }

    public static boolean A0H(C26937f c26937f) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        return (shouldSkipFunnelEventsForSession == null || !shouldSkipFunnelEventsForSession.booleanValue()) && AbstractC3350Ij.A0A(c26937f) != 0;
    }

    public static boolean A0I(C26937f c26937f) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        if (shouldSkipFunnelEventsForSession != null && shouldSkipFunnelEventsForSession.booleanValue()) {
            return false;
        }
        double funnelEventLogProbability = 1.0d / AbstractC3350Ij.A0A(c26937f);
        return c26937f.A08().A00() <= funnelEventLogProbability;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c5, code lost:
    
        if (r10 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ca, code lost:
    
        if (r8 > (r6 * r2)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01cc, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e0, code lost:
    
        if (r8 > r6) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e2, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01db, code lost:
    
        if (r10 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
    
        if (r15 < (1.0d - r2)) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(com.facebook.ads.redexgen.uinode.C26937f r12, java.lang.String r13, int r14, double r15, com.facebook.ads.redexgen.uinode.C27258B r17) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C271884.A0J(com.facebook.ads.redexgen.X.7f, java.lang.String, int, double, com.facebook.ads.redexgen.X.8B):boolean");
    }

    public static boolean A0K(C26937f c26937f, String str, int i10, C27258B c27258b) {
        if (!AbstractC3350Ij.A0P(c26937f)) {
            return true;
        }
        int customLimit = A00.get(i10);
        int eventsLimit = AbstractC3350Ij.A00(c26937f);
        if (c27258b.A02() != -1) {
            eventsLimit = c27258b.A02();
        } else {
            int currentCounter = A00(str, i10, c26937f);
            if (eventsLimit < currentCounter) {
                eventsLimit = currentCounter;
            }
        }
        if (customLimit >= eventsLimit) {
            if (A06.contains(Integer.valueOf(customLimit))) {
                boolean A0D = c27258b.A0D();
                if (A05[3].charAt(3) != 'Y') {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[5] = "DtDXz8TrFQQZw1pkgy";
                strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                if (A0D) {
                    A05(c26937f, i10, customLimit);
                }
            }
            A00.put(i10, customLimit + 1);
            return true;
        }
        A00.put(i10, customLimit + 1);
        return false;
    }
}