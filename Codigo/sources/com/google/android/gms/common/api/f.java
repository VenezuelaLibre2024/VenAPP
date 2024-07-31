package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.s1;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f9314a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends com.google.android.gms.common.api.internal.f {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends com.google.android.gms.common.api.internal.n {
    }

    public static Set<f> c() {
        Set<f> set = f9314a;
        synchronized (set) {
        }
        return set;
    }

    public <A extends a.b, R extends n, T extends com.google.android.gms.common.api.internal.d<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends n, A>> T b(T t10) {
        throw new UnsupportedOperationException();
    }

    public <C extends a.f> C d(a.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public Context e() {
        throw new UnsupportedOperationException();
    }

    public Looper f() {
        throw new UnsupportedOperationException();
    }

    public boolean g(com.google.android.gms.common.api.internal.s sVar) {
        throw new UnsupportedOperationException();
    }

    public void h() {
        throw new UnsupportedOperationException();
    }

    public void i(s1 s1Var) {
        throw new UnsupportedOperationException();
    }

    public void j(s1 s1Var) {
        throw new UnsupportedOperationException();
    }
}
