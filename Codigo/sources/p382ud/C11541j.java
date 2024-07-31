package p382ud;

import de.AbstractC6896i;
import p129h3.EnumC7617a;
import p171j3.C8970q;
import p311qd.InterfaceC10460t;
import p456y3.InterfaceC12593h;
import p478z3.InterfaceC12798d;

/* renamed from: ud.j */
/* loaded from: classes.dex */
public class C11541j implements InterfaceC12593h<Object> {

    /* renamed from: a */
    private AbstractC6896i f29931a;

    /* renamed from: b */
    private InterfaceC10460t f29932b;

    @Override // p456y3.InterfaceC12593h
    /* renamed from: c */
    public boolean mo36135c(Object obj, Object obj2, InterfaceC12798d<Object> interfaceC12798d, EnumC7617a enumC7617a, boolean z10) {
        C11544m.m36182a("Image Downloading  Success : " + obj);
        return false;
    }

    @Override // p456y3.InterfaceC12593h
    /* renamed from: d */
    public boolean mo36136d(C8970q c8970q, Object obj, InterfaceC12798d<Object> interfaceC12798d, boolean z10) {
        InterfaceC10460t interfaceC10460t;
        InterfaceC10460t.b bVar;
        C11544m.m36182a("Image Downloading  Error : " + c8970q.getMessage() + ":" + c8970q.getCause());
        if (this.f29931a == null || this.f29932b == null) {
            return false;
        }
        if (c8970q.getLocalizedMessage().contains("Failed to decode")) {
            interfaceC10460t = this.f29932b;
            bVar = InterfaceC10460t.b.IMAGE_UNSUPPORTED_FORMAT;
        } else {
            interfaceC10460t = this.f29932b;
            bVar = InterfaceC10460t.b.UNSPECIFIED_RENDER_ERROR;
        }
        interfaceC10460t.mo31382c(bVar);
        return false;
    }
}
