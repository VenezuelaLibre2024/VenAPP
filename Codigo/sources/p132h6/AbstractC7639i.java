package p132h6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p132h6.C7632b;

/* renamed from: h6.i */
/* loaded from: classes.dex */
public abstract class AbstractC7639i {

    /* renamed from: h6.i$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public final a m23212a(String str, int i10) {
            mo23173e().put(str, String.valueOf(i10));
            return this;
        }

        /* renamed from: b */
        public final a m23213b(String str, long j10) {
            mo23173e().put(str, String.valueOf(j10));
            return this;
        }

        /* renamed from: c */
        public final a m23214c(String str, String str2) {
            mo23173e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC7639i mo23172d();

        /* renamed from: e */
        protected abstract Map<String, String> mo23173e();

        /* renamed from: f */
        protected abstract a mo23174f(Map<String, String> map);

        /* renamed from: g */
        public abstract a mo23175g(Integer num);

        /* renamed from: h */
        public abstract a mo23176h(C7638h c7638h);

        /* renamed from: i */
        public abstract a mo23177i(long j10);

        /* renamed from: j */
        public abstract a mo23178j(String str);

        /* renamed from: k */
        public abstract a mo23179k(long j10);
    }

    /* renamed from: a */
    public static a m23206a() {
        return new C7632b.b().mo23174f(new HashMap());
    }

    /* renamed from: b */
    public final String m23207b(String str) {
        String str2 = mo23166c().get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<String, String> mo23166c();

    /* renamed from: d */
    public abstract Integer mo23167d();

    /* renamed from: e */
    public abstract C7638h mo23168e();

    /* renamed from: f */
    public abstract long mo23169f();

    /* renamed from: g */
    public final int m23208g(String str) {
        String str2 = mo23166c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m23209h(String str) {
        String str2 = mo23166c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m23210i() {
        return Collections.unmodifiableMap(mo23166c());
    }

    /* renamed from: j */
    public abstract String mo23170j();

    /* renamed from: k */
    public abstract long mo23171k();

    /* renamed from: l */
    public a m23211l() {
        return new C7632b.b().mo23178j(mo23170j()).mo23175g(mo23167d()).mo23176h(mo23168e()).mo23177i(mo23169f()).mo23179k(mo23171k()).mo23174f(new HashMap(mo23166c()));
    }
}
