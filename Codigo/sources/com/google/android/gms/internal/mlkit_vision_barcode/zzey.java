package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzey extends zzei implements RunnableFuture {
    private volatile zzeu zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzey(zzup zzupVar) {
        this.zzb = new zzex(this, zzupVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzeu zzeuVar = this.zzb;
        if (zzeuVar != null) {
            zzeuVar.run();
        }
        this.zzb = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    public final String zze() {
        zzeu zzeuVar = this.zzb;
        if (zzeuVar == null) {
            return super.zze();
        }
        return "task=[" + zzeuVar.toString() + "]";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzec
    protected final void zzk() {
        zzeu zzeuVar;
        if (zzn() && (zzeuVar = this.zzb) != null) {
            zzeuVar.zze();
        }
        this.zzb = null;
    }
}
