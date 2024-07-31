package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* loaded from: classes.dex */
public class f extends i {

    /* renamed from: e, reason: collision with root package name */
    private final n f13913e;

    /* renamed from: f, reason: collision with root package name */
    private final n f13914f;

    /* renamed from: g, reason: collision with root package name */
    private final String f13915g;

    /* renamed from: h, reason: collision with root package name */
    private final de.a f13916h;

    /* renamed from: i, reason: collision with root package name */
    private final de.a f13917i;

    /* renamed from: j, reason: collision with root package name */
    private final g f13918j;

    /* renamed from: k, reason: collision with root package name */
    private final g f13919k;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        g f13920a;

        /* renamed from: b, reason: collision with root package name */
        g f13921b;

        /* renamed from: c, reason: collision with root package name */
        String f13922c;

        /* renamed from: d, reason: collision with root package name */
        de.a f13923d;

        /* renamed from: e, reason: collision with root package name */
        n f13924e;

        /* renamed from: f, reason: collision with root package name */
        n f13925f;

        /* renamed from: g, reason: collision with root package name */
        de.a f13926g;

        public f a(e eVar, Map<String, String> map) {
            de.a aVar = this.f13923d;
            if (aVar == null) {
                throw new IllegalArgumentException("Card model must have a primary action");
            }
            if (aVar.c() == null) {
                throw new IllegalArgumentException("Card model must have a primary action button");
            }
            de.a aVar2 = this.f13926g;
            if (aVar2 != null && aVar2.c() == null) {
                throw new IllegalArgumentException("Card model secondary action must be null or have a button");
            }
            if (this.f13924e == null) {
                throw new IllegalArgumentException("Card model must have a title");
            }
            if (this.f13920a == null && this.f13921b == null) {
                throw new IllegalArgumentException("Card model must have at least one image");
            }
            if (TextUtils.isEmpty(this.f13922c)) {
                throw new IllegalArgumentException("Card model must have a background color");
            }
            return new f(eVar, this.f13924e, this.f13925f, this.f13920a, this.f13921b, this.f13922c, this.f13923d, this.f13926g, map);
        }

        public b b(String str) {
            this.f13922c = str;
            return this;
        }

        public b c(n nVar) {
            this.f13925f = nVar;
            return this;
        }

        public b d(g gVar) {
            this.f13921b = gVar;
            return this;
        }

        public b e(g gVar) {
            this.f13920a = gVar;
            return this;
        }

        public b f(de.a aVar) {
            this.f13923d = aVar;
            return this;
        }

        public b g(de.a aVar) {
            this.f13926g = aVar;
            return this;
        }

        public b h(n nVar) {
            this.f13924e = nVar;
            return this;
        }
    }

    private f(e eVar, n nVar, n nVar2, g gVar, g gVar2, String str, de.a aVar, de.a aVar2, Map<String, String> map) {
        super(eVar, MessageType.CARD, map);
        this.f13913e = nVar;
        this.f13914f = nVar2;
        this.f13918j = gVar;
        this.f13919k = gVar2;
        this.f13915g = str;
        this.f13916h = aVar;
        this.f13917i = aVar2;
    }

    public static b d() {
        return new b();
    }

    @Override // de.i
    @Deprecated
    public g b() {
        return this.f13918j;
    }

    public String e() {
        return this.f13915g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (hashCode() != fVar.hashCode()) {
            return false;
        }
        n nVar = this.f13914f;
        if ((nVar == null && fVar.f13914f != null) || (nVar != null && !nVar.equals(fVar.f13914f))) {
            return false;
        }
        de.a aVar = this.f13917i;
        if ((aVar == null && fVar.f13917i != null) || (aVar != null && !aVar.equals(fVar.f13917i))) {
            return false;
        }
        g gVar = this.f13918j;
        if ((gVar == null && fVar.f13918j != null) || (gVar != null && !gVar.equals(fVar.f13918j))) {
            return false;
        }
        g gVar2 = this.f13919k;
        return (gVar2 != null || fVar.f13919k == null) && (gVar2 == null || gVar2.equals(fVar.f13919k)) && this.f13913e.equals(fVar.f13913e) && this.f13916h.equals(fVar.f13916h) && this.f13915g.equals(fVar.f13915g);
    }

    public n f() {
        return this.f13914f;
    }

    public g g() {
        return this.f13919k;
    }

    public g h() {
        return this.f13918j;
    }

    public int hashCode() {
        n nVar = this.f13914f;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        de.a aVar = this.f13917i;
        int hashCode2 = aVar != null ? aVar.hashCode() : 0;
        g gVar = this.f13918j;
        int hashCode3 = gVar != null ? gVar.hashCode() : 0;
        g gVar2 = this.f13919k;
        return this.f13913e.hashCode() + hashCode + this.f13915g.hashCode() + this.f13916h.hashCode() + hashCode2 + hashCode3 + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public de.a i() {
        return this.f13916h;
    }

    public de.a j() {
        return this.f13917i;
    }

    public n k() {
        return this.f13913e;
    }
}
