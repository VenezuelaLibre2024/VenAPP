package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6X */
/* loaded from: assets/audience_network.dex */
public class CallableC26366X implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C26416c A01;

    public CallableC26366X(C26416c c26416c, C26376Y c26376y) {
        this.A01 = c26416c;
        new Handler(Looper.getMainLooper()).post(new C4340Yq(this, c26416c, c26376y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C26376Y c26376y) {
        C26937f c26937f;
        C26937f c26937f2;
        long currentTimeMillis = System.currentTimeMillis();
        c26937f = this.A01.A04;
        C3858R0 A05 = C3858R0.A05(c26937f.A01());
        Uri A00 = AbstractC3484Ky.A00(c26376y.A08);
        long j10 = c26376y.A00;
        if (j10 == -1) {
            c26937f2 = this.A01.A04;
            j10 = C3348Ih.A0O(c26937f2);
        }
        A05.A0G(A00, new C4339Yp(this, c26376y, j10, currentTimeMillis), j10);
    }
}
