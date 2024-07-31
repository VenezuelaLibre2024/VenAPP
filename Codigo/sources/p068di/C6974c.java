package p068di;

/* renamed from: di.c */
/* loaded from: classes3.dex */
public class C6974c {

    /* renamed from: a */
    private int f15550a;

    /* renamed from: b */
    private int f15551b;

    /* renamed from: c */
    private int f15552c;

    public C6974c(int i10, int i11, int i12) {
        this.f15550a = i10;
        this.f15551b = i11;
        this.f15552c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6974c c6974c = (C6974c) obj;
        return this.f15550a == c6974c.f15550a && this.f15551b == c6974c.f15551b && this.f15552c == c6974c.f15552c;
    }

    public int hashCode() {
        return (((this.f15550a * 31) + this.f15551b) * 31) + this.f15552c;
    }
}
