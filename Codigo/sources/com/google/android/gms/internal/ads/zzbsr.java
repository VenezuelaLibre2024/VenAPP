package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes2.dex */
public final class zzbsr extends zzbsu {
    private static final zzbuw zza = new zzbuw();

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbsy zzb(String str) {
        zzbtv zzbtvVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbsr.class.getClassLoader());
                if (i9.g.class.isAssignableFrom(cls)) {
                    return new zzbtv((i9.g) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (i9.a.class.isAssignableFrom(cls)) {
                    return new zzbtv((i9.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcec.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th2) {
                zzcec.zzk("Could not instantiate mediation adapter: " + str + ". ", th2);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            zzcec.zze("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbtvVar = new zzbtv(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            zzbtvVar = new zzbtv(new AdMobAdapter());
            return zzbtvVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final zzbus zzc(String str) {
        return new zzbve((RtbAdapter) Class.forName(str, false, zzbuw.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zzd(String str) {
        try {
            return i9.a.class.isAssignableFrom(Class.forName(str, false, zzbsr.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcec.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsv
    public final boolean zze(String str) {
        try {
            return j9.a.class.isAssignableFrom(Class.forName(str, false, zzbsr.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcec.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
