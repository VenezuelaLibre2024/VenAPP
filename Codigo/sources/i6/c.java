package i6;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a */
    private final Context f17165a;

    /* renamed from: b */
    private final r6.a f17166b;

    /* renamed from: c */
    private final r6.a f17167c;

    /* renamed from: d */
    private final String f17168d;

    public c(Context context, r6.a aVar, r6.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f17165a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f17166b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f17167c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f17168d = str;
    }

    @Override // i6.h
    public Context b() {
        return this.f17165a;
    }

    @Override // i6.h
    public String c() {
        return this.f17168d;
    }

    @Override // i6.h
    public r6.a d() {
        return this.f17167c;
    }

    @Override // i6.h
    public r6.a e() {
        return this.f17166b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17165a.equals(hVar.b()) && this.f17166b.equals(hVar.e()) && this.f17167c.equals(hVar.d()) && this.f17168d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f17165a.hashCode() ^ 1000003) * 1000003) ^ this.f17166b.hashCode()) * 1000003) ^ this.f17167c.hashCode()) * 1000003) ^ this.f17168d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f17165a + ", wallClock=" + this.f17166b + ", monotonicClock=" + this.f17167c + ", backendName=" + this.f17168d + "}";
    }
}
