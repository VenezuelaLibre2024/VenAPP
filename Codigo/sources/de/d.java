package de;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final n f13906a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13907b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private n f13908a;

        /* renamed from: b, reason: collision with root package name */
        private String f13909b;

        public d a() {
            if (TextUtils.isEmpty(this.f13909b)) {
                throw new IllegalArgumentException("Button model must have a color");
            }
            n nVar = this.f13908a;
            if (nVar != null) {
                return new d(nVar, this.f13909b);
            }
            throw new IllegalArgumentException("Button model must have text");
        }

        public b b(String str) {
            this.f13909b = str;
            return this;
        }

        public b c(n nVar) {
            this.f13908a = nVar;
            return this;
        }
    }

    private d(n nVar, String str) {
        this.f13906a = nVar;
        this.f13907b = str;
    }

    public static b a() {
        return new b();
    }

    public String b() {
        return this.f13907b;
    }

    public n c() {
        return this.f13906a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return hashCode() == dVar.hashCode() && this.f13906a.equals(dVar.f13906a) && this.f13907b.equals(dVar.f13907b);
    }

    public int hashCode() {
        return this.f13906a.hashCode() + this.f13907b.hashCode();
    }
}
