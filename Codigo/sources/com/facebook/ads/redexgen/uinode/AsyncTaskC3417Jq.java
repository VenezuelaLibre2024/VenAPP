package com.facebook.ads.redexgen.uinode;

import android.os.AsyncTask;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Jq */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC3417Jq extends AsyncTask<AbstractC3890RW, Void, InterfaceC3877RJ> implements InterfaceC3887RT {
    public static byte[] A04;
    public InterfaceC3879RL A00;
    public C3408Jh A01;
    public Exception A02;
    public Executor A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final InterfaceC3877RJ A00(AbstractC3890RW... abstractC3890RWArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            if (abstractC3890RWArr != null) {
                try {
                    if (abstractC3890RWArr.length > 0) {
                        InterfaceC3877RJ A0J = this.A01.A0J(abstractC3890RWArr[0]);
                        if (this.A01.A0K().A04() && A0J != null) {
                            String.format(Locale.US, A01(108, 21, 6), Integer.valueOf(A0J.A83()), A0J.getUrl(), A0J.A69());
                        }
                        if (A0J != null) {
                            return A0J;
                        }
                        throw new IllegalStateException(A01(87, 21, 119));
                    }
                } catch (Exception e10) {
                    this.A02 = e10;
                    if (this.A01.A0K().A04()) {
                        String.format(Locale.US, A01(64, 23, 98), e10.getMessage());
                    }
                    cancel(true);
                    return null;
                }
            }
            throw new IllegalArgumentException(A01(0, 64, 69));
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-18, 25, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, -2, 11, 29, 21, -54, 30, 11, 21, 15, 29, -54, 15, 34, 11, 13, 30, 22, 35, -54, 25, 24, 15, -54, 11, 28, 17, 31, 23, 15, 24, 30, -54, 25, 16, -54, 30, 35, 26, 15, -54, -14, 30, 30, 26, -4, 15, 27, 31, 15, 29, 30, 15, 27, 27, 23, -25, 57, 44, 56, 60, 44, 58, 59, -25, 45, 40, 48, 51, 44, 43, 1, -25, -20, 58, 36, 80, 80, 76, -4, 78, 65, 79, 76, 75, 74, 79, 65, -4, 69, 79, -4, 74, 81, 72, 72, -67, -48, -34, -37, -38, -39, -34, -48, -91, -117, -112, -49, -117, -109, -112, -34, -108, -91, 117, -112, -34};
    }

    public AsyncTaskC3417Jq(C3408Jh c3408Jh, InterfaceC3879RL interfaceC3879RL, Executor executor) {
        this.A01 = c3408Jh;
        this.A00 = interfaceC3879RL;
        this.A03 = executor;
    }

    private final void A03(InterfaceC3877RJ result) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            this.A00.AB9(result);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    public final void A04(AbstractC3890RW abstractC3890RW) {
        super.executeOnExecutor(this.A03, abstractC3890RW);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ InterfaceC3877RJ doInBackground(AbstractC3890RW[] abstractC3890RWArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            return A00(abstractC3890RWArr);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.A00.ABS(this.A02);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(InterfaceC3877RJ interfaceC3877RJ) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            A03(interfaceC3877RJ);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}