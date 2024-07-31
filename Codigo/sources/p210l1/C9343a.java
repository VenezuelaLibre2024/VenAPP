package p210l1;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C9343a {

    /* renamed from: a */
    public static final C9343a f22624a = new C9343a();

    /* renamed from: l1.a$a */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a */
        public static final a f22625a = new a();

        private a() {
        }

        /* renamed from: a */
        public final int m27834a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private C9343a() {
    }

    /* renamed from: a */
    public final int m27833a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f22625a.m27834a();
        }
        return 0;
    }
}
