.class public final Lyi/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyi/b$b;
    }
.end annotation


# instance fields
.field private final a:Lyi/a;

.field private final b:Lio/grpc/okhttp/internal/e;


# direct methods
.method private constructor <init>(Lyi/b$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lyi/b$b;->a(Lyi/b$b;)Lyi/a;

    move-result-object v0

    iput-object v0, p0, Lyi/b;->a:Lyi/a;

    invoke-static {p1}, Lyi/b$b;->b(Lyi/b$b;)Lio/grpc/okhttp/internal/e$b;

    move-result-object p1

    invoke-virtual {p1}, Lio/grpc/okhttp/internal/e$b;->c()Lio/grpc/okhttp/internal/e;

    move-result-object p1

    iput-object p1, p0, Lyi/b;->b:Lio/grpc/okhttp/internal/e;

    return-void
.end method

.method synthetic constructor <init>(Lyi/b$b;Lyi/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lyi/b;-><init>(Lyi/b$b;)V

    return-void
.end method


# virtual methods
.method public a()Lio/grpc/okhttp/internal/e;
    .locals 1

    iget-object v0, p0, Lyi/b;->b:Lio/grpc/okhttp/internal/e;

    return-object v0
.end method

.method public b()Lyi/a;
    .locals 1

    iget-object v0, p0, Lyi/b;->a:Lyi/a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyi/b;->a:Lyi/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method