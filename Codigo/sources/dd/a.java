package dd;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f13877a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f13878b;

    /* renamed from: c, reason: collision with root package name */
    private final b f13879c;

    public a(int i10, d... dVarArr) {
        this.f13877a = i10;
        this.f13878b = dVarArr;
        this.f13879c = new b(i10);
    }

    @Override // dd.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f13877a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f13878b) {
            if (stackTraceElementArr2.length <= this.f13877a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f13877a ? this.f13879c.a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
