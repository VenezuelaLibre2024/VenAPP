package p428wl;

import dm.InterfaceC7060d;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10527d0;
import p319ql.C10548w;

/* renamed from: wl.h */
/* loaded from: classes3.dex */
public final class C12245h extends AbstractC10527d0 {

    /* renamed from: b */
    private final String f32727b;

    /* renamed from: c */
    private final long f32728c;

    /* renamed from: d */
    private final InterfaceC7060d f32729d;

    public C12245h(String str, long j10, InterfaceC7060d source) {
        C9322n.m27781e(source, "source");
        this.f32727b = str;
        this.f32728c = j10;
        this.f32729d = source;
    }

    @Override // p319ql.AbstractC10527d0
    /* renamed from: b */
    public long mo31705b() {
        return this.f32728c;
    }

    @Override // p319ql.AbstractC10527d0
    /* renamed from: e */
    public C10548w mo31706e() {
        String str = this.f32727b;
        if (str == null) {
            return null;
        }
        return C10548w.f26476e.m31949b(str);
    }

    @Override // p319ql.AbstractC10527d0
    /* renamed from: f */
    public InterfaceC7060d mo31707f() {
        return this.f32729d;
    }
}
