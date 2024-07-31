package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.internal.s;

/* loaded from: classes.dex */
public abstract class f<T> {
    private final String zza;
    private Object zzb;

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
    public f(String str) {
        this.zza = str;
    }

    protected abstract T getRemoteCreator(IBinder iBinder);

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getRemoteCreatorInstance(Context context) {
        if (this.zzb == null) {
            s.j(context);
            Context d10 = ca.k.d(context);
            if (d10 == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) d10.getClassLoader().loadClass(this.zza).newInstance());
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
