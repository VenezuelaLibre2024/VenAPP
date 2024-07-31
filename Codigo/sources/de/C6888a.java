package de;

import android.text.TextUtils;

/* renamed from: de.a */
/* loaded from: classes.dex */
public class C6888a {

    /* renamed from: a */
    private final String f15240a;

    /* renamed from: b */
    private final C6891d f15241b;

    /* renamed from: de.a$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private String f15242a;

        /* renamed from: b */
        private C6891d f15243b;

        /* renamed from: a */
        public C6888a m19873a() {
            return new C6888a(this.f15242a, this.f15243b);
        }

        /* renamed from: b */
        public b m19874b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f15242a = str;
            }
            return this;
        }

        /* renamed from: c */
        public b m19875c(C6891d c6891d) {
            this.f15243b = c6891d;
            return this;
        }
    }

    private C6888a(String str, C6891d c6891d) {
        this.f15240a = str;
        this.f15241b = c6891d;
    }

    /* renamed from: a */
    public static b m19870a() {
        return new b();
    }

    /* renamed from: b */
    public String m19871b() {
        return this.f15240a;
    }

    /* renamed from: c */
    public C6891d m19872c() {
        return this.f15241b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6888a)) {
            return false;
        }
        C6888a c6888a = (C6888a) obj;
        if (hashCode() != c6888a.hashCode()) {
            return false;
        }
        String str = this.f15240a;
        if ((str == null && c6888a.f15240a != null) || (str != null && !str.equals(c6888a.f15240a))) {
            return false;
        }
        C6891d c6891d = this.f15241b;
        return (c6891d == null && c6888a.f15241b == null) || (c6891d != null && c6891d.equals(c6888a.f15241b));
    }

    public int hashCode() {
        String str = this.f15240a;
        int hashCode = str != null ? str.hashCode() : 0;
        C6891d c6891d = this.f15241b;
        return hashCode + (c6891d != null ? c6891d.hashCode() : 0);
    }
}
