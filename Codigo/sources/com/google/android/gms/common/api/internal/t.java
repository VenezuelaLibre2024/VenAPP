package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;

/* loaded from: classes.dex */
public class t extends h.a {

    /* renamed from: a, reason: collision with root package name */
    private final e<Status> f9474a;

    public t(e<Status> eVar) {
        this.f9474a = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.h
    public void onResult(Status status) {
        this.f9474a.setResult(status);
    }
}
