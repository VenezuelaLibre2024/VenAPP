.class public final Lkb/p;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/l;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/p$a;

    const-class v2, Ljb/a;

    invoke-direct {v1, v2}, Lkb/p$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/l;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lkb/p;->l(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljb/l$b;",
            ")",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/m;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lvb/m;->Y()Lvb/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvb/m$b;->A(I)Lvb/m$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/m;

    new-instance v0, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-direct {v0, p0, p1}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    return-object v0
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lkb/p;

    invoke-direct {v0}, Lkb/p;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    invoke-static {}, Lkb/s;->c()V

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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/m;",
            "Lvb/l;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/p$b;

    const-class v1, Lvb/m;

    invoke-direct {v0, p0, v1}, Lkb/p$b;-><init>(Lkb/p;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/p;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/l;

    invoke-virtual {p0, p1}, Lkb/p;->p(Lvb/l;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/l;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/l;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/l;

    move-result-object p1

    return-object p1
.end method

.method public p(Lvb/l;)V
    .locals 2

    invoke-virtual {p1}, Lvb/l;->Z()I

    move-result v0

    invoke-virtual {p0}, Lkb/p;->m()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/l;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-static {p1}, Lwb/r;->a(I)V

    return-void
.end method
