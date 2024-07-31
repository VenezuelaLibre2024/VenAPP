.class final Lzd/c3$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzd/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field static final a:Lcom/google/protobuf/k0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/k0<",
            "Ljava/lang/String;",
            "Lzd/b3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lcom/google/protobuf/t1$b;->STRING:Lcom/google/protobuf/t1$b;

    sget-object v1, Lcom/google/protobuf/t1$b;->MESSAGE:Lcom/google/protobuf/t1$b;

    invoke-static {}, Lzd/b3;->g0()Lzd/b3;

    move-result-object v2

    const-string v3, ""

    invoke-static {v0, v3, v1, v2}, Lcom/google/protobuf/k0;->d(Lcom/google/protobuf/t1$b;Ljava/lang/Object;Lcom/google/protobuf/t1$b;Ljava/lang/Object;)Lcom/google/protobuf/k0;

    move-result-object v0

    sput-object v0, Lzd/c3$b;->a:Lcom/google/protobuf/k0;

    return-void
.end method
