package com.bumptech.glide.load.data;

import com.bumptech.glide.EnumC2121g;
import p129h3.EnumC7617a;

/* renamed from: com.bumptech.glide.load.data.d */
/* loaded from: classes.dex */
public interface InterfaceC2133d<T> {

    /* renamed from: com.bumptech.glide.load.data.d$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: c */
        void mo10773c(Exception exc);

        /* renamed from: f */
        void mo10774f(T t10);
    }

    /* renamed from: a */
    Class<T> mo10760a();

    /* renamed from: b */
    void mo10765b();

    void cancel();

    /* renamed from: d */
    EnumC7617a mo10767d();

    /* renamed from: e */
    void mo10768e(EnumC2121g enumC2121g, a<? super T> aVar);
}
