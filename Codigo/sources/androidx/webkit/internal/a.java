package androidx.webkit.internal;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a implements n0 {

    /* renamed from: c */
    private static final Set<a> f5552c = new HashSet();

    /* renamed from: a */
    private final String f5553a;

    /* renamed from: b */
    private final String f5554b;

    /* renamed from: androidx.webkit.internal.a$a */
    /* loaded from: classes.dex */
    public static class C0090a {

        /* renamed from: a */
        static final Set<String> f5555a = new HashSet(Arrays.asList(k1.d().a()));
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends a {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f5553a = str;
        this.f5554b = str2;
        f5552c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f5552c);
    }

    @Override // androidx.webkit.internal.n0
    public boolean a() {
        return c() || d();
    }

    @Override // androidx.webkit.internal.n0
    public String b() {
        return this.f5553a;
    }

    public abstract boolean c();

    public boolean d() {
        return hm.a.b(C0090a.f5555a, this.f5554b);
    }
}
