package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzoq<PrimitiveT, KeyProtoT extends zzakn, PublicKeyProtoT extends zzakn> extends zzmo<PrimitiveT, KeyProtoT> implements zzco<PrimitiveT> {
    private final zzop<KeyProtoT, PublicKeyProtoT> zza;
    private final zznb<PublicKeyProtoT> zzb;

    public zzoq(zzop<KeyProtoT, PublicKeyProtoT> zzopVar, zznb<PublicKeyProtoT> zznbVar, Class<PrimitiveT> cls) {
        super(zzopVar, cls);
        this.zza = zzopVar;
        this.zzb = zznbVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzco
    public final zzuy zzc(zzahp zzahpVar) {
        try {
            KeyProtoT zza = this.zza.zza(zzahpVar);
            this.zza.zza((zzop<KeyProtoT, PublicKeyProtoT>) zza);
            PublicKeyProtoT zzb = this.zza.zzb(zza);
            this.zzb.zza((zznb<PublicKeyProtoT>) zzb);
            return (zzuy) ((zzajc) zzuy.zza().zza(this.zzb.zze()).zza(zzb.zzi()).zza(this.zzb.zzd()).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("expected serialized proto of type ", e10);
        }
    }
}
