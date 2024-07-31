package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aa */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4445aa implements InterfaceC23792K {
    public static byte[] A06;
    public final InterfaceC236021 A00;
    public final HandlerC236829 A01;
    public final C4337Yn A02;
    public final Handler A03;
    public final String A04;
    public final InterfaceC23722D A05;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-65, -46, -53, -63, -55, -62, -36, -62, -43, -47, -49, -66, -48, -36, -56, -62, -42, -46, -41, -35, -24, -50, -37, -37, -40, -37, -24, -52, -40, -51, -50, -24, -44, -50, -30, -83, -82, -84, -71, -101, -98, -71, -93, -98, -71, -91, -97, -77, -24, -23, -25, -12, -38, -25, -25, -28, -25, -12, -30, -38, -24, -24, -42, -36, -38, -12, -32, -38, -18};
    }

    public abstract void A08();

    public abstract void A09();

    public AbstractC4445aa(C4337Yn c4337Yn, String str, InterfaceC23732E interfaceC23732E) {
        this.A02 = c4337Yn;
        this.A04 = str;
        DynamicLoaderFactory.makeLoader(c4337Yn).getInitApi().onAdLoadInvoked(c4337Yn);
        C4448ad c4448ad = new C4448ad(c4337Yn, this);
        this.A00 = c4448ad;
        HandlerC236829 handlerC236829 = new HandlerC236829(c4337Yn, this);
        this.A01 = handlerC236829;
        this.A03 = new Handler(Looper.getMainLooper());
        this.A05 = interfaceC23732E.A4g(c4448ad, this, handlerC236829);
    }

    public final InterfaceC236021 A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A04;
    }

    public final void A05() {
        if (this.A01.A01) {
            this.A02.A0E().AEp();
            A06();
        } else {
            this.A02.A0E().AEh();
            this.A01.A02 = true;
            this.A01.A0E(AbstractC3351Ik.A01.get());
        }
    }

    public final void A06() {
        this.A02.A0E().AEu();
        if (!this.A01.A0F(this.A05.A7J(), this.A05.A4e(this.A04))) {
            A09();
            this.A02.A0E().AEn();
        }
    }

    public final void A07() {
        if (!C3348Ih.A0p(this.A02)) {
            return;
        }
        ExecutorC3530Li.A00(new C4446ab(this));
    }

    public final void A0A(int i10) {
        this.A01.A0D(this.A02, i10);
    }

    public final void A0B(int i10, AdErrorType adErrorType, String str) {
        Bundle bundle = new Bundle();
        String A01 = A01(48, 21, 113);
        if (str != null) {
            bundle.putString(A01, str);
        } else {
            bundle.putString(A01, adErrorType.getDefaultErrorMessage());
        }
        bundle.putInt(A01(17, 18, 101), adErrorType.getErrorCode());
        ACJ(i10, this.A04, bundle);
    }

    public final void A0C(Message message) {
        this.A05.A8W(message);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23792K
    public final void ACJ(int i10, String str, Bundle bundle) {
        Message obtain = Message.obtain((Handler) null, i10);
        obtain.getData().putString(A01(35, 13, 54), str);
        if (bundle != null) {
            obtain.getData().putBundle(A01(0, 17, 89), bundle);
        }
        Runnable callbackApiRunnable = new C4447ac(this, obtain);
        this.A03.post(callbackApiRunnable);
    }
}
