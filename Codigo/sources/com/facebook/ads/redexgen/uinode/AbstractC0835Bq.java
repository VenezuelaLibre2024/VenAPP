package com.facebook.ads.redexgen.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0835Bq implements WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C06674q A02;
    public final ArrayDeque<C06674q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0836Br> A04;
    public final PriorityQueue<C06674q> A05;

    public abstract WI A0N();

    public abstract void A0P(C5 c52);

    public abstract boolean A0R();

    public AbstractC0835Bq() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C06674q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C06644n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C06674q c06674q) {
        c06674q.A07();
        this.A03.add(c06674q);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0L */
    public C5 A54() throws C0920Fp {
        AbstractC0955Ha.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        C06674q pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0M */
    public AbstractC0836Br A55() throws C0920Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1377Xr) this.A05.peek()).A00 <= this.A00) {
            C06674q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0836Br pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                A0K(poll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                WI A0N = A0N();
                if (!poll.A03()) {
                    AbstractC0836Br pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1377Xr) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    /* renamed from: A0O */
    public void AEG(C5 c52) throws C0920Fp {
        AbstractC0955Ha.A03(c52 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c52.A03()) {
            A0K(this.A02);
        } else {
            C06674q c06674q = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c06674q.A00 = j10;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC0836Br abstractC0836Br) {
        abstractC0836Br.A07();
        this.A04.add(abstractC0836Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void AEV() {
    }

    @Override // com.facebook.ads.redexgen.uinode.WL
    public void AGB(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C06674q c06674q = this.A02;
        if (c06674q != null) {
            A0K(c06674q);
            this.A02 = null;
        }
    }
}
