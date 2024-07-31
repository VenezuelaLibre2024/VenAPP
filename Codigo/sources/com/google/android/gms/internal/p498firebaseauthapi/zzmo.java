package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
class zzmo<PrimitiveT, KeyProtoT extends zzakn> implements zzbs<PrimitiveT> {
    private final zznb<KeyProtoT> zza;
    private final Class<PrimitiveT> zzb;

    public zzmo(zznb<KeyProtoT> zznbVar, Class<PrimitiveT> cls) {
        if (!zznbVar.zzh().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zznbVar.toString(), cls.getName()));
        }
        this.zza = zznbVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbs
    public final zzuy zza(zzahp zzahpVar) {
        try {
            return (zzuy) ((zzajc) zzuy.zza().zza(this.zza.zze()).zza(new zzmr(this.zza.zzc()).zza(zzahpVar).zzi()).zza(this.zza.zzd()).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbs
    public final String zza() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzbs
    public final PrimitiveT zzb(zzahp zzahpVar) {
        try {
            KeyProtoT zza = this.zza.zza(zzahpVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zza((zznb<KeyProtoT>) zza);
            return (PrimitiveT) this.zza.zza(zza, this.zzb);
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.zza.zzg().getName(), e10);
        }
    }
}
