package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn */
/* loaded from: assets/audience_network.dex */
public final class C4154Vn implements InterfaceC3239Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC3237Gs A02;
    public final InterfaceC3239Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final long ADl(C3243Gy c3243Gy) throws IOException {
        long ADl = this.A03.ADl(c3243Gy);
        this.A00 = ADl;
        if (ADl == 0) {
            return 0L;
        }
        if (c3243Gy.A02 == -1 && this.A00 != -1) {
            c3243Gy = new C3243Gy(c3243Gy.A04, c3243Gy.A01, c3243Gy.A03, this.A00, c3243Gy.A05, c3243Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c3243Gy);
        return this.A00;
    }

    public C4154Vn(InterfaceC3239Gu interfaceC3239Gu, InterfaceC3237Gs interfaceC3237Gs) {
        this.A03 = (InterfaceC3239Gu) AbstractC3281Ha.A01(interfaceC3239Gu);
        this.A02 = (InterfaceC3237Gs) AbstractC3281Ha.A01(interfaceC3237Gs);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
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
                    InterfaceC3237Gs interfaceC3237Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC3237Gs.close();
                    }
                }
                throw th2;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
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
