.class Lcom/google/crypto/tink/internal/l$a;
.super Lcom/google/crypto/tink/internal/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/crypto/tink/internal/l;->b(Lcom/google/crypto/tink/internal/l$b;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/l<",
        "TKeyT;TPrimitiveT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/crypto/tink/internal/l$b;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/l$b;)V
    .locals 0

    iput-object p3, p0, Lcom/google/crypto/tink/internal/l$a;->c:Lcom/google/crypto/tink/internal/l$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/l;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/l$a;)V

    return-void
.end method


# virtual methods
.method public a(Ljb/g;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TKeyT;)TPrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/l$a;->c:Lcom/google/crypto/tink/internal/l$b;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/internal/l$b;->a(Ljb/g;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
