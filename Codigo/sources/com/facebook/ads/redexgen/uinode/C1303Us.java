package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Us, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1303Us implements RL {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ K1 A01;
    public final /* synthetic */ K4 A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{103, 54, 102, 103, 100, 53, 105, 101, 109, 116, 104, 105, 98, 95, 68, 66, 87, 83, 78, 72, 73, 29, 7, 24, 46, 57, 61, 46, 57, 107, 46, 57, 57, 36, 57, 107, 36, 40, 40, 62, 57, 57, 46, 47, 108, 90, 77, 73, 90, 77, 31, 77, 90, 79, 83, 86, 90, 91, 31, 76, 74, 92, 92, 90, 76, 76, 89, 74, 83, 83, 70, 122, 123, 32, 124, 123, 41, 47, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public C1303Us(K4 k42, K1 k12, long j10) {
        this.A02 = k42;
        this.A01 = k12;
        this.A00 = j10;
    }

    private final void A02(RX rx) {
        C1399Yn c1399Yn;
        long j10;
        C1399Yn c1399Yn2;
        long j11;
        K5 k52;
        C1399Yn c1399Yn3;
        C1399Yn c1399Yn4;
        long j12;
        K0.A06(this.A01);
        try {
            RJ response = rx.A00();
            if (response != null) {
                String A69 = response.A69();
                k52 = this.A02.A05;
                c1399Yn3 = this.A02.A04;
                K7 serverResponse = k52.A06(c1399Yn3, A69, this.A00);
                if (serverResponse.A01() == K6.A03) {
                    C1300Uo c1300Uo = (C1300Uo) serverResponse;
                    String A04 = c1300Uo.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1300Uo.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A69 = A04;
                    }
                    c1399Yn4 = this.A02.A04;
                    C0S A0E = c1399Yn4.A0E();
                    j12 = this.A02.A00;
                    A0E.A2v(C1057Lf.A01(j12), adErrorTypeFromCode.getErrorCode(), A69, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C1005Jb.A01(adErrorTypeFromCode, A69));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String errorMessage = rx.getMessage();
            c1399Yn2 = this.A02.A04;
            C0S A0E2 = c1399Yn2.A0E();
            j11 = this.A02.A00;
            A0E2.A2v(C1057Lf.A01(j11), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
            this.A02.A0D(C1005Jb.A01(adErrorType, errorMessage));
        } catch (JSONException e10) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String errorMessage2 = rx.getMessage();
            c1399Yn = this.A02.A04;
            C0S A0E3 = c1399Yn.A0E();
            j10 = this.A02.A00;
            A0E3.A2v(C1057Lf.A01(j10), adErrorType2.getErrorCode(), A00(8, 15, 45) + e10.getMessage(), adErrorType2.isPublicError());
            this.A02.A0D(C1005Jb.A01(adErrorType2, errorMessage2));
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.RL
    public final void AB9(RJ rj2) {
        AbstractC1018Jp.A05(A00(78, 10, 46), A00(44, 27, 53), A00(0, 8, 90));
        if (rj2 != null) {
            String A69 = rj2.A69();
            K0.A06(this.A01);
            this.A02.A0N(A69, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.RL
    public final void ABS(Exception exc) {
        C1399Yn c1399Yn;
        long j10;
        AbstractC1018Jp.A05(A00(88, 7, 58), A00(23, 21, 65), A00(71, 7, 18));
        if (RX.class.equals(exc.getClass())) {
            A02((RX) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String errorMessage = exc.getMessage();
        c1399Yn = this.A02.A04;
        C0S A0E = c1399Yn.A0E();
        j10 = this.A02.A00;
        A0E.A2v(C1057Lf.A01(j10), adErrorType.getErrorCode(), errorMessage, adErrorType.isPublicError());
        this.A02.A0D(C1005Jb.A01(adErrorType, errorMessage));
    }
}
