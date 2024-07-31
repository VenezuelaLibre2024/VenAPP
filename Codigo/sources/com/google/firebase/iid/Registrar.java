package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import pd.a;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements pd.a {

        /* renamed from: a, reason: collision with root package name */
        final FirebaseInstanceId f11876a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f11876a = firebaseInstanceId;
        }

        @Override // pd.a
        public String a() {
            return this.f11876a.n();
        }

        @Override // pd.a
        public void b(String str, String str2) {
            this.f11876a.f(str, str2);
        }

        @Override // pd.a
        public void c(a.InterfaceC0378a interfaceC0378a) {
            this.f11876a.a(interfaceC0378a);
        }

        @Override // pd.a
        public Task<String> d() {
            String n10 = this.f11876a.n();
            return n10 != null ? Tasks.forResult(n10) : this.f11876a.j().continueWith(q.f11912a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(pc.d dVar) {
        return new FirebaseInstanceId((zb.g) dVar.get(zb.g.class), dVar.f(ye.i.class), dVar.f(od.j.class), (fe.f) dVar.get(fe.f.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ pd.a lambda$getComponents$1$Registrar(pc.d dVar) {
        return new a((FirebaseInstanceId) dVar.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<pc.c<?>> getComponents() {
        return Arrays.asList(pc.c.c(FirebaseInstanceId.class).b(pc.q.j(zb.g.class)).b(pc.q.i(ye.i.class)).b(pc.q.i(od.j.class)).b(pc.q.j(fe.f.class)).f(o.f11910a).c().d(), pc.c.c(pd.a.class).b(pc.q.j(FirebaseInstanceId.class)).f(p.f11911a).d(), ye.h.b("fire-iid", "21.1.0"));
    }
}
