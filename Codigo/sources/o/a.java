package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: o.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0361a implements a {
        @Override // o.a
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f22045a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22046b;

        public b(boolean z10, int i10) {
            this.f22045a = z10;
            this.f22046b = i10;
        }

        @Override // o.a
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f22045a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f22046b);
            return bundle;
        }
    }

    Bundle a();
}
