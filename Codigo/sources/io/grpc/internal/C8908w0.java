package io.grpc.internal;

import java.util.ArrayList;

/* renamed from: io.grpc.internal.w0 */
/* loaded from: classes3.dex */
public final class C8908w0 {

    /* renamed from: a */
    private final ArrayList<String> f20934a = new ArrayList<>();

    /* renamed from: a */
    public C8908w0 m25875a(Object obj) {
        this.f20934a.add(String.valueOf(obj));
        return this;
    }

    /* renamed from: b */
    public C8908w0 m25876b(String str, Object obj) {
        this.f20934a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f20934a.toString();
    }
}
