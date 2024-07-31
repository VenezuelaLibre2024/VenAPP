package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class cb implements kb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ va f10042a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cb(va vaVar) {
        this.f10042a = vaVar;
    }

    @Override // com.google.android.gms.measurement.internal.kb
    public final void a(String str, String str2, Bundle bundle) {
        w5 w5Var;
        w5 w5Var2;
        if (!TextUtils.isEmpty(str)) {
            this.f10042a.zzl().y(new bb(this, str, str2, bundle));
            return;
        }
        w5Var = this.f10042a.f10727l;
        if (w5Var != null) {
            w5Var2 = this.f10042a.f10727l;
            w5Var2.zzj().B().b("AppId not known when logging event", str2);
        }
    }
}
