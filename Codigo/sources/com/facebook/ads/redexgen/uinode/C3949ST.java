package com.facebook.ads.redexgen.uinode;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ST */
/* loaded from: assets/audience_network.dex */
public final class C3949ST extends AbstractC25184c<C3943SN> {
    public static String[] A0H = {"U2dBX20JaeRgS8KUkn4U", "4wbYdEjd6EY1wYpAHERmBQ5UbLFk3rIE", "poCzv8x7tLJqIV5ZIWq", "9iyDRDGf0xWQ70I4mtfqA0IQycZfZ47C", "v2glKkwlOEfR0MfsI3TqmdNecXONmhZ3", "6XdF3RdtkhprEZiVEVCq65KOMzsBziM7", "2OiOSmaAlP7OTnmHwLOjTjXlL7jeDPuL", "nkMLdycTxYcJ5galJfvG8bjM9rVBse8i"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC3559MB A04;
    public InterfaceC3560MC A05;
    public String A06;
    public List<C3785Pp> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC4476b5 A0A;
    public final C26416c A0B;
    public final C4337Yn A0C;
    public final InterfaceC3369J2 A0D;
    public final C3528Lg A0E;
    public final C3957Sb A0F;
    public final C3872RE A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C3949ST(C4337Yn c4337Yn, List<C3785Pp> list, AbstractC4476b5 abstractC4476b5, InterfaceC3369J2 interfaceC3369J2, C26416c c26416c, C3872RE c3872re, C3528Lg c3528Lg, InterfaceC3560MC interfaceC3560MC, String str, int i10, int i11, int i12, int i13, C3957Sb c3957Sb, AbstractC3559MB abstractC3559MB) {
        this.A0C = c4337Yn;
        this.A0D = interfaceC3369J2;
        this.A0B = c26416c;
        this.A0G = c3872re;
        this.A0E = c3528Lg;
        this.A05 = interfaceC3560MC;
        this.A0A = abstractC4476b5;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = c3957Sb;
        this.A04 = abstractC3559MB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C3943SN A0C(ViewGroup viewGroup, int i10) {
        return new C3943SN(AbstractC3731Ox.A00(new C3696OO(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0H(this.A04).A0K(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A0y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0D(C3943SN c3943sn, int i10) {
        c3943sn.A0j(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            c3943sn.AFr();
            String[] strArr = A0H;
            if (strArr[3].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            A0H[1] = "f5MkbcX2dFxcVTBDK6f4VKhLC7wzzoeI";
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    public final int A0E() {
        return this.A07.size();
    }
}
