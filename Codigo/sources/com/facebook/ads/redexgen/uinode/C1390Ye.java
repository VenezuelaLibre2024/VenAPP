package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1390Ye extends KT {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C07277f A01;
    public final /* synthetic */ AnonymousClass83 A02;
    public final /* synthetic */ C8B A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, 63, 55, 43, 63, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public C1390Ye(C07277f c07277f, String str, int i10, C8B c8b, AnonymousClass83 anonymousClass83) {
        this.A01 = c07277f;
        this.A04 = str;
        this.A00 = i10;
        this.A03 = c8b;
        this.A02 = anonymousClass83;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        String str;
        Map<String, String> A4n;
        String A7F;
        AtomicReference atomicReference;
        try {
            if (AnonymousClass84.A0K(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            JD.A08(this.A01, J5.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                str = LW.A03(this.A01, cause);
            } else if (Ij.A0R(this.A01)) {
                C07277f c07277f = this.A01;
                Throwable deLogExceptionCause = this.A03;
                str = LW.A03(c07277f, deLogExceptionCause);
            } else {
                str = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (Ij.A0V(this.A01)) {
                A4n = this.A01.A03().A4n();
            } else {
                AnonymousClass83 anonymousClass83 = this.A02;
                if (anonymousClass83 != null) {
                    A4n = anonymousClass83.A6x();
                } else if (AnonymousClass84.A02) {
                    AnonymousClass84.A0F(new RuntimeException(A00(1, 57, 65), this.A03));
                    A4n = new HashMap<>();
                } else {
                    A4n = this.A01.A03().A4n();
                }
            }
            A4n.put(A00(136, 7, 65), this.A04);
            A4n.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject A03 = this.A03.A03();
            if (A03 != null) {
                A4n.put(A00(71, 15, 69), A03.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(111, 15, 126).equals(this.A04)) && (A7F = this.A01.A03().A7F()) != null) {
                A4n.put(A00(86, 20, 84), A7F);
            }
            String A0B = this.A01.A0B();
            if (A0B != null && !TextUtils.isEmpty(A0B)) {
                A4n.put(A00(126, 10, 4), A0B);
            }
            atomicReference = AnonymousClass84.A0A;
            AnonymousClass82 anonymousClass82 = (AnonymousClass82) atomicReference.get();
            if (anonymousClass82 == null) {
                AnonymousClass84.A0F(new RuntimeException(A00(58, 13, 7)));
            } else {
                anonymousClass82.AHD(str, A4n, this.A01);
            }
        } catch (Throwable t10) {
            AnonymousClass84.A0F(t10);
        }
    }
}