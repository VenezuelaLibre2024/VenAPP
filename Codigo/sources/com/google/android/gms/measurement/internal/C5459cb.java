package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.cb */
/* loaded from: classes2.dex */
public final class C5459cb implements InterfaceC5563kb {

    /* renamed from: a */
    final /* synthetic */ C5705va f11162a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5459cb(C5705va c5705va) {
        this.f11162a = c5705va;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5563kb
    /* renamed from: a */
    public final void mo13719a(String str, String str2, Bundle bundle) {
        C5712w5 c5712w5;
        C5712w5 c5712w52;
        if (!TextUtils.isEmpty(str)) {
            this.f11162a.zzl().m14248y(new RunnableC5446bb(this, str, str2, bundle));
            return;
        }
        c5712w5 = this.f11162a.f11933l;
        if (c5712w5 != null) {
            c5712w52 = this.f11162a.f11933l;
            c5712w52.zzj().m14182B().m14219b("AppId not known when logging event", str2);
        }
    }
}
