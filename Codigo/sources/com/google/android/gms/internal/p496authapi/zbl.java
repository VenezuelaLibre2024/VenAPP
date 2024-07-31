package com.google.android.gms.internal.p496authapi;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.C5083a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import p352s9.C10849a;
import p379u9.InterfaceC11474a;

/* loaded from: classes2.dex */
public final class zbl implements InterfaceC11474a {
    public final AbstractC5109i<Status> delete(AbstractC5106f abstractC5106f, Credential credential) {
        C5276s.m13325k(abstractC5106f, "client must not be null");
        C5276s.m13325k(credential, "credential must not be null");
        return abstractC5106f.mo12985b(new zbi(this, abstractC5106f, credential));
    }

    public final AbstractC5109i<Status> disableAutoSignIn(AbstractC5106f abstractC5106f) {
        C5276s.m13325k(abstractC5106f, "client must not be null");
        return abstractC5106f.mo12985b(new zbj(this, abstractC5106f));
    }

    public final PendingIntent getHintPickerIntent(AbstractC5106f abstractC5106f, HintRequest hintRequest) {
        C5276s.m13325k(abstractC5106f, "client must not be null");
        C5276s.m13325k(hintRequest, "request must not be null");
        C10849a.a zba = ((zbo) abstractC5106f.m12986d(C10849a.f27524g)).zba();
        return zbn.zba(abstractC5106f.mo12987e(), zba, hintRequest, zba.m33093d());
    }

    public final AbstractC5109i<Object> request(AbstractC5106f abstractC5106f, C5083a c5083a) {
        C5276s.m13325k(abstractC5106f, "client must not be null");
        C5276s.m13325k(c5083a, "request must not be null");
        return abstractC5106f.mo12984a(new zbg(this, abstractC5106f, c5083a));
    }

    public final AbstractC5109i<Status> save(AbstractC5106f abstractC5106f, Credential credential) {
        C5276s.m13325k(abstractC5106f, "client must not be null");
        C5276s.m13325k(credential, "credential must not be null");
        return abstractC5106f.mo12985b(new zbh(this, abstractC5106f, credential));
    }
}
