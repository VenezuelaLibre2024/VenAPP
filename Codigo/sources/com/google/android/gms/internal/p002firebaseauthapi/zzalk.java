package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzalk extends zzals {
    private final /* synthetic */ zzalg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzalk(zzalg zzalgVar) {
        super(zzalgVar);
        this.zza = zzalgVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzali(this.zza);
    }
}
