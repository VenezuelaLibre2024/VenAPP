package q8;

import t6.d4;
import t6.r3;
import v7.a0;
import v7.f1;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    private a f23624a;

    /* renamed from: b, reason: collision with root package name */
    private s8.e f23625b;

    /* loaded from: classes.dex */
    public interface a {
        void b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s8.e a() {
        return (s8.e) t8.a.i(this.f23625b);
    }

    public void b(a aVar, s8.e eVar) {
        this.f23624a = aVar;
        this.f23625b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f23624a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public void f() {
        this.f23624a = null;
        this.f23625b = null;
    }

    public abstract b0 g(r3[] r3VarArr, f1 f1Var, a0.b bVar, d4 d4Var);

    public void h(v6.e eVar) {
    }
}
