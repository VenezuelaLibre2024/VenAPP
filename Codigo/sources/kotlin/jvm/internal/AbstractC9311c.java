package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p257nk.C9729b;
import p405vk.EnumC11973j;
import p405vk.InterfaceC11965b;
import p405vk.InterfaceC11967d;
import p405vk.InterfaceC11972i;

/* renamed from: kotlin.jvm.internal.c */
/* loaded from: classes3.dex */
public abstract class AbstractC9311c implements InterfaceC11965b, Serializable {
    public static final Object NO_RECEIVER = a.f22566a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient InterfaceC11965b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.c$a */
    /* loaded from: classes3.dex */
    private static class a implements Serializable {

        /* renamed from: a */
        private static final a f22566a = new a();

        private a() {
        }

        private Object readResolve() {
            return f22566a;
        }
    }

    public AbstractC9311c() {
        this(NO_RECEIVER);
    }

    protected AbstractC9311c(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC9311c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }

    @Override // p405vk.InterfaceC11965b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p405vk.InterfaceC11965b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public InterfaceC11965b compute() {
        InterfaceC11965b interfaceC11965b = this.reflected;
        if (interfaceC11965b != null) {
            return interfaceC11965b;
        }
        InterfaceC11965b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract InterfaceC11965b computeReflected();

    @Override // p405vk.InterfaceC11964a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public InterfaceC11967d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C9333y.m27798c(cls) : C9333y.m27797b(cls);
    }

    @Override // p405vk.InterfaceC11965b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC11965b getReflected() {
        InterfaceC11965b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C9729b();
    }

    @Override // p405vk.InterfaceC11965b
    public InterfaceC11972i getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // p405vk.InterfaceC11965b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p405vk.InterfaceC11965b
    public EnumC11973j getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p405vk.InterfaceC11965b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p405vk.InterfaceC11965b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p405vk.InterfaceC11965b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p405vk.InterfaceC11965b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
