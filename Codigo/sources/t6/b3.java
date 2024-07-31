package t6;

import java.io.IOException;

/* loaded from: classes.dex */
public class b3 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25865b;

    /* JADX INFO: Access modifiers changed from: protected */
    public b3(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f25864a = z10;
        this.f25865b = i10;
    }

    public static b3 a(String str, Throwable th2) {
        return new b3(str, th2, true, 1);
    }

    public static b3 b(String str, Throwable th2) {
        return new b3(str, th2, true, 0);
    }

    public static b3 c(String str, Throwable th2) {
        return new b3(str, th2, true, 4);
    }

    public static b3 d(String str, Throwable th2) {
        return new b3(str, th2, false, 4);
    }

    public static b3 e(String str) {
        return new b3(str, null, false, 1);
    }
}
