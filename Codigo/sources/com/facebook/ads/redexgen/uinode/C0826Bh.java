package com.facebook.ads.redexgen.uinode;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0826Bh extends C1424Zn {
    public final /* synthetic */ C0825Bg A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final int A0O(View view, int i10) {
        int i11;
        AbstractC06654o A08 = A08();
        if (!A08.A20()) {
            return 0;
        }
        C06664p c06664p = (C06664p) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c06664p.leftMargin, A08.A0n(view) + c06664p.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i10);
        i11 = this.A00.A02;
        return A0N + i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826Bh(C0825Bg c0825Bg, C1399Yn c1399Yn) {
        super(c1399Yn);
        this.A00 = c0825Bg;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final float A0J(DisplayMetrics displayMetrics) {
        float f10;
        f10 = this.A00.A00;
        return f10 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1424Zn
    public final PointF A0P(int i10) {
        return this.A00.A4O(i10);
    }
}
