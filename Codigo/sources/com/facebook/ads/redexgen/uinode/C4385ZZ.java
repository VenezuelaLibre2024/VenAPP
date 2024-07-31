package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.ZZ */
/* loaded from: assets/audience_network.dex */
public class C4385ZZ extends AbstractC25354t {
    public static String[] A02 = {"mAEXsU", "ynqBxBOImfiaim2rOjt4gNln3IJjMmAs", "wywpOwDcOClPwSqhh8hqnS4LzA6xmBGs", "SzqLf2", "g6", "3b", "2rYsw0AU9P5CKqqKD8yWz2y811Q4TNqs", "g7NtZwf9Cfcv4ky8xJWe0WMsxKKUH5F1"};
    public boolean A00 = false;
    public final /* synthetic */ AbstractC4384ZY A01;

    public C4385ZZ(AbstractC4384ZY abstractC4384ZY) {
        this.A01 = abstractC4384ZY;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25354t
    public final void A0L(C3100Eb c3100Eb, int i10) {
        super.A0L(c3100Eb, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25354t
    public final void A0M(C3100Eb c3100Eb, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        String[] strArr = A02;
        if (strArr[5].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        A02[1] = "WMOmT1QQvzwg3wEMb9eL1K1wBJkCMN2D";
        this.A00 = true;
    }
}
