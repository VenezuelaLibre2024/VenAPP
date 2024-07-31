.class Lkb/d0$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/d0;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/f0;",
        "Lvb/e0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/d0;


# direct methods
.method constructor <init>(Lkb/d0;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/d0$b;->b:Lkb/d0;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/f0;

    invoke-virtual {p0, p1}, Lkb/d0$b;->f(Lvb/f0;)Lvb/e0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/d0$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/f0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/f0;

    invoke-virtual {p0, p1}, Lkb/d0$b;->h(Lvb/f0;)V

    return-void
.end method

.method public f(Lvb/f0;)Lvb/e0;
    .locals 1

    invoke-static {}, Lvb/e0;->a0()Lvb/e0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvb/e0$b;->A(Lvb/f0;)Lvb/e0$b;

    move-result-object p1

    iget-object v0, p0, Lkb/d0$b;->b:Lkb/d0;

    invoke-virtual {v0}, Lkb/d0;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/e0$b;->B(I)Lvb/e0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/e0;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/f0;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/f0;->Y(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/f0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/f0;)V
    .locals 0

    return-void
.end method
