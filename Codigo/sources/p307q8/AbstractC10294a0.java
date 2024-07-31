package p307q8;

import p351s8.InterfaceC10817e;
import p361t6.AbstractC11018d4;
import p361t6.InterfaceC11095r3;
import p363t8.C11137a;
import p396v6.C11639e;
import p397v7.C11700f1;
import p397v7.InterfaceC11684a0;

/* renamed from: q8.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC10294a0 {

    /* renamed from: a */
    private a f25592a;

    /* renamed from: b */
    private InterfaceC10817e f25593b;

    /* renamed from: q8.a0$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo30875b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final InterfaceC10817e m30867a() {
        return (InterfaceC10817e) C11137a.m34607i(this.f25593b);
    }

    /* renamed from: b */
    public void m30868b(a aVar, InterfaceC10817e interfaceC10817e) {
        this.f25592a = aVar;
        this.f25593b = interfaceC10817e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m30869c() {
        a aVar = this.f25592a;
        if (aVar != null) {
            aVar.mo30875b();
        }
    }

    /* renamed from: d */
    public boolean mo30870d() {
        return false;
    }

    /* renamed from: e */
    public abstract void mo30871e(Object obj);

    /* renamed from: f */
    public void mo30872f() {
        this.f25592a = null;
        this.f25593b = null;
    }

    /* renamed from: g */
    public abstract C10296b0 mo30873g(InterfaceC11095r3[] interfaceC11095r3Arr, C11700f1 c11700f1, InterfaceC11684a0.b bVar, AbstractC11018d4 abstractC11018d4);

    /* renamed from: h */
    public void mo30874h(C11639e c11639e) {
    }
}
