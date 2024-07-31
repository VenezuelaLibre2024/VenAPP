package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.f */
/* loaded from: classes2.dex */
public interface InterfaceFutureC5920f<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}
