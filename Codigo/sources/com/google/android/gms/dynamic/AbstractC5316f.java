package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import ca.C1912k;
import com.google.android.gms.common.internal.C5276s;

/* renamed from: com.google.android.gms.dynamic.f */
/* loaded from: classes.dex */
public abstract class AbstractC5316f<T> {
    private final String zza;
    private Object zzb;

    /* renamed from: com.google.android.gms.dynamic.f$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5316f(String str) {
        this.zza = str;
    }

    protected abstract T getRemoteCreator(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getRemoteCreatorInstance(Context context) {
        if (this.zzb == null) {
            C5276s.m13324j(context);
            Context m10098d = C1912k.m10098d(context);
            if (m10098d == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) m10098d.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e10) {
                throw new a("Could not load creator class.", e10);
            } catch (IllegalAccessException e11) {
                throw new a("Could not access creator.", e11);
            } catch (InstantiationException e12) {
                throw new a("Could not instantiate creator.", e12);
            }
        }
        return (T) this.zzb;
    }
}
