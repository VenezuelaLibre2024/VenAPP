package kotlin.jvm.internal;

/* loaded from: classes3.dex */
public class j extends c implements i, vk.e {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, c.NO_RECEIVER, null, null, null, 0);
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.c
    protected vk.b computeReflected() {
        return y.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && n.a(getBoundReceiver(), jVar.getBoundReceiver()) && n.a(getOwner(), jVar.getOwner());
        }
        if (obj instanceof vk.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.c
    public vk.e getReflected() {
        return (vk.e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // vk.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // vk.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // vk.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // vk.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.c, vk.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        vk.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
