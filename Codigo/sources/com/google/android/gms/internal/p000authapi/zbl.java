package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.s;
import s9.a;
import u9.a;

/* loaded from: classes2.dex */
public final class zbl implements a {
    public final i<Status> delete(f fVar, Credential credential) {
        s.k(fVar, "client must not be null");
        s.k(credential, "credential must not be null");
        return fVar.b(new zbi(this, fVar, credential));
    }

    public final i<Status> disableAutoSignIn(f fVar) {
        s.k(fVar, "client must not be null");
        return fVar.b(new zbj(this, fVar));
    }

    public final PendingIntent getHintPickerIntent(f fVar, HintRequest hintRequest) {
        s.k(fVar, "client must not be null");
        s.k(hintRequest, "request must not be null");
        a.C0422a zba = ((zbo) fVar.d(s9.a.f25405g)).zba();
        return zbn.zba(fVar.e(), zba, hintRequest, zba.d());
    }

    public final i<Object> request(f fVar, com.google.android.gms.auth.api.credentials.a aVar) {
        s.k(fVar, "client must not be null");
        s.k(aVar, "request must not be null");
        return fVar.a(new zbg(this, fVar, aVar));
    }

    public final i<Status> save(f fVar, Credential credential) {
        s.k(fVar, "client must not be null");
        s.k(credential, "credential must not be null");
        return fVar.b(new zbh(this, fVar, credential));
    }
}
