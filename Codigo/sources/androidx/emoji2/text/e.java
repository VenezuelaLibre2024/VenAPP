package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class e {

    /* renamed from: n */
    private static final Object f4343n = new Object();

    /* renamed from: o */
    private static final Object f4344o = new Object();

    /* renamed from: p */
    private static volatile e f4345p;

    /* renamed from: b */
    private final Set<AbstractC0062e> f4347b;

    /* renamed from: e */
    private final b f4350e;

    /* renamed from: f */
    final g f4351f;

    /* renamed from: g */
    final boolean f4352g;

    /* renamed from: h */
    final boolean f4353h;

    /* renamed from: i */
    final int[] f4354i;

    /* renamed from: j */
    private final boolean f4355j;

    /* renamed from: k */
    private final int f4356k;

    /* renamed from: l */
    private final int f4357l;

    /* renamed from: m */
    private final d f4358m;

    /* renamed from: a */
    private final ReadWriteLock f4346a = new ReentrantReadWriteLock();

    /* renamed from: c */
    private volatile int f4348c = 3;

    /* renamed from: d */
    private final Handler f4349d = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b */
        private volatile androidx.emoji2.text.h f4359b;

        /* renamed from: c */
        private volatile m f4360c;

        /* renamed from: androidx.emoji2.text.e$a$a */
        /* loaded from: classes.dex */
        class C0061a extends h {
            C0061a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th2) {
                a.this.f4362a.m(th2);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f4362a.f4351f.a(new C0061a());
            } catch (Throwable th2) {
                this.f4362a.m(th2);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f4359b.h(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f4360c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f4362a.f4352g);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f4362a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f4360c = mVar;
            m mVar2 = this.f4360c;
            i iVar = new i();
            d dVar = this.f4362a.f4358m;
            e eVar = this.f4362a;
            this.f4359b = new androidx.emoji2.text.h(mVar2, iVar, dVar, eVar.f4353h, eVar.f4354i);
            this.f4362a.n();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final e f4362a;

        b(e eVar) {
            this.f4362a = eVar;
        }

        void a() {
            throw null;
        }

        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final g f4363a;

        /* renamed from: b */
        boolean f4364b;

        /* renamed from: c */
        boolean f4365c;

        /* renamed from: d */
        int[] f4366d;

        /* renamed from: e */
        Set<AbstractC0062e> f4367e;

        /* renamed from: f */
        boolean f4368f;

        /* renamed from: g */
        int f4369g = -16711936;

        /* renamed from: h */
        int f4370h = 0;

        /* renamed from: i */
        d f4371i = new androidx.emoji2.text.d();

        public c(g gVar) {
            androidx.core.util.h.l(gVar, "metadataLoader cannot be null.");
            this.f4363a = gVar;
        }

        public final g a() {
            return this.f4363a;
        }

        public c b(int i10) {
            this.f4370h = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0062e {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: a */
        private final List<AbstractC0062e> f4372a;

        /* renamed from: b */
        private final Throwable f4373b;

        /* renamed from: c */
        private final int f4374c;

        f(AbstractC0062e abstractC0062e, int i10) {
            this(Arrays.asList((AbstractC0062e) androidx.core.util.h.l(abstractC0062e, "initCallback cannot be null")), i10, null);
        }

        f(Collection<AbstractC0062e> collection, int i10) {
            this(collection, i10, null);
        }

        f(Collection<AbstractC0062e> collection, int i10, Throwable th2) {
            androidx.core.util.h.l(collection, "initCallbacks cannot be null");
            this.f4372a = new ArrayList(collection);
            this.f4374c = i10;
            this.f4373b = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4372a.size();
            int i10 = 0;
            if (this.f4374c != 1) {
                while (i10 < size) {
                    this.f4372a.get(i10).a(this.f4373b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f4372a.get(i10).b();
                    i10++;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(m mVar);
    }

    /* loaded from: classes.dex */
    public static class i {
        i() {
        }

        public androidx.emoji2.text.i a(androidx.emoji2.text.g gVar) {
            return new o(gVar);
        }
    }

    private e(c cVar) {
        this.f4352g = cVar.f4364b;
        this.f4353h = cVar.f4365c;
        this.f4354i = cVar.f4366d;
        this.f4355j = cVar.f4368f;
        this.f4356k = cVar.f4369g;
        this.f4351f = cVar.f4363a;
        this.f4357l = cVar.f4370h;
        this.f4358m = cVar.f4371i;
        androidx.collection.b bVar = new androidx.collection.b();
        this.f4347b = bVar;
        Set<AbstractC0062e> set = cVar.f4367e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f4367e);
        }
        this.f4350e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f4343n) {
            eVar = f4345p;
            androidx.core.util.h.n(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i10, i11, z10);
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i10, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f4345p;
        if (eVar == null) {
            synchronized (f4343n) {
                eVar = f4345p;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f4345p = eVar;
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f4345p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f4346a.writeLock().lock();
        try {
            if (this.f4357l == 0) {
                this.f4348c = 0;
            }
            this.f4346a.writeLock().unlock();
            if (d() == 0) {
                this.f4350e.a();
            }
        } catch (Throwable th2) {
            this.f4346a.writeLock().unlock();
            throw th2;
        }
    }

    public int c() {
        return this.f4356k;
    }

    public int d() {
        this.f4346a.readLock().lock();
        try {
            return this.f4348c;
        } finally {
            this.f4346a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f4355j;
    }

    public void k() {
        androidx.core.util.h.n(this.f4357l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f4346a.writeLock().lock();
        try {
            if (this.f4348c == 0) {
                return;
            }
            this.f4348c = 0;
            this.f4346a.writeLock().unlock();
            this.f4350e.a();
        } finally {
            this.f4346a.writeLock().unlock();
        }
    }

    void m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f4346a.writeLock().lock();
        try {
            this.f4348c = 2;
            arrayList.addAll(this.f4347b);
            this.f4347b.clear();
            this.f4346a.writeLock().unlock();
            this.f4349d.post(new f(arrayList, this.f4348c, th2));
        } catch (Throwable th3) {
            this.f4346a.writeLock().unlock();
            throw th3;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f4346a.writeLock().lock();
        try {
            this.f4348c = 1;
            arrayList.addAll(this.f4347b);
            this.f4347b.clear();
            this.f4346a.writeLock().unlock();
            this.f4349d.post(new f(arrayList, this.f4348c));
        } catch (Throwable th2) {
            this.f4346a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, a.e.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        androidx.core.util.h.n(j(), "Not initialized yet");
        androidx.core.util.h.i(i10, "start cannot be negative");
        androidx.core.util.h.i(i11, "end cannot be negative");
        androidx.core.util.h.i(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.h.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.h.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.h.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f4352g : false;
        } else {
            z10 = true;
        }
        return this.f4350e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(AbstractC0062e abstractC0062e) {
        androidx.core.util.h.l(abstractC0062e, "initCallback cannot be null");
        this.f4346a.writeLock().lock();
        try {
            if (this.f4348c != 1 && this.f4348c != 2) {
                this.f4347b.add(abstractC0062e);
            }
            this.f4349d.post(new f(abstractC0062e, this.f4348c));
        } finally {
            this.f4346a.writeLock().unlock();
        }
    }

    public void t(AbstractC0062e abstractC0062e) {
        androidx.core.util.h.l(abstractC0062e, "initCallback cannot be null");
        this.f4346a.writeLock().lock();
        try {
            this.f4347b.remove(abstractC0062e);
        } finally {
            this.f4346a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f4350e.c(editorInfo);
    }
}
