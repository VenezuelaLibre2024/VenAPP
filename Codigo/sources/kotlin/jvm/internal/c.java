package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class c implements vk.b, Serializable {
    public static final Object NO_RECEIVER = a.f20744a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient vk.b reflected;
    private final String signature;

    /* loaded from: classes3.dex */
    private static class a implements Serializable {

        /* renamed from: a */
        private static final a f20744a = new a();

        private a() {
        }

        private Object readResolve() {
            return f20744a;
        }
    }

    public c() {
        this(NO_RECEIVER);
    }

    protected c(Object obj) {
        this(obj, null, null, null, false);
    }

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // vk.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // vk.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public vk.b compute() {
        vk.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        vk.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract vk.b computeReflected();

    @Override // vk.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public vk.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? y.c(cls) : y.b(cls);
    }

    @Override // vk.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public vk.b getReflected() {
        vk.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new nk.b();
    }

    @Override // vk.b
    public vk.i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // vk.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // vk.b
    public vk.j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // vk.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // vk.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // vk.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // vk.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
