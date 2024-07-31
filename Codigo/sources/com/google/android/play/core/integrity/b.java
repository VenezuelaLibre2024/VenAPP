package com.google.android.play.core.integrity;

import android.app.PendingIntent;
import com.google.android.play.integrity.internal.c0;

/* loaded from: classes2.dex */
final class b extends ba {

    /* renamed from: a, reason: collision with root package name */
    private String f10949a;

    /* renamed from: b, reason: collision with root package name */
    private c0 f10950b;

    /* renamed from: c, reason: collision with root package name */
    private PendingIntent f10951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba a(PendingIntent pendingIntent) {
        this.f10951c = pendingIntent;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba b(c0 c0Var) {
        if (c0Var == null) {
            throw new NullPointerException("Null logger");
        }
        this.f10950b = c0Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final ba c(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f10949a = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.integrity.ba
    public final bb d() {
        c0 c0Var;
        String str = this.f10949a;
        if (str != null && (c0Var = this.f10950b) != null) {
            return new bb(str, c0Var, this.f10951c);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f10949a == null) {
            sb2.append(" token");
        }
        if (this.f10950b == null) {
            sb2.append(" logger");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
