package dm;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9322n;

/* renamed from: dm.h */
/* loaded from: classes3.dex */
public class C7064h extends C7081y {

    /* renamed from: f */
    private C7081y f15656f;

    public C7064h(C7081y delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f15656f = delegate;
    }

    @Override // dm.C7081y
    /* renamed from: a */
    public C7081y mo20786a() {
        return this.f15656f.mo20786a();
    }

    @Override // dm.C7081y
    /* renamed from: b */
    public C7081y mo20787b() {
        return this.f15656f.mo20787b();
    }

    @Override // dm.C7081y
    /* renamed from: c */
    public long mo20788c() {
        return this.f15656f.mo20788c();
    }

    @Override // dm.C7081y
    /* renamed from: d */
    public C7081y mo20789d(long j10) {
        return this.f15656f.mo20789d(j10);
    }

    @Override // dm.C7081y
    /* renamed from: e */
    public boolean mo20790e() {
        return this.f15656f.mo20790e();
    }

    @Override // dm.C7081y
    /* renamed from: f */
    public void mo20791f() {
        this.f15656f.mo20791f();
    }

    @Override // dm.C7081y
    /* renamed from: g */
    public C7081y mo20792g(long j10, TimeUnit unit) {
        C9322n.m27781e(unit, "unit");
        return this.f15656f.mo20792g(j10, unit);
    }

    /* renamed from: i */
    public final C7081y m20793i() {
        return this.f15656f;
    }

    /* renamed from: j */
    public final C7064h m20794j(C7081y delegate) {
        C9322n.m27781e(delegate, "delegate");
        this.f15656f = delegate;
        return this;
    }
}
