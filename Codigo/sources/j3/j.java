package j3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f19620a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final j f19621b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final j f19622c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final j f19623d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final j f19624e = new e();

    /* loaded from: classes.dex */
    class a extends j {
        a() {
        }

        @Override // j3.j
        public boolean a() {
            return true;
        }

        @Override // j3.j
        public boolean b() {
            return true;
        }

        @Override // j3.j
        public boolean c(h3.a aVar) {
            return aVar == h3.a.REMOTE;
        }

        @Override // j3.j
        public boolean d(boolean z10, h3.a aVar, h3.c cVar) {
            return (aVar == h3.a.RESOURCE_DISK_CACHE || aVar == h3.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    class b extends j {
        b() {
        }

        @Override // j3.j
        public boolean a() {
            return false;
        }

        @Override // j3.j
        public boolean b() {
            return false;
        }

        @Override // j3.j
        public boolean c(h3.a aVar) {
            return false;
        }

        @Override // j3.j
        public boolean d(boolean z10, h3.a aVar, h3.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class c extends j {
        c() {
        }

        @Override // j3.j
        public boolean a() {
            return true;
        }

        @Override // j3.j
        public boolean b() {
            return false;
        }

        @Override // j3.j
        public boolean c(h3.a aVar) {
            return (aVar == h3.a.DATA_DISK_CACHE || aVar == h3.a.MEMORY_CACHE) ? false : true;
        }

        @Override // j3.j
        public boolean d(boolean z10, h3.a aVar, h3.c cVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    class d extends j {
        d() {
        }

        @Override // j3.j
        public boolean a() {
            return false;
        }

        @Override // j3.j
        public boolean b() {
            return true;
        }

        @Override // j3.j
        public boolean c(h3.a aVar) {
            return false;
        }

        @Override // j3.j
        public boolean d(boolean z10, h3.a aVar, h3.c cVar) {
            return (aVar == h3.a.RESOURCE_DISK_CACHE || aVar == h3.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    class e extends j {
        e() {
        }

        @Override // j3.j
        public boolean a() {
            return true;
        }

        @Override // j3.j
        public boolean b() {
            return true;
        }

        @Override // j3.j
        public boolean c(h3.a aVar) {
            return aVar == h3.a.REMOTE;
        }

        @Override // j3.j
        public boolean d(boolean z10, h3.a aVar, h3.c cVar) {
            return ((z10 && aVar == h3.a.DATA_DISK_CACHE) || aVar == h3.a.LOCAL) && cVar == h3.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(h3.a aVar);

    public abstract boolean d(boolean z10, h3.a aVar, h3.c cVar);
}
