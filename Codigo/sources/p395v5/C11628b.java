package p395v5;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: v5.b */
/* loaded from: classes.dex */
public final class C11628b {

    /* renamed from: a */
    private final String f30250a;

    /* renamed from: b */
    private final String f30251b;

    /* renamed from: c */
    private int f30252c;

    /* renamed from: d */
    private final int f30253d;

    /* renamed from: e */
    private boolean f30254e;

    /* renamed from: f */
    private Long f30255f;

    public C11628b(String id2, String name, int i10, int i11, boolean z10, Long l10) {
        C9322n.m27781e(id2, "id");
        C9322n.m27781e(name, "name");
        this.f30250a = id2;
        this.f30251b = name;
        this.f30252c = i10;
        this.f30253d = i11;
        this.f30254e = z10;
        this.f30255f = l10;
    }

    public /* synthetic */ C11628b(String str, String str2, int i10, int i11, boolean z10, Long l10, int i12, C9315g c9315g) {
        this(str, str2, i10, i11, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? null : l10);
    }

    /* renamed from: a */
    public final int m36443a() {
        return this.f30252c;
    }

    /* renamed from: b */
    public final String m36444b() {
        return this.f30250a;
    }

    /* renamed from: c */
    public final Long m36445c() {
        return this.f30255f;
    }

    /* renamed from: d */
    public final String m36446d() {
        return this.f30251b;
    }

    /* renamed from: e */
    public final boolean m36447e() {
        return this.f30254e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11628b)) {
            return false;
        }
        C11628b c11628b = (C11628b) obj;
        return C9322n.m27777a(this.f30250a, c11628b.f30250a) && C9322n.m27777a(this.f30251b, c11628b.f30251b) && this.f30252c == c11628b.f30252c && this.f30253d == c11628b.f30253d && this.f30254e == c11628b.f30254e && C9322n.m27777a(this.f30255f, c11628b.f30255f);
    }

    /* renamed from: f */
    public final void m36448f(Long l10) {
        this.f30255f = l10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f30250a.hashCode() * 31) + this.f30251b.hashCode()) * 31) + Integer.hashCode(this.f30252c)) * 31) + Integer.hashCode(this.f30253d)) * 31;
        boolean z10 = this.f30254e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        Long l10 = this.f30255f;
        return i11 + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "AssetPathEntity(id=" + this.f30250a + ", name=" + this.f30251b + ", assetCount=" + this.f30252c + ", typeInt=" + this.f30253d + ", isAll=" + this.f30254e + ", modifiedDate=" + this.f30255f + ')';
    }
}
