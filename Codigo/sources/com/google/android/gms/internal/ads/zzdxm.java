package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.v4;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import x8.y;

/* loaded from: classes2.dex */
public final class zzdxm extends zzbog {
    private final zzdxp zza;
    private final zzdxk zzb;
    private final Map zzc = new HashMap();

    public zzdxm(zzdxp zzdxpVar, zzdxk zzdxkVar) {
        this.zza = zzdxpVar;
        this.zzb = zzdxkVar;
    }

    private static u4 zzc(Map map) {
        char c10;
        v4 v4Var = new v4();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return v4Var.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c10 = 3;
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        v4Var.b(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        v4Var.e(arrayList);
                        break;
                    case 2:
                        v4Var.d(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            v4Var.g(0);
                            break;
                        } else {
                            v4Var.g(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            v4Var.h(0);
                            break;
                        } else {
                            v4Var.h(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!y.f30714f.contains(nextString)) {
                            break;
                        } else {
                            v4Var.f(nextString);
                            break;
                        }
                    case 6:
                        v4Var.c(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            zzcec.zze("Ad Request json was malformed, parsing ended early.");
        }
        u4 a10 = v4Var.a();
        Bundle bundle2 = a10.f8761x.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = a10.f8751c;
            a10.f8761x.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new u4(a10.f8749a, a10.f8750b, bundle2, a10.f8752d, a10.f8753e, a10.f8754f, a10.f8755r, a10.f8756s, a10.f8757t, a10.f8758u, a10.f8759v, a10.f8760w, a10.f8761x, a10.f8762y, a10.f8763z, a10.A, a10.B, a10.C, a10.D, a10.E, a10.F, a10.G, a10.H, a10.I, a10.J);
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00a5, code lost:
    
        if (r0.equals("create_interstitial_ad") != false) goto L175;
     */
    @Override // com.google.android.gms.internal.ads.zzboh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxm.zzf(java.lang.String):void");
    }
}
