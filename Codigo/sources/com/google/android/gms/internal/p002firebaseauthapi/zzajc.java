package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.firebase-auth-api.zzajc.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzajc;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class zzajc<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
    private static Map<Object, zzajc<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzamd zzb = zzamd.zzc();

    /* loaded from: classes2.dex */
    public static abstract class zza<MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzahe<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zza(MessageType messagetype) {
            this.zzb = messagetype;
            if (messagetype.zzu()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.zza = (MessageType) messagetype.zzo();
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzalb.zza().zza((zzalb) messagetype).zza(messagetype, messagetype2);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
        public /* synthetic */ Object clone() {
            zza zzaVar = (zza) this.zzb.zza(zzf.zze, null, null);
            zzaVar.zza = (MessageType) zzg();
            return zzaVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzu()) {
                zzj();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahe
        /* renamed from: zzc */
        public final /* synthetic */ zzahe clone() {
            return (zza) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
        /* renamed from: zze */
        public MessageType zzg() {
            if (!this.zza.zzu()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
        public final /* synthetic */ zzakn zzh() {
            return this.zzb;
        }

        public final void zzi() {
            if (this.zza.zzu()) {
                return;
            }
            zzj();
        }

        public void zzj() {
            MessageType messagetype = (MessageType) this.zzb.zzo();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
        public final boolean zzk() {
            return zzajc.zza(this.zza, false);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class zzb<MessageType extends zzb<MessageType, BuilderType>, BuilderType> extends zzajc<MessageType, BuilderType> implements zzakp {
        protected zzaiv<zze> zzc = zzaiv.zzb();

        public final zzaiv<zze> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzaiv) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes2.dex */
    protected static class zzc<T extends zzajc<T, ?>> extends zzahg<T> {
        private final T zza;

        public zzc(T t10) {
            this.zza = t10;
        }
    }

    /* loaded from: classes2.dex */
    public static class zzd<ContainingType extends zzakn, Type> extends zzaip<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class zze implements zzaix<zze> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final zzakm zza(zzakm zzakmVar, zzakn zzaknVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final zzaks zza(zzaks zzaksVar, zzaks zzaksVar2) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final zzamr zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final zzanb zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaix
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes2.dex */
    public enum zzf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    private final int zza() {
        return zzalb.zza().zza((zzalb) this).zzb(this);
    }

    private static <T extends zzajc<T, ?>> T zza(T t10) {
        if (t10 == null || t10.zzk()) {
            return t10;
        }
        throw new zzamc(t10).zza().zza(t10);
    }

    public static <T extends zzajc<T, ?>> T zza(T t10, zzahp zzahpVar, zzaio zzaioVar) {
        return (T) zza(zzb(t10, zzahpVar, zzaioVar));
    }

    private static <T extends zzajc<T, ?>> T zza(T t10, zzaia zzaiaVar, zzaio zzaioVar) {
        T t11 = (T) t10.zzo();
        try {
            zzalf zza2 = zzalb.zza().zza((zzalb) t11);
            zza2.zza(t11, zzaij.zza(zzaiaVar), zzaioVar);
            zza2.zzc(t11);
            return t11;
        } catch (zzaji e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzaji(e);
            }
            throw e.zza(t11);
        } catch (zzamc e11) {
            throw e11.zza().zza(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaji) {
                throw ((zzaji) e12.getCause());
            }
            throw new zzaji(e12).zza(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzaji) {
                throw ((zzaji) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends zzajc<T, ?>> T zza(T t10, InputStream inputStream, zzaio zzaioVar) {
        zzaia zzaifVar;
        if (inputStream == null) {
            byte[] bArr = zzajf.zzb;
            zzaifVar = zzaia.zza(bArr, 0, bArr.length, false);
        } else {
            zzaifVar = new zzaif(inputStream);
        }
        return (T) zza(zza(t10, zzaifVar, zzaioVar));
    }

    private static <T extends zzajc<T, ?>> T zza(T t10, byte[] bArr, int i10, int i11, zzaio zzaioVar) {
        T t11 = (T) t10.zzo();
        try {
            zzalf zza2 = zzalb.zza().zza((zzalb) t11);
            zza2.zza(t11, bArr, 0, i11, new zzahk(zzaioVar));
            zza2.zzc(t11);
            return t11;
        } catch (zzaji e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzaji(e);
            }
            throw e.zza(t11);
        } catch (zzamc e11) {
            throw e11.zza().zza(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzaji) {
                throw ((zzaji) e12.getCause());
            }
            throw new zzaji(e12).zza(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzaji.zzi().zza(t11);
        }
    }

    public static <T extends zzajc<T, ?>> T zza(T t10, byte[] bArr, zzaio zzaioVar) {
        return (T) zza(zza(t10, bArr, 0, bArr.length, zzaioVar));
    }

    public static <T extends zzajc<?, ?>> T zza(Class<T> cls) {
        zzajc<?, ?> zzajcVar = zzc.get(cls);
        if (zzajcVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajcVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzajcVar == null) {
            zzajcVar = (T) ((zzajc) zzamk.zza(cls)).zza(zzf.zzf, (Object) null, (Object) null);
            if (zzajcVar == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, zzajcVar);
        }
        return (T) zzajcVar;
    }

    public static <E> zzajj<E> zza(zzajj<E> zzajjVar) {
        int size = zzajjVar.size();
        return zzajjVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(zzakn zzaknVar, String str, Object[] objArr) {
        return new zzald(zzaknVar, str, objArr);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends zzajc<?, ?>> void zza(Class<T> cls, T t10) {
        t10.zzt();
        zzc.put(cls, t10);
    }

    protected static final <T extends zzajc<T, ?>> boolean zza(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.zza(zzf.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzalb.zza().zza((zzalb) t10).zzd(t10);
        if (z10) {
            t10.zza(zzf.zzb, zzd2 ? t10 : null, null);
        }
        return zzd2;
    }

    private final int zzb(zzalf<?> zzalfVar) {
        return zzalfVar == null ? zzalb.zza().zza((zzalb) this).zza(this) : zzalfVar.zza(this);
    }

    private static <T extends zzajc<T, ?>> T zzb(T t10, zzahp zzahpVar, zzaio zzaioVar) {
        zzaia zzc2 = zzahpVar.zzc();
        T t11 = (T) zza(t10, zzc2, zzaioVar);
        try {
            zzc2.zzc(0);
            return t11;
        } catch (zzaji e10) {
            throw e10.zza(t11);
        }
    }

    public static <E> zzajj<E> zzp() {
        return zzala.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final int a_() {
        return this.zzd & a.e.API_PRIORITY_OTHER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzalb.zza().zza((zzalb) this).zzb(this, (zzajc) obj);
        }
        return false;
    }

    public int hashCode() {
        if (zzu()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzako.zza(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final int zza(zzalf zzalfVar) {
        if (!zzu()) {
            if (a_() != Integer.MAX_VALUE) {
                return a_();
            }
            int zzb2 = zzb((zzalf<?>) zzalfVar);
            zzb(zzb2);
            return zzb2;
        }
        int zzb3 = zzb((zzalf<?>) zzalfVar);
        if (zzb3 >= 0) {
            return zzb3;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + zzb3);
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final void zza(zzaik zzaikVar) {
        zzalb.zza().zza((zzalb) this).zza((zzalf) this, (zzana) zzain.zza(zzaikVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
    public final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & a.e.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
    public final /* synthetic */ zzakn zzh() {
        return (zzajc) zza(zzf.zzf, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakp
    public final boolean zzk() {
        return zza(this, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final int zzl() {
        return zza((zzalf) null);
    }

    public final <MessageType extends zzajc<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzm() {
        return (BuilderType) zza(zzf.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzn() {
        return (BuilderType) ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzo() {
        return (MessageType) zza(zzf.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakm zzq() {
        return (zza) zza(zzf.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakm zzr() {
        return ((zza) zza(zzf.zze, (Object) null, (Object) null)).zza(this);
    }

    public final void zzs() {
        zzalb.zza().zza((zzalb) this).zzc(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= a.e.API_PRIORITY_OTHER;
    }

    public final boolean zzu() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
