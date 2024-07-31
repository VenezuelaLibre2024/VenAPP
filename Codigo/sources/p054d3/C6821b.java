package p054d3;

import dm.AbstractC7062f;
import dm.C7056b;
import dm.C7068l;
import dm.InterfaceC7058c;
import dm.InterfaceC7078v;
import java.io.IOException;
import p319ql.AbstractC10523b0;
import p319ql.C10548w;

/* renamed from: d3.b */
/* loaded from: classes.dex */
public class C6821b extends AbstractC10523b0 {

    /* renamed from: b */
    protected final AbstractC10523b0 f15061b;

    /* renamed from: c */
    protected final InterfaceC6820a f15062c;

    /* renamed from: d */
    protected final String f15063d;

    /* renamed from: e */
    protected a f15064e;

    /* renamed from: d3.b$a */
    /* loaded from: classes.dex */
    protected static class a extends AbstractC7062f {

        /* renamed from: b */
        private long f15065b;

        /* renamed from: c */
        private final C6821b f15066c;

        public a(C6821b c6821b, InterfaceC7078v interfaceC7078v) {
            super(interfaceC7078v);
            this.f15066c = c6821b;
        }

        @Override // dm.AbstractC7062f, dm.InterfaceC7078v
        /* renamed from: K0 */
        public void mo19710K0(C7056b c7056b, long j10) {
            try {
                super.mo19710K0(c7056b, j10);
                long j11 = this.f15065b + j10;
                this.f15065b = j11;
                C6821b c6821b = this.f15066c;
                if (c6821b != null) {
                    c6821b.m19709h(j11, c6821b.mo19705a());
                }
            } catch (IOException e10) {
                C6821b c6821b2 = this.f15066c;
                if (c6821b2 != null) {
                    c6821b2.m19708g(e10);
                }
            }
        }
    }

    public C6821b(AbstractC10523b0 abstractC10523b0, String str, InterfaceC6820a interfaceC6820a) {
        this.f15061b = abstractC10523b0;
        this.f15063d = str;
        this.f15062c = interfaceC6820a;
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: a */
    public long mo19705a() {
        return this.f15061b.mo19705a();
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: b */
    public C10548w mo19706b() {
        return this.f15061b.mo19706b();
    }

    @Override // p319ql.AbstractC10523b0
    /* renamed from: f */
    public void mo19707f(InterfaceC7058c interfaceC7058c) {
        try {
            a aVar = new a(this, interfaceC7058c);
            this.f15064e = aVar;
            InterfaceC7058c m20802a = C7068l.m20802a(aVar);
            this.f15061b.mo19707f(m20802a);
            m20802a.flush();
        } catch (IOException e10) {
            m19708g(e10);
        }
    }

    /* renamed from: g */
    public void m19708g(Exception exc) {
        InterfaceC6820a interfaceC6820a = this.f15062c;
        if (interfaceC6820a != null) {
            interfaceC6820a.mo10635a(this.f15063d, "upload_task_error", exc.toString());
        }
    }

    /* renamed from: h */
    public void m19709h(long j10, long j11) {
        InterfaceC6820a interfaceC6820a = this.f15062c;
        if (interfaceC6820a != null) {
            interfaceC6820a.mo10636c(this.f15063d, j10, j11);
        }
    }
}
