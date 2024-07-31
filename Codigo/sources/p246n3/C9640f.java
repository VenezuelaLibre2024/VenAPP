package p246n3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC2121g;
import com.bumptech.glide.load.data.InterfaceC2133d;
import java.io.IOException;
import java.io.InputStream;
import p022b4.C1656d;
import p129h3.C7624h;
import p129h3.EnumC7617a;
import p246n3.InterfaceC9649o;
import p346s3.C10789g;
import p346s3.C10792j;

/* renamed from: n3.f */
/* loaded from: classes.dex */
public final class C9640f<DataT> implements InterfaceC9649o<Integer, DataT> {

    /* renamed from: a */
    private final Context f23638a;

    /* renamed from: b */
    private final e<DataT> f23639b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.f$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC9650p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a */
        private final Context f23640a;

        a(Context context) {
            this.f23640a = context;
        }

        @Override // p246n3.C9640f.e
        /* renamed from: a */
        public Class<AssetFileDescriptor> mo28871a() {
            return AssetFileDescriptor.class;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, AssetFileDescriptor> mo28852d(C9653s c9653s) {
            return new C9640f(this.f23640a, this);
        }

        @Override // p246n3.C9640f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo28872b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // p246n3.C9640f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo28873c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.f$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC9650p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a */
        private final Context f23641a;

        b(Context context) {
            this.f23641a = context;
        }

        @Override // p246n3.C9640f.e
        /* renamed from: a */
        public Class<Drawable> mo28871a() {
            return Drawable.class;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, Drawable> mo28852d(C9653s c9653s) {
            return new C9640f(this.f23641a, this);
        }

        @Override // p246n3.C9640f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo28872b(Drawable drawable) {
        }

        @Override // p246n3.C9640f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable mo28873c(Resources.Theme theme, Resources resources, int i10) {
            return C10789g.m32875a(this.f23641a, i10, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.f$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC9650p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a */
        private final Context f23642a;

        c(Context context) {
            this.f23642a = context;
        }

        @Override // p246n3.C9640f.e
        /* renamed from: a */
        public Class<InputStream> mo28871a() {
            return InputStream.class;
        }

        @Override // p246n3.InterfaceC9650p
        /* renamed from: d */
        public InterfaceC9649o<Integer, InputStream> mo28852d(C9653s c9653s) {
            return new C9640f(this.f23642a, this);
        }

        @Override // p246n3.C9640f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo28872b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // p246n3.C9640f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream mo28873c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.f$d */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements InterfaceC2133d<DataT> {

        /* renamed from: a */
        private final Resources.Theme f23643a;

        /* renamed from: b */
        private final Resources f23644b;

        /* renamed from: c */
        private final e<DataT> f23645c;

        /* renamed from: d */
        private final int f23646d;

        /* renamed from: e */
        private DataT f23647e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f23643a = theme;
            this.f23644b = resources;
            this.f23645c = eVar;
            this.f23646d = i10;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: a */
        public Class<DataT> mo10760a() {
            return this.f23645c.mo28871a();
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: b */
        public void mo10765b() {
            DataT datat = this.f23647e;
            if (datat != null) {
                try {
                    this.f23645c.mo28872b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: d */
        public EnumC7617a mo10767d() {
            return EnumC7617a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.InterfaceC2133d
        /* renamed from: e */
        public void mo10768e(EnumC2121g enumC2121g, InterfaceC2133d.a<? super DataT> aVar) {
            try {
                DataT mo28873c = this.f23645c.mo28873c(this.f23643a, this.f23644b, this.f23646d);
                this.f23647e = mo28873c;
                aVar.mo10774f(mo28873c);
            } catch (Resources.NotFoundException e10) {
                aVar.mo10773c(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3.f$e */
    /* loaded from: classes.dex */
    public interface e<DataT> {
        /* renamed from: a */
        Class<DataT> mo28871a();

        /* renamed from: b */
        void mo28872b(DataT datat);

        /* renamed from: c */
        DataT mo28873c(Resources.Theme theme, Resources resources, int i10);
    }

    C9640f(Context context, e<DataT> eVar) {
        this.f23638a = context.getApplicationContext();
        this.f23639b = eVar;
    }

    /* renamed from: c */
    public static InterfaceC9650p<Integer, AssetFileDescriptor> m28866c(Context context) {
        return new a(context);
    }

    /* renamed from: e */
    public static InterfaceC9650p<Integer, Drawable> m28867e(Context context) {
        return new b(context);
    }

    /* renamed from: g */
    public static InterfaceC9650p<Integer, InputStream> m28868g(Context context) {
        return new c(context);
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC9649o.a<DataT> mo28848b(Integer num, int i10, int i11, C7624h c7624h) {
        Resources.Theme theme = (Resources.Theme) c7624h.m23147c(C10792j.f27245b);
        return new InterfaceC9649o.a<>(new C1656d(num), new d(theme, theme != null ? theme.getResources() : this.f23638a.getResources(), this.f23639b, num.intValue()));
    }

    @Override // p246n3.InterfaceC9649o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo28847a(Integer num) {
        return true;
    }
}
