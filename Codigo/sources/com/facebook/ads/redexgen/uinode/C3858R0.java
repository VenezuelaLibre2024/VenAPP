package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.R0 */
/* loaded from: assets/audience_network.dex */
public final class C3858R0 {
    public static C3858R0 A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public C3079EG A00;
    public InterfaceC3265HK A01;
    public File A02;
    public boolean A03;
    public final C4336Ym A06;
    public final InterfaceC3072E9 A07;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C3856Qy> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC3855Qx(this);

    public static String A07(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{C4201WY.A03};
    }

    public C3858R0(C4336Ym c4336Ym, C3079EG c3079eg) {
        C3423Jw c3423Jw = new C3423Jw(this);
        this.A07 = c3423Jw;
        this.A06 = c4336Ym;
        if (c3079eg != null) {
            this.A00 = c3079eg;
            c3079eg.A0Q(c3423Jw);
        }
        A01().A0P();
    }

    private synchronized C3079EG A01() {
        if (this.A00 == null) {
            C3079EG c3079eg = new C3079EG(new C3084EL(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00 = c3079eg;
            c3079eg.A0Q(this.A07);
        }
        return this.A00;
    }

    private C248241 A02() {
        return new C248241(A07(78, 3, 89), null);
    }

    private final synchronized InterfaceC3265HK A03() {
        if (this.A01 == null) {
            this.A01 = new C4147Vg(new File(A06(), A07(64, 14, 16)), new C2942Bk(C3348Ih.A0P(this.A06)));
        }
        return this.A01;
    }

    public static C4150Vj A04(C4166Vz c4166Vz, InterfaceC3265HK interfaceC3265HK) {
        return new C4150Vj(interfaceC3265HK, c4166Vz, new C4162Vv(), null, 2, null);
    }

    public static synchronized C3858R0 A05(C4336Ym c4336Ym) {
        C3858R0 c3858r0;
        synchronized (C3858R0.class) {
            if (A09 == null) {
                A09 = new C3858R0(c4336Ym, null);
            }
            c3858r0 = A09;
        }
        return c3858r0;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(C4336Ym c4336Ym, Uri uri) {
        try {
            if (!C3348Ih.A1T(c4336Ym)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e10) {
            c4336Ym.A07().A9a(A07(81, 5, 14), AbstractC27248A.A0u, new C27258B(e10));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (C3078EF c3078ef : A01().A0S()) {
            int taskId = c3078ef.A02;
            C3856Qy c3856Qy = this.A05.get(taskId);
            if (c3856Qy != null) {
                int i10 = c3078ef.A01;
                if (i10 == 2 || c3078ef.A03 > c3856Qy.A00) {
                    String str = A07(15, 19, 61) + i10 + A07(0, 8, 18) + c3078ef.A03;
                    c3856Qy.A01.ABL(c3856Qy.A02);
                    this.A05.remove(taskId);
                } else if (i10 == 4 || i10 == 3) {
                    String str2 = A07(34, 14, 111) + i10;
                    c3856Qy.A01.ABT(c3078ef.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + c3078ef.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C4150Vj A0F(Context context) {
        return A04(new C4166Vz(context, (InterfaceC3261HG<? super InterfaceC3239Gu>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC3857Qz interfaceC3857Qz, long j10) {
        String A08 = A08(this.A06, uri);
        if (A08 == null) {
            A08 = uri.toString();
        }
        boolean A0H = A0H(A08);
        this.A05.put(A01().A0O(new C4201WY(uri, false, null, A08)), new C3856Qy(interfaceC3857Qz, j10, A0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6G(str, 0L, 1L) > 0;
    }
}
