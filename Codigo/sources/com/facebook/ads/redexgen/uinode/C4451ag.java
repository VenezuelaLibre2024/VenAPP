package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import com.facebook.ads.AdSize;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ag */
/* loaded from: assets/audience_network.dex */
public final class C4451ag implements InterfaceC3430K3 {
    public static byte[] A0E;
    public static String[] A0F = {"Um", "5O6Pi5UhekEiJBNtL2", "ByBiFstlzS", "VNZICTTmM6bBZ", "I3ykA2cHAONkN", "xnUs6VMzToWHuFoC", "Qkjm3fg24P6DD7pmZ7L4neN1zLjqdukp", "LFB8Dcv49A6aPeUL"};
    public InterfaceC23571y A00;
    public C27428S A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final Handler A05;
    public final AdSize A06;
    public final C22910u A07;
    public final C4337Yn A08;
    public final InterfaceC3369J2 A09;
    public final EnumC3407Jg A0A;
    public final C3431K4 A0B;
    public final Runnable A0C;
    public final String A0D;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0F[2].length() != 10) {
                throw new RuntimeException();
            }
            A0F[1] = "uoxYJqIRleds8fPMMv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 87);
            i13++;
        }
    }

    public static void A05() {
        byte[] bArr = {64, 65, -14, 66, 62, 51, 53, 55, 63, 55, 64, 70, -14, 59, 64, -14, 68, 55, 69, 66, 65, 64, 69, 55};
        if (A0F[0].length() != 2) {
            throw new RuntimeException();
        }
        A0F[1] = "dKV76OJFyRmVPWeRzZ";
        A0E = bArr;
    }

    static {
        A05();
        AbstractC3538Lq.A02();
    }

    public C4451ag(C4337Yn c4337Yn, String str, EnumC3407Jg enumC3407Jg, AdSize adSize, int i10) {
        this.A08 = c4337Yn;
        this.A0D = str;
        this.A0A = enumC3407Jg;
        this.A06 = adSize;
        this.A04 = i10;
        C3431K4 c3431k4 = new C3431K4(c4337Yn);
        this.A0B = c3431k4;
        c3431k4.A0P(this);
        this.A07 = new C22910u();
        this.A03 = true;
        this.A05 = new Handler();
        this.A0C = new C3142FH(this);
        this.A09 = c4337Yn.A09();
        DynamicLoaderFactory.makeLoader(c4337Yn).getInitApi().onAdLoadInvoked(c4337Yn);
    }

    private List<C4491bK> A04() {
        C27428S c27428s = this.A01;
        ArrayList arrayList = new ArrayList(c27428s.A02());
        for (C27408Q A04 = c27428s.A04(); A04 != null; A04 = c27428s.A04()) {
            InterfaceC22860p A00 = this.A07.A00(this.A08, AdPlacementType.NATIVE);
            if (A00 != null && A00.A7e() == AdPlacementType.NATIVE) {
                C4491bK nativeAdapter = (C4491bK) A00;
                nativeAdapter.A0L(this.A08, new C3143FI(this, arrayList, nativeAdapter), this.A09, new C23541v(A04.A04(), c27428s.A05(), this.A0D, c27428s.A05().A0C()), C4107V2.A0K());
            }
        }
        return arrayList;
    }

    public final void A06() {
        this.A03 = false;
        this.A05.removeCallbacks(this.A0C);
    }

    public final void A07() {
        try {
            C3412Jl c3412Jl = new C3412Jl(this.A08, null, null, null);
            C4337Yn c4337Yn = this.A08;
            String str = this.A0D;
            AdSize adSize = this.A06;
            this.A0B.A0O(new C3428K1(c4337Yn, str, adSize != null ? new C3512LQ(adSize.getWidth(), this.A06.getHeight()) : null, this.A0A, this.A04, c3412Jl, AbstractC3518LW.A01(C3348Ih.A0J(this.A08)), this.A02, null, new C4444aZ()));
        } catch (C3404Jc e10) {
            ABR(C3403Jb.A02(e10));
        }
    }

    public final void A08(InterfaceC23571y interfaceC23571y) {
        this.A00 = interfaceC23571y;
    }

    public final void A09(String str) {
        this.A02 = str;
    }

    public final boolean A0A() {
        C27428S c27428s = this.A01;
        return c27428s == null || c27428s.A0C();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3430K3
    public final void ABR(C3403Jb c3403Jb) {
        if (this.A03) {
            this.A05.postDelayed(this.A0C, 1800000L);
        }
        InterfaceC23571y interfaceC23571y = this.A00;
        if (A0F[2].length() != 10) {
            throw new RuntimeException();
        }
        A0F[2] = "yGn7NPCZVX";
        if (interfaceC23571y != null) {
            interfaceC23571y.ABR(c3403Jb);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3430K3
    public final void ADG(C4094Up c4094Up) {
        C27428S A00 = c4094Up.A00();
        if (A00 != null) {
            if (this.A03) {
                long A0A = A00.A05().A0A();
                if (A0A == 0) {
                    A0A = 1800000;
                }
                this.A05.postDelayed(this.A0C, A0A);
            }
            this.A01 = A00;
            List<C4491bK> A04 = A04();
            if (this.A00 != null) {
                if (A04.isEmpty()) {
                    this.A00.ABR(C3403Jb.A01(AdErrorType.NO_FILL, A03(0, 0, 68)));
                    return;
                } else {
                    this.A00.ACP(A04);
                    return;
                }
            }
            return;
        }
        throw new IllegalStateException(A03(0, 24, 123));
    }
}
