.class public final Ldm/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldm/x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldm/a;->y(Ldm/x;)Ldm/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldm/a;

.field final synthetic b:Ldm/x;


# direct methods
.method constructor <init>(Ldm/a;Ldm/x;)V
    .locals 0

    iput-object p1, p0, Ldm/a$d;->a:Ldm/a;

    iput-object p2, p0, Ldm/a$d;->b:Ldm/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ldm/a;
    .locals 1

    iget-object v0, p0, Ldm/a$d;->a:Ldm/a;

    return-object v0
.end method

.method public close()V
    .locals 3

    iget-object v0, p0, Ldm/a$d;->a:Ldm/a;

    iget-object v1, p0, Ldm/a$d;->b:Ldm/x;

    invoke-virtual {v0}, Ldm/a;->t()V

    :try_start_0
    invoke-interface {v1}, Ldm/x;->close()V

    sget-object v1, Lck/v;->a:Lck/v;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ldm/a;->n(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ldm/a;->n(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    :goto_0
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result v0

    throw v1
.end method

.method public bridge synthetic m()Ldm/y;
    .locals 1

    invoke-virtual {p0}, Ldm/a$d;->a()Ldm/a;

    move-result-object v0

    return-object v0
.end method

.method public s1(Ldm/b;J)J
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldm/a$d;->a:Ldm/a;

    iget-object v1, p0, Ldm/a$d;->b:Ldm/x;

    invoke-virtual {v0}, Ldm/a;->t()V

    :try_start_0
    invoke-interface {v1, p1, p2, p3}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result p3

    if-nez p3, :cond_0

    return-wide p1

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ldm/a;->n(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ldm/a;->n(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :goto_0
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result p2

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldm/a$d;->b:Ldm/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
