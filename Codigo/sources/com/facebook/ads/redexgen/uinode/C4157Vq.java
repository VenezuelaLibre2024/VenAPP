package com.facebook.ads.redexgen.uinode;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.facebook.ads.redexgen.X.Vq */
/* loaded from: assets/audience_network.dex */
public final class C4157Vq {
    public HandlerC3252H7<? extends InterfaceC3253H8> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends InterfaceC3253H8> long A04(T t10, InterfaceC3251H6<T> interfaceC3251H6, int i10) {
        Looper myLooper = Looper.myLooper();
        AbstractC3281Ha.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC3252H7(this, myLooper, t10, interfaceC3251H6, i10, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public C4157Vq(String str) {
        this.A02 = AbstractC3322IF.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i10) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC3252H7<? extends InterfaceC3253H8> handlerC3252H7 = this.A00;
            if (handlerC3252H7 != null) {
                if (i10 == Integer.MIN_VALUE) {
                    i10 = handlerC3252H7.A03;
                }
                handlerC3252H7.A05(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(InterfaceC3254H9 interfaceC3254H9) {
        HandlerC3252H7<? extends InterfaceC3253H8> handlerC3252H7 = this.A00;
        if (handlerC3252H7 != null) {
            handlerC3252H7.A07(true);
        }
        if (interfaceC3254H9 != null) {
            this.A02.execute(new RunnableC3255HA(interfaceC3254H9));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
