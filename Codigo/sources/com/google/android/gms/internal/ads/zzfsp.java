package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzfsp {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfsq zzc;
    private final zzfqr zzd;
    private final zzfqm zze;
    private zzfse zzf;
    private final Object zzg = new Object();

    public zzfsp(Context context, zzfsq zzfsqVar, zzfqr zzfqrVar, zzfqm zzfqmVar) {
        this.zzb = context;
        this.zzc = zzfsqVar;
        this.zzd = zzfqrVar;
        this.zze = zzfqmVar;
    }

    private final synchronized Class zzd(zzfsf zzfsfVar) {
        String zzk = zzfsfVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfsfVar.zzc())) {
                throw new zzfso(2026, "VM did not pass signature verification");
            }
            try {
                File zzb = zzfsfVar.zzb();
                if (!zzb.exists()) {
                    zzb.mkdirs();
                }
                Class<?> loadClass = new DexClassLoader(zzfsfVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(zzk, loadClass);
                return loadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                throw new zzfso(AdError.REMOTE_ADS_SERVICE_ERROR, e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new zzfso(2026, e11);
        }
    }

    public final zzfqu zza() {
        zzfse zzfseVar;
        synchronized (this.zzg) {
            zzfseVar = this.zzf;
        }
        return zzfseVar;
    }

    public final zzfsf zzb() {
        synchronized (this.zzg) {
            zzfse zzfseVar = this.zzf;
            if (zzfseVar == null) {
                return null;
            }
            return zzfseVar.zzf();
        }
    }

    public final boolean zzc(zzfsf zzfsfVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfse zzfseVar = new zzfse(zzd(zzfsfVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfsfVar.zze(), null, new Bundle(), 2), zzfsfVar, this.zzc, this.zzd);
                if (!zzfseVar.zzh()) {
                    throw new zzfso(4000, "init failed");
                }
                int zze = zzfseVar.zze();
                if (zze != 0) {
                    throw new zzfso(4001, "ci: " + zze);
                }
                synchronized (this.zzg) {
                    zzfse zzfseVar2 = this.zzf;
                    if (zzfseVar2 != null) {
                        try {
                            zzfseVar2.zzg();
                        } catch (zzfso e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                    }
                    this.zzf = zzfseVar;
                }
                this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzfso(AdError.INTERNAL_ERROR_2004, e11);
            }
        } catch (zzfso e12) {
            this.zzd.zzc(e12.zza(), System.currentTimeMillis() - currentTimeMillis, e12);
            return false;
        } catch (Exception e13) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e13);
            return false;
        }
    }
}
