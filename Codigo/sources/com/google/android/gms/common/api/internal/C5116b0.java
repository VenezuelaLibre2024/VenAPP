package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C5102b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* loaded from: classes.dex */
public final class C5116b0 {

    /* renamed from: a */
    private final Map f10434a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map f10435b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m13003h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f10434a) {
            hashMap = new HashMap(this.f10434a);
        }
        synchronized (this.f10435b) {
            hashMap2 = new HashMap(this.f10435b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new C5102b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m13004c(BasePendingResult basePendingResult, boolean z10) {
        this.f10434a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.addStatusListener(new C5197z(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m13005d(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.f10435b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new C5112a0(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m13006e(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.m13003h(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C5116b0.m13006e(int, java.lang.String):void");
    }

    /* renamed from: f */
    public final void m13007f() {
        m13003h(false, C5135g.f10461C);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m13008g() {
        return (this.f10434a.isEmpty() && this.f10435b.isEmpty()) ? false : true;
    }
}
