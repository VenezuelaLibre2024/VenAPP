package l3;

import android.content.Context;
import java.io.File;
import l3.d;

/* loaded from: classes.dex */
public final class f extends d {

    /* loaded from: classes.dex */
    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f20896b;

        a(Context context, String str) {
            this.f20895a = context;
            this.f20896b = str;
        }

        @Override // l3.d.a
        public File a() {
            File cacheDir = this.f20895a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f20896b != null ? new File(cacheDir, this.f20896b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
