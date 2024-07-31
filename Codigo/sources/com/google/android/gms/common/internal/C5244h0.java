package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC5147j;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* loaded from: classes.dex */
final class C5244h0 extends AbstractDialogInterfaceOnClickListenerC5247i0 {

    /* renamed from: a */
    final /* synthetic */ Intent f10694a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC5147j f10695b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5244h0(Intent intent, InterfaceC5147j interfaceC5147j, int i10) {
        this.f10694a = intent;
        this.f10695b = interfaceC5147j;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC5247i0
    /* renamed from: a */
    public final void mo13262a() {
        Intent intent = this.f10694a;
        if (intent != null) {
            this.f10695b.startActivityForResult(intent, 2);
        }
    }
}
