package kotlin.jvm.internal;

import p405vk.InterfaceC11965b;
import p405vk.InterfaceC11971h;

/* renamed from: kotlin.jvm.internal.u */
/* loaded from: classes3.dex */
public abstract class AbstractC9329u extends AbstractC9311c implements InterfaceC11971h {

    /* renamed from: a */
    private final boolean f22578a;

    public AbstractC9329u() {
        this.f22578a = false;
    }

    public AbstractC9329u(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f22578a = (i10 & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9311c
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC11971h getReflected() {
        if (this.f22578a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (InterfaceC11971h) super.getReflected();
    }

    @Override // kotlin.jvm.internal.AbstractC9311c
    public InterfaceC11965b compute() {
        return this.f22578a ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9329u) {
            AbstractC9329u abstractC9329u = (AbstractC9329u) obj;
            return getOwner().equals(abstractC9329u.getOwner()) && getName().equals(abstractC9329u.getName()) && getSignature().equals(abstractC9329u.getSignature()) && C9322n.m27777a(getBoundReceiver(), abstractC9329u.getBoundReceiver());
        }
        if (obj instanceof InterfaceC11971h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        InterfaceC11965b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
