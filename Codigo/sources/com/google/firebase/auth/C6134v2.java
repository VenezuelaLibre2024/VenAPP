package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import p272oc.InterfaceC9859i1;
import p272oc.InterfaceC9899w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.auth.v2 */
/* loaded from: classes.dex */
public final class C6134v2 implements InterfaceC9899w, InterfaceC9859i1 {

    /* renamed from: a */
    private final /* synthetic */ FirebaseAuth f13009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6134v2(FirebaseAuth firebaseAuth) {
        this.f13009a = firebaseAuth;
    }

    @Override // p272oc.InterfaceC9859i1
    /* renamed from: a */
    public final void mo16427a(zzafn zzafnVar, AbstractC6045a0 abstractC6045a0) {
        this.f13009a.m16392f0(abstractC6045a0, zzafnVar, true, true);
    }

    @Override // p272oc.InterfaceC9899w
    public final void zza(Status status) {
        int m12969v1 = status.m12969v1();
        if (m12969v1 == 17011 || m12969v1 == 17021 || m12969v1 == 17005) {
            this.f13009a.m16362C();
        }
    }
}
