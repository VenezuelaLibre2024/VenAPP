package de;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f13951a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13952b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f13953a;

        /* renamed from: b, reason: collision with root package name */
        private String f13954b;

        public n a() {
            if (TextUtils.isEmpty(this.f13954b)) {
                throw new IllegalArgumentException("Text model must have a color");
            }
            return new n(this.f13953a, this.f13954b);
        }

        public b b(String str) {
            this.f13954b = str;
            return this;
        }

        public b c(String str) {
            this.f13953a = str;
            return this;
        }
    }

    private n(String str, String str2) {
        this.f13951a = str;
        this.f13952b = str2;
    }

    public static b a() {
        return new b();
    }

    public String b() {
        return this.f13952b;
    }

    public String c() {
        return this.f13951a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (hashCode() != nVar.hashCode()) {
            return false;
        }
        String str = this.f13951a;
        return (str != null || nVar.f13951a == null) && (str == null || str.equals(nVar.f13951a)) && this.f13952b.equals(nVar.f13952b);
    }

    public int hashCode() {
        String str = this.f13951a;
        return str != null ? str.hashCode() + this.f13952b.hashCode() : this.f13952b.hashCode();
    }
}
