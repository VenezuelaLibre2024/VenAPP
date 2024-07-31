package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cS */
/* loaded from: assets/audience_network.dex */
public class RunnableC4550cS implements Runnable {
    public static String[] A03 = {"dpzU5luUOUHn3PWLQSytUkpXF5uf76Gb", "OIXAlbgxv8lxL6Dw2D3vNQ6xborOE6Ab", "016lHYH9eT2TKwrcc2bnFjN8P1e", "T3DTHKpc", "xtrZuPGJxZVhMxMYehMPzz7RP9cUVZ", "GHqsJR2NBv7dmhvhUyJ2cgs96CqPd5ri", "JC4MWKMVQLy9m", "a7WpfUfSeSK3qdCMwJm40hXORQEICpVd"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4549cR A01;
    public final /* synthetic */ Exception A02;

    public RunnableC4550cS(C4549cR c4549cR, int i10, Exception exc) {
        this.A01 = c4549cR;
        this.A00 = i10;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        InterfaceC3950SU interfaceC3950SU;
        Handler handler;
        Runnable runnable;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            try {
                z10 = this.A01.A01;
                if (z10) {
                    C4549cR c4549cR = this.A01;
                    interfaceC3950SU = c4549cR.A05;
                    c4549cR.A04(interfaceC3950SU.AAY());
                    handler = this.A01.A04;
                    runnable = this.A01.A09;
                    handler.postDelayed(runnable, this.A00);
                }
            } catch (Exception e10) {
                StackTraceElement[] innerTrace = e10.getStackTrace();
                StackTraceElement[] stackTrace = this.A02.getStackTrace();
                StackTraceElement[] callerTrace = (StackTraceElement[]) Arrays.copyOf(innerTrace, innerTrace.length + stackTrace.length);
                System.arraycopy(stackTrace, 0, callerTrace, innerTrace.length, stackTrace.length);
                e10.setStackTrace(callerTrace);
                throw e10;
            }
        } catch (Throwable th2) {
            if (A03[4].length() == 16) {
                throw new RuntimeException();
            }
            A03[3] = "b6O1Nd";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
