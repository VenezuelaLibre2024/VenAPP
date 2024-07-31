package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.InterfaceC5204n;

/* renamed from: com.google.android.gms.common.api.internal.q0 */
/* loaded from: classes.dex */
public final class C5171q0 extends C5128e0 {

    /* renamed from: c */
    private final AbstractC5105e f10574c;

    public C5171q0(AbstractC5105e abstractC5105e) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f10574c = abstractC5105e;
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: a */
    public final <A extends C5101a.b, R extends InterfaceC5204n, T extends AbstractC5123d<R, A>> T mo12984a(T t10) {
        return (T) this.f10574c.doRead((AbstractC5105e) t10);
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: b */
    public final <A extends C5101a.b, T extends AbstractC5123d<? extends InterfaceC5204n, A>> T mo12985b(T t10) {
        return (T) this.f10574c.doWrite((AbstractC5105e) t10);
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: e */
    public final Context mo12987e() {
        return this.f10574c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: f */
    public final Looper mo12988f() {
        return this.f10574c.getLooper();
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: i */
    public final void mo12991i(C5178s1 c5178s1) {
    }

    @Override // com.google.android.gms.common.api.AbstractC5106f
    /* renamed from: j */
    public final void mo12992j(C5178s1 c5178s1) {
    }
}
