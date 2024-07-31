package com.facebook.ads.redexgen.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: assets/audience_network.dex */
public final class X2 implements InterfaceC0863Cy {
    public static byte[] A0D;
    public static final double[] A0E;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C4 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final Cz A0B = new Cz(RecognitionOptions.ITF);

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Format, Long> A00(Cz cz, String str) {
        byte[] copyOf = Arrays.copyOf(cz.A02, cz.A00);
        int i10 = copyOf[4] & 255;
        int i11 = copyOf[5] & 255;
        int i12 = (i10 << 4) | (i11 >> 4);
        int i13 = ((i11 & 15) << 8) | (copyOf[6] & 255);
        float f10 = 1.0f;
        switch ((copyOf[7] & 240) >> 4) {
            case 2:
                f10 = (i13 * 4) / (i12 * 3);
                break;
            case 3:
                f10 = (i13 * 16) / (i12 * 9);
                break;
            case 4:
                f10 = (i13 * 121) / (i12 * 100);
                break;
        }
        Format A03 = Format.A03(str, A01(0, 11, 121), null, -1, -1, i12, i13, -1.0f, Collections.singletonList(copyOf), -1, f10, null);
        long j10 = 0;
        int i14 = (copyOf[7] & 15) - 1;
        if (i14 >= 0) {
            double[] dArr = A0E;
            if (i14 < dArr.length) {
                double d10 = dArr[i14];
                int i15 = cz.A01;
                int i16 = (copyOf[i15 + 9] & 96) >> 5;
                if (i16 != (copyOf[i15 + 9] & 31)) {
                    d10 *= (i16 + 1.0d) / (r4 + 1);
                }
                j10 = (long) (1000000.0d / d10);
            }
        }
        return Pair.create(A03, Long.valueOf(j10));
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0D = new byte[]{7, 24, 21, 20, 30, 94, 28, 1, 20, 22, 67};
    }

    static {
        A02();
        A0E = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0863Cy
    public final void A4R(C0980Hz c0980Hz) {
        int A06 = c0980Hz.A06();
        int A07 = c0980Hz.A07();
        byte[] bArr = c0980Hz.A00;
        this.A04 += c0980Hz.A04();
        this.A05.AFR(c0980Hz, c0980Hz.A04());
        while (true) {
            int A04 = AbstractC0976Hv.A04(bArr, A06, A07, this.A0C);
            if (A04 == A07) {
                break;
            }
            int i10 = c0980Hz.A00[A04 + 3] & 255;
            if (!this.A07) {
                int i11 = A04 - A06;
                if (i11 > 0) {
                    this.A0B.A01(bArr, A06, A04);
                }
                if (this.A0B.A02(i10, i11 < 0 ? -i11 : 0)) {
                    Pair<Format, Long> A00 = A00(this.A0B, this.A06);
                    this.A05.A5n((Format) A00.first);
                    this.A00 = ((Long) A00.second).longValue();
                    this.A07 = true;
                }
            }
            if (i10 == 0 || i10 == 179) {
                int i12 = A07 - A04;
                if (this.A0A && this.A08 && this.A07) {
                    this.A05.AFS(this.A03, this.A09 ? 1 : 0, ((int) (this.A04 - this.A02)) - i12, i12, null);
                }
                boolean z10 = this.A0A;
                if (!z10 || this.A08) {
                    this.A02 = this.A04 - i12;
                    long j10 = this.A01;
                    if (j10 == -9223372036854775807L) {
                        j10 = z10 ? this.A03 + this.A00 : 0L;
                    }
                    this.A03 = j10;
                    this.A09 = false;
                    this.A01 = -9223372036854775807L;
                    this.A0A = true;
                }
                this.A08 = i10 == 0;
            } else if (i10 == 184) {
                this.A09 = true;
            }
            A06 = A04 + 3;
        }
        if (!this.A07) {
            this.A0B.A01(bArr, A06, A07);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0863Cy
    public final void A4p(InterfaceC0839Bu interfaceC0839Bu, DC dc2) {
        dc2.A05();
        this.A06 = dc2.A04();
        this.A05 = interfaceC0839Bu.AGi(dc2.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0863Cy
    public final void ADs() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0863Cy
    public final void ADt(long j10, boolean z10) {
        this.A01 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0863Cy
    public final void AFg() {
        AbstractC0976Hv.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
