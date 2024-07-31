package n3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import n3.o;

/* loaded from: classes.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21705a;

    /* renamed from: b, reason: collision with root package name */
    private final e<DataT> f21706b;

    /* loaded from: classes.dex */
    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21707a;

        a(Context context) {
            this.f21707a = context;
        }

        @Override // n3.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // n3.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f21707a, this);
        }

        @Override // n3.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) {
            assetFileDescriptor.close();
        }

        @Override // n3.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21708a;

        b(Context context) {
            this.f21708a = context;
        }

        @Override // n3.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // n3.p
        public o<Integer, Drawable> d(s sVar) {
            return new f(this.f21708a, this);
        }

        @Override // n3.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }

        @Override // n3.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return s3.g.a(this.f21708a, i10, theme);
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f21709a;

        c(Context context) {
            this.f21709a = context;
        }

        @Override // n3.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // n3.p
        public o<Integer, InputStream> d(s sVar) {
            return new f(this.f21709a, this);
        }

        @Override // n3.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) {
            inputStream.close();
        }

        @Override // n3.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f21710a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f21711b;

        /* renamed from: c, reason: collision with root package name */
        private final e<DataT> f21712c;

        /* renamed from: d, reason: collision with root package name */
        private final int f21713d;

        /* renamed from: e, reason: collision with root package name */
        private DataT f21714e;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f21710a = theme;
            this.f21711b = resources;
            this.f21712c = eVar;
            this.f21713d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f21712c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f21714e;
            if (datat != null) {
                try {
                    this.f21712c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public h3.a d() {
            return h3.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                DataT c10 = this.f21712c.c(this.f21710a, this.f21711b, this.f21713d);
                this.f21714e = c10;
                aVar.f(c10);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat);

        DataT c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e<DataT> eVar) {
        this.f21705a = context.getApplicationContext();
        this.f21706b = eVar;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // n3.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Integer num, int i10, int i11, h3.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(s3.j.f25126b);
        return new o.a<>(new b4.d(num), new d(theme, theme != null ? theme.getResources() : this.f21705a.getResources(), this.f21706b, num.intValue()));
    }

    @Override // n3.o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }
}
