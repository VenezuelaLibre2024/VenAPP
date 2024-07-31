package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzgzu;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgzp<MessageType extends zzgzu<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> extends zzgxs<MessageType, BuilderType> {
    protected zzgzu zza;
    private final zzgzu zzb;

    public zzgzp(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzaY()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzaD();
    }

    private static void zza(Object obj, Object obj2) {
        zzhbn.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgxs
    /* renamed from: zzai */
    public final zzgzp clone() {
        zzgzp zzgzpVar = (zzgzp) this.zzb.zzb(5, null, null);
        zzgzpVar.zza = zzan();
        return zzgzpVar;
    }

    public final zzgzp zzaj(zzgzu zzgzuVar) {
        if (!this.zzb.equals(zzgzuVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgzuVar);
        }
        return this;
    }

    public final zzgzp zzak(byte[] bArr, int i10, int i11, zzgzf zzgzfVar) {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzhbn.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgxx(zzgzfVar));
            return this;
        } catch (zzhag e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzhag.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaX()) {
            return zzan;
        }
        throw new zzhco(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzhbd
    /* renamed from: zzam */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    public final void zzap() {
        if (this.zza.zzaY()) {
            return;
        }
        zzaq();
    }

    protected void zzaq() {
        zzgzu zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzhbf
    public final /* synthetic */ zzhbe zzbk() {
        throw null;
    }
}
