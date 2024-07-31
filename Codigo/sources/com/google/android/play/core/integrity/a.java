package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
final class a extends ag {

    /* renamed from: a, reason: collision with root package name */
    private String f10898a;

    /* renamed from: b, reason: collision with root package name */
    private c0 f10899b;

    /* renamed from: c, reason: collision with root package name */
    private PendingIntent f10900c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ag
    public final ag a(PendingIntent pendingIntent) {
        this.f10900c = pendingIntent;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ag
    public final ag b(c0 c0Var) {
        if (c0Var == null) {
            throw new NullPointerException("Null logger");
        }
        this.f10899b = c0Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ag
    public final ag c(String str) {
        this.f10898a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ag
    public final ah d() {
        c0 c0Var;
        String str = this.f10898a;
        if (str != null && (c0Var = this.f10899b) != null) {
            return new ah(str, c0Var, this.f10900c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10898a == null) {
            sb2.append(" token");
        }
        if (this.f10899b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
