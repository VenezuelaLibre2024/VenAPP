package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.util.u1;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzchk implements zzbng {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i10) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                x.b();
                i10 = zzcdv.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcec.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (u1.c()) {
            u1.a("Parse pixels for " + str + ", got string " + str2 + ", int " + i10 + ".");
        }
        return i10;
    }

    private static void zzc(zzcfz zzcfzVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfzVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcec.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzcfzVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfzVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfzVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfzVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:191|(1:(8:194|195|(1:197)(3:215|(1:217)|218)|199|200|201|202|(2:211|212)(2:206|(2:208|209)(1:210)))(1:219))(3:221|(1:223)|224)|220|195|(0)(0)|199|200|201|202|(1:204)|211|212) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03f4, code lost:
    
        if (r3 == (-1)) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03f7  */
    @Override // com.google.android.gms.internal.ads.zzbng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchk.zza(java.lang.Object, java.util.Map):void");
    }
}
