.class public final Lvb/w$b;
.super Lcom/google/crypto/tink/shaded/protobuf/y$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y$a<",
        "Lvb/w;",
        "Lvb/w$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/s0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lvb/w;->V()Lvb/w;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lvb/w$a;)V
    .locals 0

    invoke-direct {p0}, Lvb/w$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A(I)Lvb/w$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Lvb/w;

    invoke-static {v0, p1}, Lvb/w;->X(Lvb/w;I)V

    return-object p0
.end method

.method public B(Lvb/x;)Lvb/w$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->r()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$a;->b:Lcom/google/crypto/tink/shaded/protobuf/y;

    check-cast v0, Lvb/w;

    invoke-static {v0, p1}, Lvb/w;->W(Lvb/w;Lvb/x;)V

    return-object p0
.end method

.method public bridge synthetic H0(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->v(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Y0(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 0

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/a$a;->k(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/a$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->q()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->t()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->p()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method protected bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/a;)Lcom/google/crypto/tink/shaded/protobuf/a$a;
    .locals 0

    check-cast p1, Lcom/google/crypto/tink/shaded/protobuf/y;

    invoke-super {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->u(Lcom/google/crypto/tink/shaded/protobuf/y;)Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object p1

    return-object p1
.end method
