package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ea */
/* loaded from: assets/audience_network.dex */
public class C3099Ea extends C4382ZW {
    public static String[] A00 = {"ebBTtcDfrXbt7XUNv2xXXzukgR", "AfSrg72OINfokWlk8lEehE43rER54C5K", "DLWRAT6zkYb5ZQ4lVerhsjeXnJdmq546", "HcA6UXt4lgXnqoCqWVxSHZRcl", "xLJGdEWbtHtgosfXVcR1IwW", "KlZdBiYd7CYsgOQcQxjIKqODuE8wujbn", "gwTEk6Fa0GjLNEZ2sqovA8E7SRT86ppt", "mobLesdsIst7Z6gfBQK3QOgi9WAmLStS"};

    public C3099Ea(C25735V c25735v) {
        super(c25735v, null);
    }

    public /* synthetic */ C3099Ea(C25735V c25735v, C25695R c25695r) {
        this(c25735v);
    }

    @Override // com.facebook.ads.redexgen.uinode.C4382ZW, com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void A43(String str) {
        if (this.A00.get() == null) {
            return;
        }
        C25735V c25735v = this.A00.get();
        if (A00[1].charAt(12) != 'k') {
            throw new RuntimeException();
        }
        A00[0] = "wcnlDkVPCotGmNFV8gEH10X6";
        c25735v.A0G(str);
        String A02 = EnumC3821QP.A08.A02();
        String rewardedVideoError = EnumC3821QP.A09.A02();
        if (str.equals(A02)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C4382ZW, com.facebook.ads.redexgen.uinode.InterfaceC3560MC
    public final void A44(String str, C27658q c27658q) {
        super.A44(str, c27658q);
    }
}
