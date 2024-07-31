package p218l9;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.util.C5005j2;
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
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: l9.p0 */
/* loaded from: classes.dex */
final class C9442p0 implements zzgej {

    /* renamed from: a */
    final /* synthetic */ InterfaceFutureC5920f f22963a;

    /* renamed from: b */
    final /* synthetic */ zzccx f22964b;

    /* renamed from: c */
    final /* synthetic */ zzccq f22965c;

    /* renamed from: d */
    final /* synthetic */ zzfmo f22966d;

    /* renamed from: e */
    final /* synthetic */ long f22967e;

    /* renamed from: f */
    final /* synthetic */ BinderC9415c f22968f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9442p0(BinderC9415c binderC9415c, InterfaceFutureC5920f interfaceFutureC5920f, zzccx zzccxVar, zzccq zzccqVar, zzfmo zzfmoVar, long j10) {
        this.f22963a = interfaceFutureC5920f;
        this.f22964b = zzccxVar;
        this.f22965c = zzccqVar;
        this.f22966d = zzfmoVar;
        this.f22967e = j10;
        this.f22968f = binderC9415c;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzdwk zzdwkVar;
        zzdwa zzdwaVar;
        long mo28130a = C4965t.m12565b().mo28130a() - this.f22967e;
        String message = th2.getMessage();
        C4965t.m12580q().zzw(th2, "SignalGeneratorImpl.generateSignals");
        BinderC9415c binderC9415c = this.f22968f;
        zzdwkVar = binderC9415c.f22907y;
        zzdwaVar = binderC9415c.f22899f;
        C9454y.m28109c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", message), new Pair("tqgt", String.valueOf(mo28130a)));
        zzfmz m28059P2 = BinderC9415c.m28059P2(this.f22963a, this.f22964b);
        if (((Boolean) zzbht.zze.zze()).booleanValue() && m28059P2 != null) {
            zzfmo zzfmoVar = this.f22966d;
            zzfmoVar.zzg(th2);
            zzfmoVar.zzf(false);
            m28059P2.zza(zzfmoVar);
            m28059P2.zzg();
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.f22965c.zzb(message);
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
        C9439o c9439o = (C9439o) obj;
        zzfmz m28059P2 = BinderC9415c.m28059P2(this.f22963a, this.f22964b);
        atomicBoolean = this.f22968f.f22891P;
        atomicBoolean.set(true);
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzhD)).booleanValue()) {
            long mo28130a = C4965t.m12565b().mo28130a() - this.f22967e;
            try {
                try {
                    if (c9439o == null) {
                        this.f22965c.zzc(null, null, null);
                        BinderC9415c binderC9415c = this.f22968f;
                        zzdwkVar4 = binderC9415c.f22907y;
                        zzdwaVar5 = binderC9415c.f22899f;
                        C9454y.m28109c(zzdwkVar4, zzdwaVar5, "sgs", new Pair("rid", "-1"));
                        this.f22966d.zzf(true);
                        if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                            return;
                        }
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(c9439o.f22959b);
                            String optString = jSONObject.optString("request_id", "");
                            if (TextUtils.isEmpty(optString)) {
                                zzcec.zzj("The request ID is empty in request JSON.");
                                this.f22965c.zzb("Internal error: request ID is empty in request JSON.");
                                BinderC9415c binderC9415c2 = this.f22968f;
                                zzdwkVar3 = binderC9415c2.f22907y;
                                zzdwaVar4 = binderC9415c2.f22899f;
                                C9454y.m28109c(zzdwkVar3, zzdwaVar4, "sgf", new Pair("sgf_reason", "rid_missing"));
                                zzfmo zzfmoVar2 = this.f22966d;
                                zzfmoVar2.zzc("Request ID empty");
                                zzfmoVar2.zzf(false);
                                if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                                    return;
                                }
                            } else {
                                BinderC9415c binderC9415c3 = this.f22968f;
                                String str7 = c9439o.f22959b;
                                zzdwaVar2 = binderC9415c3.f22899f;
                                BinderC9415c.m28072p2(binderC9415c3, optString, str7, zzdwaVar2);
                                Bundle bundle = c9439o.f22960c;
                                BinderC9415c binderC9415c4 = this.f22968f;
                                z10 = binderC9415c4.f22879D;
                                if (z10 && bundle != null) {
                                    str5 = binderC9415c4.f22881F;
                                    if (bundle.getInt(str5, -1) == -1) {
                                        BinderC9415c binderC9415c5 = this.f22968f;
                                        str6 = binderC9415c5.f22881F;
                                        atomicInteger = binderC9415c5.f22882G;
                                        bundle.putInt(str6, atomicInteger.get());
                                    }
                                }
                                BinderC9415c binderC9415c6 = this.f22968f;
                                z11 = binderC9415c6.f22878C;
                                if (z11 && bundle != null) {
                                    str = binderC9415c6.f22880E;
                                    if (TextUtils.isEmpty(bundle.getString(str))) {
                                        str2 = this.f22968f.f22884I;
                                        if (TextUtils.isEmpty(str2)) {
                                            BinderC9415c binderC9415c7 = this.f22968f;
                                            C5005j2 m12581r = C4965t.m12581r();
                                            BinderC9415c binderC9415c8 = this.f22968f;
                                            context = binderC9415c8.f22895b;
                                            zzceiVar = binderC9415c8.f22883H;
                                            binderC9415c7.f22884I = m12581r.m12689E(context, zzceiVar.zza);
                                        }
                                        BinderC9415c binderC9415c9 = this.f22968f;
                                        str3 = binderC9415c9.f22880E;
                                        str4 = binderC9415c9.f22884I;
                                        bundle.putString(str3, str4);
                                    }
                                }
                                this.f22965c.zzc(c9439o.f22958a, c9439o.f22959b, bundle);
                                BinderC9415c binderC9415c10 = this.f22968f;
                                zzdwkVar2 = binderC9415c10.f22907y;
                                zzdwaVar3 = binderC9415c10.f22899f;
                                Pair[] pairArr = new Pair[2];
                                pairArr[0] = new Pair("tqgt", String.valueOf(mo28130a));
                                String str8 = "na";
                                if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzju)).booleanValue()) {
                                    try {
                                        str8 = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                                    } catch (JSONException e10) {
                                        zzcec.zzh("Error retrieving JSONObject from the requestJson, ", e10);
                                    }
                                }
                                pairArr[1] = new Pair("tpc", str8);
                                C9454y.m28109c(zzdwkVar2, zzdwaVar3, "sgs", pairArr);
                                this.f22966d.zzf(true);
                                if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                                    return;
                                }
                            }
                        } catch (JSONException e11) {
                            zzcec.zzj("Failed to create JSON object from the request string.");
                            this.f22965c.zzb("Internal error for request JSON: " + e11.toString());
                            BinderC9415c binderC9415c11 = this.f22968f;
                            zzdwkVar = binderC9415c11.f22907y;
                            zzdwaVar = binderC9415c11.f22899f;
                            C9454y.m28109c(zzdwkVar, zzdwaVar, "sgf", new Pair("sgf_reason", "request_invalid"));
                            zzfmo zzfmoVar3 = this.f22966d;
                            zzfmoVar3.zzg(e11);
                            zzfmoVar3.zzf(false);
                            C4965t.m12580q().zzw(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                            if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                                return;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    if (((Boolean) zzbht.zze.zze()).booleanValue() && m28059P2 != null) {
                        m28059P2.zza(this.f22966d);
                        m28059P2.zzg();
                    }
                    throw th2;
                }
            } catch (RemoteException e12) {
                zzfmo zzfmoVar4 = this.f22966d;
                zzfmoVar4.zzg(e12);
                zzfmoVar4.zzf(false);
                zzcec.zzh("", e12);
                C4965t.m12580q().zzw(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                    return;
                }
            }
            zzfmoVar = this.f22966d;
        } else {
            try {
                this.f22965c.zzb("QueryInfo generation has been disabled.");
            } catch (RemoteException e13) {
                zzcec.zzg("QueryInfo generation has been disabled.".concat(e13.toString()));
            }
            if (!((Boolean) zzbht.zze.zze()).booleanValue() || m28059P2 == null) {
                return;
            }
            zzfmoVar = this.f22966d;
            zzfmoVar.zzc("QueryInfo generation has been disabled.");
            zzfmoVar.zzf(false);
        }
        m28059P2.zza(zzfmoVar);
        m28059P2.zzg();
    }
}
