package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.6X, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6X implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C07046c A01;

    public C6X(C07046c c07046c, C6Y c6y) {
        this.A01 = c07046c;
        new Handler(Looper.getMainLooper()).post(new C1402Yq(this, c07046c, c6y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C6Y c6y) {
        C07277f c07277f;
        C07277f c07277f2;
        long currentTimeMillis = System.currentTimeMillis();
        c07277f = this.A01.A04;
        R0 A05 = R0.A05(c07277f.A01());
        Uri A00 = AbstractC1050Ky.A00(c6y.A08);
        long j10 = c6y.A00;
        if (j10 == -1) {
            c07277f2 = this.A01.A04;
            j10 = C0988Ih.A0O(c07277f2);
        }
        A05.A0G(A00, new C1401Yp(this, c6y, j10, currentTimeMillis), j10);
    }
}
