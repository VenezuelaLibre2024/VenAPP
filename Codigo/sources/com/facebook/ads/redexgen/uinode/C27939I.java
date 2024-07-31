package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I */
/* loaded from: assets/audience_network.dex */
public final class C27939I extends C3824QS {
    public int A00;
    public boolean A01;
    public final AbstractC27678s<C27929H> A02;
    public final AbstractC27678s<C278398> A03;
    public final AbstractC27678s<C3680O8> A04;
    public final AbstractC27678s<C277893> A05;
    public final AbstractC27678s<C3601Mr> A06;
    public final AbstractC27678s<C3589Mf> A07;
    public final AbstractC27678s<C3584Ma> A08;
    public final AbstractC27678s<C3578MU> A09;
    public final AbstractC27678s<C3542Lu> A0A;
    public final C3930SA A0B;
    public final AbstractC3643NX A0C;
    public final AbstractC3579MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C27939I(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, List<AbstractC23842P> list, String str) {
        super(c4337Yn, interfaceC3369J2, c3930sa, list, str, !c3930sa.A0h(), new C3823QR(c4337Yn, c3930sa));
        AbstractC3579MV abstractC3579MV = new AbstractC3579MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3580MW c3580mw) {
                C27939I.this.A0a();
            }
        };
        this.A0D = abstractC3579MV;
        C3927S7 c3927s7 = new C3927S7(this);
        this.A07 = c3927s7;
        C3923S3 c3923s3 = new C3923S3(this);
        this.A03 = c3923s3;
        C3875RH c3875rh = new C3875RH(this);
        this.A04 = c3875rh;
        C3868RA c3868ra = new C3868RA(this);
        this.A05 = c3868ra;
        C3835Qd c3835Qd = new C3835Qd(this);
        this.A02 = c3835Qd;
        C3834Qc c3834Qc = new C3834Qc(this);
        this.A06 = c3834Qc;
        C3832Qa c3832Qa = new C3832Qa(this);
        this.A09 = c3832Qa;
        C3827QV c3827qv = new C3827QV(this);
        this.A0A = c3827qv;
        C3929S9 c3929s9 = new C3929S9(this);
        this.A08 = c3929s9;
        AbstractC3643NX abstractC3643NX = new AbstractC3643NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3659Nn c3659Nn) {
                C3930SA c3930sa2;
                C27939I c27939i = C27939I.this;
                c3930sa2 = c27939i.A0B;
                c27939i.A00 = c3930sa2.getDuration();
            }
        };
        this.A0C = abstractC3643NX;
        this.A01 = false;
        this.A0B = c3930sa;
        c3930sa.getEventBus().A03(abstractC3579MV, c3868ra, c3927s7, c3875rh, c3923s3, c3835Qd, c3834Qc, c3832Qa, c3827qv, abstractC3643NX, c3929s9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public C27939I(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, List<AbstractC23842P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c4337Yn, interfaceC3369J2, c3930sa, list, str, !c3930sa.A0h(), bundle, map, new C3823QR(c4337Yn, c3930sa));
        AbstractC3579MV abstractC3579MV = new AbstractC3579MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3580MW c3580mw) {
                C27939I.this.A0a();
            }
        };
        this.A0D = abstractC3579MV;
        C3927S7 c3927s7 = new C3927S7(this);
        this.A07 = c3927s7;
        C3923S3 c3923s3 = new C3923S3(this);
        this.A03 = c3923s3;
        C3875RH c3875rh = new C3875RH(this);
        this.A04 = c3875rh;
        C3868RA c3868ra = new C3868RA(this);
        this.A05 = c3868ra;
        C3835Qd c3835Qd = new C3835Qd(this);
        this.A02 = c3835Qd;
        C3834Qc c3834Qc = new C3834Qc(this);
        this.A06 = c3834Qc;
        C3832Qa c3832Qa = new C3832Qa(this);
        this.A09 = c3832Qa;
        C3827QV c3827qv = new C3827QV(this);
        this.A0A = c3827qv;
        C3929S9 c3929s9 = new C3929S9(this);
        this.A08 = c3929s9;
        this.A0C = new AbstractC3643NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C3659Nn c3659Nn) {
                C3930SA c3930sa2;
                C27939I c27939i = C27939I.this;
                c3930sa2 = c27939i.A0B;
                c27939i.A00 = c3930sa2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = c3930sa;
        c3930sa.getEventBus().A03(abstractC3579MV, c3868ra, c3927s7, c3875rh, c3923s3, c3835Qd, c3834Qc, c3832Qa, c3827qv, c3929s9);
    }

    public C27939I(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, String str) {
        this(c4337Yn, interfaceC3369J2, c3930sa, new ArrayList(), str);
    }

    public C27939I(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, String str, Bundle bundle) {
        this(c4337Yn, interfaceC3369J2, c3930sa, new ArrayList(), str, bundle, null);
    }

    public C27939I(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, String str, Map<String, String> extraParams) {
        this(c4337Yn, interfaceC3369J2, c3930sa, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        C3928S8 c3928s8 = new C3928S8(this);
        if (this.A0B.A0l()) {
            ExecutorC3530Li.A00(c3928s8);
        } else {
            this.A0B.getStateHandler().post(c3928s8);
        }
    }
}
