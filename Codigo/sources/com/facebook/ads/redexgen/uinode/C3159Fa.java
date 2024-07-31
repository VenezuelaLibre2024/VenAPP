package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fa */
/* loaded from: assets/audience_network.dex */
public class C3159Fa extends AbstractC4461aq {
    public static String[] A04 = {"9yCAU6vHH5iW2uzgCW6HgdGPEZSQZZfL", "J47", "6rlZoFx9Uu0Bsrona1cKRXumzm4YYBbS", "bhq", "umQrlUDl61wUXIIBom7yT3QugrS", "j4Wkewb2uBFqLUCHLR63rcK9C", "eNU4QeIs11d2vjS0Im22LGZCKxJhHCKO", "6j5HGQ5u8FmBkqYMwiejF76PKOqfr1XC"};
    public final /* synthetic */ C3157FY A00;
    public final /* synthetic */ AbstractC4480b9 A01;
    public final /* synthetic */ C3151FS A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3159Fa(C3157FY c3157fy, boolean z10, boolean z11, C3151FS c3151fs, AbstractC4480b9 abstractC4480b9) {
        super(z10);
        this.A00 = c3157fy;
        this.A03 = z11;
        this.A02 = c3151fs;
        this.A01 = abstractC4480b9;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4461aq
    public final void A00() {
        InterfaceC230518 interfaceC230518;
        interfaceC230518 = this.A00.A01;
        interfaceC230518.AD1(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC4461aq
    public final void A01(boolean z10) {
        C4337Yn c4337Yn;
        AtomicBoolean atomicBoolean;
        InterfaceC230518 interfaceC230518;
        C4337Yn c4337Yn2;
        c4337Yn = this.A00.A04;
        if (!C3348Ih.A1R(c4337Yn) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            if (A04[4].length() == 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[1] = "NG7";
            strArr[3] = "cbl";
            atomicBoolean.set(true);
            interfaceC230518 = this.A00.A01;
            interfaceC230518.ACy(this.A01);
            return;
        }
        C3157FY c3157fy = this.A00;
        c4337Yn2 = c3157fy.A04;
        c3157fy.A06 = AbstractC3746PC.A01(c4337Yn2, this.A02, 0, new C4487bG(this));
    }
}
