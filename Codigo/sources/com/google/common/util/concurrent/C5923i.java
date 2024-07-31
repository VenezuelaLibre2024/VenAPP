package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.common.util.concurrent.i */
/* loaded from: classes2.dex */
final class C5923i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m15180a(Object obj, long j10) {
        LockSupport.parkNanos(obj, Math.min(j10, 2147483647999999999L));
    }
}
