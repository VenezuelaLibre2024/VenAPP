package com.facebook.ads.redexgen.uinode;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: com.facebook.ads.redexgen.X.EP */
/* loaded from: assets/audience_network.dex */
public class C3088EP extends AbstractC4333Yj<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C27027o A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public C3088EP(C27027o c27027o, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c27027o;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC27057r
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        C4336Ym c4336Ym;
        Lock lock;
        C4336Ym c4336Ym2;
        Lock lock2;
        C4336Ym c4336Ym3;
        Lock lock3;
        C4336Ym c4336Ym4;
        C4335Yl c4335Yl;
        C4334Yk c4334Yk;
        Lock lock4;
        C4336Ym c4336Ym5;
        String eventId = A01(0, 8, 12);
        c4336Ym = this.A03.A01;
        c4336Ym.A07().A8l(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        lock = C27027o.A08;
        lock.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                sQLiteDatabase = this.A03.A0E();
                sQLiteDatabase.beginTransaction();
                c4335Yl = this.A03.A02;
                c4334Yk = this.A03.A03;
                String A0E = c4335Yl.A0E(c4334Yk.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e10) {
                        c4336Ym5 = this.A03.A01;
                        c4336Ym5.A07().A9a(eventId, AbstractC27248A.A0z, new C27258B(e10));
                    }
                }
                lock4 = C27027o.A08;
                lock4.unlock();
                return A0E;
            } catch (Exception e11) {
                A01(EnumC27047q.A06);
                c4336Ym2 = this.A03.A01;
                c4336Ym2.A07().A9a(eventId, AbstractC27248A.A0y, new C27258B(e11));
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Exception e12) {
                        c4336Ym3 = this.A03.A01;
                        c4336Ym3.A07().A9a(eventId, AbstractC27248A.A0z, new C27258B(e12));
                    }
                }
                lock2 = C27027o.A08;
                lock2.unlock();
                return null;
            }
        } catch (Throwable th2) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                try {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                } catch (Exception e13) {
                    c4336Ym4 = this.A03.A01;
                    c4336Ym4.A07().A9a(eventId, AbstractC27248A.A0z, new C27258B(e13));
                }
            }
            lock3 = C27027o.A08;
            lock3.unlock();
            throw th2;
        }
    }
}
