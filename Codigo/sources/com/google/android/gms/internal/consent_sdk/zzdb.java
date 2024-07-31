package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdb extends zzcy {
    private final zzdd zza;

    public zzdb(zzdd zzddVar, int i10) {
        super(zzddVar.size(), i10);
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcy
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
