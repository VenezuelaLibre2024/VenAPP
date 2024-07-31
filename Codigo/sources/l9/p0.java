package l9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.util.j2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdwa;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzfmo;
import com.google.android.gms.internal.ads.zzfmz;
import com.google.android.gms.internal.ads.zzgej;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class p0 implements zzgej {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.f f21110a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ zzccx f21111b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzccq f21112c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzfmo f21113d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f21114e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f21115f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(c cVar, com.google.common.util.concurrent.f fVar, zzccx zzccxVar, zzccq zzccqVar, zzfmo zzfmoVar, long j10) {
        this.f21110a = fVar;
        this.f21111b = zzccxVar;
        this.f21112c = zzccqVar;
        this.f21113d = zzfmoVar;
        this.f21114e = j10;
        this.f21115f = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        long a10 = com.google.android.gms.ads.internal.t.b().a() - this.f21114e;
        String message = th2.getMessage();
        com.google.android.gms.ads.internal.t.q().zzw(th2, "SignalGeneratorImpl.generateSignals");
        c cVar = this.f21115f;
        zzdwkVar = cVar.f21054y;
        zzdwaVar = cVar.f21046f;
        y.c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(a10)));
        zzfmz P2 = c.P2(this.f21110a, this.f21111b);
        if (((Boolean) zzbht.zze.zze()).booleanValue() && P2 != null) {
            zzfmo zzfmoVar = this.f21113d;
            zzfmoVar.zzg(th2);
            zzfmoVar.zzf(false);
            P2.zza(zzfmoVar);
            P2.zzg();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f21112c.zzb(message);
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        AtomicBoolean atomicBoolean;
        zzfmo zzfmoVar;
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        zzdwa zzdwaVar2;
        boolean z10;
        boolean z11;
        zzdwk zzdwkVar2;
        zzdwa zzdwaVar3;
        String str;
        String str2;
        String str3;
        String str4;
        Context context;
        zzcei zzceiVar;
        String str5;
        String str6;
        AtomicInteger atomicInteger;
        zzdwk zzdwkVar3;
        zzdwa zzdwaVar4;
        zzdwk zzdwkVar4;
        zzdwa zzdwaVar5;
        o oVar = (o) obj;
        zzfmz P2 = c.P2(this.f21110a, this.f21111b);
        atomicBoolean = this.f21115f.P;
        atomicBoolean.set(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzhD)).booleanValue()) {
            long a10 = com.google.android.gms.ads.internal.t.b().a() - this.f21114e;
            try {
                try {
                    if (oVar == null) {
                        this.f21112c.zzc(null, null, null);
                        c cVar = this.f21115f;
                        zzdwkVar4 = cVar.f21054y;
                        zzdwaVar5 = cVar.f21046f;
                        y.c(zzdwkVar4, zzdwaVar5, "sgs", new Pair("rid", "-1"));
                        this.f21113d.zzf(true);
                        if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(oVar.f21106b);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                zzcec.zzj("The request ID is empty in request JSON.");
                                this.f21112c.zzb("Internal error: request ID is empty in request JSON.");
                                c cVar2 = this.f21115f;
                                zzdwkVar3 = cVar2.f21054y;
                                zzdwaVar4 = cVar2.f21046f;
                                y.c(zzdwkVar3, zzdwaVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                                zzfmo zzfmoVar2 = this.f21113d;
                                zzfmoVar2.zzc("Request ID empty");
                                zzfmoVar2.zzf(false);
                                if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                                    return;
                                }
                            } else {
                                c cVar3 = this.f21115f;
                                String str7 = oVar.f21106b;
                                zzdwaVar2 = cVar3.f21046f;
                                c.p2(cVar3, optString, str7, zzdwaVar2);
                                Bundle bundle = oVar.f21107c;
                                c cVar4 = this.f21115f;
                                z10 = cVar4.D;
                                if (z10 && bundle != null) {
                                    str5 = cVar4.F;
                                    if (bundle.getInt(str5, -1) == -1) {
                                        c cVar5 = this.f21115f;
                                        str6 = cVar5.F;
                                        atomicInteger = cVar5.G;
                                        bundle.putInt(str6, atomicInteger.get());
                                    }
                                }
                                c cVar6 = this.f21115f;
                                z11 = cVar6.C;
                                if (z11 && bundle != null) {
                                    str = cVar6.E;
                                    if (TextUtils.isEmpty(bundle.getString(str))) {
                                        str2 = this.f21115f.I;
                                        if (TextUtils.isEmpty(str2)) {
                                            c cVar7 = this.f21115f;
                                            j2 r10 = com.google.android.gms.ads.internal.t.r();
                                            c cVar8 = this.f21115f;
                                            context = cVar8.f21042b;
                                            zzceiVar = cVar8.H;
                                            cVar7.I = r10.E(context, zzceiVar.zza);
                                        }
                                        c cVar9 = this.f21115f;
                                        str3 = cVar9.E;
                                        str4 = cVar9.I;
                                        bundle.putString(str3, str4);
                                    }
                                }
                                this.f21112c.zzc(oVar.f21105a, oVar.f21106b, bundle);
                                c cVar10 = this.f21115f;
                                zzdwkVar2 = cVar10.f21054y;
                                zzdwaVar3 = cVar10.f21046f;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(a10));
                                String str8 = "na";
                                if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzju)).booleanValue()) {
                                    try {
                                        str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e10) {
                                        zzcec.zzh("Error retrieving JSONObject from the requestJson, ", e10);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str8);
                                y.c(zzdwkVar2, zzdwaVar3, "sgs", pairArr);
                                this.f21113d.zzf(true);
                                if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e11) {
                            zzcec.zzj("Failed to create JSON object from the request string.");
                            this.f21112c.zzb("Internal error for request JSON: " + e11.toString());
                            c cVar11 = this.f21115f;
                            zzdwkVar = cVar11.f21054y;
                            zzdwaVar = cVar11.f21046f;
                            y.c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                            zzfmo zzfmoVar3 = this.f21113d;
                            zzfmoVar3.zzg(e11);
                            zzfmoVar3.zzf(false);
                            com.google.android.gms.ads.internal.t.q().zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    if (((Boolean) zzbht.zze.zze()).booleanValue() && P2 != null) {
                        P2.zza(this.f21113d);
                        P2.zzg();
                    }
                    throw th2;
                }
            } catch (RemoteException e12) {
                zzfmo zzfmoVar4 = this.f21113d;
                zzfmoVar4.zzg(e12);
                zzfmoVar4.zzf(false);
                zzcec.zzh("", e12);
                com.google.android.gms.ads.internal.t.q().zzw(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                    return;
                }
            }
            zzfmoVar = this.f21113d;
        } else {
            try {
                this.f21112c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e13) {
                zzcec.zzg("QueryInfo generation has been disabled.".concat(e13.toString()));
            }
            if (!((Boolean) zzbht.zze.zze()).booleanValue() || P2 == null) {
                return;
            }
            zzfmoVar = this.f21113d;
            zzfmoVar.zzc("QueryInfo generation has been disabled.");
            zzfmoVar.zzf(false);
        }
        P2.zza(zzfmoVar);
        P2.zzg();
    }
}
