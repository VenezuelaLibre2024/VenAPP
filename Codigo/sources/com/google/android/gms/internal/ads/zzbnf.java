package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbnf {
    public static final zzbng zza = zzbmd.zza;
    public static final zzbng zzb = zzbmf.zza;
    public static final zzbng zzc = zzbmi.zza;
    public static final zzbng zzd = new zzbmx();
    public static final zzbng zze = new zzbmy();
    public static final zzbng zzf = zzbmj.zza;
    public static final zzbng zzg = new zzbmz();
    public static final zzbng zzh = new zzbna();
    public static final zzbng zzi = zzbmh.zza;
    public static final zzbng zzj = new zzbnb();
    public static final zzbng zzk = new zzbnc();
    public static final zzbng zzl = new zzchk();
    public static final zzbng zzm = new zzchl();
    public static final zzbng zzn = new zzblz();
    public static final zzbnv zzo = new zzbnv();
    public static final zzbng zzp = new zzbnd();
    public static final zzbng zzq = new zzbne();
    public static final zzbng zzr = new zzbmk();
    public static final zzbng zzs = new zzbml();
    public static final zzbng zzt = new zzbmm();
    public static final zzbng zzu = new zzbmn();
    public static final zzbng zzv = new zzbmo();
    public static final zzbng zzw = new zzbmp();
    public static final zzbng zzx = new zzbmq();
    public static final zzbng zzy = new zzbmr();
    public static final zzbng zzz = new zzbms();
    public static final zzbng zzA = new zzbmt();
    public static final zzbng zzB = new zzbmv();
    public static final zzbng zzC = new zzbmw();

    public static com.google.common.util.concurrent.f zza(zzcjk zzcjkVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzavi zzI = zzcjkVar.zzI();
            zzfhl zzQ = zzcjkVar.zzQ();
            if (!((Boolean) a0.c().zza(zzbgc.zzlr)).booleanValue() || zzQ == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcjkVar.getContext(), zzcjkVar.zzF(), zzcjkVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzQ.zza(parse, zzcjkVar.getContext(), zzcjkVar.zzF(), zzcjkVar.zzi());
            }
        } catch (zzavj unused) {
            zzcec.zzj("Unable to append parameter to URL: ".concat(str));
        }
        String zzb2 = zzccj.zzb(parse, zzcjkVar.getContext());
        long longValue = ((Long) zzbhz.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 240304702) {
            return zzgen.zzh(zzb2);
        }
        zzgee zzu2 = zzgee.zzu(zzcjkVar.zzS());
        zzbma zzbmaVar = zzbma.zza;
        zzgey zzgeyVar = zzcep.zzf;
        return zzgen.zze(zzgen.zzm(zzgen.zze(zzu2, Throwable.class, zzbmaVar, zzgeyVar), new zzfws() { // from class: com.google.android.gms.internal.ads.zzbmb
            public final /* synthetic */ String zza;

            public /* synthetic */ zzbmb(String zzb22) {
                r1 = zzb22;
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbng zzbngVar = zzbnf.zza;
                String str3 = r1;
                if (str2 != null) {
                    if (((Boolean) zzbhz.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i10 = 0; i10 < 3; i10++) {
                            if (!host.endsWith(strArr[i10])) {
                            }
                        }
                    }
                    String str4 = (String) zzbhz.zza.zze();
                    String str5 = (String) zzbhz.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzgeyVar), Throwable.class, new zzfws() { // from class: com.google.android.gms.internal.ads.zzbmc
            public final /* synthetic */ String zza;

            public /* synthetic */ zzbmc(String zzb22) {
                r1 = zzb22;
            }

            @Override // com.google.android.gms.internal.ads.zzfws
            public final Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                zzbng zzbngVar = zzbnf.zza;
                if (((Boolean) zzbhz.zzk.zze()).booleanValue()) {
                    t.q().zzw(th2, "prepareClickUrl.attestation2");
                }
                return r1;
            }
        }, zzgeyVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:10|11|12)|(12:51|52|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        r7 = r0;
        r0 = "Error constructing openable urls response.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
    
        com.google.android.gms.internal.ads.zzcec.zzh(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.t.q().zzw(r0, r8.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzckn r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbnf.zzb(com.google.android.gms.internal.ads.zzckn, java.util.Map):void");
    }

    public static void zzc(Map map, zzdiu zzdiuVar) {
        if (((Boolean) a0.c().zza(zzbgc.zzkl)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdiuVar != null) {
            zzdiuVar.zzs();
        }
    }
}
