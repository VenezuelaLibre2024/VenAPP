package com.facebook.ads.redexgen.uinode;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uu */
/* loaded from: assets/audience_network.dex */
public class C4099Uu extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public final /* synthetic */ C3428K1 A00;
    public final /* synthetic */ C3431K4 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 75, 89, 68, 71, 72, 72, 67, 84, 89, 77, 67, 95, 101, 68, 11, 69, 78, 95, 92, 68, 89, 64, 11, 72, 68, 69, 69, 78, 72, 95, 66, 68, 69};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C4337Yn c4337Yn;
        C4337Yn c4337Yn2;
        C4337Yn c4337Yn3;
        C4337Yn c4337Yn4;
        C4337Yn c4337Yn5;
        long j10;
        C4337Yn c4337Yn6;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC3879RL A022;
        C4337Yn c4337Yn7;
        C4337Yn c4337Yn8;
        C4337Yn c4337Yn9;
        C4337Yn c4337Yn10;
        long j11;
        c4337Yn = this.A01.A04;
        if (AbstractC3525Ld.A00(c4337Yn) == EnumC3524Lc.A07) {
            this.A01.A09();
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String A00 = A00(13, 21, 92);
            c4337Yn10 = this.A01.A04;
            InterfaceC22640S A0E = c4337Yn10.A0E();
            j11 = this.A01.A00;
            A0E.A2v(C3527Lf.A01(j11), adErrorType.getErrorCode(), A00, adErrorType.isPublicError());
            this.A01.A0D(new C3403Jb(adErrorType, A00));
            return;
        }
        c4337Yn2 = this.A01.A04;
        C27338J.A08(c4337Yn2);
        c4337Yn3 = this.A01.A04;
        AbstractC26186E.A07(c4337Yn3);
        C27608l A002 = C27608l.A00();
        c4337Yn4 = this.A01.A04;
        boolean z10 = true;
        Map<String, String> A09 = this.A00.A09(A002.A01(c4337Yn4, true).A6w(this.A00.A05()));
        this.A01.A02 = A09;
        try {
            c4337Yn7 = this.A01.A04;
            PackageManager packageManager = c4337Yn7.getPackageManager();
            if (packageManager != null) {
                String A003 = A00(1, 12, 113);
                StringBuilder sb2 = new StringBuilder();
                c4337Yn8 = this.A01.A04;
                StringBuilder append = sb2.append(c4337Yn8.getPackageName()).append(A00(0, 1, 93));
                c4337Yn9 = this.A01.A04;
                A09.put(A003, new String(Base64.encode(append.append(packageManager.getInstallerPackageName(c4337Yn9.getPackageName())).toString().getBytes(), 2)));
            }
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC3407Jg.A03 && this.A00.A06() != EnumC3407Jg.A05 && this.A00.A06() != EnumC3407Jg.A04 && this.A00.A06() != null) {
                z10 = false;
            }
            c4337Yn6 = this.A01.A04;
            InterfaceC3878RK A023 = C3896Rc.A02(z10, c4337Yn6);
            str = this.A01.A06;
            C3892RY c3892ry = new C3892RY();
            map = this.A01.A02;
            byte[] A08 = c3892ry.A05(map).A08();
            A022 = this.A01.A02(C3527Lf.A00(), this.A00);
            A023.AE0(str, A08, A022);
        } catch (Exception e10) {
            AdErrorType adErrorType2 = AdErrorType.AD_REQUEST_FAILED;
            String message = e10.getMessage();
            c4337Yn5 = this.A01.A04;
            InterfaceC22640S A0E2 = c4337Yn5.A0E();
            j10 = this.A01.A00;
            A0E2.A2v(C3527Lf.A01(j10), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
            this.A01.A0D(C3403Jb.A01(adErrorType2, message));
        }
    }

    public C4099Uu(C3431K4 c3431k4, C3428K1 c3428k1) {
        this.A01 = c3431k4;
        this.A00 = c3428k1;
    }
}
