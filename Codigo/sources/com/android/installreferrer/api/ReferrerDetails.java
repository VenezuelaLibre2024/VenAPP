package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class ReferrerDetails {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f7201a;

    public ReferrerDetails(Bundle bundle) {
        this.f7201a = bundle;
    }

    public String a() {
        return this.f7201a.getString("install_referrer");
    }
}
