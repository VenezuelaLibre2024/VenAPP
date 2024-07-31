.class public final Lkb/e;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/e$a;

    const-class v2, Ljb/a;

    invoke-direct {v1, v2}, Lkb/e$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/d;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 0

    invoke-static/range {p0 .. p5}, Lkb/e;->l(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IIIILvb/u;Ljb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Lvb/u;",
            "Ljb/l$b;",
            ")",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {p0, p1, p2, p3, p4}, Lkb/e;->m(IIIILvb/u;)Lvb/e;

    move-result-object p0

    invoke-direct {v0, p0, p5}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    return-object v0
.end method

.method private static m(IIIILvb/u;)Lvb/e;
    .locals 2

    invoke-static {}, Lvb/g;->b0()Lvb/g$b;

    move-result-object v0

    invoke-static {}, Lvb/h;->Z()Lvb/h$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lvb/h$b;->A(I)Lvb/h$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/h;

    invoke-virtual {v0, p1}, Lvb/g$b;->B(Lvb/h;)Lvb/g$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lvb/g$b;->A(I)Lvb/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/g;

    invoke-static {}, Lvb/w;->b0()Lvb/w$b;

    move-result-object p1

    invoke-static {}, Lvb/x;->b0()Lvb/x$b;

    move-result-object v0

    invoke-virtual {v0, p4}, Lvb/x$b;->A(Lvb/u;)Lvb/x$b;

    move-result-object p4

    invoke-virtual {p4, p3}, Lvb/x$b;->B(I)Lvb/x$b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p3

    check-cast p3, Lvb/x;

    invoke-virtual {p1, p3}, Lvb/w$b;->B(Lvb/x;)Lvb/w$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvb/w$b;->A(I)Lvb/w$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/w;

    invoke-static {}, Lvb/e;->a0()Lvb/e$b;

    move-result-object p2

    invoke-virtual {p2, p0}, Lvb/e$b;->A(Lvb/g;)Lvb/e$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lvb/e$b;->B(Lvb/w;)Lvb/e$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/e;

    return-object p0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lkb/e;

    invoke-direct {v0}, Lkb/e;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    return-void
.end method


# virtual methods
.method public a()Lob/b$b;
    .locals 1

    sget-object v0, Lob/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lob/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/e;",
            "Lvb/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/e$b;

    const-class v1, Lvb/e;

    invoke-direct {v0, p0, v1}, Lkb/e$b;-><init>(Lkb/e;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/e;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/d;

    invoke-virtual {p0, p1}, Lkb/e;->q(Lvb/d;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/d;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/d;->d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/d;

    move-result-object p1

    return-object p1
.end method

.method public q(Lvb/d;)V
    .locals 2

    invoke-virtual {p1}, Lvb/d;->b0()I

    move-result v0

    invoke-virtual {p0}, Lkb/e;->n()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    new-instance v0, Lkb/f;

    invoke-direct {v0}, Lkb/f;-><init>()V

    invoke-virtual {p1}, Lvb/d;->Z()Lvb/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkb/f;->n(Lvb/f;)V

    new-instance v0, Lrb/k;

    invoke-direct {v0}, Lrb/k;-><init>()V

    invoke-virtual {p1}, Lvb/d;->a0()Lvb/v;

    move-result-object p1

    invoke-virtual {v0, p1}, Lrb/k;->q(Lvb/v;)V

    return-void
.end method
