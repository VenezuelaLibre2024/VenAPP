package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Og */
/* loaded from: assets/audience_network.dex */
public class RunnableC3714Og implements Runnable {
    public static String[] A01 = {"ZvDtHAz5m48M18w3xVBvW9UUvAxUfTco", "Su9zcdtZ9ImnInrf0ILgVeApSeGsgvZI", "xXqvKIRF0PBjEGaR7TZ18ROMB", "m2Hewa3Z6gbURtNYV3SWt7DVdluwrYvz", "mWXUFmbAmKViJClAM9LXlAC", "0Y7AahKvzPLarINwhoocY8ezozCmsz", "5fBoxvqmYpNfoXwOAmWasRGE3QCsQXLn", "O4RwXCXfxOQMJWQD0Tqe5fA"};
    public final /* synthetic */ C4011TT A00;

    public RunnableC3714Og(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                return;
            }
            this.A00.A0N();
        } catch (Throwable th2) {
            String[] strArr = A01;
            if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "0ZDTnX20ALQ1qRFYGfQrfbk";
            strArr2[4] = "BYw49wL2ISjP5kGNoOWH1Xi";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
