package com.facebook.ads.redexgen.uinode;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Re */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC3898Re extends AsyncTask<String, Void, C3899Rf> {
    public static byte[] A05;
    public static String[] A06 = {"iMGBqiSHm2uYyOurEO", "JHkNge3qKUrOixxb", "Efd0ZU7p6XsOViiGEn9FTnCEMV0phXsZ", "Qqux8MYyckh5CceEy", "ksejtLtP", "6qwv67", "yXEFufBpuo", "JuPO8KFa"};
    public static final String A07;
    public static final Set<String> A08;
    public C26937f A00;
    public InterfaceC3877RJ A01;
    public InterfaceC3897Rd A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C3899Rf A00(String... strArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String A02 = A02(str);
                Map<String, String> map = this.A03;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        A02 = A03(A02, entry.getKey(), entry.getValue());
                    }
                }
                int i10 = 1;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 > 2) {
                        return null;
                    }
                    if (A06(A02)) {
                        return new C3899Rf(this.A01);
                    }
                    i10 = i11;
                }
            }
            return null;
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{48, 0, 3, 57, 33, 22, 22, 11, 22, 68, 11, 20, 1, 10, 13, 10, 3, 68, 17, 22, 8, 94, 68, 122, 117, 122, 119, 116, 124, 44, 55, 46, 46};
    }

    static {
        A04();
        A07 = AsyncTaskC3898Re.class.getSimpleName();
        HashSet hashSet = new HashSet();
        A08 = hashSet;
        hashSet.add(A01(0, 1, 73));
        hashSet.add(A01(29, 4, 24));
    }

    public AsyncTaskC3898Re(C26937f c26937f) {
        this(c26937f, null, null);
    }

    public AsyncTaskC3898Re(C26937f c26937f, Map<String, String> extraData) {
        this(c26937f, extraData, null);
    }

    public AsyncTaskC3898Re(C26937f c26937f, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c26937f;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 65), AbstractC3505LJ.A01(this.A00.A03().A61()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String A01 = A01(3, 1, 92);
        if (str.contains(A01)) {
            A01 = A01(1, 1, 124);
        }
        StringBuilder append = new StringBuilder().append(str).append(A01).append(str2);
        String prepend = A01(2, 1, 100);
        StringBuilder append2 = append.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return append2.append(prepend2).toString();
    }

    private final void A05(C3899Rf response) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            InterfaceC3897Rd interfaceC3897Rd = this.A02;
            if (interfaceC3897Rd != null) {
                interfaceC3897Rd.AEC(response);
            }
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC3877RJ ADy;
        InterfaceC3878RK A00 = C3896Rc.A00(this.A00);
        try {
            Map<String, String> map = this.A04;
            if (map == null || map.size() == 0) {
                ADy = A00.ADy(str, new C3892RY());
            } else {
                C3892RY params = new C3892RY();
                params.A05(this.A04);
                ADy = A00.ADz(str, params.A08());
            }
            this.A01 = ADy;
        } catch (Exception e10) {
            Log.e(A07, A01(4, 19, 62) + str, e10);
        }
        InterfaceC3877RJ interfaceC3877RJ = this.A01;
        String[] strArr = A06;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A06[2] = "iiLT70HajwBiOF9fGWlLisdNhF1wiwwV";
        return interfaceC3877RJ != null && interfaceC3877RJ.A83() == 200;
    }

    public final void A07(InterfaceC3897Rd interfaceC3897Rd) {
        this.A02 = interfaceC3897Rd;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C3899Rf doInBackground(String[] strArr) {
        if (AbstractC3447KL.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        InterfaceC3897Rd interfaceC3897Rd = this.A02;
        if (interfaceC3897Rd != null) {
            interfaceC3897Rd.AEA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C3899Rf c3899Rf) {
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            A05(c3899Rf);
        } catch (Throwable th2) {
            if (A06[3].length() != 17) {
                throw new RuntimeException();
            }
            A06[2] = "KahWFkeddZk466vYoInqTxrEqXEaISmf";
            AbstractC3447KL.A00(th2, this);
        }
    }
}
