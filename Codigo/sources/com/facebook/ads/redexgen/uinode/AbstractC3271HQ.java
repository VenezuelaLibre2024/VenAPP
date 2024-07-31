package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.HQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3271HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:46:0x00ae */
    public static long A00(C3243Gy c3243Gy, long j10, long j11, InterfaceC3239Gu interfaceC3239Gu, byte[] bArr, C3310I3 c3310i3, int i10, C3270HP c3270hp) throws IOException, InterruptedException {
        InterfaceC3239Gu interfaceC3239Gu2;
        while (true) {
            if (c3310i3 != null) {
                c3310i3.A01(i10);
            }
            try {
                break;
            } catch (C3309I2 unused) {
            } finally {
                AbstractC3322IF.A0W(interfaceC3239Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C3243Gy c3243Gy2 = new C3243Gy(c3243Gy.A04, c3243Gy.A06, j10, (c3243Gy.A03 + j10) - c3243Gy.A01, -1L, c3243Gy.A05, c3243Gy.A00 | 2);
        long ADl = interfaceC3239Gu2.ADl(c3243Gy2);
        if (c3270hp.A01 == -1 && ADl != -1) {
            c3270hp.A01 = c3243Gy2.A01 + ADl;
        }
        long j12 = 0;
        while (true) {
            if (j12 == j11) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC3239Gu2.read(bArr, 0, j11 != -1 ? (int) Math.min(bArr.length, j11 - j12) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j12 += read;
                c3270hp.A02 += read;
            } else if (c3270hp.A01 == -1) {
                c3270hp.A01 = c3243Gy2.A01 + j12;
            }
        }
        return j12;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C3243Gy c3243Gy) {
        if (c3243Gy.A05 != null) {
            return c3243Gy.A05;
        }
        Uri uri = c3243Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C3243Gy c3243Gy, InterfaceC3265HK interfaceC3265HK, C4151Vk c4151Vk, byte[] bArr, C3310I3 c3310i3, int i10, C3270HP c3270hp, AtomicBoolean atomicBoolean, boolean z10) throws IOException, InterruptedException {
        long start;
        C3270HP c3270hp2 = c3270hp;
        AbstractC3281Ha.A01(c4151Vk);
        AbstractC3281Ha.A01(bArr);
        if (c3270hp2 != null) {
            A04(c3243Gy, interfaceC3265HK, c3270hp2);
        } else {
            c3270hp2 = new C3270HP();
        }
        String A02 = A02(c3243Gy);
        long j10 = c3243Gy.A01;
        long start2 = c3243Gy.A02;
        if (start2 != -1) {
            start = c3243Gy.A02;
        } else {
            start = interfaceC3265HK.A6W(A02);
        }
        while (true) {
            long j11 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6G = interfaceC3265HK.A6G(A02, j10, start != -1 ? start : Long.MAX_VALUE);
                    if (A6G <= 0) {
                        long j12 = -A6G;
                        A6G = j12;
                        if (A00(c3243Gy, j10, j12, c4151Vk, bArr, c3310i3, i10, c3270hp2) < A6G) {
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

    public static void A04(C3243Gy c3243Gy, InterfaceC3265HK interfaceC3265HK, C3270HP c3270hp) {
        long left;
        String A02 = A02(c3243Gy);
        long j10 = c3243Gy.A01;
        if (c3243Gy.A02 != -1) {
            left = c3243Gy.A02;
        } else {
            left = interfaceC3265HK.A6W(A02);
        }
        c3270hp.A01 = left;
        c3270hp.A00 = 0L;
        c3270hp.A02 = 0L;
        while (left != 0) {
            long A6G = interfaceC3265HK.A6G(A02, j10, left != -1 ? left : Long.MAX_VALUE);
            if (A6G > 0) {
                c3270hp.A00 += A6G;
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

    public static void A05(InterfaceC3265HK interfaceC3265HK, String str) {
        Iterator<C3269HO> it = interfaceC3265HK.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                interfaceC3265HK.AF9(it.next());
            } catch (C3263HI unused) {
            }
        }
    }
}
