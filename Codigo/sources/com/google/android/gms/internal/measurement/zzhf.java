package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzhf<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkm {
    private final String zza(String str) {
        return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType zzb(zzib zzibVar, zzik zzikVar);

    public BuilderType zza(byte[] bArr, int i10, int i11) {
        try {
            zzib zza = zzib.zza(bArr, 0, i11, false);
            zzb(zza, zzik.zza);
            zza.zzb(0);
            return this;
        } catch (zzji e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public BuilderType zza(byte[] bArr, int i10, int i11, zzik zzikVar) {
        try {
            zzib zza = zzib.zza(bArr, 0, i11, false);
            zzb(zza, zzikVar);
            zza.zzb(0);
            return this;
        } catch (zzji e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ zzkm zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ zzkm zza(byte[] bArr, zzik zzikVar) {
        return zza(bArr, 0, bArr.length, zzikVar);
    }

    @Override // 
    /* renamed from: zzy, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
