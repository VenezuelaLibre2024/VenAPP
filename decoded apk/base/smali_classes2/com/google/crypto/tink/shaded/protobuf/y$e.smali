.class public Lcom/google/crypto/tink/shaded/protobuf/y$e;
.super Lcom/google/crypto/tink/shaded/protobuf/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/crypto/tink/shaded/protobuf/r0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/crypto/tink/shaded/protobuf/n<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/crypto/tink/shaded/protobuf/r0;

.field final b:Lcom/google/crypto/tink/shaded/protobuf/y$d;


# virtual methods
.method public a()Lcom/google/crypto/tink/shaded/protobuf/t1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->d()Lcom/google/crypto/tink/shaded/protobuf/t1$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$e;->a:Lcom/google/crypto/tink/shaded/protobuf/r0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y$d;->a()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/y$e;->b:Lcom/google/crypto/tink/shaded/protobuf/y$d;

    iget-boolean v0, v0, Lcom/google/crypto/tink/shaded/protobuf/y$d;->d:Z

    return v0
.end method
