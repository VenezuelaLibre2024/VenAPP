package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 extends i0 {

    /* renamed from: a */
    final /* synthetic */ Intent f9575a;

    /* renamed from: b */
    final /* synthetic */ Activity f9576b;

    /* renamed from: c */
    final /* synthetic */ int f9577c;

    public g0(Intent intent, Activity activity, int i10) {
        this.f9575a = intent;
        this.f9576b = activity;
        this.f9577c = i10;
    }

    @Override // com.google.android.gms.common.internal.i0
    public final void a() {
        Intent intent = this.f9575a;
        if (intent != null) {
            this.f9576b.startActivityForResult(intent, this.f9577c);
        }
    }
}
