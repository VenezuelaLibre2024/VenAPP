package de;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* renamed from: de.i */
/* loaded from: classes.dex */
public abstract class AbstractC6896i {

    /* renamed from: a */
    @Deprecated
    C6894g f15289a;

    /* renamed from: b */
    MessageType f15290b;

    /* renamed from: c */
    C6892e f15291c;

    /* renamed from: d */
    private Map<String, String> f15292d;

    public AbstractC6896i(C6892e c6892e, MessageType messageType, Map<String, String> map) {
        this.f15291c = c6892e;
        this.f15290b = messageType;
        this.f15292d = map;
    }

    /* renamed from: a */
    public C6892e m19929a() {
        return this.f15291c;
    }

    @Deprecated
    /* renamed from: b */
    public C6894g mo19884b() {
        return this.f15289a;
    }

    /* renamed from: c */
    public MessageType m19930c() {
        return this.f15290b;
    }
}
