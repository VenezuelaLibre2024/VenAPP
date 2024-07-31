package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzzf extends Handler implements Runnable {
    final /* synthetic */ zzzk zza;
    private final zzzg zzb;
    private final long zzc;
    private zzzc zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzf(zzzk zzzkVar, Looper looper, zzzg zzzgVar, zzzc zzzcVar, int i10, long j10) {
        super(looper);
        this.zza = zzzkVar;
        this.zzb = zzzgVar;
        this.zzd = zzzcVar;
        this.zzc = j10;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzzf zzzfVar;
        this.zze = null;
        zzzk zzzkVar = this.zza;
        executorService = zzzkVar.zze;
        zzzfVar = zzzkVar.zzf;
        zzzfVar.getClass();
        executorService.execute(zzzfVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10;
        int i11;
        int i12;
        long j10;
        if (this.zzi) {
            return;
        }
        int i13 = message.what;
        if (i13 == 0) {
            zzd();
            return;
        }
        if (i13 == 3) {
            throw ((Error) message.obj);
        }
        this.zza.zzf = null;
        long j11 = this.zzc;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = elapsedRealtime - j11;
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        if (this.zzh) {
            zzzcVar.zzJ(this.zzb, elapsedRealtime, j12, false);
            return;
        }
        int i14 = message.what;
        if (i14 == 1) {
            try {
                zzzcVar.zzK(this.zzb, elapsedRealtime, j12);
                return;
            } catch (RuntimeException e10) {
                zzff.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zzg = new zzzj(e10);
                return;
            }
        }
        if (i14 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i15 = this.zzf + 1;
        this.zzf = i15;
        zzze zzu = zzzcVar.zzu(this.zzb, elapsedRealtime, j12, iOException, i15);
        i10 = zzu.zza;
        if (i10 == 3) {
            this.zza.zzg = this.zze;
            return;
        }
        i11 = zzu.zza;
        if (i11 != 2) {
            i12 = zzu.zza;
            if (i12 == 1) {
                this.zzf = 1;
            }
            j10 = zzu.zzb;
            zzc(j10 != -9223372036854775807L ? zzu.zzb : Math.min((this.zzf - 1) * AdError.NETWORK_ERROR_CODE, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object zzzjVar;
        Message obtainMessage;
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z10) {
                String str = "load:" + this.zzb.getClass().getSimpleName();
                int i10 = zzfy.zza;
                Trace.beginSection(str);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage = obtainMessage(2, e10);
            obtainMessage.sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzff.zzd("LoadTask", "Unexpected exception loading stream", e11);
            zzzjVar = new zzzj(e11);
            obtainMessage = obtainMessage(2, zzzjVar);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzff.zzd("LoadTask", "OutOfMemory error loading stream", e12);
            zzzjVar = new zzzj(e12);
            obtainMessage = obtainMessage(2, zzzjVar);
            obtainMessage.sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzff.zzd("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(boolean z10) {
        this.zzi = z10;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzzc zzzcVar = this.zzd;
            zzzcVar.getClass();
            zzzcVar.zzJ(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j10) {
        zzzf zzzfVar;
        zzzfVar = this.zza.zzf;
        zzek.zzf(zzzfVar == null);
        this.zza.zzf = this;
        if (j10 > 0) {
            sendEmptyMessageDelayed(0, j10);
        } else {
            zzd();
        }
    }
}
