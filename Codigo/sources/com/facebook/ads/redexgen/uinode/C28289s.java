package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9s */
/* loaded from: assets/audience_network.dex */
public final class C28289s {
    public static byte[] A0F;
    public long A00;
    public C28289s A01;
    public C28299t A02;
    public TrackGroupArray A03;
    public C3229Gk A04;
    public boolean A05;
    public boolean A06;
    public C3229Gk A07;
    public final InterfaceC4192WP A08;
    public final Object A09;
    public final InterfaceC3136FB[] A0A;
    public final boolean[] A0B;
    public final InterfaceC3115Eq A0C;
    public final AbstractC3228Gj A0D;
    public final InterfaceC2846AA[] A0E;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102, 74, 109, 110, 102, 103, 112, 81, 100, 115, 104, 110, 101, 33, 115, 100, 109, 100, 96, 114, 100, 33, 103, 96, 104, 109, 100, 101, 47};
    }

    public C28289s(InterfaceC2846AA[] interfaceC2846AAArr, long j10, AbstractC3228Gj abstractC3228Gj, InterfaceC3231Gm interfaceC3231Gm, InterfaceC3115Eq interfaceC3115Eq, Object obj, C28299t c28299t) {
        this.A0E = interfaceC2846AAArr;
        this.A00 = j10 - c28299t.A03;
        this.A0D = abstractC3228Gj;
        this.A0C = interfaceC3115Eq;
        this.A09 = AbstractC3281Ha.A01(obj);
        this.A02 = c28299t;
        this.A0A = new InterfaceC3136FB[interfaceC2846AAArr.length];
        this.A0B = new boolean[interfaceC2846AAArr.length];
        InterfaceC4192WP A4k = interfaceC3115Eq.A4k(c28299t.A04, interfaceC3231Gm);
        this.A08 = c28299t.A02 != Long.MIN_VALUE ? new C2976CI(A4k, true, 0L, c28299t.A02) : A4k;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(com.facebook.ads.redexgen.uinode.C3229Gk r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.Gh r0 = r4.A01
            com.facebook.ads.redexgen.X.Gg r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5U()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C28289s.A02(com.facebook.ads.redexgen.X.Gk):void");
    }

    private void A03(C3229Gk c3229Gk) {
        C3229Gk c3229Gk2 = this.A07;
        this.A07 = c3229Gk;
        if (c3229Gk != null) {
            A02(c3229Gk);
        }
    }

    private void A04(InterfaceC3136FB[] interfaceC3136FBArr) {
        int i10 = 0;
        while (true) {
            InterfaceC2846AA[] interfaceC2846AAArr = this.A0E;
            int i11 = interfaceC2846AAArr.length;
            if (i10 < i11) {
                if (interfaceC2846AAArr[i10].A8C() == 5 && this.A04.A00(i10)) {
                    interfaceC3136FBArr[i10] = new C4197WU();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void A05(InterfaceC3136FB[] interfaceC3136FBArr) {
        int i10 = 0;
        while (true) {
            InterfaceC2846AA[] interfaceC2846AAArr = this.A0E;
            int i11 = interfaceC2846AAArr.length;
            if (i10 < i11) {
                if (interfaceC2846AAArr[i10].A8C() == 5) {
                    interfaceC3136FBArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7U();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j10) {
        return j10 - A07();
    }

    public final long A09(long j10) {
        return A07() + j10;
    }

    public final long A0A(long j10, boolean z10) {
        return A0B(j10, z10, new boolean[this.A0E.length]);
    }

    public final long A0B(long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            int i11 = this.A04.A00;
            boolean z11 = false;
            if (i10 >= i11) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z10 && this.A04.A02(this.A07, i10)) {
                z11 = true;
            }
            zArr2[i10] = z11;
            i10++;
        }
        A05(this.A0A);
        A03(this.A04);
        C3226Gh c3226Gh = this.A04.A01;
        long AFm = this.A08.AFm(c3226Gh.A01(), this.A0B, this.A0A, zArr, j10);
        A04(this.A0A);
        this.A05 = false;
        int i12 = 0;
        while (true) {
            InterfaceC3136FB[] interfaceC3136FBArr = this.A0A;
            if (i12 < interfaceC3136FBArr.length) {
                if (interfaceC3136FBArr[i12] != null) {
                    AbstractC3281Ha.A04(this.A04.A00(i12));
                    int i13 = this.A0E[i12].A8C();
                    if (i13 != 5) {
                        this.A05 = true;
                    }
                } else {
                    AbstractC3281Ha.A04(c3226Gh.A00(i12) == null);
                }
                i12++;
            } else {
                return AFm;
            }
        }
    }

    public final long A0C(boolean z10) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A6D = this.A08.A6D();
        if (A6D == Long.MIN_VALUE && z10) {
            return this.A02.A01;
        }
        return A6D;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AEa(((C2976CI) this.A08).A05);
            } else {
                this.A0C.AEa(this.A08);
            }
        } catch (RuntimeException e10) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e10);
        }
    }

    public final void A0E(float f10) throws C28139c {
        this.A06 = true;
        this.A03 = this.A08.A8B();
        A0I(f10);
        long A0A = A0A(this.A02.A03, false);
        long j10 = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j10 + (newStartPositionUs - A0A);
        this.A02 = this.A02.A01(A0A);
    }

    public final void A0F(long j10) {
        this.A08.A4T(A08(j10));
    }

    public final void A0G(long j10) {
        if (this.A06) {
            this.A08.AER(A08(j10));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A6D() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f10) throws C28139c {
        C3229Gk A0T = this.A0D.A0T(this.A0E, this.A03);
        C3229Gk selectorResult = this.A07;
        if (A0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = A0T;
        for (InterfaceC3225Gg interfaceC3225Gg : A0T.A01.A01()) {
            if (interfaceC3225Gg != null) {
                interfaceC3225Gg.ACc(f10);
            }
        }
        return true;
    }
}
