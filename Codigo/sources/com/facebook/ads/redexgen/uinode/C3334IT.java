package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.IT */
/* loaded from: assets/audience_network.dex */
public final class C3334IT {
    public static byte[] A0C;
    public static String[] A0D = {"xjDjhxCoR5E9PaR", "vpLFoDls1yXd", "vp7lX6ix760xQFA", "plC", "mnLR5dwnrEQUmTikV", "t5Nzngx1C9ROF", "WJjUxBMWNKZwORVrQ", "T20oC"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final C3332IR A0A;
    public final ChoreographerFrameCallbackC3333IS A0B;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = (copyOfRange[i13] - i12) - 91;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[2] = "fcjVOHbVEUruwwj";
            copyOfRange[i13] = (byte) i14;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-13, -8, 2, -1, -5, -16, 8, 29, 15, 20, 10, 21, 29};
    }

    static {
        A04();
    }

    public C3334IT() {
        this(null);
    }

    public C3334IT(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 75));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = AbstractC3322IF.A02 >= 17 ? A01(context) : null;
            this.A0B = ChoreographerFrameCallbackC3333IS.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
    }

    public static long A00(long j10, long j11, long j12) {
        long j13;
        long vsyncCount = j12 * ((j10 - j11) / j12);
        long j14 = j11 + vsyncCount;
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j13 = j14;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[7] = "KRnDU";
            j14 += j12;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    private C3332IR A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 52));
        if (displayManager == null) {
            return null;
        }
        return new C3332IR(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }

    private boolean A06(long j10, long j11) {
        long j12 = j10 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j11 - elapsedFrameTimeNs) - j12) > 20000000;
    }

    public final long A07(long j10, long j11) {
        long j12 = 1000 * j10;
        long j13 = j12;
        long j14 = j11;
        if (this.A08) {
            if (j10 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j15 = this.A01;
            if (j15 >= 6) {
                long j16 = this.A00 + ((j12 - this.A04) / j15);
                if (!A06(j16, j11)) {
                    j14 = (this.A05 + j16) - this.A04;
                    j13 = j16;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j12, j11)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j12;
            this.A05 = j11;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j10;
        this.A03 = j13;
        ChoreographerFrameCallbackC3333IS choreographerFrameCallbackC3333IS = this.A0B;
        if (choreographerFrameCallbackC3333IS != null) {
            long j17 = this.A06;
            if (A0D[2].length() != 15) {
                throw new RuntimeException();
            }
            A0D[3] = "GMIC0";
            if (j17 != -9223372036854775807L) {
                long j18 = choreographerFrameCallbackC3333IS.A04;
                if (j18 == -9223372036854775807L) {
                    return j14;
                }
                return A00(j14, j18, this.A06) - this.A07;
            }
        }
        return j14;
    }

    public final void A08() {
        if (this.A09 != null) {
            C3332IR c3332ir = this.A0A;
            if (c3332ir != null) {
                c3332ir.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            C3332IR c3332ir = this.A0A;
            if (c3332ir != null) {
                c3332ir.A00();
            }
            A03();
        }
    }
}
