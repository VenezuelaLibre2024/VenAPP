package p171j3;

import p129h3.EnumC7617a;
import p129h3.EnumC7619c;

/* renamed from: j3.j */
/* loaded from: classes.dex */
public abstract class AbstractC8963j {

    /* renamed from: a */
    public static final AbstractC8963j f21388a = new a();

    /* renamed from: b */
    public static final AbstractC8963j f21389b = new b();

    /* renamed from: c */
    public static final AbstractC8963j f21390c = new c();

    /* renamed from: d */
    public static final AbstractC8963j f21391d = new d();

    /* renamed from: e */
    public static final AbstractC8963j f21392e = new e();

    /* renamed from: j3.j$a */
    /* loaded from: classes.dex */
    class a extends AbstractC8963j {
        a() {
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: a */
        public boolean mo26261a() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: b */
        public boolean mo26262b() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: c */
        public boolean mo26263c(EnumC7617a enumC7617a) {
            return enumC7617a == EnumC7617a.REMOTE;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: d */
        public boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c) {
            return (enumC7617a == EnumC7617a.RESOURCE_DISK_CACHE || enumC7617a == EnumC7617a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: j3.j$b */
    /* loaded from: classes.dex */
    class b extends AbstractC8963j {
        b() {
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: a */
        public boolean mo26261a() {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: b */
        public boolean mo26262b() {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: c */
        public boolean mo26263c(EnumC7617a enumC7617a) {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: d */
        public boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c) {
            return false;
        }
    }

    /* renamed from: j3.j$c */
    /* loaded from: classes.dex */
    class c extends AbstractC8963j {
        c() {
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: a */
        public boolean mo26261a() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: b */
        public boolean mo26262b() {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: c */
        public boolean mo26263c(EnumC7617a enumC7617a) {
            return (enumC7617a == EnumC7617a.DATA_DISK_CACHE || enumC7617a == EnumC7617a.MEMORY_CACHE) ? false : true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: d */
        public boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c) {
            return false;
        }
    }

    /* renamed from: j3.j$d */
    /* loaded from: classes.dex */
    class d extends AbstractC8963j {
        d() {
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: a */
        public boolean mo26261a() {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: b */
        public boolean mo26262b() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: c */
        public boolean mo26263c(EnumC7617a enumC7617a) {
            return false;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: d */
        public boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c) {
            return (enumC7617a == EnumC7617a.RESOURCE_DISK_CACHE || enumC7617a == EnumC7617a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: j3.j$e */
    /* loaded from: classes.dex */
    class e extends AbstractC8963j {
        e() {
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: a */
        public boolean mo26261a() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: b */
        public boolean mo26262b() {
            return true;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: c */
        public boolean mo26263c(EnumC7617a enumC7617a) {
            return enumC7617a == EnumC7617a.REMOTE;
        }

        @Override // p171j3.AbstractC8963j
        /* renamed from: d */
        public boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c) {
            return ((z10 && enumC7617a == EnumC7617a.DATA_DISK_CACHE) || enumC7617a == EnumC7617a.LOCAL) && enumC7619c == EnumC7619c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo26261a();

    /* renamed from: b */
    public abstract boolean mo26262b();

    /* renamed from: c */
    public abstract boolean mo26263c(EnumC7617a enumC7617a);

    /* renamed from: d */
    public abstract boolean mo26264d(boolean z10, EnumC7617a enumC7617a, EnumC7619c enumC7619c);
}
