.class Lkb/f$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/f;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/g;",
        "Lvb/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/f;


# direct methods
.method constructor <init>(Lkb/f;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/f$b;->b:Lkb/f;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/g;

    invoke-virtual {p0, p1}, Lkb/f$b;->f(Lvb/g;)Lvb/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/f$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/g;

    invoke-virtual {p0, p1}, Lkb/f$b;->h(Lvb/g;)V

    return-void
.end method

.method public f(Lvb/g;)Lvb/f;
    .locals 2

    invoke-static {}, Lvb/f;->d0()Lvb/f$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/g;->a0()Lvb/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/f$b;->B(Lvb/h;)Lvb/f$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/g;->Z()I

    move-result p1

    invoke-static {p1}, Lwb/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/f$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/f$b;

    move-result-object p1

    iget-object v0, p0, Lkb/f$b;->b:Lkb/f;

    invoke-virtual {v0}, Lkb/f;->l()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/f$b;->C(I)Lvb/f$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/f;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/g;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/g;->c0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/g;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/g;)V
    .locals 1

    invoke-virtual {p1}, Lvb/g;->Z()I

    move-result v0

    invoke-static {v0}, Lwb/r;->a(I)V

    iget-object v0, p0, Lkb/f$b;->b:Lkb/f;

    invoke-virtual {p1}, Lvb/g;->a0()Lvb/h;

    move-result-object p1

    invoke-static {v0, p1}, Lkb/f;->k(Lkb/f;Lvb/h;)V

    return-void
.end method
