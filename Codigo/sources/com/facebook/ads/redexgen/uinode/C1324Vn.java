package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1324Vn implements InterfaceC0950Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0948Gs A02;
    public final InterfaceC0950Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final long ADl(C0954Gy c0954Gy) throws IOException {
        long ADl = this.A03.ADl(c0954Gy);
        this.A00 = ADl;
        if (ADl == 0) {
            return 0L;
        }
        if (c0954Gy.A02 == -1 && this.A00 != -1) {
            c0954Gy = new C0954Gy(c0954Gy.A04, c0954Gy.A01, c0954Gy.A03, this.A00, c0954Gy.A05, c0954Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c0954Gy);
        return this.A00;
    }

    public C1324Vn(InterfaceC0950Gu interfaceC0950Gu, InterfaceC0948Gs interfaceC0948Gs) {
        this.A03 = (InterfaceC0950Gu) AbstractC0955Ha.A01(interfaceC0950Gu);
        this.A02 = (InterfaceC0948Gs) AbstractC0955Ha.A01(interfaceC0948Gs);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th2) {
            boolean z10 = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z10) {
                    this.A01 = false;
                    InterfaceC0948Gs interfaceC0948Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0948Gs.close();
                    }
                }
                throw th2;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0950Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i10, i11);
        if (read > 0) {
            this.A02.write(bArr, i10, read);
            long j10 = this.A00;
            if (j10 != -1) {
                this.A00 = j10 - read;
            }
        }
        return read;
    }
}
