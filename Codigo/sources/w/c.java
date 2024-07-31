package w;

import w.q;

/* loaded from: classes.dex */
final class c extends q.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f29443a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f29444b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(int i10, Throwable th2) {
        this.f29443a = i10;
        this.f29444b = th2;
    }

    @Override // w.q.a
    public Throwable c() {
        return this.f29444b;
    }

    @Override // w.q.a
    public int d() {
        return this.f29443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q.a)) {
            return false;
        }
        q.a aVar = (q.a) obj;
        if (this.f29443a == aVar.d()) {
            Throwable th2 = this.f29444b;
            Throwable c10 = aVar.c();
            if (th2 == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (th2.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f29443a ^ 1000003) * 1000003;
        Throwable th2 = this.f29444b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f29443a + ", cause=" + this.f29444b + "}";
    }
}
