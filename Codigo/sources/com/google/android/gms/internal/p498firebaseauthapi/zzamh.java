package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzamh implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzamf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamh(zzamf zzamfVar) {
        zzajt zzajtVar;
        this.zzb = zzamfVar;
        zzajtVar = zzamfVar.zza;
        this.zza = zzajtVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
