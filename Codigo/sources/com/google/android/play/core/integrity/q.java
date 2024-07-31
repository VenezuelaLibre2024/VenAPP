package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class q implements ai {

    /* renamed from: a, reason: collision with root package name */
    private Context f10978a;

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f10978a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ai
    public final s b() {
        com.google.android.play.integrity.internal.l.a(this.f10978a, Context.class);
        return new s(this.f10978a, null);
    }
}
