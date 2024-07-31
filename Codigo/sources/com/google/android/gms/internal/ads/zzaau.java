package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaau implements DisplayManager.DisplayListener, zzaas {
    private final DisplayManager zza;
    private zzaap zzb;

    private zzaau(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzaas zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzaau(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        zzaap zzaapVar = this.zzb;
        if (zzaapVar == null || i10 != 0) {
            return;
        }
        zzaaw.zzb(zzaapVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zzb(zzaap zzaapVar) {
        this.zzb = zzaapVar;
        this.zza.registerDisplayListener(this, zzfy.zzw(null));
        zzaaw.zzb(zzaapVar.zza, zzd());
    }
}
