package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I */
/* loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC07618s<C9H> A02;
    public final AbstractC07618s<AnonymousClass98> A03;
    public final AbstractC07618s<O8> A04;
    public final AbstractC07618s<AnonymousClass93> A05;
    public final AbstractC07618s<C1095Mr> A06;
    public final AbstractC07618s<C1083Mf> A07;
    public final AbstractC07618s<C1078Ma> A08;
    public final AbstractC07618s<MU> A09;
    public final AbstractC07618s<C1072Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C9I(C1399Yn c1399Yn, J2 j22, SA sa2, List<C2P> list, String str) {
        super(c1399Yn, j22, sa2, list, str, !sa2.A0h(), new QR(c1399Yn, sa2));
        C9J c9j = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            public C9J() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = c9j;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh2 = new RH(this);
        this.A04 = rh2;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C1185Qd c1185Qd = new C1185Qd(this);
        this.A02 = c1185Qd;
        C1184Qc c1184Qc = new C1184Qc(this);
        this.A06 = c1184Qc;
        C1182Qa c1182Qa = new C1182Qa(this);
        this.A09 = c1182Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s92 = new S9(this);
        this.A08 = s92;
        C9K c9k = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            public C9K() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(C1117Nn c1117Nn) {
                SA sa3;
                C9I c9i = C9I.this;
                sa3 = c9i.A0B;
                c9i.A00 = sa3.getDuration();
            }
        };
        this.A0C = c9k;
        this.A01 = false;
        this.A0B = sa2;
        sa2.getEventBus().A03(c9j, ra2, s72, rh2, s32, c1185Qd, c1184Qc, c1182Qa, qv, c9k, s92);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C9I(C1399Yn c1399Yn, J2 j22, SA sa2, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c1399Yn, j22, sa2, list, str, !sa2.A0h(), bundle, map, new QR(c1399Yn, sa2));
        C9J c9j = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            public C9J() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = c9j;
        S7 s72 = new S7(this);
        this.A07 = s72;
        S3 s32 = new S3(this);
        this.A03 = s32;
        RH rh2 = new RH(this);
        this.A04 = rh2;
        RA ra2 = new RA(this);
        this.A05 = ra2;
        C1185Qd c1185Qd = new C1185Qd(this);
        this.A02 = c1185Qd;
        C1184Qc c1184Qc = new C1184Qc(this);
        this.A06 = c1184Qc;
        C1182Qa c1182Qa = new C1182Qa(this);
        this.A09 = c1182Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s92 = new S9(this);
        this.A08 = s92;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            public C9K() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(C1117Nn c1117Nn) {
                SA sa3;
                C9I c9i = C9I.this;
                sa3 = c9i.A0B;
                c9i.A00 = sa3.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa2;
        sa2.getEventBus().A03(c9j, ra2, s72, rh2, s32, c1185Qd, c1184Qc, c1182Qa, qv, s92);
    }

    public C9I(C1399Yn c1399Yn, J2 j22, SA sa2, String str) {
        this(c1399Yn, j22, sa2, new ArrayList(), str);
    }

    public C9I(C1399Yn c1399Yn, J2 j22, SA sa2, String str, Bundle bundle) {
        this(c1399Yn, j22, sa2, new ArrayList(), str, bundle, null);
    }

    public C9I(C1399Yn c1399Yn, J2 j22, SA sa2, String str, Map<String, String> extraParams) {
        this(c1399Yn, j22, sa2, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s82 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC1060Li.A00(s82);
        } else {
            this.A0B.getStateHandler().post(s82);
        }
    }
}
