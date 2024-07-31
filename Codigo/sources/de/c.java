package de;

import android.text.TextUtils;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends i {

    /* renamed from: e, reason: collision with root package name */
    private final n f13896e;

    /* renamed from: f, reason: collision with root package name */
    private final n f13897f;

    /* renamed from: g, reason: collision with root package name */
    private final g f13898g;

    /* renamed from: h, reason: collision with root package name */
    private final de.a f13899h;

    /* renamed from: i, reason: collision with root package name */
    private final String f13900i;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        n f13901a;

        /* renamed from: b, reason: collision with root package name */
        n f13902b;

        /* renamed from: c, reason: collision with root package name */
        g f13903c;

        /* renamed from: d, reason: collision with root package name */
        de.a f13904d;

        /* renamed from: e, reason: collision with root package name */
        String f13905e;

        public c a(e eVar, Map<String, String> map) {
            if (this.f13901a == null) {
                throw new IllegalArgumentException("Banner model must have a title");
            }
            if (TextUtils.isEmpty(this.f13905e)) {
                throw new IllegalArgumentException("Banner model must have a background color");
            }
            return new c(eVar, this.f13901a, this.f13902b, this.f13903c, this.f13904d, this.f13905e, map);
        }

        public b b(de.a aVar) {
            this.f13904d = aVar;
            return this;
        }

        public b c(String str) {
            this.f13905e = str;
            return this;
        }

        public b d(n nVar) {
            this.f13902b = nVar;
            return this;
        }

        public b e(g gVar) {
            this.f13903c = gVar;
            return this;
        }

        public b f(n nVar) {
            this.f13901a = nVar;
            return this;
        }
    }

    private c(e eVar, n nVar, n nVar2, g gVar, de.a aVar, String str, Map<String, String> map) {
        super(eVar, MessageType.BANNER, map);
        this.f13896e = nVar;
        this.f13897f = nVar2;
        this.f13898g = gVar;
        this.f13899h = aVar;
        this.f13900i = str;
    }

    public static b d() {
        return new b();
    }

    @Override // de.i
    public g b() {
        return this.f13898g;
    }

    public de.a e() {
        return this.f13899h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        n nVar = this.f13897f;
        if ((nVar == null && cVar.f13897f != null) || (nVar != null && !nVar.equals(cVar.f13897f))) {
            return false;
        }
        g gVar = this.f13898g;
        if ((gVar == null && cVar.f13898g != null) || (gVar != null && !gVar.equals(cVar.f13898g))) {
            return false;
        }
        de.a aVar = this.f13899h;
        return (aVar != null || cVar.f13899h == null) && (aVar == null || aVar.equals(cVar.f13899h)) && this.f13896e.equals(cVar.f13896e) && this.f13900i.equals(cVar.f13900i);
    }

    public String f() {
        return this.f13900i;
    }

    public n g() {
        return this.f13897f;
    }

    public n h() {
        return this.f13896e;
    }

    public int hashCode() {
        n nVar = this.f13897f;
        int hashCode = nVar != null ? nVar.hashCode() : 0;
        g gVar = this.f13898g;
        int hashCode2 = gVar != null ? gVar.hashCode() : 0;
        de.a aVar = this.f13899h;
        return this.f13896e.hashCode() + hashCode + hashCode2 + (aVar != null ? aVar.hashCode() : 0) + this.f13900i.hashCode();
    }
}
