package com.facebook.ads.redexgen.uinode;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.VW */
/* loaded from: assets/audience_network.dex */
public final class C4137VW implements InterfaceC23792K {
    public static C4137VW A01;
    public static byte[] A02;
    public static String[] A03 = {"F9VPCRzHFTAYh6WHGcx0Jd90Enb3hSh2", "fH8nu2kqsRdgHbOq", "0ARAQCTuMPQjF7tJb0MjvB18yGPry4Qu", "N48QVONPfFEZdhqNPTKHT8FFB7x206Ht", "sPSH6DBrw2hyfCGwQm6LEVZ2ITL2jpSj", "gRA8laRbRDS4iSEHtkOaasMfi52gbS0", "x", "ATQcDE"};
    public static final String A04;
    public final LinkedHashMap<String, C3361Iu> A00 = new LinkedHashMap<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{19, 4, 31, 21, 29, 20, 14, 20, 9, 5, 3, 16, 2, 14, 26, 20, 8, 66, 99, 117, 114, 116, 105, Byte.MAX_VALUE, 99, 98, 38, 71, 98, 38, 84, 83, 85, 88, 70, 67, 88, 78, 67, 88, 76, 66, 94};
    }

    static {
        A02();
        A04 = C4137VW.class.getSimpleName();
    }

    public static C4137VW A00() {
        C4137VW c4137vw = A01;
        if (A03[3].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        A03[1] = "1qA3QfWMYYAsctqz";
        if (c4137vw == null) {
            A01 = new C4137VW();
        }
        C4137VW c4137vw2 = A01;
        String[] strArr = A03;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A03[3] = "jddXnAGVDmATkeoPPEKFEO5X5Iu6IeIG";
        return c4137vw2;
    }

    public final InterfaceC236223 A03(String str) {
        C3361Iu adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        return null;
    }

    public final C3361Iu A04(String str) {
        return this.A00.get(str);
    }

    public final C3361Iu A05(String str, Messenger messenger, String str2) {
        C3361Iu c3361Iu = new C3361Iu(str, messenger, str2);
        this.A00.put(str, c3361Iu);
        return c3361Iu;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C3361Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, C3361Iu> next = it.next();
            if (A03[0].charAt(11) == 'O') {
                throw new RuntimeException();
            }
            A03[1] = "vlvRe5nph1i3Qvfj";
            InterfaceC236223 interfaceC236223 = next.getValue().A00;
            if (interfaceC236223 != null) {
                interfaceC236223.destroy();
            }
            it.remove();
        }
    }

    public final void A07(int i10, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i10);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 6), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 80), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C3361Iu c3361Iu = this.A00.get(str);
        if (c3361Iu != null && c3361Iu.A00 != null) {
            String str2 = A01(17, 13, 7) + str;
            c3361Iu.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23792K
    public final void ACJ(int i10, String str, Bundle bundle) {
        C3361Iu adRecord = A04(str);
        if (adRecord != null) {
            A07(i10, str, bundle, adRecord.A01);
        }
        Iterator<Map.Entry<String, C3361Iu>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C3361Iu value = it.next().getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                A08(value.A02);
            }
        }
    }
}