.class Lkb/z$b;
.super Lcom/google/crypto/tink/internal/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/z;->f()Lcom/google/crypto/tink/internal/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/d$a<",
        "Lvb/s;",
        "Lvb/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lkb/z;


# direct methods
.method constructor <init>(Lkb/z;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lkb/z$b;->b:Lkb/z;

    invoke-direct {p0, p2}, Lcom/google/crypto/tink/internal/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    check-cast p1, Lvb/s;

    invoke-virtual {p0, p1}, Lkb/z$b;->f(Lvb/s;)Lvb/r;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/crypto/tink/internal/d$a$a<",
            "Lvb/s;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/s;->W()Lvb/s;

    move-result-object v2

    sget-object v3, Ljb/l$b;->TINK:Ljb/l$b;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/crypto/tink/internal/d$a$a;

    invoke-static {}, Lvb/s;->W()Lvb/s;

    move-result-object v2

    sget-object v3, Ljb/l$b;->RAW:Ljb/l$b;

    invoke-direct {v1, v2, v3}, Lcom/google/crypto/tink/internal/d$a$a;-><init>(Ljava/lang/Object;Ljb/l$b;)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/h;)Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 0

    invoke-virtual {p0, p1}, Lkb/z$b;->g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/r0;)V
    .locals 0

    check-cast p1, Lvb/s;

    invoke-virtual {p0, p1}, Lkb/z$b;->h(Lvb/s;)V

    return-void
.end method

.method public f(Lvb/s;)Lvb/r;
    .locals 1

    invoke-static {}, Lvb/r;->a0()Lvb/r$b;

    move-result-object p1

    iget-object v0, p0, Lkb/z$b;->b:Lkb/z;

    invoke-virtual {v0}, Lkb/z;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lvb/r$b;->B(I)Lvb/r$b;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {v0}, Lwb/p;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->k([B)Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvb/r$b;->A(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/y$a;->m()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p1

    check-cast p1, Lvb/r;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/h;)Lvb/s;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v0

    invoke-static {p1, v0}, Lvb/s;->X(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/s;

    move-result-object p1

    return-object p1
.end method

.method public h(Lvb/s;)V
    .locals 0

    return-void
.end method
