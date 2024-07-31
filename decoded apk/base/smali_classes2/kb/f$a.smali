.class Lkb/f$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkb/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Lwb/l;",
        "Lvb/f;",
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

    check-cast p1, Lvb/f;

    invoke-virtual {p0, p1}, Lkb/f$a;->c(Lvb/f;)Lwb/l;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/f;)Lwb/l;
    .locals 2

    new-instance v0, Lwb/a;

    invoke-virtual {p1}, Lvb/f;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object v1

    invoke-virtual {p1}, Lvb/f;->b0()Lvb/h;

    move-result-object p1

    invoke-virtual {p1}, Lvb/h;->Y()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lwb/a;-><init>([BI)V

    return-object v0
.end method
