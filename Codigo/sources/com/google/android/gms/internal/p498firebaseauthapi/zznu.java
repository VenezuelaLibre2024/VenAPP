package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zznu {
    private static final zznu zza = (zznu) zzpd.zza(new zzpg() { // from class: com.google.android.gms.internal.firebase-auth-api.zznt
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.firebase-auth-api.zznw, com.google.android.gms.internal.firebase-auth-api.zzmz] */
        @Override // com.google.android.gms.internal.p498firebaseauthapi.zzpg
        public final Object zza() {
            zznu zznuVar = new zznu();
            zznuVar.zza(zzmx.zza(new Object() { // from class: com.google.android.gms.internal.firebase-auth-api.zznw
            }, zznd.class, zzos.class));
            return zznuVar;
        }
    });
    private final AtomicReference<zzoy> zzb = new AtomicReference<>(new zzox().zza());

    public static zznu zza() {
        return zza;
    }

    public final zzbt zza(zzos zzosVar, zzcs zzcsVar) {
        return !this.zzb.get().zzb((zzoy) zzosVar) ? new zznd(zzosVar, zzcsVar) : this.zzb.get().zza((zzoy) zzosVar, zzcsVar);
    }

    public final <SerializationT extends zzov> zzch zza(SerializationT serializationt) {
        return this.zzb.get().zza((zzoy) serializationt);
    }

    public final <ParametersT extends zzch, SerializationT extends zzov> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.zzb.get().zza((zzoy) parameterst, (Class) cls);
    }

    public final synchronized <SerializationT extends zzov> void zza(zzmu<SerializationT> zzmuVar) {
        this.zzb.set(new zzox(this.zzb.get()).zza(zzmuVar).zza());
    }

    public final synchronized <KeyT extends zzbt, SerializationT extends zzov> void zza(zzmx<KeyT, SerializationT> zzmxVar) {
        this.zzb.set(new zzox(this.zzb.get()).zza(zzmxVar).zza());
    }

    public final synchronized <SerializationT extends zzov> void zza(zznv<SerializationT> zznvVar) {
        this.zzb.set(new zzox(this.zzb.get()).zza(zznvVar).zza());
    }

    public final synchronized <ParametersT extends zzch, SerializationT extends zzov> void zza(zznz<ParametersT, SerializationT> zznzVar) {
        this.zzb.set(new zzox(this.zzb.get()).zza(zznzVar).zza());
    }

    public final <SerializationT extends zzov> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzc((zzoy) serializationt);
    }
}
