.class public final Lkb/h;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/i;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/h$a;

    const-class v2, Ljb/a;

    invoke-direct {v1, v2}, Lkb/h$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/i;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2}, Lkb/h;->l(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljb/l$b;",
            ")",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/j;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lvb/j;->a0()Lvb/j$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvb/j$b;->A(I)Lvb/j$b;

    move-result-object p0

    invoke-static {}, Lvb/k;->Z()Lvb/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvb/k$b;->A(I)Lvb/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/k;

    invoke-virtual {p0, p1}, Lvb/j$b;->B(Lvb/k;)Lvb/j$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/j;

    new-instance p1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-direct {p1, p0, p2}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    return-object p1
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lkb/h;

    invoke-direct {v0}, Lkb/h;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    invoke-static {}, Lkb/n;->c()V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/j;",
            "Lvb/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/h$b;

    const-class v1, Lvb/j;

    invoke-direct {v0, p0, v1}, Lkb/h$b;-><init>(Lkb/h;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/h;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/i;

    invoke-virtual {p0, p1}, Lkb/h;->p(Lvb/i;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/i;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/i;->d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/i;

    move-result-object p1

    return-object p1
.end method

.method public p(Lvb/i;)V
    .locals 2

    invoke-virtual {p1}, Lvb/i;->b0()I

    move-result v0

    invoke-virtual {p0}, Lkb/h;->m()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/i;->Z()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, Lwb/r;->a(I)V

    invoke-virtual {p1}, Lvb/i;->a0()Lvb/k;

    move-result-object v0

    invoke-virtual {v0}, Lvb/k;->Y()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lvb/i;->a0()Lvb/k;

    move-result-object p1

    invoke-virtual {p1}, Lvb/k;->Y()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
