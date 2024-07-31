package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5837l;

/* renamed from: com.google.android.play.core.integrity.m */
/* loaded from: classes2.dex */
final class C5799m implements InterfaceC5808t {

    /* renamed from: a */
    private Context f12183a;

    private C5799m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5799m(C5798l c5798l) {
    }

    /* renamed from: a */
    public final C5799m m14643a(Context context) {
        context.getClass();
        this.f12183a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5808t
    /* renamed from: b */
    public final C5803o mo14644b() {
        C5837l.m14691a(this.f12183a, Context.class);
        return new C5803o(this.f12183a, null);
    }
}
