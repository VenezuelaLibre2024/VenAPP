package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.lifecycle.k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0074a<D> {
        void a(j1.b<D> bVar);

        void b(j1.b<D> bVar, D d10);

        j1.b<D> c(int i10, Bundle bundle);
    }

    public static <T extends k & k0> a b(T t10) {
        return new b(t10, t10.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> j1.b<D> c(int i10, Bundle bundle, InterfaceC0074a<D> interfaceC0074a);

    public abstract void d();
}
