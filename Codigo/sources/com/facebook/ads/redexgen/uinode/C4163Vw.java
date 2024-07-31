package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw */
/* loaded from: assets/audience_network.dex */
public final class C4163Vw implements InterfaceC3239Gu {
    public static byte[] A05;
    public static String[] A06 = {"2AQ", "PKEE8tvP1F9G5CS2asOfHv5i9NmL9OD8", "nghUlW0EKiCso94RSH6SGDaiGhOOZ9vR", "y3nJ4vSOM9HwnTFSw", "dDA", "lgpDjnw", "z3SCjqWwobuDiPiZI", "K1NyJtZzbkl5fIhEU"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final InterfaceC3261HG<? super C4163Vw> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-23};
        if (A06[3].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[2] = "0CNdTW9yzTlkWk7IYlaLkwwChYLMq6mo";
        strArr[1] = "0Hm8psTbLgTGmvvfzx0WFuRjr22Bb9pe";
        A05 = bArr;
    }

    static {
        A01();
    }

    public C4163Vw() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public C4163Vw(InterfaceC3261HG<? super C4163Vw> interfaceC3261HG) {
        this.A04 = interfaceC3261HG;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final Uri A8E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final long ADl(C3243Gy c3243Gy) throws C3246H1 {
        try {
            this.A01 = c3243Gy.A04;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c3243Gy.A04.getPath(), A00(0, 1, 20));
            this.A02 = randomAccessFile;
            randomAccessFile.seek(c3243Gy.A03);
            long length = c3243Gy.A02 == -1 ? this.A02.length() - c3243Gy.A03 : c3243Gy.A02;
            this.A00 = length;
            if (length >= 0) {
                this.A03 = true;
                InterfaceC3261HG<? super C4163Vw> interfaceC3261HG = this.A04;
                if (interfaceC3261HG != null) {
                    interfaceC3261HG.ADP(this, c3243Gy);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e10) {
            throw new C3246H1(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final void close() throws C3246H1 {
        this.A01 = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.A02;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new C3246H1(e10);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC3261HG<? super C4163Vw> interfaceC3261HG = this.A04;
                if (interfaceC3261HG != null) {
                    interfaceC3261HG.ADO(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final int read(byte[] bArr, int i10, int i11) throws C3246H1 {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.A00;
        if (j10 == 0) {
            return -1;
        }
        try {
            int read = this.A02.read(bArr, i10, (int) Math.min(j10, i11));
            if (read > 0) {
                this.A00 -= read;
                InterfaceC3261HG<? super C4163Vw> interfaceC3261HG = this.A04;
                if (interfaceC3261HG != null) {
                    interfaceC3261HG.AB1(this, read);
                }
            }
            return read;
        } catch (IOException e10) {
            throw new C3246H1(e10);
        }
    }
}
