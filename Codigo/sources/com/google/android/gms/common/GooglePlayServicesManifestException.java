package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    private final int f9287a;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f9287a = i10;
    }
}
