package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaho extends zzahq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzahp zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaho(zzahp zzahpVar) {
        this.zzc = zzahpVar;
        this.zzb = zzahpVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahv
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}
