package p487zd;

import android.app.Application;
import com.google.protobuf.AbstractC6562a;
import com.google.protobuf.C6566b0;
import com.google.protobuf.InterfaceC6634z0;
import dj.AbstractC6977b;
import dj.AbstractC6985j;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* renamed from: zd.u2 */
/* loaded from: classes.dex */
public class C12983u2 {

    /* renamed from: a */
    private final Application f35312a;

    /* renamed from: b */
    private final String f35313b;

    public C12983u2(Application application, String str) {
        this.f35312a = application;
        this.f35313b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ AbstractC6562a m42948c(InterfaceC6634z0 interfaceC6634z0) {
        synchronized (this) {
            try {
                FileInputStream openFileInput = this.f35312a.openFileInput(this.f35313b);
                try {
                    AbstractC6562a abstractC6562a = (AbstractC6562a) interfaceC6634z0.mo18390c(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    return abstractC6562a;
                } catch (Throwable th2) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (C6566b0 | FileNotFoundException e10) {
                C12940l2.m42842c("Recoverable exception while reading cache: " + e10.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m42949d(AbstractC6562a abstractC6562a) {
        synchronized (this) {
            FileOutputStream openFileOutput = this.f35312a.openFileOutput(this.f35313b, 0);
            try {
                openFileOutput.write(abstractC6562a.mo18375h());
                openFileOutput.close();
            } finally {
            }
        }
        return abstractC6562a;
    }

    /* renamed from: e */
    public <T extends AbstractC6562a> AbstractC6985j<T> m42950e(final InterfaceC6634z0<T> interfaceC6634z0) {
        return AbstractC6985j.m20254l(new Callable() { // from class: zd.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AbstractC6562a m42948c;
                m42948c = C12983u2.this.m42948c(interfaceC6634z0);
                return m42948c;
            }
        });
    }

    /* renamed from: f */
    public AbstractC6977b m42951f(final AbstractC6562a abstractC6562a) {
        return AbstractC6977b.m20196k(new Callable() { // from class: zd.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object m42949d;
                m42949d = C12983u2.this.m42949d(abstractC6562a);
                return m42949d;
            }
        });
    }
}
