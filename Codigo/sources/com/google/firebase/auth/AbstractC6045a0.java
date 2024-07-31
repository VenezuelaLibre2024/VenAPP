package com.google.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.p498firebaseauthapi.zzafn;
import com.google.android.gms.tasks.Task;
import java.util.List;
import p081ea.AbstractC7138a;
import p485zb.C12867g;

/* renamed from: com.google.firebase.auth.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC6045a0 extends AbstractC7138a implements InterfaceC6054c1 {
    /* renamed from: A1 */
    public abstract boolean mo16430A1();

    /* renamed from: B1 */
    public Task<InterfaceC6076i> m16431B1(AbstractC6072h abstractC6072h) {
        C5276s.m13324j(abstractC6072h);
        return FirebaseAuth.getInstance(mo16447Q1()).m16374M(this, abstractC6072h);
    }

    /* renamed from: C1 */
    public Task<InterfaceC6076i> m16432C1(AbstractC6072h abstractC6072h) {
        C5276s.m13324j(abstractC6072h);
        return FirebaseAuth.getInstance(mo16447Q1()).m16412s0(this, abstractC6072h);
    }

    /* renamed from: D1 */
    public Task<Void> m16433D1() {
        return FirebaseAuth.getInstance(mo16447Q1()).m16402l0(this);
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: E */
    public abstract String mo16434E();

    /* renamed from: E1 */
    public Task<Void> m16435E1() {
        return FirebaseAuth.getInstance(mo16447Q1()).m16379S(this, false).continueWithTask(new C6093l1(this));
    }

    /* renamed from: F1 */
    public Task<Void> m16436F1(C6060e c6060e) {
        return FirebaseAuth.getInstance(mo16447Q1()).m16379S(this, false).continueWithTask(new C6089k1(this, c6060e));
    }

    /* renamed from: G1 */
    public Task<InterfaceC6076i> m16437G1(Activity activity, AbstractC6099n abstractC6099n) {
        C5276s.m13324j(activity);
        C5276s.m13324j(abstractC6099n);
        return FirebaseAuth.getInstance(mo16447Q1()).m16371I(activity, abstractC6099n, this);
    }

    /* renamed from: H1 */
    public Task<InterfaceC6076i> m16438H1(Activity activity, AbstractC6099n abstractC6099n) {
        C5276s.m13324j(activity);
        C5276s.m13324j(abstractC6099n);
        return FirebaseAuth.getInstance(mo16447Q1()).m16400k0(activity, abstractC6099n, this);
    }

    /* renamed from: I1 */
    public Task<InterfaceC6076i> m16439I1(String str) {
        C5276s.m13320f(str);
        return FirebaseAuth.getInstance(mo16447Q1()).m16404m0(this, str);
    }

    @Deprecated
    /* renamed from: J1 */
    public Task<Void> m16440J1(String str) {
        C5276s.m13320f(str);
        return FirebaseAuth.getInstance(mo16447Q1()).m16414t0(this, str);
    }

    /* renamed from: K1 */
    public Task<Void> m16441K1(String str) {
        C5276s.m13320f(str);
        return FirebaseAuth.getInstance(mo16447Q1()).m16418v0(this, str);
    }

    /* renamed from: L1 */
    public Task<Void> m16442L1(C6104o0 c6104o0) {
        return FirebaseAuth.getInstance(mo16447Q1()).m16376O(this, c6104o0);
    }

    /* renamed from: M1 */
    public Task<Void> m16443M1(C6058d1 c6058d1) {
        C5276s.m13324j(c6058d1);
        return FirebaseAuth.getInstance(mo16447Q1()).m16377P(this, c6058d1);
    }

    /* renamed from: N1 */
    public Task<Void> m16444N1(String str) {
        return m16445O1(str, null);
    }

    /* renamed from: O1 */
    public Task<Void> m16445O1(String str, C6060e c6060e) {
        return FirebaseAuth.getInstance(mo16447Q1()).m16379S(this, false).continueWithTask(new C6097m1(this, str, c6060e));
    }

    /* renamed from: P1 */
    public abstract AbstractC6045a0 mo16446P1(List<? extends InterfaceC6054c1> list);

    /* renamed from: Q1 */
    public abstract C12867g mo16447Q1();

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: R */
    public abstract String mo16448R();

    /* renamed from: R1 */
    public abstract void mo16449R1(zzafn zzafnVar);

    /* renamed from: S1 */
    public abstract AbstractC6045a0 mo16450S1();

    /* renamed from: T1 */
    public abstract void mo16451T1(List<AbstractC6084j0> list);

    /* renamed from: U1 */
    public abstract zzafn mo16452U1();

    /* renamed from: V1 */
    public abstract List<String> mo16453V1();

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: l */
    public abstract String mo16454l();

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: r */
    public abstract String mo16455r();

    /* renamed from: u1 */
    public Task<Void> m16456u1() {
        return FirebaseAuth.getInstance(mo16447Q1()).m16373L(this);
    }

    @Override // com.google.firebase.auth.InterfaceC6054c1
    /* renamed from: v0 */
    public abstract Uri mo16457v0();

    /* renamed from: v1 */
    public Task<C6053c0> m16458v1(boolean z10) {
        return FirebaseAuth.getInstance(mo16447Q1()).m16379S(this, z10);
    }

    /* renamed from: w1 */
    public abstract InterfaceC6049b0 mo16459w1();

    /* renamed from: x1 */
    public abstract AbstractC6073h0 mo16460x1();

    /* renamed from: y1 */
    public abstract List<? extends InterfaceC6054c1> mo16461y1();

    /* renamed from: z1 */
    public abstract String mo16462z1();

    public abstract String zzd();

    public abstract String zze();
}
