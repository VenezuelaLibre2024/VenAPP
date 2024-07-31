package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* loaded from: classes.dex */
final class C5241g0 extends AbstractDialogInterfaceOnClickListenerC5247i0 {

    /* renamed from: a */
    final /* synthetic */ Intent f10690a;

    /* renamed from: b */
    final /* synthetic */ Activity f10691b;

    /* renamed from: c */
    final /* synthetic */ int f10692c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5241g0(Intent intent, Activity activity, int i10) {
        this.f10690a = intent;
        this.f10691b = activity;
        this.f10692c = i10;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC5247i0
    /* renamed from: a */
    public final void mo13262a() {
        Intent intent = this.f10690a;
        if (intent != null) {
            this.f10691b.startActivityForResult(intent, this.f10692c);
        }
    }
}
