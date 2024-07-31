package p212l3;

import android.content.Context;
import java.io.File;
import p212l3.C9378d;

/* renamed from: l3.f */
/* loaded from: classes.dex */
public final class C9380f extends C9378d {

    /* renamed from: l3.f$a */
    /* loaded from: classes.dex */
    class a implements C9378d.a {

        /* renamed from: a */
        final /* synthetic */ Context f22717a;

        /* renamed from: b */
        final /* synthetic */ String f22718b;

        a(Context context, String str) {
            this.f22717a = context;
            this.f22718b = str;
        }

        @Override // p212l3.C9378d.a
        /* renamed from: a */
        public File mo27898a() {
            File cacheDir = this.f22717a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f22718b != null ? new File(cacheDir, this.f22718b) : cacheDir;
        }
    }

    public C9380f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C9380f(Context context, String str, long j10) {
        super(new a(context, str), j10);
    }
}
