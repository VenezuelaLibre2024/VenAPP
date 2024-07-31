package l1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20802a = new a();

    /* renamed from: l1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0324a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0324a f20803a = new C0324a();

        private C0324a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private a() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C0324a.f20803a.a();
        }
        return 0;
    }
}
