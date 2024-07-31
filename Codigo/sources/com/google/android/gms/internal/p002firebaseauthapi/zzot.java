package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
final class zzot extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ SecureRandom initialValue() {
        return zzou.zza();
    }
}
