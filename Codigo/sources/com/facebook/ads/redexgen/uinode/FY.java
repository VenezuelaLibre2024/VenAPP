package com.facebook.ads.redexgen.uinode;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class FY extends AbstractC1506b9 {
    public static C07046c A0D;
    public static byte[] A0E;
    public static String[] A0F = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public AnonymousClass18 A01;
    public AnonymousClass19 A02;
    public C1F A03;
    public C1399Yn A04;
    public KB A05;
    public PB A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 2, 11, 3, 4, 15, 14, 43, 14, 46, 11, 30, 11, 40, 31, 4, 14, 6, 15, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, 31, 27, 19, 104, Byte.MAX_VALUE, 109, 123, 104, 126, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 79, 72, 86, 25, 14, 28, 10, 25, 15, 14, 15, 61, 2, 15, 14, 4, 42, 15, 47, 10, 31, 10, 41, 30, 5, 15, 7, 14, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C06142o A00 = C06142o.A00(this.A04);
        AnonymousClass19 anonymousClass19 = this.A02;
        A00.A06(anonymousClass19, anonymousClass19.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C06142o.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i10 = super.A00;
        String A04 = A04(77, 24, 89);
        if (i10 != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0F[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i11 = super.A00;
                if (A0F[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0F;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i11);
                return;
            }
        }
        if (!C0988Ih.A0d(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B(C1399Yn c1399Yn, C1500b3 c1500b3, int i10) {
        if (i10 >= c1500b3.A0s()) {
            return;
        }
        FS fs = (FS) c1500b3.A0v(i10);
        C07046c c07046c = new C07046c(c1399Yn);
        A0D = c07046c;
        c07046c.A0d(new JA(fs.A12(), c1399Yn.A09()));
        AbstractC05931t.A02(c1399Yn, A0D, fs);
        A0D.A0W(new FZ(this, i10 == 0, c1399Yn, fs, c1500b3, i10), new C6V(fs.A0S(), A04(152, 14, 91), i10));
    }

    private void A0C(boolean z10) {
        if (this.A05 == KB.A0F) {
            A0E(z10);
            return;
        }
        KB kb2 = this.A05;
        String[] strArr = A0F;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (kb2 == KB.A0H) {
            A0F(z10);
        } else if (this.A05 == KB.A0G) {
            A0D(z10);
        } else {
            A0F(z10);
        }
    }

    private void A0D(boolean z10) {
        C07046c c07046c = new C07046c(this.A04);
        boolean z11 = C0988Ih.A1n(this.A04) && AnonymousClass62.A0A(this.A03.A0V());
        if (z11) {
            AnonymousClass62 unifiedAssetsLoader = new AnonymousClass62(c07046c, this.A03.A0V(), this.A03.A0P(), this.A03.A0S(), z11, new C1512bF(this));
            c07046c.A0d(new JA(((AbstractC1502b5) this.A03).A12(), this.A04.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        AbstractC05921s.A02(this.A04, (AbstractC1502b5) this.A03, z10, new C1511bE(this));
    }

    private void A0E(boolean z10) {
        C07046c c07046c = new C07046c(this.A04);
        c07046c.A0d(new JA(((AbstractC1502b5) this.A03).A12(), this.A04.A09()));
        AbstractC05931t.A03(this.A04, c07046c, (FS) this.A03);
        c07046c.A0W(new C1516bJ(this), new C6V(this.A03.A0S(), A04(152, 14, 91)));
    }

    private void A0F(boolean z10) {
        boolean z11 = false;
        if (this.A03.A0j()) {
            C1500b3 c1500b3 = (C1500b3) this.A03;
            for (int i10 = 0; i10 < c1500b3.A0s(); i10++) {
                if (TextUtils.isEmpty(c1500b3.A0v(i10).A0x().A0D().A08())) {
                    this.A01.AD1(this, AdError.INTERNAL_ERROR);
                    return;
                }
            }
            A0B(this.A04, c1500b3, 0);
            return;
        }
        C07046c c07046c = new C07046c(this.A04);
        c07046c.A0d(new JA(((AbstractC1502b5) this.A03).A12(), this.A04.A09()));
        if (C0988Ih.A1n(this.A04) && AnonymousClass62.A0A(this.A03.A0V())) {
            z11 = true;
        }
        boolean A0m = this.A03.A0m();
        if (z11) {
            AnonymousClass62 unifiedAssetsLoader = new AnonymousClass62(c07046c, this.A03.A0V(), this.A03.A0P(), this.A03.A0S(), z11, new C1514bH(this, A0m));
            unifiedAssetsLoader.A0B();
            return;
        }
        FS fs = (FS) this.A03;
        if (TextUtils.isEmpty(fs.A0x().A0D().A08())) {
            this.A01.AD1(this, AdError.INTERNAL_ERROR);
        } else {
            AbstractC05931t.A02(this.A04, c07046c, fs);
            c07046c.A0W(new C0907Fa(this, z10, A0m, fs, this), new C6V(fs.A0S(), A04(152, 14, 91)));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1506b9
    public final int A0G() {
        C1F c1f = this.A03;
        if (c1f != null) {
            return c1f.A0G();
        }
        String[] strArr = A0F;
        if (strArr[4].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0F[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1506b9
    public final C1F A0H() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC1506b9
    public final boolean A0I() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0X(super.A01);
        String A03 = Q7.A03(super.A02, this.A0B, this.A07);
        this.A03.A0Y(super.A02);
        this.A03.A0c(A03);
        AdActivityIntent A04 = C1037Kj.A04(this.A04);
        A04.putExtra(A04(174, 8, 91), this.A05);
        A04.putExtra(A04(127, 25, 21), this.A03);
        A04.putExtra(A04(34, 19, 20), this.A03);
        A04.putExtra(A04(166, 8, 119), this.A0B);
        if (A03 != null) {
            A04.putExtra(A04(112, 15, 100), A03);
        }
        A04.putExtra(A04(66, 11, 2), this.A0A);
        A04.putExtra(A04(101, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            A04.putExtra(A04(53, 13, 87), str);
        }
        A09(A04);
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            A04.setFlags(A04.getFlags() | 268435456);
        }
        ActivityUtils.A03(this.A04);
        try {
            if (ProcessUtils.isRemoteRenderingProcess()) {
                if (!C1037Kj.A0J(this.A04, A04)) {
                    this.A04.A0E().AF0();
                    AnonymousClass18 anonymousClass18 = this.A01;
                    if (anonymousClass18 != null) {
                        anonymousClass18.AD1(this, AdError.AD_PRESENTATION_ERROR);
                    }
                    return false;
                }
                return true;
            }
            C1037Kj.A0A(this.A04, A04);
            return true;
        } catch (C1035Kh e10) {
            Throwable cause = e10.getCause();
            Throwable th2 = e10;
            if (cause != null) {
                th2 = e10.getCause();
            }
            this.A04.A07().A9a(A04(23, 11, 115), C8A.A01, new C8B(th2));
            return true;
        }
    }

    public final void A0J(C1399Yn c1399Yn, AnonymousClass18 anonymousClass18, C05951v c05951v, boolean z10, String str, String str2) {
        this.A0C.set(false);
        this.A04 = c1399Yn;
        this.A01 = anonymousClass18;
        this.A0A = c05951v.A02();
        this.A00 = c05951v.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A07 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        C1F A00 = C1F.A00(c05951v.A03(), this.A04);
        this.A03 = A00;
        A00.A0a(str);
        this.A03.A0W(c05951v.A01().A06());
        if (this.A03.A0j()) {
            this.A08 = ((C1500b3) this.A03).A0y();
        } else {
            AbstractC1502b5 abstractC1502b5 = (AbstractC1502b5) this.A03;
            String[] strArr = A0F;
            String str4 = strArr[7];
            String str5 = strArr[6];
            int experienceType = str4.charAt(31);
            if (experienceType != str5.charAt(31)) {
                String[] strArr2 = A0F;
                strArr2[7] = "FFkeuuVk1meHqgTyMiNT7tgr8739x7mc";
                strArr2[6] = "JwuXN3bqyC9CcnquHiHDyzq7R0rb3kLZ";
                this.A08 = abstractC1502b5.A12();
            } else {
                String[] strArr3 = A0F;
                strArr3[7] = "QuYSy7nqZhyT9avsyztjWhd8F7hW1wjU";
                strArr3[6] = "5b6UXiMlNaCol2aZqv4zpvCfEMtgCuxD";
                this.A08 = abstractC1502b5.A12();
            }
        }
        boolean A0m = this.A03.A0m();
        String[] strArr4 = A0F;
        if (strArr4[7].charAt(31) == strArr4[6].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr5 = A0F;
        strArr5[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
        strArr5[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
        if (A0m) {
            this.A05 = KB.A08;
            if (this.A03.A0g()) {
                this.A04.A0E().AGG(EnumC05530e.A07);
            } else {
                this.A04.A0E().AGG(EnumC05530e.A09);
            }
        } else {
            switch (this.A03.A0F()) {
                case 0:
                    this.A05 = KB.A0H;
                    C0S A0E2 = this.A04.A0E();
                    int experienceType2 = A0F[3].charAt(29);
                    if (experienceType2 != 105) {
                        A0F[3] = "i1vVIMuEE2CogviWDEosGc55NgD83ibP";
                        A0E2.AGG(EnumC05530e.A0C);
                        break;
                    } else {
                        A0F[2] = "e7mQJdX4ST7JevLzoIctPRomcGPYY6Su";
                        A0E2.AGG(EnumC05530e.A0C);
                        break;
                    }
                case 1:
                    this.A05 = KB.A0G;
                    this.A04.A0E().AGG(EnumC05530e.A0B);
                    break;
                case 2:
                    this.A05 = KB.A05;
                    this.A04.A0E().AGG(EnumC05530e.A04);
                    break;
                case 3:
                    this.A05 = KB.A0F;
                    this.A04.A0E().AGG(EnumC05530e.A03);
                    break;
            }
        }
        if (C0988Ih.A0q(c1399Yn)) {
            if (this.A03.A0j()) {
                C1500b3 c1500b3 = (C1500b3) this.A03;
                for (int A0s = c1500b3.A0s() - 1; A0s >= 0; A0s--) {
                    AbstractC1502b5 A0v = c1500b3.A0v(A0s);
                    if (AbstractC05600l.A06(this.A04, AbstractC05600l.A01(c1399Yn, A0v.A0V(), A0v.A12()), c1399Yn.A09())) {
                        this.A04.A0E().A4K();
                        c1500b3.A10(A0s);
                        return;
                    }
                }
                if (c1500b3.A0s() == 0) {
                    this.A01.AD1(this, AdError.NO_FILL);
                    return;
                }
            } else if (AbstractC05600l.A06(this.A04, AbstractC05600l.A01(c1399Yn, c05951v.A03(), ((AbstractC1502b5) this.A03).A12()), c1399Yn.A09())) {
                this.A04.A0E().A4K();
                this.A01.AD1(this, AdError.NO_FILL);
                return;
            }
        }
        this.A02 = new AnonymousClass19(this.A0B, this, anonymousClass18);
        A06();
        A0C(z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final String A6T() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final boolean AGd() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05630p
    public final void onDestroy() {
        A07();
    }
}