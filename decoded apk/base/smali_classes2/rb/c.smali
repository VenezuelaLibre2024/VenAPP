.class public final Lrb/c;
.super Lcom/google/crypto/tink/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d<",
        "Lvb/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final d:Lcom/google/crypto/tink/internal/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/l<",
            "Lrb/a;",
            "Lrb/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb/b;

    invoke-direct {v0}, Lrb/b;-><init>()V

    const-class v1, Lrb/a;

    const-class v2, Lrb/g;

    invoke-static {v0, v1, v2}, Lcom/google/crypto/tink/internal/l;->b(Lcom/google/crypto/tink/internal/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/l;

    move-result-object v0

    sput-object v0, Lrb/c;->d:Lcom/google/crypto/tink/internal/l;

    return-void
.end method

.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/crypto/tink/internal/m;

    new-instance v1, Lrb/c$a;

    const-class v2, Ljb/t;

    invoke-direct {v1, v2}, Lrb/c$a;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lvb/a;

    invoke-direct {p0, v1, v0}, Lcom/google/crypto/tink/internal/d;-><init>(Ljava/lang/Class;[Lcom/google/crypto/tink/internal/m;)V

    return-void
.end method

.method static synthetic k(Lvb/c;)V
    .locals 0

    invoke-static {p0}, Lrb/c;->q(Lvb/c;)V

    return-void
.end method

.method static synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lrb/c;->r(I)V

    return-void
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lrb/c;

    invoke-direct {v0}, Lrb/c;-><init>()V

    invoke-static {v0, p0}, Ljb/x;->l(Lcom/google/crypto/tink/internal/d;Z)V

    invoke-static {}, Lrb/f;->c()V

    invoke-static {}, Lcom/google/crypto/tink/internal/h;->c()Lcom/google/crypto/tink/internal/h;

    move-result-object p0

    sget-object v0, Lrb/c;->d:Lcom/google/crypto/tink/internal/l;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/h;->d(Lcom/google/crypto/tink/internal/l;)V

    return-void
.end method

.method private static q(Lvb/c;)V
    .locals 2

    invoke-virtual {p0}, Lvb/c;->Y()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lvb/c;->Y()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static r(I)V
    .locals 1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0
.end method

.method public f()Lcom/google/crypto/tink/internal/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/crypto/tink/internal/d$a<",
            "Lvb/b;",
            "Lvb/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrb/c$b;

    const-class v1, Lvb/b;

    invoke-direct {v0, p0, v1}, Lrb/c$b;-><init>(Lrb/c;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lvb/y$c;
    .locals 1

    sget-object v0, Lvb/y$c;->SYMMETRIC:Lvb/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/c;->n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/a;

    invoke-virtual {p0, p1}, Lrb/c;->p(Lvb/a;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/a;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/a;->d0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/a;

    move-result-object p1

    return-object p1
.end method

.method public p(Lvb/a;)V
    .locals 2

    invoke-virtual {p1}, Lvb/a;->b0()I

    move-result v0

    invoke-virtual {p0}, Lrb/c;->m()I

    move-result v1

    invoke-static {v0, v1}, Lwb/r;->c(II)V

    invoke-virtual {p1}, Lvb/a;->Z()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v0

    invoke-static {v0}, Lrb/c;->r(I)V

    invoke-virtual {p1}, Lvb/a;->a0()Lvb/c;

    move-result-object p1

    invoke-static {p1}, Lrb/c;->q(Lvb/c;)V

    return-void
.end method
