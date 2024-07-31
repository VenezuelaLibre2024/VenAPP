.class Lkb/f0$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/f0;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/h0;",
        "Lvb/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/f0;


# direct methods
.method constructor <init>(Lkb/f0;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/f0$b;->b:Lkb/f0;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/h0;

    invoke-virtual {p0, p1}, Lkb/f0$b;->f(Lvb/h0;)Lvb/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/f0$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/h0;

    invoke-virtual {p0, p1}, Lkb/f0$b;->h(Lvb/h0;)V

    return-void
.end method

.method public f(Lvb/h0;)Lvb/g0;
    .locals 1

    invoke-static {}, Lvb/g0;->a0()Lvb/g0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvb/g0$b;->A(Lvb/h0;)Lvb/g0$b;

    move-result-object p1

    iget-object v0, p0, Lkb/f0$b;->b:Lkb/f0;

    invoke-virtual {v0}, Lkb/f0;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/g0$b;->B(I)Lvb/g0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/g0;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/h0;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/h0;->a0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/h0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/h0;)V
    .locals 1

    invoke-virtual {p1}, Lvb/h0;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lvb/h0;->Z()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
