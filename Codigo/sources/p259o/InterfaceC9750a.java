package p259o;

import android.os.Bundle;

/* renamed from: o.a */
/* loaded from: classes.dex */
public interface InterfaceC9750a {

    /* renamed from: o.a$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9750a {
        @Override // p259o.InterfaceC9750a
        /* renamed from: a */
        public Bundle mo29226a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle;
        }
    }

    /* renamed from: o.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9750a {

        /* renamed from: a */
        private final boolean f23978a;

        /* renamed from: b */
        private final int f23979b;

        public b(boolean z10, int i10) {
            this.f23978a = z10;
            this.f23979b = i10;
        }

        @Override // p259o.InterfaceC9750a
        /* renamed from: a */
        public Bundle mo29226a() {
            Bundle bundle = new Bundle();
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.f23978a);
            bundle.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.f23979b);
            return bundle;
        }
    }

    /* renamed from: a */
    Bundle mo29226a();
}
