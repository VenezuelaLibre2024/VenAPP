package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:46:0x00ae */
    public static long A00(C0954Gy c0954Gy, long j10, long j11, InterfaceC0950Gu interfaceC0950Gu, byte[] bArr, I3 i32, int i10, HP hp) throws IOException, InterruptedException {
        InterfaceC0950Gu interfaceC0950Gu2;
        while (true) {
            if (i32 != null) {
                i32.A01(i10);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC0950Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0954Gy c0954Gy2 = new C0954Gy(c0954Gy.A04, c0954Gy.A06, j10, (c0954Gy.A03 + j10) - c0954Gy.A01, -1L, c0954Gy.A05, c0954Gy.A00 | 2);
        long ADl = interfaceC0950Gu2.ADl(c0954Gy2);
        if (hp.A01 == -1 && ADl != -1) {
            hp.A01 = c0954Gy2.A01 + ADl;
        }
        long j12 = 0;
        while (true) {
            if (j12 == j11) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC0950Gu2.read(bArr, 0, j11 != -1 ? (int) Math.min(bArr.length, j11 - j12) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j12 += read;
                hp.A02 += read;
            } else if (hp.A01 == -1) {
                hp.A01 = c0954Gy2.A01 + j12;
            }
        }
        return j12;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0954Gy c0954Gy) {
        if (c0954Gy.A05 != null) {
            return c0954Gy.A05;
        }
        Uri uri = c0954Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0954Gy c0954Gy, HK hk2, C1321Vk c1321Vk, byte[] bArr, I3 i32, int i10, HP hp, AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        long start;
        HP hp2 = hp;
        AbstractC0955Ha.A01(c1321Vk);
        AbstractC0955Ha.A01(bArr);
        if (hp2 != null) {
            A04(c0954Gy, hk2, hp2);
        } else {
            hp2 = new HP();
        }
        String A02 = A02(c0954Gy);
        long j10 = c0954Gy.A01;
        long start2 = c0954Gy.A02;
        if (start2 != -1) {
            start = c0954Gy.A02;
        } else {
            start = hk2.A6W(A02);
        }
        while (true) {
            long j11 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6G = hk2.A6G(A02, j10, start != -1 ? start : Long.MAX_VALUE);
                    if (A6G <= 0) {
                        long j12 = -A6G;
                        A6G = j12;
                        if (A00(c0954Gy, j10, j12, c1321Vk, bArr, i32, i10, hp2) < A6G) {
                            if (!z10 || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j10 += A6G;
                    if (start != -1) {
                        j11 = A6G;
                    }
                    start -= j11;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0954Gy c0954Gy, HK hk2, HP hp) {
        long left;
        String A02 = A02(c0954Gy);
        long j10 = c0954Gy.A01;
        if (c0954Gy.A02 != -1) {
            left = c0954Gy.A02;
        } else {
            left = hk2.A6W(A02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long A6G = hk2.A6G(A02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (A6G > 0) {
                hp.A00 += A6G;
            } else {
                A6G = -A6G;
                if (A6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j10 += A6G;
            if (left == -1) {
                A6G = 0;
            }
            left -= A6G;
        }
    }

    public static void A05(HK hk2, String str) {
        Iterator<HO> it = hk2.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                hk2.AF9(it.next());
            } catch (HI unused) {
            }
        }
    }
}
