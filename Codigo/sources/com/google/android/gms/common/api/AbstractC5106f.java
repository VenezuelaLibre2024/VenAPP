package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.internal.AbstractC5123d;
import com.google.android.gms.common.api.internal.C5178s1;
import com.google.android.gms.common.api.internal.InterfaceC5131f;
import com.google.android.gms.common.api.internal.InterfaceC5161n;
import com.google.android.gms.common.api.internal.InterfaceC5176s;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* renamed from: com.google.android.gms.common.api.f */
/* loaded from: classes.dex */
public abstract class AbstractC5106f {

    /* renamed from: a */
    private static final Set f10422a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$a */
    /* loaded from: classes.dex */
    public interface a extends InterfaceC5131f {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.common.api.f$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC5161n {
    }

    /* renamed from: c */
    public static Set<AbstractC5106f> m12983c() {
        Set<AbstractC5106f> set = f10422a;
        synchronized (set) {
        }
        return set;
    }

    /* renamed from: a */
    public <A extends C5101a.b, R extends InterfaceC5204n, T extends AbstractC5123d<R, A>> T mo12984a(T t10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public <A extends C5101a.b, T extends AbstractC5123d<? extends InterfaceC5204n, A>> T mo12985b(T t10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public <C extends C5101a.f> C m12986d(C5101a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public Context mo12987e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public Looper mo12988f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public boolean m12989g(InterfaceC5176s interfaceC5176s) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public void m12990h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public void mo12991i(C5178s1 c5178s1) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public void mo12992j(C5178s1 c5178s1) {
        throw new UnsupportedOperationException();
    }
}
