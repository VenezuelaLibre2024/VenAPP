package de;

import android.text.TextUtils;

/* renamed from: de.d */
/* loaded from: classes.dex */
public class C6891d {

    /* renamed from: a */
    private final C6901n f15260a;

    /* renamed from: b */
    private final String f15261b;

    /* renamed from: de.d$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private C6901n f15262a;

        /* renamed from: b */
        private String f15263b;

        /* renamed from: a */
        public C6891d m19898a() {
            if (TextUtils.isEmpty(this.f15263b)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            C6901n c6901n = this.f15262a;
            if (c6901n != null) {
                return new C6891d(c6901n, this.f15263b);
            }
            throw new IllegalArgumentException("Button model must have text");
        }

        /* renamed from: b */
        public b m19899b(String str) {
            this.f15263b = str;
            return this;
        }

        /* renamed from: c */
        public b m19900c(C6901n c6901n) {
            this.f15262a = c6901n;
            return this;
        }
    }

    private C6891d(C6901n c6901n, String str) {
        this.f15260a = c6901n;
        this.f15261b = str;
    }

    /* renamed from: a */
    public static b m19895a() {
        return new b();
    }

    /* renamed from: b */
    public String m19896b() {
        return this.f15261b;
    }

    /* renamed from: c */
    public C6901n m19897c() {
        return this.f15260a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6891d)) {
            return false;
        }
        C6891d c6891d = (C6891d) obj;
        return hashCode() == c6891d.hashCode() && this.f15260a.equals(c6891d.f15260a) && this.f15261b.equals(c6891d.f15261b);
    }

    public int hashCode() {
        return this.f15260a.hashCode() + this.f15261b.hashCode();
    }
}
