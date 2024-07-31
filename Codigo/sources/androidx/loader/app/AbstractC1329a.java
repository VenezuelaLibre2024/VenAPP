package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC1310k;
import androidx.lifecycle.InterfaceC1311k0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p169j1.C8938b;

/* renamed from: androidx.loader.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC1329a {

    /* renamed from: androidx.loader.app.a$a */
    /* loaded from: classes.dex */
    public interface a<D> {
        /* renamed from: a */
        void mo7415a(C8938b<D> c8938b);

        /* renamed from: b */
        void mo7416b(C8938b<D> c8938b, D d10);

        /* renamed from: c */
        C8938b<D> mo7417c(int i10, Bundle bundle);
    }

    /* renamed from: b */
    public static <T extends InterfaceC1310k & InterfaceC1311k0> AbstractC1329a m7411b(T t10) {
        return new C1330b(t10, t10.getViewModelStore());
    }

    @Deprecated
    /* renamed from: a */
    public abstract void mo7412a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    /* renamed from: c */
    public abstract <D> C8938b<D> mo7413c(int i10, Bundle bundle, a<D> aVar);

    /* renamed from: d */
    public abstract void mo7414d();
}
