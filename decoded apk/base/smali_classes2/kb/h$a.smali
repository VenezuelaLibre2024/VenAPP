.class Lkb/h$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/h;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/a;",
        "Lvb/i;",
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

    check-cast p1, Lvb/i;

    invoke-virtual {p0, p1}, Lkb/h$a;->c(Lvb/i;)Ljb/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/i;)Ljb/a;
    .locals 2

    new-instance v0, Lwb/b;

    invoke-virtual {p1}, Lvb/i;->Z()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object v1

    invoke-virtual {p1}, Lvb/i;->a0()Lvb/k;

    move-result-object p1

    invoke-virtual {p1}, Lvb/k;->Y()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lwb/b;-><init>([BI)V

    return-object v0
.end method
