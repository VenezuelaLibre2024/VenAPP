package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class m implements t {

    /* renamed from: a, reason: collision with root package name */
    private Context f10968a;

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ m(l lVar) {
    }

    public final m a(Context context) {
        context.getClass();
        this.f10968a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.t
    public final o b() {
        com.google.android.play.integrity.internal.l.a(this.f10968a, Context.class);
        return new o(this.f10968a, null);
    }
}
