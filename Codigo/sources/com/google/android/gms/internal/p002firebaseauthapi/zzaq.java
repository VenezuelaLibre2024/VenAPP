package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaq extends zzap {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzap zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaq(zzap zzapVar, int i10, int i11) {
        this.zzc = zzapVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzy.zza(i10, this.zzb);
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap, java.util.List
    public final /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzap
    /* renamed from: zza */
    public final zzap subList(int i10, int i11) {
        zzy.zza(i10, i11, this.zzb);
        zzap zzapVar = this.zzc;
        int i12 = this.zza;
        return (zzap) zzapVar.subList(i10 + i12, i11 + i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzc.zzf();
    }
}
