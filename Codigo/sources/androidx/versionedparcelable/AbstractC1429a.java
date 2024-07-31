package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.collection.C0731a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p053d2.InterfaceC6819b;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
public abstract class AbstractC1429a {

    /* renamed from: a */
    protected final C0731a<String, Method> f6361a;

    /* renamed from: b */
    protected final C0731a<String, Method> f6362b;

    /* renamed from: c */
    protected final C0731a<String, Class> f6363c;

    public AbstractC1429a(C0731a<String, Method> c0731a, C0731a<String, Method> c0731a2, C0731a<String, Class> c0731a3) {
        this.f6361a = c0731a;
        this.f6362b = c0731a2;
        this.f6363c = c0731a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m8212N(InterfaceC6819b interfaceC6819b) {
        try {
            mo8224I(m8213c(interfaceC6819b.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(interfaceC6819b.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    /* renamed from: c */
    private Class m8213c(Class<? extends InterfaceC6819b> cls) {
        Class cls2 = this.f6363c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f6363c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m8214d(String str) {
        Method method = this.f6361a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC1429a.class.getClassLoader()).getDeclaredMethod("read", AbstractC1429a.class);
        this.f6361a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private Method m8215e(Class cls) {
        Method method = this.f6362b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m8213c = m8213c(cls);
        System.currentTimeMillis();
        Method declaredMethod = m8213c.getDeclaredMethod("write", cls, AbstractC1429a.class);
        this.f6362b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: A */
    protected abstract void mo8216A(byte[] bArr);

    /* renamed from: B */
    public void m8217B(byte[] bArr, int i10) {
        mo8248w(i10);
        mo8216A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo8218C(CharSequence charSequence);

    /* renamed from: D */
    public void m8219D(CharSequence charSequence, int i10) {
        mo8248w(i10);
        mo8218C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo8220E(int i10);

    /* renamed from: F */
    public void m8221F(int i10, int i11) {
        mo8248w(i11);
        mo8220E(i10);
    }

    /* renamed from: G */
    protected abstract void mo8222G(Parcelable parcelable);

    /* renamed from: H */
    public void m8223H(Parcelable parcelable, int i10) {
        mo8248w(i10);
        mo8222G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo8224I(String str);

    /* renamed from: J */
    public void m8225J(String str, int i10) {
        mo8248w(i10);
        mo8224I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC6819b> void m8226K(T t10, AbstractC1429a abstractC1429a) {
        try {
            m8215e(t10.getClass()).invoke(null, t10, abstractC1429a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m8227L(InterfaceC6819b interfaceC6819b) {
        if (interfaceC6819b == null) {
            mo8224I(null);
            return;
        }
        m8212N(interfaceC6819b);
        AbstractC1429a mo8230b = mo8230b();
        m8226K(interfaceC6819b, mo8230b);
        mo8230b.mo8229a();
    }

    /* renamed from: M */
    public void m8228M(InterfaceC6819b interfaceC6819b, int i10) {
        mo8248w(i10);
        m8227L(interfaceC6819b);
    }

    /* renamed from: a */
    protected abstract void mo8229a();

    /* renamed from: b */
    protected abstract AbstractC1429a mo8230b();

    /* renamed from: f */
    public boolean m8231f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo8232g();

    /* renamed from: h */
    public boolean m8233h(boolean z10, int i10) {
        return !mo8238m(i10) ? z10 : mo8232g();
    }

    /* renamed from: i */
    protected abstract byte[] mo8234i();

    /* renamed from: j */
    public byte[] m8235j(byte[] bArr, int i10) {
        return !mo8238m(i10) ? bArr : mo8234i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo8236k();

    /* renamed from: l */
    public CharSequence m8237l(CharSequence charSequence, int i10) {
        return !mo8238m(i10) ? charSequence : mo8236k();
    }

    /* renamed from: m */
    protected abstract boolean mo8238m(int i10);

    /* renamed from: n */
    protected <T extends InterfaceC6819b> T m8239n(String str, AbstractC1429a abstractC1429a) {
        try {
            return (T) m8214d(str).invoke(null, abstractC1429a);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* renamed from: o */
    protected abstract int mo8240o();

    /* renamed from: p */
    public int m8241p(int i10, int i11) {
        return !mo8238m(i11) ? i10 : mo8240o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo8242q();

    /* renamed from: r */
    public <T extends Parcelable> T m8243r(T t10, int i10) {
        return !mo8238m(i10) ? t10 : (T) mo8242q();
    }

    /* renamed from: s */
    protected abstract String mo8244s();

    /* renamed from: t */
    public String m8245t(String str, int i10) {
        return !mo8238m(i10) ? str : mo8244s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends InterfaceC6819b> T m8246u() {
        String mo8244s = mo8244s();
        if (mo8244s == null) {
            return null;
        }
        return (T) m8239n(mo8244s, mo8230b());
    }

    /* renamed from: v */
    public <T extends InterfaceC6819b> T m8247v(T t10, int i10) {
        return !mo8238m(i10) ? t10 : (T) m8246u();
    }

    /* renamed from: w */
    protected abstract void mo8248w(int i10);

    /* renamed from: x */
    public void m8249x(boolean z10, boolean z11) {
    }

    /* renamed from: y */
    protected abstract void mo8250y(boolean z10);

    /* renamed from: z */
    public void m8251z(boolean z10, int i10) {
        mo8248w(i10);
        mo8250y(z10);
    }
}
