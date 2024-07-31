package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.l1;
import com.google.android.gms.ads.internal.client.m1;
import com.google.android.gms.ads.internal.client.q3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzfid {
    private static zzfid zza;
    private final Context zzb;
    private final m1 zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfid(Context context, m1 m1Var) {
        this.zzb = context;
        this.zzc = m1Var;
    }

    static m1 zza(Context context) {
        try {
            return l1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzcec.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzfid zzd(Context context) {
        synchronized (zzfid.class) {
            zzfid zzfidVar = zza;
            if (zzfidVar != null) {
                return zzfidVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbic.zzb.zze()).longValue();
            m1 m1Var = null;
            if (longValue > 0 && longValue <= 240304702) {
                m1Var = zza(applicationContext);
            }
            zzfid zzfidVar2 = new zzfid(applicationContext, m1Var);
            zza = zzfidVar2;
            return zzfidVar2;
        }
    }

    private final q3 zzg() {
        m1 m1Var = this.zzc;
        if (m1Var != null) {
            try {
                return m1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbsv zzb() {
        return (zzbsv) this.zzd.get();
    }

    public final zzcei zzc(int i10, boolean z10, int i11) {
        q3 zzg;
        t.r();
        boolean d10 = j2.d(this.zzb);
        zzcei zzceiVar = new zzcei(240304000, i11, true, d10);
        return (((Boolean) zzbic.zzc.zze()).booleanValue() && (zzg = zzg()) != null) ? new zzcei(240304000, zzg.zza(), true, d10) : zzceiVar;
    }

    public final String zze() {
        q3 zzg = zzg();
        if (zzg != null) {
            return zzg.zzb();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(com.google.android.gms.internal.ads.zzbsv r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbhm r0 = com.google.android.gms.internal.ads.zzbic.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L22
            com.google.android.gms.ads.internal.client.m1 r0 = r3.zzc
            if (r0 != 0) goto L15
        L13:
            r0 = r1
            goto L19
        L15:
            com.google.android.gms.internal.ads.zzbsv r0 = r0.getAdapterCreator()     // Catch: android.os.RemoteException -> L13
        L19:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L1e
            r4 = r0
        L1e:
            com.google.android.gms.internal.ads.zzfic.zza(r2, r1, r4)
            return
        L22:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzfic.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfid.zzf(com.google.android.gms.internal.ads.zzbsv):void");
    }
}
