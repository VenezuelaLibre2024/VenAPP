package com.facebook.ads.redexgen.uinode;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.C8 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2966C8 extends AbstractC4277Xp<C2963C5, AbstractC2949Br, C3174Fp> implements InterfaceC4188WL {
    public static byte[] A01;
    public final String A00;

    static {
        A0J();
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A01 = new byte[]{-68, -43, -52, -33, -41, -52, -54, -37, -52, -53, -121, -53, -52, -54, -42, -53, -52, -121, -52, -39, -39, -42, -39};
    }

    public abstract InterfaceC3173Fo A0b(byte[] bArr, int i10, boolean z10) throws C3174Fp;

    public AbstractC2966C8(String str) {
        super(new C2963C5[2], new AbstractC2949Br[2]);
        this.A00 = str;
        A0Y(RecognitionOptions.UPC_E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4277Xp
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C26296Q A0V() {
        return new AbstractC2949Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final AbstractC2966C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC2949Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4277Xp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C3174Fp A0W(C2963C5 c2963c5, AbstractC2949Br abstractC2949Br, boolean z10) {
        try {
            ByteBuffer inputData = c2963c5.A01;
            abstractC2949Br.A09(((C4279Xr) c2963c5).A00, A0b(inputData.array(), inputData.limit(), z10), c2963c5.A00);
            abstractC2949Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C3174Fp e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4277Xp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C3174Fp A0X(Throwable th2) {
        return new C3174Fp(A0I(0, 23, 36), th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC4277Xp
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C2963C5 A0T() {
        return new C2963C5();
    }

    public final void A0c(AbstractC2949Br abstractC2949Br) {
        super.A0a(abstractC2949Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4188WL
    public final void AGB(long j10) {
    }
}
