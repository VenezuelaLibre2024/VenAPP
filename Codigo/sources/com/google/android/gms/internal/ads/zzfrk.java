package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import c9.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzfrk {
    private final Context zza;
    private final Executor zzb;
    private final zzfqr zzc;
    private final zzfqt zzd;
    private final zzfrj zze;
    private final zzfrj zzf;
    private Task zzg;
    private Task zzh;

    zzfrk(Context context, Executor executor, zzfqr zzfqrVar, zzfqt zzfqtVar, zzfrh zzfrhVar, zzfri zzfriVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfqrVar;
        this.zzd = zzfqtVar;
        this.zze = zzfrhVar;
        this.zzf = zzfriVar;
    }

    public static zzfrk zze(Context context, Executor executor, zzfqr zzfqrVar, zzfqt zzfqtVar) {
        final zzfrk zzfrkVar = new zzfrk(context, executor, zzfqrVar, zzfqtVar, new zzfrh(), new zzfri());
        zzfrkVar.zzg = zzfrkVar.zzd.zzd() ? zzfrkVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfrk.this.zzc();
            }
        }) : Tasks.forResult(zzfrkVar.zze.zza());
        zzfrkVar.zzh = zzfrkVar.zzh(new Callable() { // from class: com.google.android.gms.internal.ads.zzfrf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzfrk.this.zzd();
            }
        });
        return zzfrkVar;
    }

    private static zzatd zzg(Task task, zzatd zzatdVar) {
        return !task.isSuccessful() ? zzatdVar : (zzatd) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfrg
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzfrk.this.zzf(exc);
            }
        });
    }

    public final zzatd zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzatd zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzatd zzc() {
        zzasg zza = zzatd.zza();
        a.C0117a a10 = c9.a.a(this.zza);
        String a11 = a10.a();
        if (a11 != null && a11.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(a11);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            a11 = Base64.encodeToString(bArr, 11);
        }
        if (a11 != null) {
            zza.zzs(a11);
            zza.zzr(a10.b());
            zza.zzab(6);
        }
        return (zzatd) zza.zzal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzatd zzd() {
        Context context = this.zza;
        return zzfqz.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
