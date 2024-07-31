package p361t6;

import java.io.IOException;

/* renamed from: t6.b3 */
/* loaded from: classes.dex */
public class C11005b3 extends IOException {

    /* renamed from: a */
    public final boolean f28008a;

    /* renamed from: b */
    public final int f28009b;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11005b3(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f28008a = z10;
        this.f28009b = i10;
    }

    /* renamed from: a */
    public static C11005b3 m33715a(String str, Throwable th2) {
        return new C11005b3(str, th2, true, 1);
    }

    /* renamed from: b */
    public static C11005b3 m33716b(String str, Throwable th2) {
        return new C11005b3(str, th2, true, 0);
    }

    /* renamed from: c */
    public static C11005b3 m33717c(String str, Throwable th2) {
        return new C11005b3(str, th2, true, 4);
    }

    /* renamed from: d */
    public static C11005b3 m33718d(String str, Throwable th2) {
        return new C11005b3(str, th2, false, 4);
    }

    /* renamed from: e */
    public static C11005b3 m33719e(String str) {
        return new C11005b3(str, null, false, 1);
    }
}
