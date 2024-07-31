package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vk */
/* loaded from: assets/audience_network.dex */
public final class C4151Vk implements InterfaceC3239Gu {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC3239Gu A07;
    public C3269HO A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC3239Gu A0D;
    public final InterfaceC3239Gu A0E;
    public final InterfaceC3239Gu A0F;
    public final InterfaceC3265HK A0G;
    public final InterfaceC3267HM A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 35);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public C4151Vk(InterfaceC3265HK interfaceC3265HK, InterfaceC3239Gu interfaceC3239Gu, InterfaceC3239Gu interfaceC3239Gu2, InterfaceC3237Gs interfaceC3237Gs, int i10, InterfaceC3267HM interfaceC3267HM) {
        this.A0G = interfaceC3265HK;
        this.A0D = interfaceC3239Gu2;
        this.A0I = (i10 & 1) != 0;
        this.A0K = (i10 & 2) != 0;
        this.A0J = (i10 & 4) != 0;
        this.A0F = interfaceC3239Gu;
        if (interfaceC3237Gs != null) {
            this.A0E = new C4154Vn(interfaceC3239Gu, interfaceC3237Gs);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC3267HM;
    }

    private int A00(C3243Gy c3243Gy) {
        if (this.A0K) {
            boolean z10 = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z10) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c3243Gy.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC3265HK interfaceC3265HK, String str, Uri uri) {
        InterfaceC3275HU contentMetadata = interfaceC3265HK.A6X(str);
        Uri A01 = AbstractC3276HV.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    private void A03() throws IOException {
        InterfaceC3239Gu interfaceC3239Gu = this.A07;
        if (interfaceC3239Gu == null) {
            return;
        }
        try {
            interfaceC3239Gu.close();
            this.A07 = null;
            this.A0A = false;
            C3269HO c3269ho = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (c3269ho != null) {
                this.A0G.AEZ(c3269ho);
                this.A08 = null;
            }
        } catch (Throwable th2) {
            this.A07 = null;
            this.A0A = false;
            C3269HO c3269ho2 = this.A08;
            if (c3269ho2 != null) {
                this.A0G.AEZ(c3269ho2);
                this.A08 = null;
            }
            throw th2;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6F();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AFx(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C3263HI)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z10) throws IOException {
        C3269HO AGV;
        long j10;
        C3243Gy c3243Gy;
        InterfaceC3239Gu nextDataSource;
        long j11;
        if (this.A0B) {
            AGV = null;
        } else if (this.A0I) {
            try {
                AGV = this.A0G.AGV(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            AGV = this.A0G.AGW(this.A09, this.A03);
        }
        if (AGV == null) {
            nextDataSource = this.A0F;
            c3243Gy = new C3243Gy(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (AGV.A05) {
            Uri fromFile = Uri.fromFile(AGV.A03);
            long filePosition = this.A03 - AGV.A02;
            long length = AGV.A01 - filePosition;
            long j12 = this.A01;
            if (j12 != -1) {
                length = Math.min(length, j12);
            }
            c3243Gy = new C3243Gy(fromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (AGV.A02()) {
                j10 = this.A01;
            } else {
                j10 = AGV.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    j10 = Math.min(j10, length2);
                }
            }
            c3243Gy = new C3243Gy(this.A06, this.A03, j10, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AEZ(AGV);
                AGV = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j11 = this.A03 + 102400;
        } else {
            j11 = Long.MAX_VALUE;
        }
        this.A02 = j11;
        if (z10) {
            AbstractC3281Ha.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th2) {
                if (AGV.A01()) {
                    this.A0G.AEZ(AGV);
                }
                throw th2;
            }
        }
        if (AGV != null && AGV.A01()) {
            this.A08 = AGV;
        }
        this.A07 = nextDataSource;
        this.A0A = c3243Gy.A02 == -1;
        long ADl = nextDataSource.ADl(c3243Gy);
        C3277HW c3277hw = new C3277HW();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (ADl != -1) {
                this.A01 = ADl;
                AbstractC3276HV.A05(c3277hw, this.A03 + ADl);
            }
        }
        if (A0B()) {
            Uri A8E = this.A07.A8E();
            this.A05 = A8E;
            if (true ^ this.A06.equals(A8E)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    AbstractC3276HV.A06(c3277hw, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    AbstractC3276HV.A06(c3277hw, uri);
                }
            } else {
                AbstractC3276HV.A04(c3277hw);
            }
        }
        if (A0C()) {
            this.A0G.A3a(this.A09, c3277hw);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r1) {
        /*
        L0:
            if (r1 == 0) goto L14
            boolean r0 = r1 instanceof com.facebook.ads.redexgen.uinode.C3240Gv
            if (r0 == 0) goto Lf
            r0 = r1
            com.facebook.ads.redexgen.X.Gv r0 = (com.facebook.ads.redexgen.uinode.C3240Gv) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r1 = r1.getCause()
            goto L0
        L14:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4151Vk.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final Uri A8E() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final long ADl(C3243Gy c3243Gy) throws IOException {
        try {
            this.A09 = AbstractC3271HQ.A02(c3243Gy);
            Uri uri = c3243Gy.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c3243Gy.A00;
            this.A03 = c3243Gy.A03;
            this.A0B = A00(c3243Gy) != -1;
            if (c3243Gy.A02 != -1 || this.A0B) {
                this.A01 = c3243Gy.A02;
            } else {
                long A6W = this.A0G.A6W(this.A09);
                this.A01 = A6W;
                if (A6W != -1) {
                    long j10 = A6W - c3243Gy.A03;
                    this.A01 = j10;
                    if (j10 <= 0) {
                        throw new C3240Gv(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e10) {
            A07(e10);
            throw e10;
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3239Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int read = this.A07.read(bArr, i10, i11);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                long j10 = this.A01;
                if (j10 != -1) {
                    this.A01 = j10 - read;
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j11 = this.A01;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i10, i11);
            }
            return read;
        } catch (IOException e10) {
            if (this.A0A && A0D(e10)) {
                A05();
                return -1;
            }
            A07(e10);
            throw e10;
        }
    }
}
