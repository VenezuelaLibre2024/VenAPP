package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, Object> f7398a;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, Object> f7399a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        public e b() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f7398a = Collections.unmodifiableMap(new HashMap(aVar.f7399a));
    }

    public boolean a(Class<Object> cls) {
        return this.f7398a.containsKey(cls);
    }
}
