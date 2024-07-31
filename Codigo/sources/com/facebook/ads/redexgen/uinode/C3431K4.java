package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.K4 */
/* loaded from: assets/audience_network.dex */
public final class C3431K4 {
    public static byte[] A07;
    public static final ThreadFactoryC3539Lr A08;
    public static final Executor A09;
    public static final AtomicReference<InterfaceC3435K8> A0A;
    public long A00;
    public InterfaceC3430K3 A01;
    public Map<String, String> A02;
    public final C23872S A03;
    public final C4337Yn A04;
    public final C3432K5 A05;
    public final String A06;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 80);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{57, 62, 105, 111, 51, 62, 51, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, Byte.MAX_VALUE, 41, 7, 122, Byte.MAX_VALUE, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45, 41, 43, 54, 47, 48, 61, 60};
    }

    static {
        A0A();
        ThreadFactoryC3539Lr threadFactoryC3539Lr = new ThreadFactoryC3539Lr();
        A08 = threadFactoryC3539Lr;
        A09 = Executors.newCachedThreadPool(threadFactoryC3539Lr);
        A0A = new AtomicReference<>();
    }

    public C3431K4(C4337Yn c4337Yn) {
        this(c4337Yn, AbstractC23882T.A00(c4337Yn.A01()));
    }

    public C3431K4(C4337Yn c4337Yn, C23872S c23872s) {
        this.A00 = -1L;
        this.A04 = c4337Yn;
        this.A05 = C3432K5.A00();
        this.A06 = AbstractC3436K9.A01(c4337Yn);
        this.A03 = c23872s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4097Us A02(long j10, C3428K1 c3428k1) {
        return new C4097Us(this, c3428k1, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C4337Yn c4337Yn = this.A04;
        if (c4337Yn == null || !C3896Rc.A0A(c4337Yn)) {
            return;
        }
        C27258B c27258b = new C27258B(A05(7, 5, 107));
        c27258b.A05(1);
        this.A04.A07().A9a(A05(85, 7, 111), AbstractC27248A.A1x, c27258b);
    }

    private void A0B(int i10, String str) {
        String A05 = A05(36, 16, 122);
        String A052 = A05(0, 7, 90);
        String A053 = A05(92, 10, 22);
        AbstractC3416Jp.A05(A053, A05, A052);
        AbstractC3416Jp.A04(A053, String.format(Locale.US, A05(52, 26, 10), Integer.valueOf(i10), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(C3403Jb c3403Jb) {
        InterfaceC3430K3 interfaceC3430K3 = this.A01;
        if (interfaceC3430K3 != null) {
            interfaceC3430K3.ABR(c3403Jb);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C3403Jb c3403Jb) {
        ExecutorC3530Li.A00(new C4095Uq(this, c3403Jb));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C4094Up c4094Up) {
        InterfaceC3430K3 interfaceC3430K3 = this.A01;
        if (interfaceC3430K3 != null) {
            interfaceC3430K3.ADG(c4094Up);
        }
    }

    private void A0L(C4094Up c4094Up) {
        InterfaceC26997l syncModule;
        ExecutorC3530Li.A00(new C4096Ur(this, c4094Up));
        if (C3348Ih.A26(this.A04) && (syncModule = this.A04.A05()) != null) {
            syncModule.A5m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j10, C3428K1 c3428k1) {
        String str2;
        try {
            try {
                C3434K7 A06 = this.A05.A06(this.A04, str, j10);
                C27428S A00 = A06.A00();
                if (A00 != null) {
                    C3348Ih.A0R(this.A04).A2X(A00.A08());
                    this.A04.A07().AAL();
                    this.A03.A0N(A00.A06());
                    AbstractC3427K0.A05(A00.A05().A0B(), c3428k1);
                    C3550M2.A01(this.A04, A09, A00);
                    C27258B c27258b = new C27258B(A05(29, 7, 123) + C3500LE.A02());
                    c27258b.A06(1);
                    c27258b.A0A(false);
                    this.A04.A07().AAA(A05(78, 7, 56), AbstractC27248A.A1W, c27258b);
                }
                switch (C3429K2.A00[A06.A01().ordinal()]) {
                    case 1:
                        C4094Up c4094Up = (C4094Up) A06;
                        if (A00 != null) {
                            if (A00.A05().A0E()) {
                                AbstractC3427K0.A07(str, c3428k1);
                            }
                            Map<String, String> map = this.A02;
                            if (map != null) {
                                str2 = map.get(A05(12, 17, 93));
                            } else {
                                str2 = null;
                            }
                            if (!TextUtils.isEmpty(A06.A02()) && !TextUtils.isEmpty(str2)) {
                                this.A04.A02().AFL(this.A04, str2, A06.A02());
                            }
                        }
                        this.A04.A0E().A2w(C3527Lf.A01(this.A00));
                        A0L(c4094Up);
                        return;
                    case 2:
                        C4093Uo c4093Uo = (C4093Uo) A06;
                        String A04 = c4093Uo.A04();
                        AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c4093Uo.A03(), AdErrorType.ERROR_MESSAGE);
                        A0B(c4093Uo.A03(), A04);
                        if (A04 == null) {
                            A04 = str;
                        }
                        this.A04.A0E().A2v(C3527Lf.A01(this.A00), adErrorTypeFromCode.getErrorCode(), A04, adErrorTypeFromCode.isPublicError());
                        A0D(C3403Jb.A01(adErrorTypeFromCode, A04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A04.A0E().A2v(C3527Lf.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0D(C3403Jb.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e10) {
                e = e10;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0E().A2v(C3527Lf.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(C3403Jb.A01(adErrorType2, message));
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j10, C3428K1 c3428k1) {
        A09.execute(new C4098Ut(this, str, j10, c3428k1));
    }

    public final void A0O(C3428K1 c3428k1) {
        this.A00 = System.currentTimeMillis();
        C27338J.A0B(this.A04);
        A0A.get();
        if (0 != 0) {
            throw new NullPointerException(A05(102, 7, 9));
        }
        if (AbstractC3427K0.A08(c3428k1)) {
            ExecutorC3541Lt.A06.execute(new C4100Uv(this));
            String A02 = AbstractC3427K0.A02(c3428k1);
            if (A02 != null) {
                this.A04.A0E().AGt();
                A0N(A02, 0L, c3428k1);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0E().A2v(C3527Lf.A01(this.A00), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0D(C3403Jb.A01(error, null));
                return;
            }
        }
        A09.execute(new C4099Uu(this, c3428k1));
    }

    public final void A0P(InterfaceC3430K3 interfaceC3430K3) {
        this.A01 = interfaceC3430K3;
    }
}
