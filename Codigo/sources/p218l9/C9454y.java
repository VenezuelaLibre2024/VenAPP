package p218l9;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4785a1;
import com.google.android.gms.ads.internal.client.C4917u4;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzfhh;
import java.util.Map;

/* renamed from: l9.y */
/* loaded from: classes.dex */
public final class C9454y {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static String m28107a(String str) {
        char c10;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    /* renamed from: b */
    public static String m28108b(C4917u4 c4917u4) {
        Bundle bundle;
        return (c4917u4 == null || (bundle = c4917u4.f9838c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* renamed from: c */
    public static void m28109c(final zzdwk zzdwkVar, final zzdwa zzdwaVar, final String str, final Pair... pairArr) {
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzha)).booleanValue()) {
            zzcep.zza.execute(new Runnable() { // from class: l9.x
                @Override // java.lang.Runnable
                public final void run() {
                    C9454y.m28110d(zzdwk.this, zzdwaVar, str, pairArr);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m28110d(zzdwk zzdwkVar, zzdwa zzdwaVar, String str, Pair... pairArr) {
        Map zzc = zzdwaVar == null ? zzdwkVar.zzc() : zzdwaVar.zza();
        m28112f(zzc, "action", str);
        for (Pair pair : pairArr) {
            m28112f(zzc, (String) pair.first, (String) pair.second);
        }
        zzdwkVar.zzf(zzc);
    }

    /* renamed from: e */
    public static int m28111e(zzfhh zzfhhVar) {
        if (zzfhhVar.zzq) {
            return 2;
        }
        C4917u4 c4917u4 = zzfhhVar.zzd;
        C4785a1 c4785a1 = c4917u4.f9829D;
        if (c4785a1 == null && c4917u4.f9834I == null) {
            return 1;
        }
        if (c4785a1 == null || c4917u4.f9834I == null) {
            return c4785a1 != null ? 3 : 4;
        }
        return 5;
    }

    /* renamed from: f */
    private static void m28112f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
