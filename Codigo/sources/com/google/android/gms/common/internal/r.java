package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final r0 f9631a = new n0();

    /* loaded from: classes.dex */
    public interface a<R extends com.google.android.gms.common.api.n, T> {
        T a(R r10);
    }

    public static <R extends com.google.android.gms.common.api.n, T extends com.google.android.gms.common.api.m<R>> Task<T> a(com.google.android.gms.common.api.i<R> iVar, T t10) {
        return b(iVar, new p0(t10));
    }

    public static <R extends com.google.android.gms.common.api.n, T> Task<T> b(com.google.android.gms.common.api.i<R> iVar, a<R, T> aVar) {
        r0 r0Var = f9631a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        iVar.addStatusListener(new o0(iVar, taskCompletionSource, aVar, r0Var));
        return taskCompletionSource.getTask();
    }

    public static <R extends com.google.android.gms.common.api.n> Task<Void> c(com.google.android.gms.common.api.i<R> iVar) {
        return b(iVar, new q0());
    }
}
