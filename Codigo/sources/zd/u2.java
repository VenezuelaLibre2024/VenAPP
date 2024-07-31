package zd;

import android.app.Application;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class u2 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f32761a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32762b;

    public u2(Application application, String str) {
        this.f32761a = application;
        this.f32762b = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ com.google.protobuf.a c(com.google.protobuf.z0 z0Var) {
        synchronized (this) {
            try {
                FileInputStream openFileInput = this.f32761a.openFileInput(this.f32762b);
                try {
                    com.google.protobuf.a aVar = (com.google.protobuf.a) z0Var.c(openFileInput);
                    if (openFileInput != null) {
                        openFileInput.close();
                    }
                    return aVar;
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
            } catch (com.google.protobuf.b0 | FileNotFoundException e10) {
                l2.c("Recoverable exception while reading cache: " + e10.getMessage());
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(com.google.protobuf.a aVar) {
        synchronized (this) {
            FileOutputStream openFileOutput = this.f32761a.openFileOutput(this.f32762b, 0);
            try {
                openFileOutput.write(aVar.h());
                openFileOutput.close();
            } finally {
            }
        }
        return aVar;
    }

    public <T extends com.google.protobuf.a> dj.j<T> e(final com.google.protobuf.z0<T> z0Var) {
        return dj.j.l(new Callable() { // from class: zd.s2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.protobuf.a c10;
                c10 = u2.this.c(z0Var);
                return c10;
            }
        });
    }

    public dj.b f(final com.google.protobuf.a aVar) {
        return dj.b.k(new Callable() { // from class: zd.t2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object d10;
                d10 = u2.this.d(aVar);
                return d10;
            }
        });
    }
}
