package androidx.webkit.internal;

import android.os.Build;
import hm.C7757a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.webkit.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC1431a implements InterfaceC1471n0 {

    /* renamed from: c */
    private static final Set<AbstractC1431a> f6377c = new HashSet();

    /* renamed from: a */
    private final String f6378a;

    /* renamed from: b */
    private final String f6379b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.webkit.internal.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        static final Set<String> f6380a = new HashSet(Arrays.asList(C1463k1.m8377d().mo8400a()));
    }

    /* renamed from: androidx.webkit.internal.a$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return true;
        }
    }

    /* renamed from: androidx.webkit.internal.a$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return false;
        }
    }

    /* renamed from: androidx.webkit.internal.a$e */
    /* loaded from: classes.dex */
    public static class e extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: androidx.webkit.internal.a$f */
    /* loaded from: classes.dex */
    public static class f extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: androidx.webkit.internal.a$g */
    /* loaded from: classes.dex */
    public static class g extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: androidx.webkit.internal.a$h */
    /* loaded from: classes.dex */
    public static class h extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* renamed from: androidx.webkit.internal.a$i */
    /* loaded from: classes.dex */
    public static class i extends AbstractC1431a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // androidx.webkit.internal.AbstractC1431a
        /* renamed from: c */
        public final boolean mo8259c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    AbstractC1431a(String str, String str2) {
        this.f6378a = str;
        this.f6379b = str2;
        f6377c.add(this);
    }

    /* renamed from: e */
    public static Set<AbstractC1431a> m8256e() {
        return Collections.unmodifiableSet(f6377c);
    }

    @Override // androidx.webkit.internal.InterfaceC1471n0
    /* renamed from: a */
    public boolean mo8257a() {
        return mo8259c() || mo8260d();
    }

    @Override // androidx.webkit.internal.InterfaceC1471n0
    /* renamed from: b */
    public String mo8258b() {
        return this.f6378a;
    }

    /* renamed from: c */
    public abstract boolean mo8259c();

    /* renamed from: d */
    public boolean mo8260d() {
        return C7757a.m23675b(a.f6380a, this.f6379b);
    }
}
