.class public Lcom/google/protobuf/x$e;
.super Lcom/google/protobuf/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/r0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/m<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/protobuf/r0;

.field final b:Lcom/google/protobuf/x$d;


# virtual methods
.method public a()Lcom/google/protobuf/t1$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->d()Lcom/google/protobuf/t1$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/protobuf/r0;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$e;->a:Lcom/google/protobuf/r0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    invoke-virtual {v0}, Lcom/google/protobuf/x$d;->a()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/x$e;->b:Lcom/google/protobuf/x$d;

    iget-boolean v0, v0, Lcom/google/protobuf/x$d;->d:Z

    return v0
.end method
