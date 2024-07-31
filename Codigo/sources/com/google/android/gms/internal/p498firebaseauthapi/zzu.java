package com.google.android.gms.internal.p498firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzu extends zzs implements Serializable {
    private final Pattern zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(Pattern pattern) {
        this.zza = (Pattern) zzy.zza(pattern);
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.p498firebaseauthapi.zzs
    public final zzp zza(CharSequence charSequence) {
        return new zzt(this.zza.matcher(charSequence));
    }
}
