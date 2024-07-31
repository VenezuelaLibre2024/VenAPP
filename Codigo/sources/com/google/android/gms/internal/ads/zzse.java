package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Trace;

/* loaded from: classes2.dex */
public final class zzse implements zzsq {
    private final zzfxu zzb;
    private final zzfxu zzc;
    private boolean zzd;

    public zzse(int i10) {
        zzsc zzscVar = new zzsc(i10);
        zzsd zzsdVar = new zzsd(i10);
        this.zzb = zzscVar;
        this.zzc = zzsdVar;
        this.zzd = true;
    }

    public static /* synthetic */ HandlerThread zza(int i10) {
        String zzr;
        zzr = zzsg.zzr(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
        return new HandlerThread(zzr);
    }

    public static /* synthetic */ HandlerThread zzb(int i10) {
        String zzr;
        zzr = zzsg.zzr(i10, "ExoPlayer:MediaCodecQueueingThread:");
        return new HandlerThread(zzr);
    }

    public final zzsg zzc(zzsp zzspVar) {
        MediaCodec mediaCodec;
        zzss zzskVar;
        int i10;
        zzsg zzsgVar;
        String str = zzspVar.zza.zza;
        zzsg zzsgVar2 = null;
        try {
            int i11 = zzfy.zza;
            Trace.beginSection("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                try {
                    if (this.zzd) {
                        zzam zzamVar = zzspVar.zzc;
                        if (zzfy.zza >= 34 && zzcb.zzh(zzamVar.zzm)) {
                            zzskVar = new zztq(mediaCodec);
                            i10 = 4;
                            zzsgVar = new zzsg(mediaCodec, zza(((zzsc) this.zzb).zza), zzskVar, null);
                            Trace.endSection();
                            zzsg.zzh(zzsgVar, zzspVar.zzb, zzspVar.zzd, null, i10);
                            return zzsgVar;
                        }
                    }
                    Trace.endSection();
                    zzsg.zzh(zzsgVar, zzspVar.zzb, zzspVar.zzd, null, i10);
                    return zzsgVar;
                } catch (Exception e10) {
                    e = e10;
                    zzsgVar2 = zzsgVar;
                    if (zzsgVar2 != null) {
                        zzsgVar2.zzl();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
                zzskVar = new zzsk(mediaCodec, zzb(((zzsd) this.zzc).zza));
                i10 = 0;
                zzsgVar = new zzsg(mediaCodec, zza(((zzsc) this.zzb).zza), zzskVar, null);
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public final void zzd(boolean z10) {
        this.zzd = true;
    }
}
