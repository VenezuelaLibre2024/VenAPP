package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes2.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.b {

    /* renamed from: a, reason: collision with root package name */
    private final Throwable f10897a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StandardIntegrityException(int i10, Throwable th2) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i10), com.google.android.play.core.integrity.model.b.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f10897a = th2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f10897a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
