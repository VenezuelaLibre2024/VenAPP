package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes2.dex */
public final class zzaak extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzaai zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaak(zzaai zzaaiVar, SurfaceTexture surfaceTexture, boolean z10, zzaaj zzaajVar) {
        super(surfaceTexture);
        this.zzd = zzaaiVar;
        this.zza = z10;
    }

    public static zzaak zza(Context context, boolean z10) {
        boolean z11 = true;
        if (z10 && !zzb(context)) {
            z11 = false;
        }
        zzek.zzf(z11);
        return new zzaai().zza(z10 ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i10;
        synchronized (zzaak.class) {
            if (!zzc) {
                zzb = zzeu.zzc(context) ? zzeu.zzd() ? 1 : 2 : 0;
                zzc = true;
            }
            i10 = zzb;
        }
        return i10 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
