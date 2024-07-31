package com.google.android.gms.internal.p498firebaseauthapi;

import com.google.android.gms.internal.p498firebaseauthapi.zzahe;
import com.google.android.gms.internal.p498firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class zzahf<MessageType extends zzahf<MessageType, BuilderType>, BuilderType extends zzahe<MessageType, BuilderType>> implements zzakn {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a_ */
    public int mo13466a_() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(zzalf zzalfVar) {
        int mo13466a_ = mo13466a_();
        if (mo13466a_ != -1) {
            return mo13466a_;
        }
        int zza = zzalfVar.zza(this);
        zzb(zza);
        return zza;
    }

    public final void zza(OutputStream outputStream) {
        zzaik zza = zzaik.zza(outputStream, zzaik.zzf(zzl()));
        zza(zza);
        zza.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzakn
    public final zzahp zzi() {
        try {
            zzahu zzc = zzahp.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzl()];
            zzaik zzb = zzaik.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }
}
