package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class x7 implements kb {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b7 f10815a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x7(b7 b7Var) {
        this.f10815a = b7Var;
    }

    @Override // com.google.android.gms.measurement.internal.kb
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f10815a.s0("auto", str2, bundle);
        } else {
            this.f10815a.R("auto", str2, bundle, str);
        }
    }
}
