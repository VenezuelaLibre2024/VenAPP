package com.facebook.ads.redexgen.uinode;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wp */
/* loaded from: assets/audience_network.dex */
public class C4215Wp implements InterfaceC3020D6 {
    public static String[] A05 = {"ZoOhGYHP8SNfCMTpI8hB8esJvCxQNk4a", "iCY0vtQk2BMTn8YKksXnllwhxYcEMWPa", "FRJmrfeKqiG8dvU06WzW6", "wyGcQq4l", "", "l2", "ODNaIWitniiqKmZchEPotBtPtmPon6SS", "r1S7VBlY5d2QYAsiLWImTDUS2fBhu4wR"};
    public final int A00;
    public final /* synthetic */ C4214Wo A04;
    public final C3305Hy A03 = new C3305Hy(new byte[5]);
    public final SparseArray<InterfaceC3026DD> A01 = new SparseArray<>();
    public final SparseIntArray A02 = new SparseIntArray();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4R(com.facebook.ads.redexgen.uinode.C3306Hz r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4215Wp.A4R(com.facebook.ads.redexgen.X.Hz):void");
    }

    public C4215Wp(C4214Wo c4214Wo, int i10) {
        this.A04 = c4214Wo;
        this.A00 = i10;
    }

    private C3023DA A00(C3306Hz c3306Hz, int i10) {
        long j10;
        long formatIdentifier;
        long j11;
        int A06 = c3306Hz.A06();
        int i11 = A06 + i10;
        int i12 = -1;
        String language = null;
        ArrayList arrayList = null;
        while (c3306Hz.A06() < i11) {
            int descriptorsStartPosition = c3306Hz.A0E();
            int positionOfNextDescriptor = c3306Hz.A06() + c3306Hz.A0E();
            if (descriptorsStartPosition == 5) {
                long A0M = c3306Hz.A0M();
                j10 = C4214Wo.A0F;
                if (A0M != j10) {
                    formatIdentifier = C4214Wo.A0G;
                    if (A05[0].charAt(13) == 108) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "OX";
                    strArr[4] = "";
                    if (A0M != formatIdentifier) {
                        j11 = C4214Wo.A0H;
                        if (A0M == j11) {
                            i12 = 36;
                        }
                    } else {
                        i12 = 135;
                    }
                } else {
                    i12 = 129;
                }
            } else if (descriptorsStartPosition == 106) {
                i12 = 129;
            } else if (descriptorsStartPosition == 122) {
                i12 = 135;
            } else if (descriptorsStartPosition == 123) {
                i12 = 138;
            } else if (descriptorsStartPosition == 10) {
                language = c3306Hz.A0S(3).trim();
            } else if (descriptorsStartPosition == 89) {
                i12 = 89;
                arrayList = new ArrayList();
                while (c3306Hz.A06() < positionOfNextDescriptor) {
                    String trim = c3306Hz.A0S(3).trim();
                    int A0E = c3306Hz.A0E();
                    byte[] bArr = new byte[4];
                    c3306Hz.A0c(bArr, 0, 4);
                    arrayList.add(new C3022D9(trim, A0E, bArr));
                }
            }
            c3306Hz.A0Z(positionOfNextDescriptor - c3306Hz.A06());
        }
        c3306Hz.A0Y(i11);
        return new C3023DA(i12, language, arrayList, Arrays.copyOfRange(c3306Hz.A00, A06, i11));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3020D6
    public final void A8q(C3318IB c3318ib, InterfaceC2952Bu interfaceC2952Bu, C3025DC c3025dc) {
    }
}
