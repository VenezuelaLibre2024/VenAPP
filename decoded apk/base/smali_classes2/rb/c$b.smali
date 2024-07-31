.class Lrb/c$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrb/c;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/b;",
        "Lvb/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lrb/c;


# direct methods
.method constructor <init>(Lrb/c;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lrb/c$b;->b:Lrb/c;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/b;

    invoke-virtual {p0, p1}, Lrb/c$b;->f(Lvb/b;)Lvb/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/b;->a0()Lvb/b$b;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lvb/b$b;->A(I)Lvb/b$b;

    move-result-object v2

    invoke-static {}, Lvb/c;->Z()Lvb/c$b;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lvb/c$b;->A(I)Lvb/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v4

    check-cast v4, Lvb/c;

    invoke-virtual {v2, v4}, Lvb/b$b;->B(Lvb/c;)Lvb/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lvb/b;

    sget-object v4, Ljb/l$b;->TINK:Ljb/l$b;

    invoke-direct {v1, v2, v4}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/b;->a0()Lvb/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lvb/b$b;->A(I)Lvb/b$b;

    move-result-object v2

    invoke-static {}, Lvb/c;->Z()Lvb/c$b;

    move-result-object v6

    invoke-virtual {v6, v5}, Lvb/c$b;->A(I)Lvb/c$b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v6

    check-cast v6, Lvb/c;

    invoke-virtual {v2, v6}, Lvb/b$b;->B(Lvb/c;)Lvb/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lvb/b;

    invoke-direct {v1, v2, v4}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/b;->a0()Lvb/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lvb/b$b;->A(I)Lvb/b$b;

    move-result-object v2

    invoke-static {}, Lvb/c;->Z()Lvb/c$b;

    move-result-object v3

    invoke-virtual {v3, v5}, Lvb/c$b;->A(I)Lvb/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v3

    check-cast v3, Lvb/c;

    invoke-virtual {v2, v3}, Lvb/b$b;->B(Lvb/c;)Lvb/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v2

    check-cast v2, Lvb/b;

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lrb/c$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/b;

    invoke-virtual {p0, p1}, Lrb/c$b;->h(Lvb/b;)V

    return-void
.end method

.method public f(Lvb/b;)Lvb/a;
    .locals 2

    invoke-static {}, Lvb/a;->c0()Lvb/a$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lvb/a$b;->C(I)Lvb/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/b;->Y()I

    move-result v1

    invoke-static {v1}, Lwb/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvb/a$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lvb/b;->Z()Lvb/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvb/a$b;->B(Lvb/c;)Lvb/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/a;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/b;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/b;->b0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/b;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/b;)V
    .locals 1

    invoke-virtual {p1}, Lvb/b;->Z()Lvb/c;

    move-result-object v0

    invoke-static {v0}, Lrb/c;->k(Lvb/c;)V

    invoke-virtual {p1}, Lvb/b;->Y()I

    move-result p1

    invoke-static {p1}, Lrb/c;->l(I)V

    return-void
.end method
