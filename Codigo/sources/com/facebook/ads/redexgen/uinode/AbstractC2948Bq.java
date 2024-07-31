package com.facebook.ads.redexgen.uinode;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.Bq */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2948Bq implements InterfaceC4188WL {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public C25324q A02;
    public final ArrayDeque<C25324q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC2949Br> A04;
    public final PriorityQueue<C25324q> A05;

    public abstract C4185WI A0N();

    public abstract void A0P(C2963C5 c2963c5);

    public abstract boolean A0R();

    public AbstractC2948Bq() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.A03.add(new C25324q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.A04.add(new C25294n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C25324q c25324q) {
        c25324q.A07();
        this.A03.add(c25324q);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2909BB
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public C2963C5 A54() throws C3174Fp {
        AbstractC3281Ha.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        C25324q pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2909BB
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public AbstractC2949Br A55() throws C3174Fp {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C4279Xr) this.A05.peek()).A00 <= this.A00) {
            C25324q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC2949Br pollFirst = this.A04.pollFirst();
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
                C4185WI A0N = A0N();
                if (!poll.A03()) {
                    AbstractC2949Br pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C4279Xr) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2909BB
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AEG(C2963C5 c2963c5) throws C3174Fp {
        AbstractC3281Ha.A03(c2963c5 == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (c2963c5.A03()) {
            A0K(this.A02);
        } else {
            C25324q c25324q = this.A02;
            long j10 = this.A01;
            this.A01 = 1 + j10;
            c25324q.A00 = j10;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC2949Br abstractC2949Br) {
        abstractC2949Br.A07();
        this.A04.add(abstractC2949Br);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2909BB
    public void AEV() {
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4188WL
    public void AGB(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2909BB
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        C25324q c25324q = this.A02;
        if (c25324q != null) {
            A0K(c25324q);
            this.A02 = null;
        }
    }
}
