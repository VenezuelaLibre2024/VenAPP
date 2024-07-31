.class Lpb/a$a;
.super Lcom/google/crypto/tink/internal/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpb/a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/m<",
        "Ljb/e;",
        "Lvb/p;",
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

    check-cast p1, Lvb/p;

    invoke-virtual {p0, p1}, Lpb/a$a;->c(Lvb/p;)Ljb/e;

    move-result-object p1

    return-object p1
.end method

.method public c(Lvb/p;)Ljb/e;
    .locals 1

    new-instance v0, Lwb/d;

    invoke-virtual {p1}, Lvb/p;->Y()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lwb/d;-><init>([B)V

    return-object v0
.end method
