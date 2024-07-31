package de;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f13886a;

    /* renamed from: b, reason: collision with root package name */
    private final d f13887b;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f13888a;

        /* renamed from: b, reason: collision with root package name */
        private d f13889b;

        public a a() {
            return new a(this.f13888a, this.f13889b);
        }

        public b b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f13888a = str;
            }
            return this;
        }

        public b c(d dVar) {
            this.f13889b = dVar;
            return this;
        }
    }

    private a(String str, d dVar) {
        this.f13886a = str;
        this.f13887b = dVar;
    }

    public static b a() {
        return new b();
    }

    public String b() {
        return this.f13886a;
    }

    public d c() {
        return this.f13887b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str = this.f13886a;
        if ((str == null && aVar.f13886a != null) || (str != null && !str.equals(aVar.f13886a))) {
            return false;
        }
        d dVar = this.f13887b;
        return (dVar == null && aVar.f13887b == null) || (dVar != null && dVar.equals(aVar.f13887b));
    }

    public int hashCode() {
        String str = this.f13886a;
        int hashCode = str != null ? str.hashCode() : 0;
        d dVar = this.f13887b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
