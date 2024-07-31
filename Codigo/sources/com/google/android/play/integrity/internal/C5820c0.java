package com.google.android.play.integrity.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.play.integrity.internal.c0 */
/* loaded from: classes2.dex */
public final class C5820c0 {

    /* renamed from: a */
    private final String f12209a;

    public C5820c0(String str) {
        this.f12209a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: e */
    private static String m14655e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m14656a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m14655e(this.f12209a, "Phonesky is not installed.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m14657b(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m14655e(this.f12209a, str, objArr), th2);
        }
        return 0;
    }

    /* renamed from: c */
    public final int m14658c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m14655e(this.f12209a, str, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public final int m14659d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m14655e(this.f12209a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
