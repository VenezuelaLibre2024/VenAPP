package h7;

import java.io.EOFException;
import java.io.IOException;
import t8.r0;
import y6.a0;
import y6.l;
import y6.n;
import y6.z;

/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a */
    private final f f16470a;

    /* renamed from: b */
    private final long f16471b;

    /* renamed from: c */
    private final long f16472c;

    /* renamed from: d */
    private final i f16473d;

    /* renamed from: e */
    private int f16474e;

    /* renamed from: f */
    private long f16475f;

    /* renamed from: g */
    private long f16476g;

    /* renamed from: h */
    private long f16477h;

    /* renamed from: i */
    private long f16478i;

    /* renamed from: j */
    private long f16479j;

    /* renamed from: k */
    private long f16480k;

    /* renamed from: l */
    private long f16481l;

    /* loaded from: classes.dex */
    public final class b implements z {
        private b() {
        }

        /* synthetic */ b(a aVar, C0273a c0273a) {
            this();
        }

        @Override // y6.z
        public z.a d(long j10) {
            return new z.a(new a0(j10, r0.r((a.this.f16471b + ((a.this.f16473d.c(j10) * (a.this.f16472c - a.this.f16471b)) / a.this.f16475f)) - 30000, a.this.f16471b, a.this.f16472c - 1)));
        }

        @Override // y6.z
        public boolean h() {
            return true;
        }

        @Override // y6.z
        public long i() {
            return a.this.f16473d.b(a.this.f16475f);
        }
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        t8.a.a(j10 >= 0 && j11 > j10);
        this.f16473d = iVar;
        this.f16471b = j10;
        this.f16472c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f16475f = j13;
            this.f16474e = 4;
        } else {
            this.f16474e = 0;
        }
        this.f16470a = new f();
    }

    private long i(l lVar) {
        if (this.f16478i == this.f16479j) {
            return -1L;
        }
        long position = lVar.getPosition();
        if (!this.f16470a.d(lVar, this.f16479j)) {
            long j10 = this.f16478i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f16470a.a(lVar, false);
        lVar.f();
        long j11 = this.f16477h;
        f fVar = this.f16470a;
        long j12 = fVar.f16500c;
        long j13 = j11 - j12;
        int i10 = fVar.f16505h + fVar.f16506i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f16479j = position;
            this.f16481l = j12;
        } else {
            this.f16478i = lVar.getPosition() + i10;
            this.f16480k = this.f16470a.f16500c;
        }
        long j14 = this.f16479j;
        long j15 = this.f16478i;
        if (j14 - j15 < 100000) {
            this.f16479j = j15;
            return j15;
        }
        long position2 = lVar.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f16479j;
        long j17 = this.f16478i;
        return r0.r(position2 + ((j13 * (j16 - j17)) / (this.f16481l - this.f16480k)), j17, j16 - 1);
    }

    private void k(l lVar) {
        while (true) {
            this.f16470a.c(lVar);
            this.f16470a.a(lVar, false);
            f fVar = this.f16470a;
            if (fVar.f16500c > this.f16477h) {
                lVar.f();
                return;
            } else {
                lVar.n(fVar.f16505h + fVar.f16506i);
                this.f16478i = lVar.getPosition();
                this.f16480k = this.f16470a.f16500c;
            }
        }
    }

    @Override // h7.g
    public long a(l lVar) {
        int i10 = this.f16474e;
        if (i10 == 0) {
            long position = lVar.getPosition();
            this.f16476g = position;
            this.f16474e = 1;
            long j10 = this.f16472c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long i11 = i(lVar);
                if (i11 != -1) {
                    return i11;
                }
                this.f16474e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(lVar);
            this.f16474e = 4;
            return -(this.f16480k + 2);
        }
        this.f16475f = j(lVar);
        this.f16474e = 4;
        return this.f16476g;
    }

    @Override // h7.g
    public void c(long j10) {
        this.f16477h = r0.r(j10, 0L, this.f16475f - 1);
        this.f16474e = 2;
        this.f16478i = this.f16471b;
        this.f16479j = this.f16472c;
        this.f16480k = 0L;
        this.f16481l = this.f16475f;
    }

    @Override // h7.g
    /* renamed from: h */
    public b b() {
        if (this.f16475f != 0) {
            return new b();
        }
        return null;
    }

    long j(l lVar) {
        long j10;
        f fVar;
        this.f16470a.b();
        if (!this.f16470a.c(lVar)) {
            throw new EOFException();
        }
        this.f16470a.a(lVar, false);
        f fVar2 = this.f16470a;
        lVar.n(fVar2.f16505h + fVar2.f16506i);
        do {
            j10 = this.f16470a.f16500c;
            f fVar3 = this.f16470a;
            if ((fVar3.f16499b & 4) == 4 || !fVar3.c(lVar) || lVar.getPosition() >= this.f16472c || !this.f16470a.a(lVar, true)) {
                break;
            }
            fVar = this.f16470a;
        } while (n.e(lVar, fVar.f16505h + fVar.f16506i));
        return j10;
    }
}
