package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class zzst extends zzif {
    public final zzsv zza;
    public final String zzb;

    public zzst(Throwable th2, zzsv zzsvVar) {
        super("Decoder failed: ".concat(String.valueOf(zzsvVar == null ? null : zzsvVar.zza)), th2);
        this.zza = zzsvVar;
        int i10 = zzfy.zza;
        this.zzb = th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null;
    }
}
