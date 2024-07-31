package kotlin.jvm.internal;

import p405vk.InterfaceC11965b;
import p405vk.InterfaceC11968e;

/* renamed from: kotlin.jvm.internal.j */
/* loaded from: classes3.dex */
public class C9318j extends AbstractC9311c implements InterfaceC9317i, InterfaceC11968e {
    private final int arity;
    private final int flags;

    public C9318j(int i10) {
        this(i10, AbstractC9311c.NO_RECEIVER, null, null, null, 0);
    }

    public C9318j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public C9318j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC9311c
    protected InterfaceC11965b computeReflected() {
        return C9333y.m27796a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9318j) {
            C9318j c9318j = (C9318j) obj;
            return getName().equals(c9318j.getName()) && getSignature().equals(c9318j.getSignature()) && this.flags == c9318j.flags && this.arity == c9318j.arity && C9322n.m27777a(getBoundReceiver(), c9318j.getBoundReceiver()) && C9322n.m27777a(getOwner(), c9318j.getOwner());
        }
        if (obj instanceof InterfaceC11968e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC9317i
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC9311c
    public InterfaceC11968e getReflected() {
        return (InterfaceC11968e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p405vk.InterfaceC11968e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p405vk.InterfaceC11968e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p405vk.InterfaceC11968e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p405vk.InterfaceC11968e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC9311c, p405vk.InterfaceC11965b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        InterfaceC11965b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
