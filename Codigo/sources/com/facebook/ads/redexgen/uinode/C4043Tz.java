package com.facebook.ads.redexgen.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Tz */
/* loaded from: assets/audience_network.dex */
public final class C4043Tz extends AbstractC25184c<C3951SV> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC3560MC A03;
    public C3872RE A04;
    public String A05;
    public List<C3785Pp> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC4476b5 A08;
    public final C26416c A09;
    public final C4337Yn A0A;
    public final InterfaceC3369J2 A0B;
    public final C4107V2 A0C;
    public final C3528Lg A0D;
    public final C2924BQ A0E;
    public final C3451KP A0F;

    public C4043Tz(C4337Yn c4337Yn, List<C3785Pp> list, AbstractC4476b5 abstractC4476b5, InterfaceC3369J2 interfaceC3369J2, C4107V2 c4107v2, InterfaceC3560MC interfaceC3560MC, String str, C2924BQ c2924bq, C3451KP c3451kp) {
        this.A0A = c4337Yn;
        this.A0B = interfaceC3369J2;
        this.A0C = c4107v2;
        this.A09 = c4107v2.A10();
        this.A04 = c4107v2.A1A();
        this.A0D = c4107v2.A19();
        this.A03 = interfaceC3560MC;
        this.A08 = abstractC4476b5;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c2924bq;
        this.A0F = c3451kp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C3951SV A0C(ViewGroup viewGroup, int i10) {
        return new C3951SV(AbstractC3664Ns.A00(new C3696OO(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0K(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(C3951SV c3951sv, int i10) {
        C3785Pp c3785Pp = this.A06.get(i10);
        c3951sv.A0k(this.A04);
        c3951sv.A0j(c3785Pp, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    public final int A0E() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(C3872RE c3872re) {
        this.A04 = c3872re;
    }
}
