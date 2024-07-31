package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C5837l;

/* renamed from: com.google.android.play.core.integrity.q */
/* loaded from: classes2.dex */
final class C5805q implements InterfaceC5764ai {

    /* renamed from: a */
    private Context f12193a;

    private C5805q() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5805q(C5804p c5804p) {
    }

    /* renamed from: a */
    public final C5805q m14648a(Context context) {
        context.getClass();
        this.f12193a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC5764ai
    /* renamed from: b */
    public final C5807s mo14623b() {
        C5837l.m14691a(this.f12193a, Context.class);
        return new C5807s(this.f12193a, null);
    }
}
