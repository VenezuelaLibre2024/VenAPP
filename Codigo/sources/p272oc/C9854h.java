package p272oc;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AbstractC6073h0;
import com.google.firebase.auth.AbstractC6077i0;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.AbstractC6092l0;
import com.google.firebase.auth.FirebaseAuth;
import java.util.List;

/* renamed from: oc.h */
/* loaded from: classes.dex */
public final class C9854h extends AbstractC6073h0 {

    /* renamed from: a */
    private final C9842d f24325a;

    public C9854h(C9842d c9842d) {
        C5276s.m13324j(c9842d);
        this.f24325a = c9842d;
    }

    @Override // com.google.firebase.auth.AbstractC6073h0
    /* renamed from: a */
    public final Task<Void> mo16531a(AbstractC6077i0 abstractC6077i0, String str) {
        C5276s.m13324j(abstractC6077i0);
        C9842d c9842d = this.f24325a;
        return FirebaseAuth.getInstance(c9842d.mo16447Q1()).m16375N(c9842d, abstractC6077i0, str);
    }

    @Override // com.google.firebase.auth.AbstractC6073h0
    /* renamed from: b */
    public final List<AbstractC6084j0> mo16532b() {
        return this.f24325a.zzh();
    }

    @Override // com.google.firebase.auth.AbstractC6073h0
    /* renamed from: c */
    public final Task<AbstractC6092l0> mo16533c() {
        return this.f24325a.m16458v1(false).continueWithTask(new C9863k(this));
    }

    @Override // com.google.firebase.auth.AbstractC6073h0
    /* renamed from: d */
    public final Task<Void> mo16534d(String str) {
        C5276s.m13320f(str);
        C9842d c9842d = this.f24325a;
        return FirebaseAuth.getInstance(c9842d.mo16447Q1()).m16378Q(c9842d, str);
    }
}
