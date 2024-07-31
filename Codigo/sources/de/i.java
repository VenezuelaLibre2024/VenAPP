package de;

import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    g f13935a;

    /* renamed from: b, reason: collision with root package name */
    MessageType f13936b;

    /* renamed from: c, reason: collision with root package name */
    e f13937c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f13938d;

    public i(e eVar, MessageType messageType, Map<String, String> map) {
        this.f13937c = eVar;
        this.f13936b = messageType;
        this.f13938d = map;
    }

    public e a() {
        return this.f13937c;
    }

    @Deprecated
    public g b() {
        return this.f13935a;
    }

    public MessageType c() {
        return this.f13936b;
    }
}
