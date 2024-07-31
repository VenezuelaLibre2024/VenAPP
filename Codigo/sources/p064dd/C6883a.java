package p064dd;

/* renamed from: dd.a */
/* loaded from: classes.dex */
public class C6883a implements InterfaceC6886d {

    /* renamed from: a */
    private final int f15231a;

    /* renamed from: b */
    private final InterfaceC6886d[] f15232b;

    /* renamed from: c */
    private final C6884b f15233c;

    public C6883a(int i10, InterfaceC6886d... interfaceC6886dArr) {
        this.f15231a = i10;
        this.f15232b = interfaceC6886dArr;
        this.f15233c = new C6884b(i10);
    }

    @Override // p064dd.InterfaceC6886d
    /* renamed from: a */
    public StackTraceElement[] mo19866a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f15231a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (InterfaceC6886d interfaceC6886d : this.f15232b) {
            if (stackTraceElementArr2.length <= this.f15231a) {
                break;
            }
            stackTraceElementArr2 = interfaceC6886d.mo19866a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f15231a ? this.f15233c.mo19866a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
