package ie;

import ie.C7962b;

/* renamed from: ie.f */
/* loaded from: classes.dex */
public abstract class AbstractC7966f {

    /* renamed from: ie.f$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC7966f mo24469a();

        /* renamed from: b */
        public abstract a mo24470b(b bVar);

        /* renamed from: c */
        public abstract a mo24471c(String str);

        /* renamed from: d */
        public abstract a mo24472d(long j10);
    }

    /* renamed from: ie.f$b */
    /* loaded from: classes.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    /* renamed from: a */
    public static a m24500a() {
        return new C7962b.b().mo24472d(0L);
    }

    /* renamed from: b */
    public abstract b mo24466b();

    /* renamed from: c */
    public abstract String mo24467c();

    /* renamed from: d */
    public abstract long mo24468d();
}
