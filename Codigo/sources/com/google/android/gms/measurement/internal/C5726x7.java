package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.x7 */
/* loaded from: classes2.dex */
public final class C5726x7 implements InterfaceC5563kb {

    /* renamed from: a */
    private final /* synthetic */ C5442b7 f12030a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5726x7(C5442b7 c5442b7) {
        this.f12030a = c5442b7;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5563kb
    /* renamed from: a */
    public final void mo13719a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f12030a.m13701s0("auto", str2, bundle);
        } else {
            this.f12030a.m13663R("auto", str2, bundle, str);
        }
    }
}
