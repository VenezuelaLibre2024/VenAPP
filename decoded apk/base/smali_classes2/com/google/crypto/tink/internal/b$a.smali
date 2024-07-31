.class Lcom/google/crypto/tink/internal/b$a;
.super Lcom/google/crypto/tink/internal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b$b;Lxb/a;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/internal/b<",
        "TSerializationT;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/google/crypto/tink/internal/b$b;


# direct methods
.method constructor <init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/b$b;)V
    .locals 0

    iput-object p3, p0, Lcom/google/crypto/tink/internal/b$a;->c:Lcom/google/crypto/tink/internal/b$b;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/crypto/tink/internal/b;-><init>(Lxb/a;Ljava/lang/Class;Lcom/google/crypto/tink/internal/b$a;)V

    return-void
.end method


# virtual methods
.method public d(Lcom/google/crypto/tink/internal/q;Ljb/y;)Ljb/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSerializationT;",
            "Ljb/y;",
            ")",
            "Ljb/g;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/internal/b$a;->c:Lcom/google/crypto/tink/internal/b$b;

    invoke-interface {v0, p1, p2}, Lcom/google/crypto/tink/internal/b$b;->a(Lcom/google/crypto/tink/internal/q;Ljb/y;)Ljb/g;

    move-result-object p1

    return-object p1
.end method
