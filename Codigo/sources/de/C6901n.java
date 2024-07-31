package de;

import android.text.TextUtils;

/* renamed from: de.n */
/* loaded from: classes.dex */
public class C6901n {

    /* renamed from: a */
    private final String f15305a;

    /* renamed from: b */
    private final String f15306b;

    /* renamed from: de.n$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private String f15307a;

        /* renamed from: b */
        private String f15308b;

        /* renamed from: a */
        public C6901n m19958a() {
            if (TextUtils.isEmpty(this.f15308b)) {
                throw new IllegalArgumentException("Text model must have a color");
            }
            return new C6901n(this.f15307a, this.f15308b);
        }

        /* renamed from: b */
        public b m19959b(String str) {
            this.f15308b = str;
            return this;
        }

        /* renamed from: c */
        public b m19960c(String str) {
            this.f15307a = str;
            return this;
        }
    }

    private C6901n(String str, String str2) {
        this.f15305a = str;
        this.f15306b = str2;
    }

    /* renamed from: a */
    public static b m19955a() {
        return new b();
    }

    /* renamed from: b */
    public String m19956b() {
        return this.f15306b;
    }

    /* renamed from: c */
    public String m19957c() {
        return this.f15305a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6901n)) {
            return false;
        }
        C6901n c6901n = (C6901n) obj;
        if (hashCode() != c6901n.hashCode()) {
            return false;
        }
        String str = this.f15305a;
        return (str != null || c6901n.f15305a == null) && (str == null || str.equals(c6901n.f15305a)) && this.f15306b.equals(c6901n.f15306b);
    }

    public int hashCode() {
        String str = this.f15305a;
        return str != null ? str.hashCode() + this.f15306b.hashCode() : this.f15306b.hashCode();
    }
}
