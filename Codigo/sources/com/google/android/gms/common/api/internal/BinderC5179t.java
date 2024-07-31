package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC5139h;

/* renamed from: com.google.android.gms.common.api.internal.t */
/* loaded from: classes.dex */
public class BinderC5179t extends InterfaceC5139h.a {

    /* renamed from: a */
    private final InterfaceC5127e<Status> f10588a;

    public BinderC5179t(InterfaceC5127e<Status> interfaceC5127e) {
        this.f10588a = interfaceC5127e;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5139h
    public void onResult(Status status) {
        this.f10588a.setResult(status);
    }
}
