package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfxo implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfxr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxo(zzfxr zzfxrVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfxrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfwt.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
