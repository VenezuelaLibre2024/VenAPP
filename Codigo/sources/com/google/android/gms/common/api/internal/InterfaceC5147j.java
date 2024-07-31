package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes.dex */
public interface InterfaceC5147j {
    /* renamed from: a */
    void mo13078a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: b */
    <T extends LifecycleCallback> T mo13079b(String str, Class<T> cls);

    /* renamed from: c */
    Activity mo13080c();

    void startActivityForResult(Intent intent, int i10);
}
