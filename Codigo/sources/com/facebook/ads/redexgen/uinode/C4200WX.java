package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.WX */
/* loaded from: assets/audience_network.dex */
public final class C4200WX implements InterfaceC3083EK {
    public static String[] A06 = {"z6XOcFfUlZLiYF0seOLnv3ze9s0DdTB", "", "kOUqzIhQkth8unrmunVXM7OloxceXCp", "vNZflObtCpyDQVnjonlKme7G1XHf5P9t", "ltwdc1Rff3GtcYqOYiouDHeI", "qE08X0G6Jnym0xvk75ZNBZoUEwP5MAza", "Z6LnFft16t74Gtd3ASLNWwB", "zHF"};
    public final C3243Gy A00;
    public final InterfaceC3265HK A01;
    public final C4151Vk A02;
    public final C3310I3 A04;
    public final C3270HP A03 = new C3270HP();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C4200WX(Uri uri, String str, C3084EL c3084el) {
        this.A00 = new C3243Gy(uri, 0L, -1L, str, 0);
        this.A01 = c3084el.A02();
        this.A02 = c3084el.A03(false);
        this.A04 = c3084el.A04();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3083EK
    public final void A5D() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            AbstractC3271HQ.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
        } finally {
            this.A04.A03(-1000);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3083EK
    public final float A6o() {
        long j10 = this.A03.A01;
        if (j10 == -1) {
            return -1.0f;
        }
        long contentLength = this.A03.A00();
        float f10 = ((float) contentLength) * 100.0f;
        if (A06[3].charAt(18) != 'l') {
            throw new RuntimeException();
        }
        A06[5] = "hhB6jfIM7FzfpB2Im4JpX4ZUe2epnCaG";
        return f10 / ((float) j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3083EK
    public final long A6p() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3083EK
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3083EK
    public final void remove() {
        AbstractC3271HQ.A05(this.A01, AbstractC3271HQ.A02(this.A00));
    }
}
