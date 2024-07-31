.class public final synthetic Lzd/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lzd/u2;

.field public final synthetic b:Lcom/google/protobuf/z0;


# direct methods
.method public synthetic constructor <init>(Lzd/u2;Lcom/google/protobuf/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/s2;->a:Lzd/u2;

    iput-object p2, p0, Lzd/s2;->b:Lcom/google/protobuf/z0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzd/s2;->a:Lzd/u2;

    iget-object v1, p0, Lzd/s2;->b:Lcom/google/protobuf/z0;

    invoke-static {v0, v1}, Lzd/u2;->b(Lzd/u2;Lcom/google/protobuf/z0;)Lcom/google/protobuf/a;

    move-result-object v0

    return-object v0
.end method
