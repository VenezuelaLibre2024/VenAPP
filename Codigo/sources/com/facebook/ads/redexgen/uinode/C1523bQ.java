package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1523bQ implements P0 {
    public final /* synthetic */ C1520bN A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void A9L() {
        FV fv;
        EQ eq;
        fv = this.A00.A03;
        String A00 = fv.A10().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        C1047Kv c1047Kv = new C1047Kv();
        eq = this.A00.A04;
        C1047Kv.A0M(c1047Kv, eq, AbstractC1050Ky.A00(A00), this.A00.A6T());
    }

    public C1523bQ(C1520bN c1520bN) {
        this.A00 = c1520bN;
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABO(B0 b02) {
        new Handler(Looper.getMainLooper()).postDelayed(new C1524bR(this, b02), 1L);
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ABd() {
    }

    @Override // com.facebook.ads.redexgen.uinode.P0
    public final void ADL(View view, MotionEvent motionEvent) {
    }
}
