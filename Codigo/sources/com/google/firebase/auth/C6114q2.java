package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import p272oc.InterfaceC9890t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.q2 */
/* loaded from: classes.dex */
public final class C6114q2 implements InterfaceC9890t {

    /* renamed from: a */
    private final /* synthetic */ AbstractC6045a0 f12995a;

    /* renamed from: b */
    private final /* synthetic */ FirebaseAuth f12996b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6114q2(FirebaseAuth firebaseAuth, AbstractC6045a0 abstractC6045a0) {
        this.f12996b = firebaseAuth;
        this.f12995a = abstractC6045a0;
    }

    @Override // p272oc.InterfaceC9890t
    public final void zza() {
        AbstractC6045a0 abstractC6045a0;
        AbstractC6045a0 abstractC6045a02;
        abstractC6045a0 = this.f12996b.f12825f;
        if (abstractC6045a0 != null) {
            abstractC6045a02 = this.f12996b.f12825f;
            if (abstractC6045a02.mo16454l().equalsIgnoreCase(this.f12995a.mo16454l())) {
                this.f12996b.m16367F0();
            }
        }
    }

    @Override // p272oc.InterfaceC9899w
    public final void zza(Status status) {
        if (status.m12969v1() == 17011 || status.m12969v1() == 17021 || status.m12969v1() == 17005) {
            this.f12996b.m16362C();
        }
    }
}
