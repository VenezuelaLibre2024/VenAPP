package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class zzavd {
    protected volatile Boolean zzb;
    private final zzawj zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfst zza = null;
    private static volatile Random zzd = null;

    public zzavd(zzawj zzawjVar) {
        this.zze = zzawjVar;
        zzawjVar.zzk().execute(new zzavc(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzavd.class) {
                    if (zzd == null) {
                        zzd = new Random();
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i10, int i11, long j10, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzars zza2 = zzarw.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j10);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfss zza3 = zza.zza(((zzarw) zza2.zzal()).zzax());
            zza3.zza(i10);
            if (i11 != -1) {
                zza3.zzb(i11);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
