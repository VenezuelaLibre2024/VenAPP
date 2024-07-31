package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzgi;
import com.google.android.recaptcha.internal.zzgo;

/* loaded from: classes2.dex */
public class zzgi<MessageType extends zzgo<MessageType, BuilderType>, BuilderType extends zzgi<MessageType, BuilderType>> extends zzeh<MessageType, BuilderType> {
    protected zzgo zza;
    private final zzgo zzb;

    public zzgi(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzF()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzs();
    }

    private static void zzd(Object obj, Object obj2) {
        zzih.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final /* synthetic */ zzhy zzX() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzeh
    protected final /* synthetic */ zzeh zzb(zzei zzeiVar) {
        zzg((zzgo) zzeiVar);
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzeh
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzgi zza() {
        zzgi zzgiVar = (zzgi) this.zzb.zzh(5, null, null);
        zzgiVar.zza = zzk();
        return zzgiVar;
    }

    public final zzgi zzg(zzgo zzgoVar) {
        if (!this.zzb.equals(zzgoVar)) {
            if (!this.zza.zzF()) {
                zzn();
            }
            zzd(this.zza, zzgoVar);
        }
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    /* renamed from: zzh */
    public final MessageType zzj() {
        MessageType zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new zzje(zzk);
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    /* renamed from: zzi */
    public MessageType zzk() {
        if (!this.zza.zzF()) {
            return (MessageType) this.zza;
        }
        this.zza.zzA();
        return (MessageType) this.zza;
    }

    public final void zzm() {
        if (this.zza.zzF()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzgo zzs = this.zzb.zzs();
        zzd(zzs, this.zza);
        this.zza = zzs;
    }

    @Override // com.google.android.recaptcha.internal.zzhz
    public final boolean zzo() {
        return zzgo.zzE(this.zza, false);
    }
}
