.class public final Lkb/u;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/n;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lkb/u$a;

    const-class v2, Ljb/a;

    invoke-direct {v1, v2}, Lkb/u$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/n;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lkb/u;->m(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private static m(ILjb/l$b;)Lcom/google/crypto/tink/internal/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljb/l$b;",
            ")",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/o;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lvb/o;->Y()Lvb/o$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvb/o$b;->A(I)Lvb/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/o;

    new-instance v0, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-direct {v0, p0, p1}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    invoke-static {}, Lkb/u;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lkb/u;

    invoke-direct {v0}, Lkb/u;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    invoke-static {}, Lkb/x;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/o;",
            "Lvb/n;",
            ">;"
        }
    .end annotation

    new-instance v0, Lkb/u$b;

    const-class v1, Lvb/o;

    invoke-direct {v0, p0, v1}, Lkb/u$b;-><init>(Lkb/u;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/u;->o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/n;

    invoke-virtual {p0, p1}, Lkb/u;->q(Lvb/n;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/n;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/n;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/n;

    move-result-object p1

    return-object p1
.end method

.method public q(Lvb/n;)V
    .locals 2

    invoke-virtual {p1}, Lvb/n;->Z()I

    move-result v0

    invoke-virtual {p0}, Lkb/u;->n()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/n;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p1

    invoke-static {p1}, Lwb/r;->a(I)V

    return-void
.end method
