package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public class C2119e {

    /* renamed from: a */
    private final Map<Class<?>, Object> f8350a;

    /* renamed from: com.bumptech.glide.e$a */
    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: a */
        private final Map<Class<?>, Object> f8351a = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C2119e m10673b() {
            return new C2119e(this);
        }
    }

    C2119e(a aVar) {
        this.f8350a = Collections.unmodifiableMap(new HashMap(aVar.f8351a));
    }

    /* renamed from: a */
    public boolean m10671a(Class<Object> cls) {
        return this.f8350a.containsKey(cls);
    }
}
