package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.C5203m;
import com.google.android.gms.common.api.InterfaceC5204n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes.dex */
public class C5273r {

    /* renamed from: a */
    private static final InterfaceC5274r0 f10746a = new C5262n0();

    /* renamed from: com.google.android.gms.common.internal.r$a */
    /* loaded from: classes.dex */
    public interface a<R extends InterfaceC5204n, T> {
        /* renamed from: a */
        T mo12957a(R r10);
    }

    /* renamed from: a */
    public static <R extends InterfaceC5204n, T extends C5203m<R>> Task<T> m13311a(AbstractC5109i<R> abstractC5109i, T t10) {
        return m13312b(abstractC5109i, new C5268p0(t10));
    }

    /* renamed from: b */
    public static <R extends InterfaceC5204n, T> Task<T> m13312b(AbstractC5109i<R> abstractC5109i, a<R, T> aVar) {
        InterfaceC5274r0 interfaceC5274r0 = f10746a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        abstractC5109i.addStatusListener(new C5265o0(abstractC5109i, taskCompletionSource, aVar, interfaceC5274r0));
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public static <R extends InterfaceC5204n> Task<Void> m13313c(AbstractC5109i<R> abstractC5109i) {
        return m13312b(abstractC5109i, new C5271q0());
    }
}
