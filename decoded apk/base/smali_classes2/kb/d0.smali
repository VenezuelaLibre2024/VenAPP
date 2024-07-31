.class public Lkb/d0;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/e0;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/d0$a;

    const-class v2, Ljb/a;

    invoke-direct {v1, v2}, Lkb/d0$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/e0;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method public static m(Z)V
    .locals 1

    new-instance v0, Lkb/d0;

    invoke-direct {v0}, Lkb/d0;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/f0;",
            "Lvb/e0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/d0$b;

    const-class v1, Lvb/f0;

    invoke-direct {v0, p0, v1}, Lkb/d0$b;-><init>(Lkb/d0;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->REMOTE:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/d0;->l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/e0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/e0;

    invoke-virtual {p0, p1}, Lkb/d0;->n(Lvb/e0;)V

    return-void
.end method

.method public k()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/e0;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/e0;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/e0;

    move-result-object p1

    return-object p1
.end method

.method public n(Lvb/e0;)V
    .locals 1

    invoke-virtual {p1}, Lvb/e0;->Z()I

    move-result p1

    invoke-virtual {p0}, Lkb/d0;->k()I

    move-result v0

    invoke-static {p1, v0}, Lwb/r;->c(II)V

    return-void
.end method
