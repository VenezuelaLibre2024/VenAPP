package io.grpc.internal;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f19187a = new ArrayList<>();

    public w0 a(Object obj) {
        this.f19187a.add(String.valueOf(obj));
        return this;
    }

    public w0 b(String str, Object obj) {
        this.f19187a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f19187a.toString();
    }
}
