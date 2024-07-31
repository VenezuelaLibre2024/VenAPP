.class public Lkb/f;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/f$a;

    const-class v2, Lwb/l;

    invoke-direct {v1, v2}, Lkb/f$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/f;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(Lkb/f;Lvb/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lkb/f;->o(Lvb/h;)V

    return-void
.end method

.method private o(Lvb/h;)V
    .locals 2

    invoke-virtual {p1}, Lvb/h;->Y()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lvb/h;->Y()I

    move-result p1

    const/16 v0, 0x10

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/g;",
            "Lvb/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/f$b;

    const-class v1, Lvb/g;

    invoke-direct {v0, p0, v1}, Lkb/f$b;-><init>(Lkb/f;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/f;->m(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/f;

    invoke-virtual {p0, p1}, Lkb/f;->n(Lvb/f;)V

    return-void
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/f;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/f;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/f;

    move-result-object p1

    return-object p1
.end method

.method public n(Lvb/f;)V
    .locals 2

    invoke-virtual {p1}, Lvb/f;->c0()I

    move-result v0

    invoke-virtual {p0}, Lkb/f;->l()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/f;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, Lwb/r;->a(I)V

    invoke-virtual {p1}, Lvb/f;->b0()Lvb/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lkb/f;->o(Lvb/h;)V

    return-void
.end method
