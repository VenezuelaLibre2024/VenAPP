package de;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends i {

    /* renamed from: e, reason: collision with root package name */
    private g f13931e;

    /* renamed from: f, reason: collision with root package name */
    private de.a f13932f;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        g f13933a;

        /* renamed from: b, reason: collision with root package name */
        de.a f13934b;

        public h a(e eVar, Map<String, String> map) {
            g gVar = this.f13933a;
            if (gVar != null) {
                return new h(eVar, gVar, this.f13934b, map);
            }
            throw new IllegalArgumentException("ImageOnly model must have image data");
        }

        public b b(de.a aVar) {
            this.f13934b = aVar;
            return this;
        }

        public b c(g gVar) {
            this.f13933a = gVar;
            return this;
        }
    }

    private h(e eVar, g gVar, de.a aVar, Map<String, String> map) {
        super(eVar, MessageType.IMAGE_ONLY, map);
        this.f13931e = gVar;
        this.f13932f = aVar;
    }

    public static b d() {
        return new b();
    }

    @Override // de.i
    public g b() {
        return this.f13931e;
    }

    public de.a e() {
        return this.f13932f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hashCode() != hVar.hashCode()) {
            return false;
        }
        de.a aVar = this.f13932f;
        return (aVar != null || hVar.f13932f == null) && (aVar == null || aVar.equals(hVar.f13932f)) && this.f13931e.equals(hVar.f13931e);
    }

    public int hashCode() {
        de.a aVar = this.f13932f;
        return this.f13931e.hashCode() + (aVar != null ? aVar.hashCode() : 0);
    }
}
