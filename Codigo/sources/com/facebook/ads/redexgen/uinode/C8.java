package com.facebook.ads.redexgen.uinode;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class C8 extends AbstractC1375Xp<C5, AbstractC0836Br, C0920Fp> implements WL {
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

    public abstract InterfaceC0919Fo A0b(byte[] bArr, int i10, boolean z10) throws C0920Fp;

    public C8(String str) {
        super(new C5[2], new AbstractC0836Br[2]);
        this.A00 = str;
        A0Y(RecognitionOptions.UPC_E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.6Q] */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1375Xp
    /* renamed from: A0E, reason: merged with bridge method [inline-methods] */
    public final C6Q A0V() {
        return new AbstractC0836Br(this) { // from class: com.facebook.ads.redexgen.X.6Q
            public final C8 A00;

            {
                this.A00 = this;
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC0836Br
            public final void A08() {
                this.A00.A0c(this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1375Xp
    /* renamed from: A0F, reason: merged with bridge method [inline-methods] */
    public final C0920Fp A0W(C5 c52, AbstractC0836Br abstractC0836Br, boolean z10) {
        try {
            ByteBuffer inputData = c52.A01;
            abstractC0836Br.A09(((C1377Xr) c52).A00, A0b(inputData.array(), inputData.limit(), z10), c52.A00);
            abstractC0836Br.A01(Integer.MIN_VALUE);
            return null;
        } catch (C0920Fp e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1375Xp
    /* renamed from: A0G, reason: merged with bridge method [inline-methods] */
    public final C0920Fp A0X(Throwable th2) {
        return new C0920Fp(A0I(0, 23, 36), th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC1375Xp
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final C5 A0T() {
        return new C5();
    }

    public final void A0c(AbstractC0836Br abstractC0836Br) {
        super.A0a(abstractC0836Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.WL
    public final void AGB(long j10) {
    }
}