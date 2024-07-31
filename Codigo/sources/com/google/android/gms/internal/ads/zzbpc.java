package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.u1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbpc implements zzapt {
    private volatile zzbop zza;
    private final Context zzb;

    public zzbpc(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbpc zzbpcVar) {
        if (zzbpcVar.zza == null) {
            return;
        }
        zzbpcVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzapt
    public final zzapw zza(zzaqa zzaqaVar) {
        Parcelable.Creator<zzboq> creator = zzboq.CREATOR;
        Map zzl = zzaqaVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzboq zzboqVar = new zzboq(zzaqaVar.zzk(), strArr, strArr2);
        long b10 = t.b().b();
        try {
            zzceu zzceuVar = new zzceu();
            this.zza = new zzbop(this.zzb, t.v().b(), new zzbpa(this, zzceuVar), new zzbpb(this, zzceuVar));
            this.zza.checkAvailabilityAndConnect();
            zzboy zzboyVar = new zzboy(this, zzboqVar);
            zzgey zzgeyVar = zzcep.zza;
            com.google.common.util.concurrent.f zzo = zzgen.zzo(zzgen.zzn(zzceuVar, zzboyVar, zzgeyVar), ((Integer) a0.c().zza(zzbgc.zzet)).intValue(), TimeUnit.MILLISECONDS, zzcep.zzd);
            zzo.addListener(new zzboz(this), zzgeyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzo.get();
            u1.a("Http assets remote cache took " + (t.b().b() - b10) + "ms");
            zzbos zzbosVar = (zzbos) new zzbzc(parcelFileDescriptor).zza(zzbos.CREATOR);
            if (zzbosVar == null) {
                return null;
            }
            if (zzbosVar.zza) {
                throw new zzaqj(zzbosVar.zzb);
            }
            if (zzbosVar.zze.length != zzbosVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbosVar.zze;
                if (i10 >= strArr3.length) {
                    return new zzapw(zzbosVar.zzc, zzbosVar.zzd, hashMap, zzbosVar.zzg, zzbosVar.zzh);
                }
                hashMap.put(strArr3[i10], zzbosVar.zzf[i10]);
                i10++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            u1.a("Http assets remote cache took " + (t.b().b() - b10) + "ms");
            return null;
        } catch (Throwable th2) {
            u1.a("Http assets remote cache took " + (t.b().b() - b10) + "ms");
            throw th2;
        }
    }
}
