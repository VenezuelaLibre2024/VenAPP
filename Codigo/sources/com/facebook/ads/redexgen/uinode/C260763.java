package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.63 */
/* loaded from: assets/audience_network.dex */
public final class C260763 extends AbstractC3085EM implements Handler.Callback {
    public static String[] A0D = {"gjDhtLri4FaGEAWjRmzGOIMLbPPteIUr", "gp3Mr1PqMY6rayIsxO9yJntmkSBHR7UD", "5ZPDaEp5A16UYvNfALSoSfbuhC4Pwik1", "wt", "uAQVQjgSUgDp2O8dWeXQS6qYbl", "Gm3ZCOzsQkh90YHushfajnERb16f", "RaSLUB1F0sju8CZYqMhotlzh76Y2FLCY", "Ujo7akDRrtwDl4IVTi3qcCtKoi2"};
    public int A00;
    public int A01;
    public Format A02;
    public InterfaceC4188WL A03;
    public C2963C5 A04;
    public AbstractC2949Br A05;
    public AbstractC2949Br A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C28259p A0A;
    public final InterfaceC3175Fq A0B;
    public final InterfaceC3176Fr A0C;

    public C260763(InterfaceC3176Fr interfaceC3176Fr, Looper looper) {
        this(interfaceC3176Fr, looper, InterfaceC3175Fq.A00);
    }

    public C260763(InterfaceC3176Fr interfaceC3176Fr, Looper looper, InterfaceC3175Fq interfaceC3175Fq) {
        super(3);
        this.A0C = (InterfaceC3176Fr) AbstractC3281Ha.A01(interfaceC3176Fr);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC3175Fq;
        this.A0A = new C28259p();
    }

    private long A00() {
        int i10 = this.A01;
        if (i10 == -1 || i10 >= this.A06.A71()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A70(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC2949Br abstractC2949Br = this.A06;
        if (abstractC2949Br != null) {
            abstractC2949Br.A08();
            this.A06 = null;
        }
        AbstractC2949Br abstractC2949Br2 = this.A05;
        if (abstractC2949Br2 != null) {
            abstractC2949Br2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.AEV();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4Z(this.A02);
    }

    private void A05(List<C3172Fn> list) {
        this.A0C.ABF(list);
    }

    private void A06(List<C3172Fn> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A15() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A16(long j10, boolean z10) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
        } else {
            A02();
            this.A03.flush();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC3085EM
    public final void A18(Format[] formatArr, long j10) throws C28139c {
        Format format = formatArr[0];
        this.A02 = format;
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4Z(format);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A91() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    public final boolean A9C() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r10.A00 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        A04();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        A02();
        r10.A08 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r7 == Long.MAX_VALUE) goto L32;
     */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4293Y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFB(long r11, long r13) throws com.facebook.ads.redexgen.uinode.C28139c {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C260763.AFB(long, long):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2846AA
    public final int AGe(Format format) {
        if (this.A0B.AGf(format)) {
            return AbstractC3085EM.A0y(null, format.A0H) ? 4 : 2;
        }
        if (AbstractC3299Hs.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                A05((List) message.obj);
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}