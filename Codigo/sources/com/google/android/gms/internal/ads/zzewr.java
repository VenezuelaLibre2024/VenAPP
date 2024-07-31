package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l9.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzewr implements zzexq {
    final String zza;
    private final zzgey zzb;
    private final ScheduledExecutorService zzc;
    private final zzepa zzd;
    private final Context zze;
    private final zzfhh zzf;
    private final zzeow zzg;
    private final zzdua zzh;
    private final zzdyk zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzewr(zzgey zzgeyVar, ScheduledExecutorService scheduledExecutorService, String str, zzepa zzepaVar, Context context, zzfhh zzfhhVar, zzeow zzeowVar, zzdua zzduaVar, zzdyk zzdykVar) {
        this.zzb = zzgeyVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzepaVar;
        this.zze = context;
        this.zzf = zzfhhVar;
        this.zzg = zzeowVar;
        this.zzh = zzduaVar;
        this.zzi = zzdykVar;
    }

    public static /* synthetic */ com.google.common.util.concurrent.f zzc(zzewr zzewrVar) {
        Map zza;
        String lowerCase = ((Boolean) a0.c().zza(zzbgc.zzkr)).booleanValue() ? zzewrVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzewrVar.zzf.zzf;
        final Bundle zzg = ((Boolean) a0.c().zza(zzbgc.zzbD)).booleanValue() ? zzewrVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) a0.c().zza(zzbgc.zzbM)).booleanValue()) {
            zza = zzewrVar.zzd.zza(zzewrVar.zza, lowerCase);
        } else {
            for (Map.Entry entry : ((zzgad) zzewrVar.zzd.zzb(zzewrVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzewrVar.zzg(str, (List) entry.getValue(), zzewrVar.zzf(str), true, true));
            }
            zza = zzewrVar.zzd.zzc();
        }
        zzewrVar.zzi(arrayList, zza);
        return zzgen.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzewm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (com.google.common.util.concurrent.f fVar : arrayList) {
                    if (((JSONObject) fVar.get()) != null) {
                        jSONArray.put(fVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzews(jSONArray.toString(), zzg);
            }
        }, zzewrVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.f8761x;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgee zzg(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgee zzu = zzgee.zzu(zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzewo
            @Override // com.google.android.gms.internal.ads.zzgdt
            public final com.google.common.util.concurrent.f zza() {
                return zzewr.this.zzd(str, list, bundle, z10, z11);
            }
        }, this.zzb));
        if (!((Boolean) a0.c().zza(zzbgc.zzbz)).booleanValue()) {
            zzu = (zzgee) zzgen.zzo(zzu, ((Long) a0.c().zza(zzbgc.zzbs)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgee) zzgen.zze(zzu, Throwable.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzewp
            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                zzcec.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbus zzbusVar, Bundle bundle, List list, zzepd zzepdVar) {
        zzbusVar.zzh(com.google.android.gms.dynamic.d.h2(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzepdVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzepe zzepeVar = (zzepe) ((Map.Entry) it.next()).getValue();
            String str = zzepeVar.zza;
            list.add(zzg(str, Collections.singletonList(zzepeVar.zze), zzf(str), zzepeVar.zzb, zzepeVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzexq
    public final com.google.common.util.concurrent.f zzb() {
        zzfhh zzfhhVar = this.zzf;
        if (zzfhhVar.zzq) {
            if (!Arrays.asList(((String) a0.c().zza(zzbgc.zzbF)).split(",")).contains(y.a(y.b(zzfhhVar.zzd)))) {
                return zzgen.zzh(new zzews(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgen.zzk(new zzgdt() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzgdt
            public final com.google.common.util.concurrent.f zza() {
                return zzewr.zzc(zzewr.this);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.common.util.concurrent.f zzd(java.lang.String r9, final java.util.List r10, final android.os.Bundle r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzceu r7 = new com.google.android.gms.internal.ads.zzceu
            r7.<init>()
            r0 = 0
            if (r13 == 0) goto L26
            com.google.android.gms.internal.ads.zzbfu r13 = com.google.android.gms.internal.ads.zzbgc.zzbE
            com.google.android.gms.internal.ads.zzbga r1 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r13 = r1.zza(r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L26
            com.google.android.gms.internal.ads.zzeow r13 = r8.zzg
            r13.zzb(r9)
            com.google.android.gms.internal.ads.zzeow r13 = r8.zzg
            com.google.android.gms.internal.ads.zzbus r13 = r13.zza(r9)
            goto L34
        L26:
            com.google.android.gms.internal.ads.zzdua r13 = r8.zzh     // Catch: android.os.RemoteException -> L2d
            com.google.android.gms.internal.ads.zzbus r13 = r13.zzb(r9)     // Catch: android.os.RemoteException -> L2d
            goto L34
        L2d:
            r13 = move-exception
            java.lang.String r1 = "Couldn't create RTB adapter : "
            com.google.android.gms.internal.ads.zzcec.zzh(r1, r13)
            r13 = r0
        L34:
            if (r13 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbfu r10 = com.google.android.gms.internal.ads.zzbgc.zzbu
            com.google.android.gms.internal.ads.zzbga r11 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r10 = r11.zza(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L4d
            com.google.android.gms.internal.ads.zzepd.zzb(r9, r7)
            goto Lba
        L4d:
            throw r0
        L4e:
            com.google.android.gms.internal.ads.zzepd r6 = new com.google.android.gms.internal.ads.zzepd
            la.f r0 = com.google.android.gms.ads.internal.t.b()
            long r4 = r0.b()
            r0 = r6
            r1 = r9
            r2 = r13
            r3 = r7
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbfu r9 = com.google.android.gms.internal.ads.zzbgc.zzbz
            com.google.android.gms.internal.ads.zzbga r0 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r9 = r0.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8d
            java.util.concurrent.ScheduledExecutorService r9 = r8.zzc
            com.google.android.gms.internal.ads.zzewq r0 = new com.google.android.gms.internal.ads.zzewq
            r0.<init>()
            com.google.android.gms.internal.ads.zzbfu r1 = com.google.android.gms.internal.ads.zzbgc.zzbs
            com.google.android.gms.internal.ads.zzbga r2 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r9.schedule(r0, r1, r3)
        L8d:
            if (r12 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbfu r9 = com.google.android.gms.internal.ads.zzbgc.zzbG
            com.google.android.gms.internal.ads.zzbga r12 = com.google.android.gms.ads.internal.client.a0.c()
            java.lang.Object r9 = r12.zza(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzgey r9 = r8.zzb
            com.google.android.gms.internal.ads.zzewn r12 = new com.google.android.gms.internal.ads.zzewn
            r0 = r12
            r1 = r8
            r2 = r13
            r3 = r11
            r4 = r10
            r5 = r6
            r6 = r7
            r0.<init>()
            r9.zza(r12)
            goto Lba
        Lb3:
            r8.zzh(r13, r11, r10, r6)
            goto Lba
        Lb7:
            r6.zzd()
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewr.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):com.google.common.util.concurrent.f");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbus zzbusVar, Bundle bundle, List list, zzepd zzepdVar, zzceu zzceuVar) {
        try {
            zzh(zzbusVar, bundle, list, zzepdVar);
        } catch (RemoteException e10) {
            zzceuVar.zzd(e10);
        }
    }
}
