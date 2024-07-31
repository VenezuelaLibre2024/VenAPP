package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* loaded from: classes.dex */
public class j extends i {

    /* renamed from: e, reason: collision with root package name */
    private final n f13939e;

    /* renamed from: f, reason: collision with root package name */
    private final n f13940f;

    /* renamed from: g, reason: collision with root package name */
    private final g f13941g;

    /* renamed from: h, reason: collision with root package name */
    private final de.a f13942h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13943i;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        n f13944a;

        /* renamed from: b, reason: collision with root package name */
        n f13945b;

        /* renamed from: c, reason: collision with root package name */
        g f13946c;

        /* renamed from: d, reason: collision with root package name */
        de.a f13947d;

        /* renamed from: e, reason: collision with root package name */
        String f13948e;

        public j a(e eVar, Map<String, String> map) {
            if (this.f13944a == null) {
                throw new IllegalArgumentException("Modal model must have a title");
            }
            de.a aVar = this.f13947d;
            if (aVar != null && aVar.c() == null) {
                throw new IllegalArgumentException("Modal model action must be null or have a button");
            }
            if (TextUtils.isEmpty(this.f13948e)) {
                throw new IllegalArgumentException("Modal model must have a background color");
            }
            return new j(eVar, this.f13944a, this.f13945b, this.f13946c, this.f13947d, this.f13948e, map);
        }

        public b b(de.a aVar) {
            this.f13947d = aVar;
            return this;
        }

        public b c(String str) {
            this.f13948e = str;
            return this;
        }

        public b d(n nVar) {
            this.f13945b = nVar;
            return this;
        }

        public b e(g gVar) {
            this.f13946c = gVar;
            return this;
        }

        public b f(n nVar) {
            this.f13944a = nVar;
            return this;
        }
    }

    private j(e eVar, n nVar, n nVar2, g gVar, de.a aVar, String str, Map<String, String> map) {
        super(eVar, MessageType.MODAL, map);
        this.f13939e = nVar;
        this.f13940f = nVar2;
        this.f13941g = gVar;
        this.f13942h = aVar;
        this.f13943i = str;
    }

    public static b d() {
        return new b();
    }

    @Override // de.i
    public g b() {
        return this.f13941g;
    }

    public de.a e() {
        return this.f13942h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (hashCode() != jVar.hashCode()) {
            return false;
        }
        n nVar = this.f13940f;
        if ((nVar == null && jVar.f13940f != null) || (nVar != null && !nVar.equals(jVar.f13940f))) {
            return false;
        }
        de.a aVar = this.f13942h;
        if ((aVar == null && jVar.f13942h != null) || (aVar != null && !aVar.equals(jVar.f13942h))) {
            return false;
        }
        g gVar = this.f13941g;
        return (gVar != null || jVar.f13941g == null) && (gVar == null || gVar.equals(jVar.f13941g)) && this.f13939e.equals(jVar.f13939e) && this.f13943i.equals(jVar.f13943i);
    }

    public String f() {
        return this.f13943i;
    }

    public n g() {
        return this.f13940f;
    }

    public n h() {
        return this.f13939e;
    }

    public int hashCode() {
        n nVar = this.f13940f;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        de.a aVar = this.f13942h;
        int hashCode2 = aVar != null ? aVar.hashCode() : 0;
        g gVar = this.f13941g;
        return this.f13939e.hashCode() + hashCode + this.f13943i.hashCode() + hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }
}
