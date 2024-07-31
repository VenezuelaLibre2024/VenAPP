package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxn extends ThreadLocal<Mac> {
    private final /* synthetic */ zzxk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxn(zzxk zzxkVar) {
        this.zza = zzxkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzwt<zzxe, Mac> zzwtVar = zzwt.zzb;
            str = this.zza.zzc;
            Mac zza = zzwtVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
