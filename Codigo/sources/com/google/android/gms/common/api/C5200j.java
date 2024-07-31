package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C5164o;
import com.google.android.gms.common.api.internal.C5185v;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.common.api.j */
/* loaded from: classes.dex */
public final class C5200j {
    /* renamed from: a */
    public static <R extends InterfaceC5204n> AbstractC5109i<R> m13209a(R r10, AbstractC5106f abstractC5106f) {
        C5276s.m13325k(r10, "Result must not be null");
        C5276s.m13316b(!r10.getStatus().m12972y1(), "Status code must not be SUCCESS");
        C5213w c5213w = new C5213w(abstractC5106f, r10);
        c5213w.setResult(r10);
        return c5213w;
    }

    /* renamed from: b */
    public static <R extends InterfaceC5204n> AbstractC5108h<R> m13210b(R r10, AbstractC5106f abstractC5106f) {
        C5276s.m13325k(r10, "Result must not be null");
        C5214x c5214x = new C5214x(abstractC5106f);
        c5214x.setResult(r10);
        return new C5164o(c5214x);
    }

    /* renamed from: c */
    public static AbstractC5109i<Status> m13211c(Status status, AbstractC5106f abstractC5106f) {
        C5276s.m13325k(status, "Result must not be null");
        C5185v c5185v = new C5185v(abstractC5106f);
        c5185v.setResult(status);
        return c5185v;
    }
}
