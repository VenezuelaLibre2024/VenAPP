.class Lkb/e$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/a;",
        "Lvb/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/crypto/tink/internal/m;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/r0;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvb/d;

    invoke-virtual {p0, p1}, Lkb/e$a;->c(Lvb/d;)Ljb/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/d;)Ljb/a;
    .locals 5

    new-instance v0, Lwb/h;

    new-instance v1, Lkb/f;

    invoke-direct {v1}, Lkb/f;-><init>()V

    invoke-virtual {p1}, Lvb/d;->Z()Lvb/f;

    move-result-object v2

    const-class v3, Lwb/l;

    invoke-virtual {v1, v2, v3}, Lcom/google/crypto/tink/internal/d;->e(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwb/l;

    new-instance v2, Lrb/k;

    invoke-direct {v2}, Lrb/k;-><init>()V

    invoke-virtual {p1}, Lvb/d;->a0()Lvb/v;

    move-result-object v3

    const-class v4, Ljb/t;

    invoke-virtual {v2, v3, v4}, Lcom/google/crypto/tink/internal/d;->e(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljb/t;

    invoke-virtual {p1}, Lvb/d;->a0()Lvb/v;

    move-result-object p1

    invoke-virtual {p1}, Lvb/v;->b0()Lvb/x;

    move-result-object p1

    invoke-virtual {p1}, Lvb/x;->a0()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lwb/h;-><init>(Lwb/l;Ljb/t;I)V

    return-object v0
.end method
