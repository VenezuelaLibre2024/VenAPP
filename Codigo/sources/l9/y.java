package l9;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.a1;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcep;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzfhh;
import java.util.Map;

/* loaded from: classes.dex */
public final class y {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a(String str) {
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

    public static String b(u4 u4Var) {
        Bundle bundle;
        return (u4Var == null || (bundle = u4Var.f8751c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void c(zzdwk zzdwkVar, zzdwa zzdwaVar, String str, Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzha)).booleanValue()) {
            zzcep.zza.execute(new Runnable() { // from class: l9.x

                /* renamed from: b */
                public final /* synthetic */ zzdwa f21144b;

                /* renamed from: c */
                public final /* synthetic */ String f21145c;

                /* renamed from: d */
                public final /* synthetic */ Pair[] f21146d;

                public /* synthetic */ x(zzdwa zzdwaVar2, String str2, Pair[] pairArr2) {
                    r2 = zzdwaVar2;
                    r3 = str2;
                    r4 = pairArr2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    y.d(zzdwk.this, r2, r3, r4);
                }
            });
        }
    }

    public static void d(zzdwk zzdwkVar, zzdwa zzdwaVar, String str, Pair... pairArr) {
        Map zzc = zzdwaVar == null ? zzdwkVar.zzc() : zzdwaVar.zza();
        f(zzc, "action", str);
        for (Pair pair : pairArr) {
            f(zzc, (String) pair.first, (String) pair.second);
        }
        zzdwkVar.zzf(zzc);
    }

    public static int e(zzfhh zzfhhVar) {
        if (zzfhhVar.zzq) {
            return 2;
        }
        u4 u4Var = zzfhhVar.zzd;
        a1 a1Var = u4Var.D;
        if (a1Var == null && u4Var.I == null) {
            return 1;
        }
        if (a1Var == null || u4Var.I == null) {
            return a1Var != null ? 3 : 4;
        }
        return 5;
    }

    private static void f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
